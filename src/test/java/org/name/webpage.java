package org.name;

import java.io.File;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webpage {
public static void main(String[] args) {
	File f =new File("F:\\eclipse\\Maven3\\excel\\web.xlsx");
	Workbook w=new XSSFWorkbook();
	Sheet s =w.createSheet();
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	WebElement table = driver.findElement(By.tagName("table"));
	WebElement heading = table.findElement(By.tagName("thead"));
	WebElement headingrow = heading.findElement(By.tagName("tr"));
	List<WebElement> headingdatas = headingrow.findElements(By.tagName("th"));
	
for (int i = 0; i < headingdatas.size(); i++) {
	WebElement webElement = headingdatas.get(i);
	String text = webElement.getText();
	
}



}
}
