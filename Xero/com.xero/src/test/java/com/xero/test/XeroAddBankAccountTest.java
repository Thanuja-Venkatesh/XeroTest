package com.xero.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.xero.pageFactory.AccountPage;
import com.xero.pageFactory.AddBankAccountPage;
import com.xero.pageFactory.AuthenticationPage;
import com.xero.pageFactory.LoginPage;
import com.xero.pageFactory.SecurityQuestions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class XeroAddBankAccountTest{
	
	WebDriver driver = DriverManager.getDriver();

	@Given("Login with {string} and {string}")
	public void login_with_and(String userid, String password) {

		
		LoginPage.getInstance().getLogin().click();		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		
		LoginPage.getInstance().getEnterEmailID().sendKeys(userid);
		LoginPage.getInstance().getEnterPassword().sendKeys(password);
		
		LoginPage.getInstance().getClickLogin().click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
	
	}

	@And("Select authenticator type")
	public void select_authenticator_type() {

		
		AuthenticationPage.getInstance().getAuthtype().click();		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		
		AuthenticationPage.getInstance().getSelectauthtype().click();	
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

	}

	@And("Enter answer for authenticator question and submit")
	public void enter_answer_for_authenticator_question_and_submit() {
		
		String getQuestionOne = SecurityQuestions.getInstance().getquestionOne().getText();		
		String getQuestionTwo = SecurityQuestions.getInstance().getquestionTwo().getText();
		
		String que[] = {getQuestionOne,getQuestionTwo};
		WebElement ans[] = {SecurityQuestions.getInstance().getfirstAnswer(),SecurityQuestions.getInstance().getsecondAnswer()};


		for(int i=0; i<2; i++)
		{		
			switch(que[i]) {
			case "What was the name of your first pet?":
				ans[i].sendKeys("King");

				break;
			case "What is your dream job?":
				ans[i].sendKeys("Testing");

				break;
			case "What is your dream car?":
				ans[i].sendKeys("RollsR");
				break;
			}
		}
		
		SecurityQuestions.getInstance().getClickconfirm().click();		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

	}

	@When("Add bank account under accounting")
	public void add_bank_account_under_accounting() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		AccountPage.getInstance().getClickAccounting().click();
		
		AccountPage.getInstance().getSelectbankaccount().click();	
		AddBankAccountPage.getInstance().getAddbankaccount().click();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		AddBankAccountPage.getInstance().getSelectANZ().click();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		AddBankAccountPage.getInstance().getEnterAccountname().sendKeys("ANZ Account");
		AddBankAccountPage.getInstance().getSelectaccounttype().click();		
		AddBankAccountPage.getInstance().getAccounttype().click();

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		AddBankAccountPage.getInstance().getEnteraccountnum().sendKeys("0258632285647892");
		AddBankAccountPage.getInstance().getSelectcontinue().click();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

	}

	@Then("Check added account displaying or not")
	public void check_added_account_displaying_or_not() {
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		assertEquals(AddBankAccountPage.getInstance().getVerifyaddedaccount().getText(), "   ANZ Account added. Xero works better with your transactions. Get started by manually importing your bank transactions.");
	
	}
	
}
