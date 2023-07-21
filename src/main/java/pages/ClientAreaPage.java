package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class ClientAreaPage extends ProjectWrappers {

	public ClientAreaPage(RemoteWebDriver driver, ExtentTest test) {

		this.driver = driver;
		this.test = test;

		if (!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a login page", "FAIL");
		}
	}
	/*
	 * public StorePage clickServices() { WebElement pdropdown =
	 * driver.findElementByXPath("//a[@class='pr-4 dropdown-toggle'])[1]"); Select
	 * option = new Select (pdropdown);
	 * option.selectByVisibleText("Order New Services"); return new StorePage
	 * (driver,test);
	 * 
	 * 
	 * public ClientAreaPage clickServices() {
	 * clickByXpath("//a[@class='pr-4 dropdown-toggle'])[1]"); return this; } public
	 * StorePage clickNewService() {
	 * clickByXpath("//a[contains(text(),'Order New Services')]"); return new
	 * StorePage (driver,test); }
	 * 
	 * 
	 * 
	 */
	

	public ClientAreaPage clickService() {
		clickByXpath("(//a[@data-toggle='dropdown'])[1]");
		return this;
		
			
		}
	
	public StorePage clickOrderNewService() {
		clickByXpath("//a[contains(text(),'Order New Services')]");
		return new StorePage(driver,test);
		
	}

	
	

}
