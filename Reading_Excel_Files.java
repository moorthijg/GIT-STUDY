package Interview_Questions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Reading_Excel_Files {
	
	@Test
	public void reading() throws IOException {
		
		File src = new File("D:\\ex.xlsx");
		
		FileInputStream fs = new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		// for .xls files
		//HSSFWorkbook hsf = new HSSFWorkbook(fs);
		
		
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    
	    String s = sheet.getRow(1).getCell(0).getStringCellValue();
	    
	    String s1 = sheet.getRow(1).getCell(1).getStringCellValue();
	    
        String s2 = sheet.getRow(2).getCell(0).getStringCellValue();
	    
	    String s3 = sheet.getRow(2).getCell(1).getStringCellValue();	    
	    
	    System.out.println("The data in the cell is = " + s);
	    System.out.println("The data in the cell is = " + s1);
	    System.out.println("The data in the cell is = " + s2);
	    System.out.println("The data in the cell is = " + s3);
	    
	    
	    workbook.close();
	    
	    // https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html 
	    
	    /*Workbook: XSSFWorkbook and HSSFWorkbook classes implement this interface.
	    XSSFWorkbook: Is a class representation of XLSX file.
	    HSSFWorkbook: Is a class representation of XLS file.
	    Sheet: XSSFSheet and HSSFSheet classes implement this interface.
	    XSSFSheet: Is a class representing a sheet in an XLSX file.
	    HSSFSheet: Is a class representing a sheet in an XLS file.
	    Row: XSSFRow and HSSFRow classes implement this interface.
	    XSSFRow: Is a class representing a row in the sheet of XLSX file.
	    HSSFRow: Is a class representing a row in the sheet of XLS file.
	    Cell: XSSFCell and HSSFCell classes implement this interface.
	    XSSFCell: Is a class representing a cell in a row of XLSX file.
	    HSSFCell: Is a class representing a cell in a row of XLS file.*/
	    
		}
}
