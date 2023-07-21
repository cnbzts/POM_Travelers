package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class StorePage extends ProjectWrappers{
	
	public StorePage (RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a login page" ,"FAIL");
		}
	}

	    public MobilePage clickMobile() {
		clickById ("Secondary_Sidebar-Categories-Mobile");
		return new MobilePage (driver,test); 
	}
	
}
