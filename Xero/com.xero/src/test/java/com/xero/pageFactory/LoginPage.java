package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

private static LoginPage LoginPageInstance;
	
	private LoginPage()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static LoginPage getInstance()
	{
		
		if(LoginPageInstance == null)
		{
			LoginPageInstance = new LoginPage();
		}
		return LoginPageInstance;
		
	}
	
	@FindBy(xpath  = "(//a[contains(text(),'Log in')])[2]")
	private WebElement Login;

	public WebElement getLogin() {
		return Login;
	}
	
	@FindBy(name = "Username")
	private WebElement EnterEmailID;

	public WebElement getEnterEmailID() {
		return EnterEmailID;
	}
	
	@FindBy(xpath  = "//input[@name='Password']")
	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	
	@FindBy(xpath  = "//button[contains(text(),'Log in')]")
	private WebElement ClickLogin;

	public WebElement getClickLogin() {
		return ClickLogin;
	}
}
