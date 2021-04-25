package org.Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	Actions a;
	public static  WebDriver driver;
	
	public  void launchBrowser(String Browser) {
		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
           }
		else if (Browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public  void luanchUrl(String url) {
		driver.get(url);

	}
	public String getCurrentUrl() {
		String curl=driver.getCurrentUrl();
		return curl;

	}
	public  void enterText(WebElement element,String Uname) {
		element.sendKeys(Uname);
	}
	
	public  void setPassword(WebElement element1,String pass) {
		element1.sendKeys(pass);
	}
	
	public  void click(WebElement element) {
		element.click();
	}
	//6
	public void mouseOver(WebElement mouse) {
		 a=new Actions(driver);
        a.moveToElement(mouse).perform();
	}
	//7
	public void dragAndDrop(WebElement src,WebElement des) {
		a.dragAndDrop(src, des).perform();
	}
	//8
	public void sliderdrag(WebElement source,int x,int y) {
		a.dragAndDropBy(source, x, y).perform();
	}
	//9
	public   void getScreenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("Screenshots//screenshot.png");
		FileHandler.copy(screenshotAs, f);
	}
	//10
	public void javaScript(WebElement ele,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", ele);

	}
	public  void javaScriptClick(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);

	}
	//11
	public  void selectByval(WebElement element,String value) {
		Select sel =new Select( element);
		sel.selectByValue(value);

	}
	//12
	public  void selectByInd(WebElement element,int index) {
		Select sel =new Select( element);
		sel.selectByIndex(index);

	}
	//13
	public   void selectByVisibleTex(WebElement element,String txt) {
		Select sel =new Select( element);
		sel.selectByVisibleText(txt);

	}
	//14
	public  void deseltByval(WebElement element,String value) {
		Select sel =new Select( element);
		sel.deselectByValue(value);

	}
	//15
	public  void deselectByInd(WebElement element,int index) {
		Select sel =new Select( element);
		sel.deselectByIndex(index);

	}
	//16
	public  void deselectByVisibleTex(WebElement element,String txt) {
		Select sel =new Select( element);
		sel.deselectByVisibleText(txt);

	}
	//17
	public void doubleclic(WebElement target) {
		a.doubleClick(target);

	}
	//18
	public void contextclic(WebElement target) {
		a.contextClick(target);

	}
	//19
	public int linkCount(List<WebElement> tagname) {
		int size = tagname.size();
		System.out.println(size);
		return size;
      
	}
	//20
	public int imgCount(List<WebElement> tagname) {
		int size = tagname.size();
		System.out.println(size);
		return size;
	
}
	//21
	public int frameCount(List<WebElement> tagname) {
		int size = tagname.size();
		System.out.println(size);
		return size;
	
}
	//21
	public void simpleAlert() {
		driver.switchTo().alert().accept();

	}
	//22
	public void promptAlert(String data) {
		driver.switchTo().alert().sendKeys(data);
		driver.switchTo().alert().getText();

	}
	//23
	public  void getScreenshot(WebElement element) throws IOException {
		File f=new File("Screenshots//screenshot.png");
		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotAs, f);
	}
	
	//24
	public  int getSheet(String sheet) throws FileNotFoundException {
		FileInputStream f=new FileInputStream("ExcelFiles//newFile");
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet(sheet);
		
		int numberOfRows = s.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		return numberOfRows;
	}
	//25
	public void switchChildWin(WebElement childlink) {
		String parent = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			if (!string.equals(parent)) {
				driver.switchTo().window(string);
			}
		}
		childlink.click();
		

	}
	public void swichToParW() {
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);

	}
	public  String getString(int row,int cell) throws IOException {
		String stringCellValue="";
		File f=new File("ExcelFiles//Register.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		if(c.getCellType()==1) {
			stringCellValue=c.getStringCellValue();
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l=(long) numericCellValue;
			stringCellValue=String.valueOf(l);
		}
		return stringCellValue;
	}
}
			
	

