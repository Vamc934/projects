package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelWrite extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("ExcelFiles//XLFIle.xlsx");
		Workbook w=null;
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("countries"));
		Select sel=new Select(country);
		List<WebElement> options = sel.getOptions();
		w=new XSSFWorkbook();
		Sheet sheet = w.createSheet("Countries");
		int size = options.size();
		for (int i=0;i<size;i++) {
			WebElement Element = options.get(i);
			String text = Element.getText();
        	Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			System.out.println(text);
		}
    	FileOutputStream out=new FileOutputStream(f);
		w.write(out);
		System.out.println("Done");
		driver.quit();

	}

}
