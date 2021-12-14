package org.baseclass;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	public static WebDriver driver;
	public String excelread(String pathname,String name,int rows,int cellno,String datecell) throws IOException  {
		File f=new File(pathname);
		FileInputStream stream=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(stream);
			Sheet sheet = w.getSheet(name);
			Row row = sheet.getRow(rows);
			Cell cell = row.getCell(cellno);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String value = cell.getStringCellValue();
				return value;
			}
	else if (DateUtil.isCellDateFormatted(cell)) {
		Date d = cell.getDateCellValue();
		SimpleDateFormat df=new SimpleDateFormat(datecell);
		String text = df.format(d);
		return text;
		}
	else {
		double d = cell.getNumericCellValue();
		long l= (long)d;
	String valueOf = String.valueOf(1);
	return valueOf;
	
	}
}public void select(WebElement element) {
	Select select=new Select(element);
}

public void enterurl(String url) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(url);
}
//public WebElement locetor(String id,String username) {
//return locetor(id,username);
//}
public String excelread(String path,String name,int rows,int cellno ) throws IOException {
		return excelread(path, name, rows, cellno);

}
public void entertext(WebElement element2,String username) {
	  element2.sendKeys(username);
}
public WebElement locator(String type,String attributevalue) {
if (type.equals("id")) {
WebElement findElement = driver.findElement(By.id(attributevalue));
	return findElement;
}else if (type.equals("name")) {
	WebElement findElement = driver.findElement(By.name(attributevalue));
	return findElement;
}else {
	WebElement findElement = driver.findElement
			(By.xpath(attributevalue));

return findElement;
}
}
public void entertex(WebElement findElement, String e) {
findElement.sendKeys(e);	
}

















}