/*@(#)ServerResponseHandler.java}
 */
package com.catsnap.util;

/**
 * @author vipin.cb , vipin.cb@experionglobal.com
 * <br>Sep 12, 2013, 3:34:43 PM
 * <br>Package:- <b>com.veebow.util</b>
 * <br>Project:- <b>Veebow</b>
 * <p>
 */
public interface ServerResponseHandler {
	/**
	 * <p>The method that receives the response of post.<p>
	 * @param serverResponse the serverResponse
	 */
	void onServerResponse(String serverResponse);
}
