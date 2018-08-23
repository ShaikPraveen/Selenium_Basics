package com.infofactors.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation_Commands
{
	public static void main(String[] args) throws InterruptedException {
		
		//back(), forward(),refresh(), to()
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.seleniumhq.org/");
		String firsttitle=driver.getTitle();
		System.out.println("First Page Title "+ firsttitle);
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.acegrades.com");
		String secondtitle=driver.getTitle();
		System.out.println("Second Page Title "+ secondtitle);
		
		Thread.sleep(3000);
		driver.navigate().back();
		String thirdtitle=driver.getTitle();
		System.out.println("Third Page Title "+ thirdtitle);
		
		Thread.sleep(3000);
		driver.navigate().forward();
		String fourthtitle=driver.getTitle();
		System.out.println("Fourh Page Title "+ fourthtitle);
		
		Thread.sleep(3000);
		driver.navigate().to("http://softmindinformatics.com");
		String fifthtitle=driver.getTitle();
		System.out.println("Fifth Page Title "+ fifthtitle);
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
	}

}
