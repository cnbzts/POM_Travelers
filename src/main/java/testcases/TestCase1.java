package testcases;

import org.testng.annotations.BeforeClass;
import wrappers.ProjectWrappers;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TestCase1 extends  ProjectWrappers{
	
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Mobile Application";
		browserName="chrome";
		//dataSheetName="";
		category="Sanity";
		authors="Can";
	}

	@Test()
	public void testCase() throws InterruptedException {
		
		new LoginPage(driver,test)
		.enterUserName()
		.enterPassowrd()
		.clickCaptcha()
		.clickLogin()
        .clickService()
        .clickOrderNewService()
		.clickMobile()
		.clickOrderNow()
		.clickContunie()
		.validateIfAdded()
		.clickCheckout()
		.clickCompleteOrder()
		.getInvoiceNumber();
	}
	
	
	
	
}
