package org.testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Otp {
	@Test
	private void test() {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement text = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		text.click();
		WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		findElement.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("deepan");
		alert.accept();
		
		
		
	}

}
