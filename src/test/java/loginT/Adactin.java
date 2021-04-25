package loginT;



import org.Facebook.BaseClass;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import pageObjects.AdactinLoginPage;

public class Adactin extends BaseClass {
BaseClass BaseClass=new BaseClass();

	
	@Test
	private void login() {
	
        BaseClass.launchBrowser("chrome");
        BaseClass.luanchUrl("https://adactinhotelapp.com/");
		AdactinLoginPage a=new AdactinLoginPage();
		String title = driver.getTitle();
		boolean b=title.contains("Adactin.com - Hotel");
		Assert.assertTrue(b);
		
		WebElement username = a.getUsername();
		

	}
	
	@AfterClass
	private void tearDown() {
		driver.close();

	}

}
