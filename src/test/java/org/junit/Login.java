package org.junit;

import java.util.Date;

import org.Facebook.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@Before
	public  void bLoginTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@After
	public void aLoginTime() {
		Date d=new Date();
		System.out.println(d);
	}
	@Test
	public void loginTest() {
		String title = driver.getTitle();
		boolean b=title.contains("Adactin.com - Hotel");
		Assert.assertTrue(b);
		WebElement uname=driver.findElement(By.id("username"));
		uname.sendKeys("Vamsi");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Vamsi");
    	String attribute = uname.getAttribute("value");
		Assert.assertEquals("verify username","Vamsi",attribute);
		WebElement lbtn=driver.findElement(By.id("login"));
		lbtn.click();;
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
}
