package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancePage {
	
private static AdvancePage AdvancePageInstance;
	
	private AdvancePage()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static AdvancePage getInstance()
	{
		
		if(AdvancePageInstance == null)
		{
			AdvancePageInstance = new AdvancePage();
		}
		return AdvancePageInstance;
		
	}
	
	@FindBy(xpath  = "//button[contains(text(),'Accounting')]")
	private WebElement ClickAccountingtab;

	public WebElement getClickAccountingtab() {
		return ClickAccountingtab;
	}

	@FindBy(xpath  = "//a[contains(text(),'Advanced')]")
	private WebElement ClickAdvance;

	public WebElement getClickAdvance() {
		return ClickAdvance;
	}
	
	@FindBy(xpath  = "//span[contains(text(),'Chart of accounts')]")
	private WebElement Clickchart;

	public WebElement getClickchart() {
		return Clickchart;
	}

	@FindBy(xpath  = "(//a[contains(text(),'ANZ Account')]/ancestor::tr/td)[1]/div/input[@class='checkbox']")
	private WebElement ClickCheckbox;

	public WebElement getClickCheckbox() {
		return ClickCheckbox;
	}
	
	@FindBy(xpath  = "//a[contains(text(),'Delete')]")
	private WebElement deleteAccount;

	public WebElement getdeleteAccount() {
		return deleteAccount;
	}

	@FindBy(xpath  = "//a[contains(text(),'OK')]")
	private WebElement deleteConfirm;

	public WebElement getdeleteConfirm() {
		return deleteConfirm;
	}
	
	@FindBy(xpath  = "(//div[@class='message'])[2]/p")
	private WebElement deleteMessage; 

	public WebElement getdeleteMessage() {
		return deleteMessage;
	}
}
