package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactingho extends Baseclass {
	public static void main(String[] args) throws InterruptedException, IOException {
		Baseclass b=new Baseclass();
	b.enterurl("https://adactinhotelapp.com/");
	Thread.sleep(3000);
	
	WebElement findElement=b.locator
			("id","username");
	String e = b.excelread
("F:\\eclipse\\Maven3\\excel\\name.xlsxsdfghjk.xlsx", 
		"Sheet1", 0, 0);
	 b.entertex(findElement,e);
		
	}
}
