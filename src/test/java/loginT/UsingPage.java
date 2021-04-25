package loginT;

import org.Facebook.BaseClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.testng.annotations.Test;

import pageObjects.AdactinLoginPage;

public class UsingPage extends BaseClass{
@Test
public void loginFb() {
	Logger logger=Logger.getLogger("UsingPage");
	PropertyConfigurator.configure("log4j.properties");
	BaseClass.launchBrowser("chrome");
	logger.info("browser launched");
	AdactinLoginPage a=new AdactinLoginPage(driver);
	driver.get("https://www.facebook.com/");
	a.setUsername("Vamsi");
	logger.info("Username entered");
	a.setPasswpord("Vamsi@123");
	logger.info("password entered");
	

}
	

}
