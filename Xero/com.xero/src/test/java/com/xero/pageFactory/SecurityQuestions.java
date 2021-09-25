package com.xero.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityQuestions {
	
	
private static SecurityQuestions SecurityQuestionsInstance;
	
	private SecurityQuestions()
	{
		//constructor, just to stop creating objects for this class
	}
	
	public static SecurityQuestions getInstance()
	{
		
		if(SecurityQuestionsInstance == null)
		{
			SecurityQuestionsInstance = new SecurityQuestions();
		}
		return SecurityQuestionsInstance;
		
	}
	
	@FindBy(xpath  = "//label[@data-automationid='auth-firstanswer--label']")
	private WebElement questionOne;
	public WebElement getquestionOne() {
		return questionOne;
	}
	@FindBy(xpath  = "//label[@data-automationid='auth-secondanswer--label']")
	private WebElement questionTwo;
	public WebElement getquestionTwo() {
		return questionTwo;
	}

	
	@FindBy(xpath  = "//input[@data-automationid='auth-firstanswer--input']")
	private WebElement firstAnswer;
	public WebElement getfirstAnswer() {
		return firstAnswer;
	}

	
	@FindBy(xpath  = "//input[@data-automationid='auth-secondanswer--input']")
	private WebElement secondAnswer;
	public WebElement getsecondAnswer() {
		return secondAnswer;
	}

	@FindBy(xpath  = "//button[@data-automationid='auth-submitanswersbutton']")
	private WebElement Clickconfirm;
	public WebElement getClickconfirm() {
		return Clickconfirm;
	}
}
