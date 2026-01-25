package testngtest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class exceldata {
	
	public static String getcelldata(String filepath, String sheetname, int row, int col) throws IOException {
		
		FileInputStream fis = new FileInputStream(filepath);
		
		
		Workbook wb = new XSSFWorkbook(fis);
		Sheet Sheet = wb.getSheet(sheetname);
		Cell cell = Sheet.getRow(row).getCell(col);
		
		String value = cell.toString();
		wb.close();
		
		
		
		
		
		
		return value;
		
		
		
	}

}
