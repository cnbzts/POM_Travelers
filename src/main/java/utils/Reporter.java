package utils;



import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public abstract class Reporter {
	public ExtentTest test;
	public static ExtentReports extent;
	public String testCaseName, testDescription, category, authors;

	
	
	//1. start result
	public ExtentReports startResult() {
		extent = new ExtentReports("./reports/result.html",true);
		extent.loadConfig(new File("./src/main/resources/extent-config.xml"));
		return extent;
		
	}
	
	 //2. start test case
	public ExtentTest startTestCase(String testCaseName, String testDescription){
		test = extent.startTest(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		return test;
	}

	//3a. Log the status - report step - without screenshot
	public void reportStepNoSnap( String desc,String status) {
		
		// Write if it is successful or failure or information
		if(status.toUpperCase().equals("PASS")){
			test.log(LogStatus.PASS,desc);
		}else if(status.toUpperCase().equals("FAIL")){
			test.log(LogStatus.FAIL, desc);
			//throw new RuntimeException("FAILED");
		}else if(status.toUpperCase().equals("INFO")){
			test.log(LogStatus.INFO, desc);
		}
	}
	
	//3b. Log the status - report step - with screenshot
	public void reportStep(String desc, String status) {
    long snapNumber = 100000l;
		
		try {
			snapNumber= takeSnap();
			//Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Write if it is successful or failure or information
		if(status.toUpperCase().equals("PASS")){
			test.log(LogStatus.PASS, desc+test.
					addScreenCapture("./../reports/images/"+snapNumber+".jpg"));
		}else if(status.toUpperCase().equals("FAIL")){
			test.log(LogStatus.FAIL, desc+test.addScreenCapture("./../reports/images/"+snapNumber+".jpg"));
			//throw new RuntimeException("FAILED");
		}else if(status.toUpperCase().equals("INFO")){
			test.log(LogStatus.INFO, desc);
		}
		
	}

     //4. end test case
	public void endTestcase(){
		extent.endTest(test);
	}
	
	 //5. end result
	public void endResult(){		
		extent.flush();
	}

	public abstract long takeSnap();

}


