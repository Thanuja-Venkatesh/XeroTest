package com.xero.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
	private static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void launchBrowser() {
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	}
}
