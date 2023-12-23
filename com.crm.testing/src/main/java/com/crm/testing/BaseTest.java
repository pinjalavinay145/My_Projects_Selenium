package com.crm.testing;

import java.sql.Driver;

import javax.swing.text.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utilities {
	@BeforeSuite
	public void beforeSuit() {
		Reporter.log("connection to server",true));
	}
	@BeforeTest
	public void beforeTest() {
		Reporter.log("connection to database",true);
	}
	@BeforeClass
	public void beforeClass() {
		 driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	@AfterClass
	public void afterClass() {
		
		
	}
	@AfterTest
	public void afterTest() {
		
	}
	@AfterSuite
	public void afterSuit() {
		
	}
	

}
