package org.excel;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class BaseClass {
	public static String DateFormatted(Cell cell) {
		Date d=new Date();
		Date date = cell.getDateCellValue();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-YY");
		String format = dateformat.format(date);
		System.out.println(format);
		return format;

	}
	public static String NumericData(Cell cell) {
		double numeric = cell.getNumericCellValue();
		long l=(long) numeric;
		String name=String.valueOf(l);
		System.out.println(name);
		return name;
	}
	public static void writeExcel(List<WebElement> options,File f) throws IOException {
		Workbook w=new XSSFWorkbook();
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

	}

}
