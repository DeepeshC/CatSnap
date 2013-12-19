/*@(#)PostMethodExecutor.java}
 */
package com.catsnap.webclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import com.catsnap.constant.AppConstants;
import com.catsnap.constant.AppConstants.ApiEnum;
import com.catsnap.util.NetWorkUtil;
import com.catsnap.util.ServerResponseHandler;
import com.catsnap.views.ViewConstants;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;



/**
 * @author vipin.cb , vipin.cb@experionglobal.com <br>
 *         Sep 12, 2013, 3:33:32 PM <br>
 *         Package:- <b>com.veebow.webclient</b> <br>
 *         Project:- <b>Veebow</b>
 *         <p>
 */
public class PostMethodExecutor extends AsyncTask<List<Object>, String, String> {
	/** The context. */
	private Context context;
	/** The interface ServerResponseHandler. */
	private ServerResponseHandler serverResponseHandler;
	/** The checkNetworkUtil. */
	private NetWorkUtil checkNetworkUtil;
	/** The jsonString. */
	private String jsonString;
	/** The apiString. */
	private String apiString;
	/** The responseJsonHeader. */
	private String responseJsonHeader;
	/** The requestHeader. */
	private Map<String, String> requestHeader;

	/**
	 * 
	 * Constructor for PostMethodExecutor.
	 * @param context the context
	 * @param serverResponseHandler the serverResponseHandler
	 */
	public PostMethodExecutor(Context context) {
		this.context = context;
		checkNetworkUtil = new NetWorkUtil(context);
	}

	/**
	 * 
	 * <p>
	 * This is the method for initializing the listener.
	 * </p>
	 * @param serverResponseHandler
	 */
	public void setServerResponseHandler(ServerResponseHandler serverResponseHandler) {
		this.serverResponseHandler = serverResponseHandler;
	}

	/**
	 * 
	 * <p>
	 * This is the method for set the header to the request.
	 * </p>
	 * @param requestHeader the header to the request
	 */
	public void setRequestHeader(Map<String, String> requestHeader) {
		this.requestHeader = requestHeader;
	}

	// /**
	// *
	// * <p>
	// * This is the method for initializing the request parameter for api call.
	// * </p>
	// * @param jsonString
	// * @param apiString
	// */
	// public void setRequestParameter(String jsonString, String apiString) {
	// this.jsonString = jsonString;
	// this.apiString = apiString;
	// }

	/**
	 * 
	 * <p>
	 * This is the method for initializing the request parameter for api call.
	 * </p>
	 * @param jsonString
	 * @param apiString
	 */
	public void setRequestParameter(String jsonString, String baseUrl, ApiEnum urlDetails) {
		this.jsonString = jsonString;
		this.apiString = baseUrl + urlDetails.toString();
		this.responseJsonHeader = urlDetails.getTag();
	}

	/**
	 * 
	 * <p>
	 * This is the method for execute the api, by calling this thread's execute
	 * method.
	 * </p>
	 */
	public void executeApi() {
		try {
			List<Object> objArray = new ArrayList<Object>();
			objArray.add(jsonString);
			objArray.add(apiString);
			objArray.add(requestHeader);
			this.execute(objArray);
		} catch (Exception e) {
			Log.d(AppConstants.APP_TAG + "Exception", AppConstants.APP_TAG + " PostMethodExecutor executeApi() " + e);
		}
	}

