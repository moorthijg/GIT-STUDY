package Interview_Questions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class Excel_File_Reading {
	
//	public static void main(String args[]) 
	@Test
			public void testing() throws IOException {
		String s = "D:\\expenses.xlsx";
		FileInputStream fs = new FileInputStream(s);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colcount;j++) {
				XSSFCell cell = row.getCell(j);
				System.out.print(cell);
				
				System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
