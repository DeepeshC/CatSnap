/*@(#)ViewConstants.java}
 */
package com.catsnap.views;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;

/**
 * @author vipin.cb , vipin.cb@experionglobal.com <br>
 *         Sep 5, 2013, 6:47:41 PM <br>
 *         Package:- <b>com.veebow.views</b> <br>
 *         Project:- <b>Veebow</b>
 *         <p>
 */
public class ViewConstants {
	/** The constant isToBackground. */
	public static boolean isToBackground;
	/** The previous context. */
	public static Context previousContext;
	/** The splash time - determines how long to show splash screen. */
	public static final int SPLASH_TIME = 3000;// 3 seconds
	/** The constant Request code gps. */
	public static final int REQUEST_CODE_GPS = 7;
	/** The constant STATUS_OK. */
	public static final int STATUS_OK = 200;
	/** The constant RESPONSE_SUCCESS. */
	public static final int RESPONSE_SUCCESS = 1;
	/** The constant RESPONSE_FAILURE. */
	public static final int RESPONSE_FAILURE = 0;
	/** The constant RESPONSE_SUCCESS. */
	public static final int VALUE_TRUE = 1;
	/** The constant RESPONSE_FAILURE. */
	public static final int VALUE_FALSE = 0;
	/** The constant ALARM_REQUEST_ID. */
	public static final int ALARM_REQUEST_ID = 1;
	/** The constant ALARM_REQUEST_ID_BADGE. */
	public static final int ALARM_REQUEST_ID_BADGE = 2;
	/** The constant ALARM_REQUEST_ID_GAME_DURATION. */
	public static final int ALARM_REQUEST_ID_GAME_DURATION = 3;
	/** The constant DEAL_DETAIL_REQUEST_CODE. */
	public static final int DEAL_DETAIL_REQUEST_CODE = 11;
	/** The gps fetch time. */
	public static final int GPS_FETCH_TIME = 5000;
	/** The integer constant IO_STREAM_BUFFER_SIZE. */
	public static final int IO_STREAM_BUFFER_SIZE = 1024;
	/** The integer constant BUTTON_POSITIVE. */
	public static final int BUTTON_POSITIVE = -1;
	/** The integer constant BUTTON_NEGATIVE. */
	public static final int BUTTON_NEGATIVE = -2;
	/** The integer constant BUTTON_NEUTRAL. */
	public static final int BUTTON_NEUTRAL = -3;
	/** The integer constant ADD_LOCATION_OBJ_POSITION. */
	public static final int ADD_LOCATION_OBJ_POSITION = 0;
	/** The integer constant GAME_DURATION_UPDATE_TIME_INTERVAL_MINTS_DEFAULT. */
	public static final int GAME_DURATION_UPDATE_TIME_INTERVAL_MINTS_DEFAULT = 1;
	/** The integer constant BADGE_SWITCH_TIME_INTERVAL_SEC_DEFAULT. */
	public static final int BADGE_SWITCH_TIME_INTERVAL_SEC_DEFAULT = 2;
	/** The integer constant TIMELY_REFRESH_TIME_INTERVAL_MINTS_DEFAULT. */
	public static final int TIMELY_REFRESH_TIME_INTERVAL_MINTS_DEFAULT = 10;
	/** The integer constant MERCHANT_CODE_MAX_CHARACTER_LIMIT. */
	public static final int MERCHANT_CODE_MAX_CHARACTER_LIMIT = 10;
	/** The integer constant IS_WITH_IN_GEOFENCE_RADIUS_DEFAULT. */
	public static final float IS_WITH_IN_GEOFENCE_RADIUS_DEFAULT = 400;//in meters
	/** The GPS constant. */
	public static final String GPS = "gps";
	/** The NETWORK constant. */
	public static final String NETWORK = "network";
	/** The constant FINISH. */
	public static final String FINISH = "FINISH";
	/** The constant ALARM_NOTIFICATION_DEAL_REFRESH. */
	public static final String ALARM_NOTIFICATION_DEAL_REFRESH = "ALARM_NOTIFICATION_DEAL_REFRESH";
	/** The constant ALARM_NOTIFICATION_BADGE_TOGGLE. */
	public static final String ALARM_NOTIFICATION_BADGE_TOGGLE = "ALARM_NOTIFICATION_BADGE_TOGGLE";
	/** The constant ALARM_NOTIFICATION_GAME_DURATION. */
	public static final String ALARM_NOTIFICATION_GAME_DURATION = "ALARM_NOTIFICATION_GAME_DURATION";
	/** The constant ALARM_NOTIFICATION. */
	public static final String INBOX_REFRESH_NOTIFICATION = "INBOX_REFRESH_NOTIFICATION";
	/** The constant ALARM_NOTIFICATION. */
	public static final String UNREAD_MESSAGE_COUNT_NOTIFICATION = "UNREAD_MESSAGE_COUNT_NOTIFICATION";
	/** The constant REFRESH. */
	public static final String REFRESH = "REFRESH";
	/** The constant UPDATE_UI. */
	public static final String UPDATE_UI = "UPDATE_UI";
	/** The constant ERROR_MSG. */
	public static final String ERROR_MSG = "ERROR";
	/** The constant GPS_MESSAGE_CANCELLED. */
	public static final String GPS_MESSAGE_CANCELLED = "GPS_MESSAGE_CANCELLED";
	/** The constant INTENT_TYPE_BROADCAST. */
	public static final String INTENT_TYPE_BROADCAST = "text/plain";
	/** The constant TEXT_TYPE_HTML. */
	public static final String TEXT_TYPE_HTML = "text/html";
	/** The constant STATUS_OK_GEOCODER. */
	public static final String STATUS_OK_GEOCODER = "OK";
	/** The constant STATUS_ERROR_GEOCODER. */
	public static final String STATUS_ERROR_GEOCODER = "ERROR";
	/** The constant STATUS_ERROR_GEOCODER. */
	public static final String TRUE = "1";
	/** The constant deal_id. */
	public static final String DEAL_DETAILS = "deal_details";
	/** The string constant FROM_INBOX. */
	public static final String FROM_INBOX = "FROM_INBOX";
	public static final String SELECTED_REWARD_ID = "reward_id";
	public static final String IS_FROM_GAME_DEAL = "is_from_game_deal";
	
