package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {

		File file = new File("D:\\Selenium\\Interviews.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Status");
		XSSFRow row = sh.getRow(2);
		XSSFCell cell = row.getCell(1);
		String dec = cell.getStringCellValue();
		System.out.println(dec);
		wb.close();
	}

}
