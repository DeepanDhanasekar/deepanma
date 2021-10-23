package org.name;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class web {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");

		WebElement table = driver.findElement(By.tagName("table"));
		WebElement heading = table.findElement(By.tagName("thead"));
		WebElement headingrow = heading.findElement(By.tagName("tr"));
	List<WebElement> headingdatas = headingrow.findElements(By.tagName("th"));
	for (int i = 0; i < headingdatas.size(); i++) {
		WebElement data = headingdatas.get(i);
		String text = data.getText();
		System.out.print(text+"          ");
		}
	
	WebElement content = table.findElement(By.tagName("tbody"));
List<WebElement> row = content.findElements(By.tagName("tr"));	
	for (int i = 1; i < row.size(); i=i+2) {
		WebElement webElement = row.get(i);
		List<WebElement> findElements = webElement.findElements(By.tagName("td"));
		System.out.print("\t\t");
		System.out.println("------------------------------------------------");
		for (int j = 0; j < findElements.size(); j++) {
			WebElement webElement2 = findElements.get(j);
			String text = webElement2.getText();
			System.out.print(text);
		System.out.print("\t");
		}
		
		
	}
	}}
