package org.name;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class xssf {
public static void main(String[] args) throws IOException {
	File f =new File("F:\\eclipse\\Maven3\\excel\\Book1.xlsx");
	FileInputStream stream =new FileInputStream(f);
	Workbook workbook = new XSSFWorkbook(stream);
	Sheet sheet = workbook.getSheet("sheet1");
	
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
	
	
	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		
		
		Cell cell = row.getCell(j);
		System.out.println(cell);
	}
		
	//}
	
//	Cell cell = row.getCell(1);
//	System.out.println(cell);
	
//	int d = row.getPhysicalNumberOfCells();
//	System.out.println(d);

	
}
}
}