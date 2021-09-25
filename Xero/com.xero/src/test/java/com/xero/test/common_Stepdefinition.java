package com.xero.test;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.xero.pageFactory.AccountPage;
import com.xero.pageFactory.AddBankAccountPage;
import com.xero.pageFactory.AdvancePage;
import com.xero.pageFactory.AuthenticationPage;
import com.xero.pageFactory.LoginPage;
import com.xero.pageFactory.SecurityQuestions;

public class common_Stepdefinition extends DriverManager {

	public static WebDriver driver;

	@io.cucumber.java.Before
	public static void setup() {

		DriverManager.launchBrowser();

		driver = DriverManager.getDriver();

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		common_Stepdefinition.initWebElements();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.xero.com/nz/"); 
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

	}
	@io.cucumber.java.After
	public void teardown() {


		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		AdvancePage.getInstance().getClickAccountingtab().click();

		AdvancePage.getInstance().getClickAdvance().click();

		AdvancePage.getInstance().getClickchart().click();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		AdvancePage.getInstance().getClickCheckbox().click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		AdvancePage.getInstance().getdeleteAccount().click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		AdvancePage.getInstance().getdeleteConfirm().click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		String deleteMessage = AdvancePage.getInstance().getdeleteMessage().getText(); 
		assertEquals(deleteMessage, "1 account has been deleted");
		driver.close();

	}

	public static void initWebElements()
	{
		PageFactory.initElements(driver, LoginPage.getInstance());
		PageFactory.initElements(driver, AccountPage.getInstance());
		PageFactory.initElements(driver, AddBankAccountPage.getInstance());
		PageFactory.initElements(driver, AuthenticationPage.getInstance());
		PageFactory.initElements(driver, SecurityQuestions.getInstance());
		PageFactory.initElements(driver, AdvancePage.getInstance());

	}
}