	/** The constant deal_id. */
	public static final String REDEMPTION_DETAILS = "redemption_details";
	/** The constant deal_id. */
	public static final String CURRENT_lOCATION = "current_location";
	/** The constant FALSE. */
	public static final String FALSE = "0";
	// /** The constant GPS_DIALOG_DISMISSED. */
	// public static final String GPS_DIALOG_DISMISSED = "GPS_DIALOG_DISMISSED";
	public static String ERROR_NO_NETWORK = "999";
	/** The string INTERNAL_SERVER_ERROR. */
	public static String INTERNAL_SERVER_ERROR = "998";
	/** The string EXCEPTION_ERROR_CODE. */
	public static String EXCEPTION_ERROR_CODE = "997";
	/** The Constant SEED_16_CHARACTER. */
	public static final String SEED_16_CHARACTER = "U1MjU1M0FDOUZ.Qz";
	/** The string VEEBOW_CACHE. */
	public static String VEEBOW_CACHE = "Veebow_Cache";
	/** The string VEEBOW_CACHE. */
	public static String CUSTOMER_INBOX_OPERATION_VIEW = "1";
	/** The string VEEBOW_CACHE. */
	public static String CUSTOMER_INBOX_OPERATION_DELETE = "2";
	/** The string ACCOUNT_SUSPENDED_ERROR_CODE. */
	public static String ACCOUNT_SUSPENDED_ERROR_CODE = "2";

	/** The Constant of merchantandqrcode. */
	public static String MERCHANT_QRCODE = "123";

	/** The Constant of REWARD_ID. */
	public static String REWARD_ID = "5";
	/** The Constant of IS_DEAL_LIST_REFRESH_REQUIRED_TAG. */
	public static String IS_DEAL_LIST_REFRESH_REQUIRED_TAG = "IS_DEAL_LIST_REFRESH_REQUIRED_TAG";

