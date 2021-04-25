package intigration;

import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FbLogin extends BaseClass{

	public static void main(String[] args) {
		BaseClass base=new BaseClass();
		BaseClass.launchBrowser("chrome");
		BaseClass.luanchUrl("http://omayo.blogspot.com/");
		WebElement link=driver.findElement(By.id("link2"));
		BaseClass.click(link);
		WebElement childlink=driver.findElement(By.partialLinkText("What should I"));
		base.switchChildWin(childlink);
		base.swichToParW();
		WebElement second=driver.findElement(By.id("link2"));
		BaseClass.click(second);
		
		
		

	}

}
