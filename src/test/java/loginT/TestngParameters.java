package loginT;

import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters extends BaseClass {
@Test
@Parameters({"FirstName","LastName","Address","Email","Tel","Skills","Country"})
private void launchBrowser(String FirstName,String LastName,String Address,String Email,String Tel,String Skills,String Country ) throws InterruptedException {
	BaseClass.launchBrowser("chrome");
	BaseClass.luanchUrl("http://demo.automationtesting.in/Register.html");
	WebElement firsname = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
	BaseClass.enterText(firsname, FirstName);
	WebElement Lastname = driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
	BaseClass.enterText(Lastname, LastName);
	WebElement address = driver.findElement(By.tagName("textarea"));
	BaseClass.enterText(address, Address);
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	BaseClass.enterText(email, Email);
	WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
	BaseClass.enterText(tel, Tel);
	WebElement Male = driver.findElement(By.name("radiooptions"));
	BaseClass.click(Male);
	WebElement hobbies = driver.findElement(By.id("checkbox1"));
	BaseClass.click(hobbies);
    WebElement Language = driver.findElement(By.id("msdd"));
	BaseClass.javaScriptClick(Language);
	WebElement English = driver.findElement(By.linkText("English"));
	BaseClass.click(English);
	WebElement skills = driver.findElement(By.id("Skills"));
	BaseClass.selectByVisibleTex(skills, Skills);
	WebElement country = driver.findElement(By.id("countries"));
	BaseClass.selectByVisibleTex(country, Country);
	WebElement year = driver.findElement(By.id("yearbox"));
	BaseClass.selectByVisibleTex(year, "1998");
	WebElement month = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	BaseClass.selectByVisibleTex(month, "February");
	WebElement Day = driver.findElement(By.id("daybox"));
	BaseClass.selectByVisibleTex(Day, "16");
	driver.findElement(By.xpath("//span[@role=\"combobox\"]")).click();
	driver.findElement(By.xpath("//span[@role=\"combobox\"]//following::li[6]")).click();
	WebElement pass = driver.findElement(By.id("firstpassword"));
	BaseClass.enterText(pass, "Vamsi@123");
	WebElement cpass = driver.findElement(By.id("secondpassword"));
	BaseClass.enterText(cpass, "Vamsi@123");
	WebElement btn = driver.findElement(By.id("submitbtn"));
	BaseClass.click(btn);
	

	
	
	
	

}
}
