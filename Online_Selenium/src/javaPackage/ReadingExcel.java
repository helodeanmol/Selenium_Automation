package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {

		// Specify the location of excel file
		File src = new File("D:\\Selenium\\Demo.xlsx");

		// Load file
		FileInputStream fis = new FileInputStream(src);

		// Load workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		// Load worksheet
		XSSFSheet sh = wb.getSheet("DemoSheet");

		// Print the loaded sheet name
		System.out.println(sh.getSheetName());

	}

}
