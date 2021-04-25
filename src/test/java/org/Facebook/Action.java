package org.Facebook;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Action {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		Actions act=new Actions(driver);
		Robot r=new Robot();
		WebElement element2 = driver.findElement(By.xpath("//div[@class=\"widget-content\"]//textarea"));
		WebElement element = driver.findElement(By.id("ta1"));
		//String text = element.getText();
		act.moveToElement(element).doubleClick(element).build().perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		act.moveToElement(element2).click().build().perform();
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