	/** The Constant of Termsand condition field. */
	public static final String webviewdata = "webviewdata";
	/** The Constant of Termsand condition field. */
	public static final String MESSAGE_READ = "1";
	/** The Constant of LOGIN_NORMAL. */
	public static final int LOGIN_NORMAL = 0;
	/** The Constant of LOGIN_NORMAL. */
	public static final int LOGIN_FACEBOOK = 1;
	/** The Constant of LOGIN_NORMAL. */
	public static final int REGISTER_NORMAL = 0;
	/** The Constant of LOGIN_NORMAL. */
	public static final int REGISTER_FACEBOOK = 1;
	/** The Constant of THOUSAND. */
	public static final int THOUSAND = 1000;
	/** The Constant DEFAULT_POS_ALL_CATEGORY. */
	public static final int DEFAULT_POS_ALL_CATEGORY = 1;
	/** The Constant MIN_CHARACTERS_TO_INSTANTIATE_SEARCH. */
	public static final int MIN_CHARACTERS_TO_INSTANTIATE_SEARCH = 3;
	/** The Constant DAY_IN_HOUR. */
	public static final int DAY_IN_HOUR = 24;
	/** The Constant MULTI_DAYS_MIN_HOUR. */
	public static final int MULTI_DAYS_MIN_HOUR = 48;
	/** The Constant MINUTES_TO_HOUR_DIVIDENT. */
	public static final int MINUTES_TO_HOUR_DIVIDENT = 60;
	/** The Constant MINTS_TO_DAY_DIVIDENT. */
	public static final int MINTS_TO_DAY_DIVIDENT = 24 * 60;
	/** The Constant AN_HOUR. */
	public static final int AN_HOUR = 1;
	/** The Constant MILLIS_TO_MINUTES. */
	public static final int MILLIS_TO_MINUTES = 1000 * 60;
	/** The Constant DEGREE_0. */
	public static final int DEGREE_0 = 0;
	/** The Constant DEGREE_180. */
	public static final int DEGREE_180 = 180;
	/** The Constant GPS_DISTANCE_TRADE_OFF. */
	public static final double GPS_DISTANCE_TRADE_OFF = 20.00;
	/** The Constant of TEXT_TYPE. */
	public static final String TEXT_TYPE = "text/html";

	/** The Constant of Termsand condition field. */
	public static final String UTF_8 = "utf-8";

	/** The Constant of Termsand condition field. */

	/** The Constant of deviceType. */
	public static final String DEVICE_TYPE = "1";

	/** The Constant of isPushNotificationEnabled. */
	public static final String isPushNotificationEnabled = "1";

	/** The Constant of isPushNotificationDesabled. */
	public static final String isPushNotificationDisabled = "0";

	/** The Constant of myPrefs. */
	public static final String myPrefs = "myPrefs";

	/** The Constant of deviceid. */
	public static final String deviceid = "deviceid";

	/** The Constant of datePicker. */
	public static final String datePicker = "datePicker";

	/** The Constant CUSTOMER_ID_TAG. */
	public static final String CUSTOMER_ID_TAG = "CustomerId";

	/** The Constant AUTHORIZATION_TAG. */
	public static final String AUTHORIZATION_TAG = "Authorization";

	/** The Constant AUTHORIZATION_STRING_DELIMITER. */
	public static final String AUTHORIZATION_STRING_DELIMITER = ":";

	/** The Constant messageDetails. */
	public static final String messageDetails = "messageDetails";

	/** The Constant dealDetails. */
	public static final String dealDetails = "dealDetails";
	
	/** The Constant dealDetailsValues. */
	public static final String DEAL_DETAIL_VALUES = "dealDetailsValues";

