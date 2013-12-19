package com.catsnap.views;

import android.os.Bundle;
import android.widget.Button;
public class LoginScreen extends BaseActity {
	private Button login;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
		bindViews();
	}
	private void bindViews() {
		login = (Button) findViewById(R.id.btn_login);
		
	}

}
