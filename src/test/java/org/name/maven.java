package org.name;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

//	String s = "I love India";
//		for (int i = s.length(); i >=3; i++) {
//			
//			char at = s.charAt(1);
//			System.out.print(at);
//		}
//	
		
	}

}










































