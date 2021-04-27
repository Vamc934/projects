package org.adactinTest;




import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Listener extends TestListenerAdapter{
  public ExtentReports reports;
  public ExtentHtmlReporter htmlreporter;
  public ExtentTest test;
  
  @Override
	public void onStart(ITestContext testContext) {
	  Date d=new Date();
		reports =new ExtentReports();
		htmlreporter =new ExtentHtmlReporter("C:\\Users\\vamck\\eclipse-workspace\\New folder\\Seleniummvn\\test-output\\test_results.html");
		reports.attachReporter(htmlreporter);
		htmlreporter.config().setDocumentTitle("Automation report");
		htmlreporter.config().setReportName("Practice page");
		htmlreporter.config().setTheme(Theme.DARK);
		reports.setSystemInfo("User", "Vamsi");
		
		
	}
  @Override
	public void onTestSuccess(ITestResult tr) {
		test=reports.createTest(tr.getName());
		test=test.log(Status.PASS, tr.getName());
	}
  @Override
	public void onTestFailure(ITestResult tr) {
	  test=reports.createTest(tr.getName());
	  test=test.log(Status.FAIL, tr.getName());
	  String path="screenshot//"+tr.getName()+".png";
	  File f=new File(path);
	   try {
		test.addScreenCaptureFromPath(path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	}
  @Override
	public void onFinish(ITestContext testContext) {
		reports.flush();
	}
	
}
