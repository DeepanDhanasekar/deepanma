package org.name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base2 extends Base {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	locaters("id","username");
	
	
	
	
	}

	

		
	

	

}