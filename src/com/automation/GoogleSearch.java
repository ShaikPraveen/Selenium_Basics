package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		
	}

}
