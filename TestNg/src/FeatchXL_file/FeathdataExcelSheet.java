package FeatchXL_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FeathdataExcelSheet
{
	@Test
	public void readExcelFile() throws IOException
	{
		FileInputStream fis = new FileInputStream("./testdata/Newcut.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet s =wb.getSheet("selenium");
		 Row r = s.getRow(2);
		 Cell c=r.getCell(1);
		System.out.println(c.getStringCellValue());
	}
}
