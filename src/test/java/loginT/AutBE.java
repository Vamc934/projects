package loginT;



import java.io.IOException;

import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AutBE extends BaseClass {
	BaseClass BaseClass=new BaseClass();
@Test
public void register() throws IOException {
	BaseClass.launchBrowser("chrome");
	BaseClass.luanchUrl("http://demo.automationtesting.in/Register.html");
	WebElement firsname = driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]"));
	BaseClass.enterText(firsname, BaseClass.getString(1,0));
	String attribute = firsname.getAttribute("value");
	Assert.assertEquals(attribute, "Vamsi");
	WebElement Lastname = driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]"));
	BaseClass.enterText(Lastname, BaseClass.getString(1,1));
	String last = firsname.getAttribute("value");
	Assert.assertEquals(last, "Krishna");
	WebElement address = driver.findElement(By.tagName("textarea"));
	BaseClass.enterText(address, BaseClass.getString(1,2));
	WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	BaseClass.enterText(email, BaseClass.getString(1,3));
	WebElement tel = driver.findElement(By.xpath("//input[@type='tel']"));
	BaseClass.enterText(tel, BaseClass.getString(1,4));
	WebElement Male = driver.findElement(By.name("radiooptions"));
	BaseClass.click(Male);
	boolean M = Male.isSelected();
	Assert.assertTrue(M);
	WebElement hobbies = driver.findElement(By.id("checkbox1"));
	BaseClass.click(hobbies);
	boolean crick = hobbies.isSelected();
	Assert.assertTrue(crick);
	WebElement Language = driver.findElement(By.id("msdd"));
	BaseClass.click(Language);
	WebElement English = driver.findElement(By.linkText("English"));
	BaseClass.click(English);
}
}
