package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class MobilePage extends ProjectWrappers {
	
public MobilePage (RemoteWebDriver driver, ExtentTest test) {
		
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a login page" ,"FAIL");
		}
}
    public MobilePage clickOrderNow() {
	clickById("product1-order-button");
	return this;

}
    public MobilePage clickContunie() {
	clickByXpath("//button[@class='btn btn-primary btn-lg']");
	return this;
}
    public MobilePage validateIfAdded() {
	verifyTextContainsByXpath("//span[contains(text(),'Mobile Applications')]", "Mobile Applications");
	return this;
}
    public MobilePage clickCheckout() {
	clickByXpath("//a[contains(text(),'Checkout')]");
	return this;
}
    public InvoicePage clickCompleteOrder() {
		WebElement element = getElementByXpath("//button[@id='btnCompleteOrder']");
		scrollToElement(element);
		clickByXpath("//button[@id='btnCompleteOrder']");
		return new InvoicePage(driver,test);

}

}