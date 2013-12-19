package com.catsnap.views;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.catsnap.constant.AppConstants;
import com.parse.Parse;

public class SplashScreen extends BaseActity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_screen);
		initializeParser();
		startSplashTimer();

	}

	private void initializeParser() {
		Parse.initialize(this, AppConstants.PARSE_APP_ID,
				AppConstants.PARSE_CLIENT_ID);
	}

	private void startSplashTimer() {
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				toLoginScreen();
			}
		}, AppConstants.SPLASH_TIME_OUT);

	}

	protected void toLoginScreen() {
		Intent intent = new Intent(SplashScreen.this, LoginScreen.class);
		startActivity(intent);
		finish();
	}

}
