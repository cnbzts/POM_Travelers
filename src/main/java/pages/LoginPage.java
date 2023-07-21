package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class LoginPage extends ProjectWrappers{
	
	public LoginPage (RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a login page" ,"FAIL");
		}
		}

	public LoginPage enterUserName() {
		enterById("inputEmail", "canboztas@gmail.com");
		return this;
	}
	
	public LoginPage enterPassowrd() {
		enterById("inputPassword", "Cnbzts_34");
		return this;
	}
	
	/*
	 * public LoginPage clickIamNotARobot() { WebElement element =
	 * driver.findElementByName("a-eh0mmq8sk4jn"); driver.switchTo().frame(element);
	 * clickByXpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']"
	 * ); return this; }
	 */
		
		//public LoginPage clickCaptcha() {
		//clickByXpath("//span[@class='recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox']");
		//return this;
		
		
	//}

	public LoginPage clickCaptcha() throws InterruptedException {
		clickByXpath("//div[@class='g-recaptcha']");
		//clickById ("recaptcha-anchor");
		Thread.sleep(20000);
		return this;
	}
	
	public ClientAreaPage clickLogin() throws InterruptedException {
		Thread.sleep(5000);
		clickById("login");
		return new ClientAreaPage (driver,test);
		
	}
	
	
	
}
