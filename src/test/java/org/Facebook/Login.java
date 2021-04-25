package org.Facebook;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass{

	public static void main(String[] args) throws IOException {
		BaseClass BaseClass=new BaseClass();
		BaseClass.launchBrowser("chrome");
		BaseClass.luanchUrl("https://www.facebook.com/");
		WebElement element = driver.findElement(By.name("email"));
		WebElement element1 = driver.findElement(By.name("pass"));
		WebElement btn = driver.findElement(By.name("login"));
		//BaseClass.setUsername(element, "Vamsi");
		BaseClass.setPassword(element1, "Vamsi@123");
		BaseClass.click(btn);
		BaseClass.getScreenshot(btn);
	}

}


