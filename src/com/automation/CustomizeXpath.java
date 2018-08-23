package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomizeXpath
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		//Customized x-path -Means our own x-path
		//driver.findElement(By.xpath("//input[@type='text' and @id='gh-ac']")).sendKeys("Mens shoes");
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("shoes");
		//driver.findElement(By.xpath("//input[contains(@class, 'gh-tb ui-autocomplete-input')]")).sendKeys("Jeans");
		
	
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.quit();
		
		
		
		
		
		
		//driver.quit();;

	}

}
