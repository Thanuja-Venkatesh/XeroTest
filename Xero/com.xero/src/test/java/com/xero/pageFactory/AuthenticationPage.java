package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {
	
private static AuthenticationPage AuthenticationPageInstance;
	
	private AuthenticationPage()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static AuthenticationPage getInstance()
	{
		
		if(AuthenticationPageInstance == null)
		{
			AuthenticationPageInstance = new AuthenticationPage();
		}
		return AuthenticationPageInstance;
		
	}
	
	@FindBy(xpath  = "//button[contains(text(),'Use another authentication method')]")
	private WebElement Authtype;

	public WebElement getAuthtype() {
		return Authtype;
	}
	
	@FindBy(xpath = "//button[@data-automationid='auth-authwithsecurityquestionsbutton']")
	private WebElement Selectauthtype;

	public WebElement getSelectauthtype() {
		return Selectauthtype;
	}
	
}

