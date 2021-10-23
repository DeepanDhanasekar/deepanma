package org.name;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;;

public class numberd {
	private String getcellvaue(String pathname,String name,int rownum,int cellnum) throws FileNotFoundException {
		String data=null;
		File f=new File(pathname);
		FileInputStream d =new FileInputStream(f);
		Workbook work=new XSSFWorkbook();
		Sheet sheet = work.getSheet("Data");
	Row row = sheet.getRow(rownum);
Cell cell = row.getCell(cellnum);
	int type = cell.getCellType();
	if (type==1) {
		String value = cell.getStringCellValue();
	
	}
		if (type==0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				
			}
		}
		
		
		
		return null;

	}
}
