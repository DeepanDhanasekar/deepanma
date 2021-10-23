
package org.name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	public WebDriver driver;
	public  WebElement element;
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Base b = new Base();
//	b.sendkeys(driver, "value");
//	WebElement element = driver.findElement(By.id("email"));
	//element.sendKeys("value");
}
}