	/** The Constant MD5_PREAPPEND_INTEGER. */
	public static final String MD5_PRE_APPEND_INTEGER = "0";
	/** The Constant MD5_PREAPPEND_INTEGER. */
	public static final String FROM_REGISTER_SCREEN = "from_register_screen";
	/** The Constant WELCOME_USER_MESSAGE. */
	public static final String WELCOME_USER_MESSAGE = "Welcome user";
	/** The Constant FACEBOOK_EMAIL_TAG. */
	public static final String FACEBOOK_EMAIL_TAG = "email";
	/** The Constant FACEBOOK_GENDER_TAG. */
	public static final String FACEBOOK_GENDER_TAG = "gender";
	/** The Constant HOME_TOWN. */
	public static final String HOME_TOWN = "hometown";
	/** The Constant NAME_TAG. */
	public static final String NAME_TAG = "name";
	/** The Constant FACEBOOK_TAG_LOCATION. */
	public static final String FACEBOOK_TAG_LOCATION = "location";
	/** The Constant ZIP_CODE_EXPRESSION. */
	public static final String ZIP_CODE_EXPRESSION = "//GeocodeResponse/result/address_component[type=\"postal_code\"]/long_name/text()";
	/** The Constant ZIP_CODE_INPUT_SOURCE. */
	public static final String ZIP_CODE_INPUT_SOURCE = "https://maps.googleapis.com/maps/api/geocode/xml?latlng=";
	/** The Constant WAKE_LOCK_TAG. */
	public static final String WAKE_LOCK_TAG = "WakeLock";
	/** The Constant MARK_UNMARK_READ. */
	public static final String MARK_UNMARK_READ = "1";
	/** The Constant MARK_UNMARK_DELETE. */
	public static final String MARK_UNMARK_DELETE = "2";
	/** The Constant FACEBOOK_POST_MESSAGE. */
	public static final int FACEBOOK_POST_MESSAGE = 1;
	/** The Constant TWITTER_POST_MESSAGE. */
	public static final int TWITTER_POST_MESSAGE = 2;
	/** The Constant ALL_DEALS_CATEGORY_ID. */
	public static final String ALL_DEALS_CATEGORY_ID = "ID_ALL_DEALS";
	/** The Constant PUSH_NOTIFICATION_MSG_KEY. */
	public static final String PUSH_NOTIFICATION_MSG_KEY = "message";
	/** The Constant DEAL_DETAIL_VIEW_REDEEM. */
	public static final String DEAL_DETAIL_VIEW_REDEEM = "DEAL_DETAIL_VIEW_REDEEM";

	/** Email regular expression. */
	public static final String regEmail = "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
			+ "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
			+ "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
			+ "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
			+ "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
			+ "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

	// /** Email regular expression. */
	// public static final String regzipcode =
	// "(/(^\\d{5}$)|(^\\d{5}-\\d{4}$)/)";

	/** Email regular expression. */
	public static final String regzipcode = "\\d{5}(-\\d{4})?";

	/** The DateFormat enum constant. */
	public enum DateFormats {
		DDMMMYYY_HYPHEN("dd-MMM-yyyy"), DDMMYYYY_HYPHEN("dd-MM-yyyy"), YYYYMMDD_HYPHEN(
				"yyyy-MM-dd"), DMY_SLASH("%m/%d/%Y"), MMMDY_SPACE("MMM dd yyyy"), MMMD_SPACE(
				"MMM dd"), YYYY("yyyy"), HHMMA_COLON_SPACE("hh:mm a"), YMD_HYPHEN_HMS(
				"%Y-%m-%d %H:%M:%S"), YMD_HYPHEN("yyyy-MM-dd"), MDY_SLASH(
				"MM/dd/yyyy"), MDY_HYPHEN("MM-dd-yyyy"), MMMDY_HYPHEN(
				"MMM-dd-yyyy");

		private String value;

		private DateFormats(String val) {
			value = val;
		}

		@Override
		public String toString() {

			return this.value;
		}
	};

	/** The DateFormat enum constant. */
	public enum CustomerInboxType {
		// 0 - By ADIMIN, 1- By Merchant, 2 – Deal, 3 – Voucher
		ADMIN_MESSAGE, MERCHANT_MESSAGE, DEAL, VOUCHER
	};

	/** The constant MERCHANT_CODE_REQUIRED. */
	public static final String MERCHANT_CODE_REQUIRED = "1";
	/** The constant MERCHANT_CODE_NOT_REQUIRED. */
	public static final String MERCHANT_CODE_NOT_REQUIRED = "0";

	/** The constant TEST_VALUE. */
	public static final String TEST_VALUE = "123";
	
	public static final String MARQUEE_TIME_FORMAT = "HH:mm:ss";
	public static final String MARQUEE_TEXT_FORMAT = "%s...............%s...............%s...............%s";

