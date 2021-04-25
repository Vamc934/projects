package org.excel;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;







public class ExcelName extends BaseClass{

	public static void main(String[] args) throws IOException   {
		File f=new File("ExcelFiles//Register.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
		Sheet s=w.getSheet("Sheet1");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int type = cell.getCellType();
				if (type==0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						BaseClass.DateFormatted(cell);
					}
					else {
					BaseClass.NumericData(cell);
					
					}
				}
//				if (type==1) {
//					String string = cell.getStringCellValue();
//					System.out.println(string);
//				}
			}
		}
		
			
		}




	}


