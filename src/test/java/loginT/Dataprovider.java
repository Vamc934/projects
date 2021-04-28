package loginT;

import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider extends BaseClass{
@Test(dataProvider="n")
private void login(String user,String pass) {
	BaseClass.launchBrowser("chrome");
	BaseClass.luanchUrl("https://adactinhotelapp.com/");
	WebElement uname=driver.findElement(By.id("username"));
	BaseClass.enterText(uname, user);
	WebElement password=driver.findElement(By.id("password"));
	BaseClass.enterText(password, pass);
	WebElement lbtn=driver.findElement(By.id("login"));
	lbtn.click();
	driver.quit();
	
}
@DataProvider(name="n")
public Object[][] datasets(){
	return new Object[][] {{"Vamsi","Vamsi@123"}
	                       ,{"krishna","Vamsi@12"}
	                       ,{"vamc","Vamsi@124"}
	                       ,{"kris","Vamsi@123"}
	                       ,{"five","Vamsi@145"}
	                       ,{"six","Vamsi@134"}
	                       ,{"seven","Vamsi@164"}
	                       ,{"eight","Vamsi@174"}
	                       ,{"nine","Vamsi@104"}
	                       ,{"ten","Vamsi@114"}};
}
@Test
private void method2() {
	System.out.println("hello");
	

}
@Test
private void method3() {
	System.out.println("world");
	

}
}
