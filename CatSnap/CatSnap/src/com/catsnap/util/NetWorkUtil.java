/*@(#)NetWorkUtil.java}
 */
package com.catsnap.util;

import com.catsnap.constant.AppConstants;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;



/**
 * @author vipin.cb , vipin.cb@experionglobal.com
 * <br>Sep 5, 2013, 6:28:56 PM
 * <br>Package:- <b>com.veebow.util</b>
 * <br>Project:- <b>Veebow</b>
 * <p>
 */
public class NetWorkUtil {
	/** The context of the calling function. */
    private Context context;

    /**
     *
     * Constructor for NetworkUtil.
     * @param context the context
     */
    public NetWorkUtil(Context context) {
    	this.context = context;
    }

    /**
     * <p>This is the method for checking the network is available or not.</p>
     * @param context current context
     * @return available for available context
     */
    public boolean isNetAvailable() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)
                        context.getSystemService(Context.CONNECTIVITY_SERVICE);

            NetworkInfo wifiNetwork = connectivityManager
                             .getNetworkInfo(ConnectivityManager.TYPE_WIFI);

            NetworkInfo mobileNetwork = connectivityManager
                             .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            NetworkInfo activeNetwork = connectivityManager
                                            .getActiveNetworkInfo();

//            if (wifiNetwork != null || mobileNetwork != null
//                 || activeNetwork != null) {
//                available = true;
//            }
            if (wifiNetwork.isConnected() || mobileNetwork.isConnected()) {
				return true;
			} else {
				return false;
			}
        } catch (Exception e) {
        	Log.d(AppConstants.APP_TAG + "Exception", AppConstants.APP_TAG + " NetworkUtil isNetAvailable()" + e);
            return false;
        }
     }
}