	/**
	 * 
	 * @author vipin.cb , vipin.cb@experionglobal.com <br>
	 *         Oct 9, 2013, 7:33:26 PM <br>
	 *         Package:- <b>com.veebow.views</b> <br>
	 *         Project:- <b>Veebow_local</b>
	 *         <p>
	 */
	public enum ScreenTag {
		DEAL_LIST_TAG("DealListFragment"), DEAL_MAP_TAG("DealMapFragment");

		/** The map to hold all the enums of this enum. */
		private static final Map<Integer, ScreenTag> screenTagMap = new HashMap<Integer, ScreenTag>();
		/** The name of enum. */
		private String value;

		/**
		 * 
		 * Constructor for ScreenTag.
		 * @param val the name of the enum
		 */
		private ScreenTag(String val) {
			value = val;
		}

		/**
		 * Create a map with all enums
		 */
		static {
			for (ScreenTag screenTag : EnumSet.allOf(ScreenTag.class))
				screenTagMap.put(screenTag.ordinal(), screenTag);
		}

		/**
		 * 
		 * <p>
		 * This is the method for get the enum providing index.
		 * </p>
		 * @param index the index
		 * @return the enum of ScreenTag type
		 */
		public static ScreenTag valueOf(int index) {
			return screenTagMap.get(index);
			// return ScreenTag.values()[index];
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

	/**
	 *
	 * @author vipin.cb , vipin.cb@experionglobal.com
	 * <br>Oct 30, 2013, 9:44:01 PM
	 * <br>Package:- <b>com.veebow.views</b>
	 * <br>Project:- <b>Veebow_local</b>
	 * <p>
	 */
	public enum CategoryViewType {
		TEXT_VIEW("TextView"), EDIT_TEXT("EditText");
		
		/** The map to hold all the enums of this enum. */
		private static final Map<Integer, CategoryViewType> categoryTypeMap = new HashMap<Integer, CategoryViewType>();
		/** The name of enum. */
		private String value;
		
		/**
		 * 
		 * Constructor for CategoryViewType.
		 * @param val the name of the enum
		 */
		private CategoryViewType(String val) {
			value = val;
		}
		
		/**
		 * Create a map with all enums
		 */
		static {
			for (CategoryViewType categoryViewType : EnumSet.allOf(CategoryViewType.class))
				categoryTypeMap.put(categoryViewType.ordinal(), categoryViewType);
		}
		
		/**
		 * 
		 * <p>
		 * This is the method for get the enum providing index.
		 * </p>
		 * @param index the index
		 * @return the enum of CategoryViewType type
		 */
		public static CategoryViewType valueOf(int index) {
			return categoryTypeMap.get(index);
		}
		
		@Override
		public String toString() {
			return this.value;
		}
	}

	/**
	 * 
	 * @author vipin.cb , vipin.cb@experionglobal.com <br>
	 *         Oct 24, 2013, 5:23:41 PM <br>
	 *         Package:- <b>com.veebow.views</b> <br>
	 *         Project:- <b>Veebow_local</b>
	 *         <p>
	 */
	public enum DealType {
		PUBLIC(1), TARGETED_DEAL(2), GAME_DEAL(3), PUNCHCARD_DEAL(4);

		/** The map to hold all the enums of this enum. */
		private static final Map<Integer, DealType> dealTypeMap = new HashMap<Integer, DealType>();
		/** The custom ordinal. */
		private int value;

		/**
		 * 
		 * Constructor for DealType.
		 * @param val the value
		 */
		private DealType(int val) {
			this.value = val;
		}

		/**
		 * Create a map with all enums
		 */
		static {
			for (DealType dealType : EnumSet.allOf(DealType.class))
				dealTypeMap.put(dealType.ordinal(), dealType);
		}

		/**
		 * 
		 * <p>
		 * This is the method for get the enum with the given ordinal.
		 * </p>
		 * @param index the index
		 * @return the deal type
		 */
		public static DealType valueOf(int index) {
			return dealTypeMap.get(index);
		}

		/**
		 * 
		 * <p>
		 * This is the method for get the custom ordinal.
		 * </p>
		 * @return the ordinal
		 */
		public int getCustomOrdinal() {
			return value;
		}
	}

	/**
	 *
	 * @author vipin.cb , vipin.cb@experionglobal.com
	 * <br>Nov 12, 2013, 5:16:45 PM
	 * <br>Package:- <b>com.veebow.views</b>
	 * <br>Project:- <b>Veebow_local</b>
	 * <p>
	 */
	public enum TimeUnits {
		MINUTE("m"), HOUR("h"), DAY("d");
		
		/** The name of enum. */
		private String value;

		/**
		 * 
		 * Constructor for TimeUnits.
		 * @param val the value
		 */
		private TimeUnits(String val) {
			this.value = val;
		}

		@Override
		public String toString() {
			return this.value;
		}
	}

	/**
	 * 
	 * @author arunkumar.s,arunkumar.s@experionglobal.com <br>
	 *         Oct 25, 2013 <br>
	 *         Package:- <b>{com.veebow.views</b> <br>
	 *         Project:- <b>{Veebow</b>
	 *         <p>
	 *         Holds all the settings values obtained from the server
	 */
	public enum ApplicationSettings {
		REGISTER_V_POINTS("REGISTER_V_POINTS"), SHARE_V_POINTS("SHARE_V_POINTS"), RESET_PWD_LINK_EXPIRY_HRS(
				"RESET_PWD_LINK_EXPIRY_HRS"), MIN_PASSWORD_LENGTH("MIN_PASSWORD_LENGTH"), PASSWORD_EXPRESSION("PASSWORD_EXPRESSION"), RANDOM_KEY_LENGTH(
				"RANDOM_KEY_LENGTH"), INVALID_PASSWORD_MESSAGE("INVALID_PASSWORD_MESSAGE"), APPLICATION_DATE_FORMAT(
				"APPLICATION_DATE_FORMAT"), ADMIN_MAIL("ADMIN_MAIL"), MAX_DECIMAL_POINTS("MAX_DECIMAL_POINTS"), MIN_REFUND_AMOUNT_FOR_APPROVAL(
				"MIN_REFUND_AMOUNT_FOR_APPROVAL"), REFUND_MANAGER_EMAIL("REFUND_MANAGER_EMAIL"), KEEP_BACKUP_DAYS("KEEP_BACKUP_DAYS"), DEFAULT_SEARCH_RADIUS_MILES(
				"DEFAULT_SEARCH_RADIUS_MILES"), END_SOON_NOTIFICATION_PERIOD("END_SOON_NOTIFICATION_PERIOD"), MERCHANT_HISTOGRAM_RPT_DAYS(
				"MERCHANT_HISTOGRAM_RPT_DAYS"), SPLASH_SCREEN_TIME_PERIOD_SEC("SPLASH_SCREEN_TIME_PERIOD_SEC"), GEOGRAPHIC_DISTANCE_ALL(
				"GEOGRAPHIC_DISTANCE_ALL"), GEOGRAPHIC_DISTANCE_RELATED("GEOGRAPHIC_DISTANCE_RELATED"), ALLOWED_ARTWORK_WIDTH_PX(
				"ALLOWED_ARTWORK_WIDTH_PX"), ALLOWED_ARTWORK_HEIGHT_PX("ALLOWED_ARTWORK_HEIGHT_PX"), GD_REP_RWD_PROB_LMT(
				"GD_REP_RWD_PROB_LMT"), GD_REP_RWD_WARN_PROB_LMT("GD_REP_RWD_WARN_PROB_LMT"), CUSTOMER_DAILY_MSG_CAP(
				"CUSTOMER_DAILY_MSG_CAP"), ARTWORK_CACHE_PERIOD_HRS("ARTWORK_CACHE_PERIOD_HRS"), MAX_NO_OF_ARTWORKS_CACHED(
				"MAX_NO_OF_ARTWORKS_CACHED"), GD_PLAY_AGAIN_UPD_MINUTES("GD_PLAY_AGAIN_UPD_MINUTES"), BADGE_SWITCH_TIME_INTERVAL_SEC(
				"BADGE_SWITCH_TIME_INTERVAL_SEC"), DEAL_LIST_REFRESH_DISTANCE_MTS("DEAL_LIST_REFRESH_DISTANCE_MTS"), DEAL_LIST_REFRESH_TIME_MINUTES(
				"DEAL_LIST_REFRESH_TIME_MINUTES"), MOBILE_DATE_TIME_FORMAT("MOBILE_DATE_TIME_FORMAT"), APPLICATION_DATE_REQUEST_FORMAT(
				"APPLICATION_DATE_REQUEST_FORMAT"), MOBILE_DATE_RESPONSE_FORMAT("MOBILE_DATE_RESPONSE_FORMAT"), MOBILE_DATE_TIME_RESPONSE_FORMAT(
				"MOBILE_DATE_TIME_RESPONSE_FORMAT"), JOINED_LBL_SHOW_TIME_INTERVAL_SEC("JOINED_LBL_SHOW_TIME_INTERVAL_SEC"),GD_MIN_SWIPE_SPEED("GD_MIN_SWIPE_SPEED");

//		REGISTER_V_POINTS("1"), SHARE_V_POINTS("2"), RESET_PWD_LINK_EXPIRY_HRS(
//				"3"), MIN_PASSWORD_LENGTH("4"), PASSWORD_EXPRESSION("5"), RANDOM_KEY_LENGTH(
//						"6"), INVALID_PASSWORD_MESSAGE("7"), APPLICATION_DATE_FORMAT(
//								"8"), ADMIN_MAIL("9"), MAX_DECIMAL_POINTS("10"), MIN_REFUND_AMOUNT_FOR_APPROVAL(
//										"11"), REFUND_MANAGER_EMAIL("12"), KEEP_BACKUP_DAYS("15"), DEFAULT_SEARCH_RADIUS_MILES(
//												"16"), END_SOON_NOTIFICATION_PERIOD("17"), MERCHANT_HISTOGRAM_RPT_DAYS(
//														"20"), SPLASH_SCREEN_TIME_PERIOD_SEC("37"), GEOGRAPHIC_DISTANCE_ALL(
//																"38"), GEOGRAPHIC_DISTANCE_RELATED("39"), ALLOWED_ARTWORK_WIDTH_PX(
//																		"40"), ALLOWED_ARTWORK_HEIGHT_PX("41"), GD_REP_RWD_PROB_LMT(
//																				"42"), GD_REP_RWD_WARN_PROB_LMT("43"), CUSTOMER_DAILY_MSG_CAP(
//																						"44"), ARTWORK_CACHE_PERIOD_HRS("45"), MAX_NO_OF_ARTWORKS_CACHED(
//																								"46"), GD_PLAY_AGAIN_UPD_MINUTES("47"), BADGE_SWITCH_TIME_INTERVAL_SEC(
//																										"48"), DEAL_LIST_REFRESH_DISTANCE_MTS("49"), DEAL_LIST_REFRESH_TIME_MINUTES(
//																												"50"), MOBILE_DATE_TIME_FORMAT("51"), APPLICATION_DATE_REQUEST_FORMAT(
//																														"52"), MOBILE_DATE_RESPONSE_FORMAT("53"), MOBILE_DATE_TIME_RESPONSE_FORMAT(
//																																"54"), JOINED_LBL_SHOW_TIME_INTERVAL_SEC("55");

		private String value;

		private ApplicationSettings(String val) {
			value = val;
		}

		@Override
		public String toString() {

			return this.value;
		}
	};

	/**
	 *
	 * @author vipin.cb , vipin.cb@experionglobal.com
	 * <br>Dec 12, 2013, 11:32:45 PM
	 * <br>Package:- <b>com.veebow.views</b>
	 * <br>Project:- <b>Veebow_local</b>
	 * <p>
	 */
	public enum ImageResolution {
		LOW(1), HIGH(2);
		/** The map to hold all the enums of this enum. */
		private static final Map<Integer, DealType> dealTypeMap = new HashMap<Integer, DealType>();
		/** The custom ordinal. */
		private int value;

		/**
		 * 
		 * Constructor for ImageResolution.
		 * @param val the value
		 */
		private ImageResolution(int val) {
			this.value = val;
		}

		/**
		 * 
		 * <p>
		 * This is the method for get the custom ordinal.
		 * </p>
		 * @return the ordinal
		 */
		public int getCustomOrdinal() {
			return value;
		}
	};
}
