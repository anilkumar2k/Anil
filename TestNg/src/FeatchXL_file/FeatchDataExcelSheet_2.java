package FeatchXL_file;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class FeatchDataExcelSheet_2 
{
  @Test
  public void readdataExcel() throws IOException
  {
	  FileInputStream fis = new FileInputStream("./testdata/Newcut.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  Sheet sheet = wb.getSheet("selenium");
	  System.out.println(wb.getSheet("selenium").getRow(2).getCell(3).toString());
	  
	  
  }
}
