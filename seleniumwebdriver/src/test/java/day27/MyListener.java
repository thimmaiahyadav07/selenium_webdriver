package day27;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener

{
	public void onStart(ITestContext context) 
	{
		System.out.println("test execution is stsrted");
	   
	  }
	
	 public void onTestStart(ITestResult result) 
	 {
		 System.out.println("test is started.....");
		    
		  }
	 
	 public void onTestSuccess(ITestResult result) 
	 {
		  System.out.println("test passed.....");
		  }
	 
	 public void onTestFailure(ITestResult result) 
	 {
		    System.out.println("test is failed...");
		  }
	 
	 public void onTestSkipped(ITestResult result) 
	 {
		    System.out.println("test is skipped.....");
		  }
	 
	 public void onFinish(ITestContext context) 
	 {
		  System.out.println("test execution is complted  ........");
		  }

}
