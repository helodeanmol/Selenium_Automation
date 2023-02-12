package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	// Click Email or Phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter username
	public void enterUsername() {
		enterData("EmailOrPhone", "testData1");
	}

	// Click password
	public void clickPassword() {
		click("Password");
	}

	// Enter Password
	public void enterPassword() {
		enterData("Password", "testData2");
	}
// click login button
	public void clickLoginButton() {
		click("LoginButton");
	}
}
