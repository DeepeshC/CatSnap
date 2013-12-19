package com.catsnap.constant;



public class AppConstants {
	public static final String APP_TAG = "CAT_SNAP";
	public static int SPLASH_TIME_OUT = 3000;
	/** The url enum. */
	public enum ApiEnum {
		// MEMBER_LOGIN("api/CustomerLogin"),
		// RESET_PASSWORD("api/resetPassword"), APP_SETTINGS(
		// "api/getApplicationConfigurations"), MEMBER_REGISTER(
		// "api/RegisterCustomer"), MEMBER_REGISTER_UPDATE(
		// "api/UpdateCustomerProfile"), TERMSANDSERVICE(
		// "api/getTermsOfService"), PRIVACYPOLICY("api/getPrivacyPolicy"),
		// LOGOUT(
		// "api/customerLogout"), RELATEDMERCHANTS(
		// "api/getrelatedmerchants"), UPDATESTATUSFLAG(
		// "api/updateSendMeDealsFlag"), DEAL_COLLECTION("api/getdeals"),
		// CUSTOMER_INBOX("api/getCustomerInboxEntries");
		MEMBER_LOGIN("api/CustomerLogin", "profileCollection"), RESET_PASSWORD(
				"api/resetPassword", "profileCollection"), APP_SETTINGS(
				"api/getApplicationConfigurations", "settingsCollection"), MEMBER_REGISTER(
				"api/RegisterCustomer", "profileCollection"), MEMBER_REGISTER_UPDATE(
				"api/UpdateCustomerProfile", "profileCollection"), TERMSANDSERVICE(
				"api/getTermsOfService", "termsofserviceCollection"), PRIVACYPOLICY(
				"api/getPrivacyPolicy", "privacyCollection"), LOGOUT("api/customerLogout",
				"logoutCollection"), RELATEDMERCHANTS(
				"api/getrelatedmerchants", "merchantCollection"), UPDATESTATUSFLAG(
				"api/updateSendMeDealsFlag", "merchantCollection"), DEAL_COLLECTION(
				"api/getdeals", "ObjectNameKey.DEAL_COLLECTION"), CUSTOMER_INBOX(
				"api/getCustomerInboxEntries", "customerInbox"), DEALDETILS(
				"api/getDealDetails", "dealCollection"), DEALREDEEM("api/RedeemDeal",
				"dealRedemptionDetails"), GET_CUSTOMER_PROFILE(
				"api/getCustomerProfile", "profileCollection"), NOTIFICATION_STATUS(
				"api/updateSendMeDealsFlag", "merchantCollection"), UPADATE_INBOX_ENTRY(
				"api/updateInboxEntryStatus", "unreadInboxItemsCount"), CUSTOMER_INBOX_UNREAD_MESSAGE_COUNT(
				"api/getCustomerInboxUnreadCount", "unreadInboxItemsCount"), UPDATE_PUSH_SETTINGS(
				"api/updatePushSettings", "pushNotificationSettings"), DELETE_FAV_MERCHANT(
				"api/deleteRelatedMerchant", "merchantCollection"), MARK_UNMARK_DEAL(
				"api/markUnmarkDealAsSaved", "merchantCollection"), GET_CATEGORIES(
				"api/getAllCategories", "ObjectNameKey.CATEGORIES_COLLECTION"), GET_ALL_DEAL_LOCATIONS(
				"api/getAllDealLocations", "dealCollection"), MARK_MERCHANT_RELATED("api/markMerchantAsRelated", "ObjectNameKey.MERCHANT_COLLECTION"),GAME_DEAL_REWARD("api/GetGameDealReward", "gameDealReward");

		private String value;
		private String objectTag;

		private ApiEnum(String val, String tag) {
			value = val;
			objectTag = tag;
		}

		@Override
		public String toString() {
			return this.value;
		}

		public String getTag() {
			return this.objectTag;
		}
	}
}
