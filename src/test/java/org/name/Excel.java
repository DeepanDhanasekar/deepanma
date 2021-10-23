package org.name;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.asn1.dvcs.Data;


public class Excel {
	public static void main(String[] args) throws IOException {
		File f =new File("F:\\eclipse\\Maven3\\excel\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(f);
		Workbook wrkb = new XSSFWorkbook(stream);
		
		Sheet sheet=wrkb.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells() ; j++) {
				
			Cell cell = row.getCell(j);
			//cell type 1-text,0-number
			int type = cell.getCellType();
			
			if (type==1) {
				
				String value = cell.getStringCellValue();
				System.out.println(value);
				}
			
			if (type==0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date date = cell.getDateCellValue();
					SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mmm-yy");
				String format = dateFormat.format(date);
				System.out.println(format);
				
				}
				else {
				double d = cell.getNumericCellValue();
				//double...long
				long l =(long) d;
				//string
				String of = String.valueOf(l);
				System.out.println(of);
				}
				
				
			}
			
			}
		}
		
	
		
		
	}

}