	private ArrayList<NameValuePair> getNameValuePairFromJsonString(String jsonRequestString) {
		try {
			ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
			JSONObject requestJsonObject = new JSONObject(jsonRequestString);
			Iterator<String> keys = requestJsonObject.keys();
			while (keys.hasNext()) {
				String key = keys.next();
				String value = requestJsonObject.optString(key);
				nameValuePairs.add(new BasicNameValuePair(key, value));
			}
			return nameValuePairs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * <p>
	 * This is the method for set the request header.
	 * </p>
	 * @param httpPost the httpPost object
	 * @param headerMap the header map
	 * @return the httpPost object
	 */
	private HttpPost setRequestHeader(HttpPost httpPost, Map<String, String> headerMap) {
		for (Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpPost.setHeader(entry.getKey(), entry.getValue());
			Log.d(AppConstants.APP_TAG + "Get Key Values", AppConstants.APP_TAG + "Get Key Values" + entry.getKey()
					+ entry.getValue());
		}
		return httpPost;
	}

	/**
	 * 
	 * <p>
	 * This is the method for executePost.
	 * </p>
	 * @param jsonRequestString the json request string
	 * @param urlString the url string
	 * @param headerMap the map containing the request header variables
	 * @return builder the string
	 */
	public String executePost(String jsonRequestString, String urlString, Map<String, String> headerMap) {
		StringBuilder builder = new StringBuilder();
		HttpClient client = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(urlString);

		ArrayList<NameValuePair> nameValuePairs = getNameValuePairFromJsonString(jsonRequestString);
		// ArrayList<NameValuePair> nam = new ArrayList<NameValuePair>();
		// // nam.add(new BasicNameValuePair("data", jsonRequestString));
		// nam.add(new BasicNameValuePair("password",
		// "c8837b23ff8aaa8a2dde915473ce0991"));
		// nam.add(new BasicNameValuePair("member_email", "ronman@mac.com"));
		// nam.add(new BasicNameValuePair("key", "WSAND"));
		// // nam.add(new BasicNameValuePair("", jsonRequestString));
		Log.d(AppConstants.APP_TAG + "requesting URL------", AppConstants.APP_TAG + urlString);
		Log.d(AppConstants.APP_TAG + "sending data------", AppConstants.APP_TAG + jsonRequestString.toString());
		try {

			// UrlEncodedFormEntity form;
			// form = new UrlEncodedFormEntity(nam);
			// form.setContentEncoding(HTTP.UTF_8);
			// httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs,
			// "UTF-8"));
			// httpPost.setEntity(form);

			httpPost.setHeader("Content-Type", "application/json");
			httpPost.setHeader("Accept", "application/json");
			if (headerMap != null) {
				setRequestHeader(httpPost, headerMap);
			}
			httpPost.setEntity(new StringEntity(jsonRequestString, "UTF-8"));

			HttpResponse response = client.execute(httpPost);
			StatusLine statusLine = response.getStatusLine();
			int statusCode = statusLine.getStatusCode();
			if (statusCode == ViewConstants.STATUS_OK) {
				HttpEntity entity = response.getEntity();
				InputStream content = entity.getContent();
				BufferedReader reader = new BufferedReader(new InputStreamReader(content));
				String line;
				while ((line = reader.readLine()) != null) {
					builder.append(line);
				}
			} else {
				builder.append(getErrorJsonString(ViewConstants.INTERNAL_SERVER_ERROR, "R.string.internal_server_error"));
				Log.e("Post was not successfull", "Status code is "
						+ statusCode);
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
			builder.append(getErrorJsonString(ViewConstants.EXCEPTION_ERROR_CODE, "R.string.exception_text"));
		} catch (IOException e) {
			e.printStackTrace();
			builder.append(getErrorJsonString(ViewConstants.EXCEPTION_ERROR_CODE, "R.string.exception_text"));
		}
		Log.d(AppConstants.APP_TAG + "response------", AppConstants.APP_TAG + builder.toString());
		return builder.toString();
	}

	@Override
	protected String doInBackground(List<Object>... params) {
		try {
			if (checkNetworkUtil.isNetAvailable()) {
				if (params.length > 0) {
					List<Object> paramsList = params[0];
					String jsonRequest = paramsList.get(0).toString();
					String url = paramsList.get(1).toString();
					Map<String, String> headerMap = (Map<String, String>) paramsList.get(2);
					return executePost(jsonRequest, url, headerMap);
				}
			} else {
				return getErrorJsonString(ViewConstants.ERROR_NO_NETWORK, "R.string.no_network_available");
			}
		} catch (Exception e) {
			Log.e(AppConstants.APP_TAG + "Exception", AppConstants.APP_TAG + " PostMethodExecutor doInBackground()");
		}
		return null;
	}

	/**
	 * 
	 * <p>
	 * This is the method for getErrorJsonString.
	 * </p>
	 * @param errorCode the error code
	 * @param errorText the error string
	 * @return errorJson the jsonString
	 */
	private String getErrorJsonString(String errorCode, String errorText) {
		try {
			JSONObject errorJson = new JSONObject();

			JSONObject outerTagJson = new JSONObject();
			JSONObject errorObject = new JSONObject();
			errorObject.put("code", errorCode);
			errorObject.put("msg", errorText);
			errorJson.put("response", errorObject);
			outerTagJson.put(responseJsonHeader, errorJson);
			return outerTagJson.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void onPostExecute(String serverResponse) {
		serverResponseHandler.onServerResponse(serverResponse);
		super.onPostExecute(serverResponse);
	}
}
