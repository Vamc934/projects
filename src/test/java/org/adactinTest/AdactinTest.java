package org.adactinTest;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

import org.AdactinPages.BookHotelPage;
import org.AdactinPages.ConfirmBook;
import org.AdactinPages.ConfirmSPage;
import org.AdactinPages.LoginPage;
import org.AdactinPages.SearchHotelP2;
import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AdactinTest extends BaseClass {
	BaseClass bc;
	LoginPage lp;
	ExtentReports reports;
	ExtentHtmlReporter htmlReport;
	ExtentTest test;
	
	@BeforeClass
	private void browserLaunch() {
		
		bc=new BaseClass();
		bc.launchBrowser("chrome");
		bc.luanchUrl("https://adactinhotelapp.com/index.php");
	}

		@Test(priority=-2)
		public void adactinTitle() {
//			reports =new ExtentReports();
//			htmlReport =new ExtentHtmlReporter("./test-output//test_results.html");
//			reports.attachReporter(htmlReport);
//			htmlReport.config().setDocumentTitle("AdactinReport");
//			htmlReport.config().setReportName("Functional Report");
//			htmlReport.config().setTheme(Theme.DARK);
//			test=reports.createTest("verifying the Adactin page");  
//			test.log(Status.INFO, "verifying the title page");
		String title=driver.getTitle();
//		if (title.contains("Adactin.com -")) {
//			test.log(Status.PASS, "title verified");
//			
//		}
 
//		}
	}

	@Test(priority=-1)
	private void login() throws IOException {
		//test=reports.createTest("Verifying the username and password field");
		lp=new LoginPage();
		bc.enterText(lp.getUserName(), "karthi007");
//		if(lp.getUserName().getAttribute("value").equals("karthi007")) {
//			test.log(Status.PASS, "username valid");
//		}else {
//			test.log(Status.FAIL, "username invalid");
//		}
//		
		bc.enterText(lp.getPass(), "Karthi@1989");
//		if(lp.getPass().getAttribute("value").equals("Karthi")) {
//			test.log(Status.PASS, "password  verified");
//		}else {
//			test.log(Status.FAIL, "password invalid");
//			File screenshotAs = lp.getPass().getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(screenshotAs, new File("sceenshot.png"));
//			test.addScreenCaptureFromPath("sceenshot.png");
//		}
		bc.click(lp.getLbn());
	}
	@Test(enabled=false)
	private void searchHotel() {
		SearchHotelP2 sh=new SearchHotelP2();
		bc.selectByVisibleTex(sh.getLocat(), "Paris");
		bc.selectByVisibleTex(sh.getHotel(), "Hotel Sunshine");
		bc.selectByVisibleTex(sh.getRT(), "Standard");
		bc.selectByVisibleTex(sh.getRNum(), "2 - Two");
		//bc.selectByVisibleTex(sh.getDIn(), "Paris");
		bc.selectByval(sh.getAdultR(), "2");
        bc.selectByval(sh.getChildR(), "2");
        bc.click(sh.getSub());
	}
	@Test(enabled=false)
	private void confirmSearch() throws InterruptedException {
		ConfirmSPage cs=new ConfirmSPage();
//		String url ="https://adactinhotelapp.com/SelectHotel.php";
//		Assert.assertEquals(bc.getCurrentUrl(), url);
		Thread.sleep(2000);
		bc.javaScriptClick(cs.getRadio());
		bc.javaScriptClick(cs.getContin());
		
		
 }
	@Test(enabled=false)
	private void bookHotel() {
		BookHotelPage bh=new BookHotelPage();
//		String url="https://adactinhotelapp.com/BookHotel.php";
//        Assert.assertEquals(bc.getCurrentUrl(), url);
        bc.enterText(bh.getFname(), "krishnaa");
        bc.enterText(bh.getLname(), " krishna");
        bc.enterText(bh.getAdd(), "Ap,Adoni 541/18G");
        bc.enterText(bh.getCardnum(), "9686598658965896");
        bc.selectByVisibleTex(bh.getCardType(), "VISA");
        bc.selectByVisibleTex(bh.getMonth(), "February");
        bc.selectByVisibleTex(bh.getYear(), "2022");
        bc.enterText(bh.getCvv(), "4052");
        bc.click(bh.getBook());

	}
	@Test(enabled=false)
	private void bookingConfirm() {
		ConfirmBook cb=new ConfirmBook();
//		String url="https://adactinhotelapp.com/BookingConfirm.php";
//		Assert.assertEquals(bc.getCurrentUrl(), url);
		//bc.click(cb.getSearchbtn());
		bc.click(cb.getItinerary());
		boolean flag=false;
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr"));
		for (int i = rows.size(); i >=1 ; i--) {
			String name=driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr['+i+']/td[7]")).getText();
		if (name.equalsIgnoreCase("krishnaa")) {
			flag=true;
		}
	}
	if (flag==true) {
		System.out.println("test case passed");
	} else {
        System.out.println("test case failed");
         System.out.println("test passed");
	}	
		
	}


}
