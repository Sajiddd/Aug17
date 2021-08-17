package a1;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ExcelRead 
{
	public static void main(String[] args) throws Exception 
	{
	 String path="./data/book1.xlsx";
	 
	 FileInputStream fis = new FileInputStream(path);
	//open the excel file
	 Workbook wb = WorkbookFactory.create(fis);
	 
	 String v=wb.getSheet("mytestdata").getRow(0).getCell(0).getStringCellValue();
	 System.out.println(v);
	 
	 wb.getSheet("sheet1").getRow(0).getCell(0).setCellValue("sajid");
	 
	 wb.write(new FileOutputStream(path));
	 
	 wb.close();
	 
	 
	}
}

