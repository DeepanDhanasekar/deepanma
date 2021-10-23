package org.name;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sele {
public static void main(String[] args) throws IOException {
	File file=new File("F:\\eclipse\\Maven3\\excel\\mass.xlsx");
	Workbook workbook=new XSSFWorkbook();
	Sheet sheet = workbook.createSheet("test");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement element= driver.findElement(By.id("Skills"));
	Select select=new Select(element);
	
	List<WebElement> options = select.getOptions();
	int size = options.size();
	for (int i = 0; i < options.size(); i++) {
	Row row = sheet.createRow(i);
	Cell cell = row.createCell(0); 
		
    WebElement webElement = options.get(i);
	String text = webElement.getText();
	cell.setCellValue(text);
	}FileOutputStream stream=new FileOutputStream(file);
	workbook.write(stream);
	System.out.println("dd");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	File file =new File("F:\\eclipse\\Maven3\\excel\\name.xlsx");
//	Workbook workbook=new XSSFWorkbook();
//	Sheet sheet = workbook.createSheet("test");
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver =new ChromeDriver();
//	driver.get("http://demo.automationtesting.in/Register.html");
//	WebElement element = driver.findElement(By.id("Skills"));
//	Select select=new Select(element);
//	List<WebElement> options = select.getOptions();
//	int size = options.size();
//	for (int i = 0; i < options.size(); i++) {
//	Row row = sheet.createRow(i);
//	Cell cell = row.createCell(0);
//	WebElement webElement = options.get(i);
//	String text = webElement.getText();
//	cell.setCellValue(text);
//	
//	}
//	FileOutputStream stream=new FileOutputStream(file);
//			workbook.write(stream);
//	System.out.println("done");
//	
}
}
