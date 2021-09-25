package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBankAccountPage {

	
private static AddBankAccountPage AddBankAccountPageInstance;
	
	private AddBankAccountPage()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static AddBankAccountPage getInstance()
	{
		
		if(AddBankAccountPageInstance == null)
		{
			AddBankAccountPageInstance = new AddBankAccountPage();
		}
		return AddBankAccountPageInstance;
		
	}
	
	@FindBy(xpath  = "//span[contains(text(),'Add Bank Account')]")
	private WebElement Addbankaccount;

	public WebElement getAddbankaccount() {
		return Addbankaccount;
	}
	
	@FindBy(xpath  = "//span[contains(text(),'ANZ')]")
	private WebElement SelectANZ;

	public WebElement getSelectANZ() {
		return SelectANZ;
	}
	
	@FindBy(xpath  = "//input[@id='accountname-1025-inputEl']")
	private WebElement EnterAccountname;

	public WebElement getEnterAccountname() {
		return EnterAccountname;
	}
	
	@FindBy(id = "accounttype-1027-trigger-picker")
	private WebElement Selectaccounttype;

	public WebElement getSelectaccounttype() {
		return Selectaccounttype;
	}
	
	@FindBy(xpath = "//li[contains(text(),'Other')]")
	private WebElement Accounttype;

	public WebElement getAccounttype() {
		return Accounttype;
	}
	
	@FindBy(xpath = "//input[@id='accountnumber-1056-inputEl']")
	private WebElement Enteraccountnum;

	public WebElement getEnteraccountnum() {
		return Enteraccountnum;
	}
	
	@FindBy(xpath = "//a[@data-automationid='continueButton']")
	private WebElement Selectcontinue;

	public WebElement getSelectcontinue() {
		return Selectcontinue;
	}
	
	@FindBy(xpath = "//div[@id='notify01']")
	private WebElement Verifyaddedaccount;

	public WebElement getVerifyaddedaccount() {
		return Verifyaddedaccount;
	}
	
	
	
	
}
