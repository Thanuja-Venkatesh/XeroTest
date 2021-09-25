package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

private static AccountPage AccountPageInstance;
	
	private AccountPage()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static AccountPage getInstance()
	{
		
		if(AccountPageInstance == null)
		{
			AccountPageInstance = new AccountPage();
		}
		return AccountPageInstance;
		
	}
	
	
	@FindBy(xpath  = "//button[contains(text(),'Accounting')]")
	private WebElement ClickAccounting;

	public WebElement getClickAccounting() {
		return ClickAccounting;
	}
	
	@FindBy(xpath = "//a[contains(text(),'Bank accounts')]")
	private WebElement Selectbankaccount;

	public WebElement getSelectbankaccount() {
		return Selectbankaccount;
	}	
}
