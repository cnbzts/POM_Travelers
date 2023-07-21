package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectWrappers;

public class InvoicePage extends ProjectWrappers{
	
	public InvoicePage (RemoteWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;
		
		if(!verifyTitle("Login - PHPTRAVELS")) {
			reportStep("This is not a login page" ,"FAIL");
	}
}
	public InvoicePage getInvoiceNumber() {
		String invoice = getTextByXpath("//h3[contains(text(),'Invoice')]");
		reportStep("The invoice number is : " + invoice, "INFO");
		System.out.println("The invoice number is : " + invoice);
		return this;
	}

	
	
}