package com.infofactors.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Handling_Textbox
{
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://acegrades.com");
		
		driver.findElement(By.xpath("//a[@id='login_id']")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shaikpraveen232@gmail.com");
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Sleeper.sleepTightInSeconds(2);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shaikpraveen232@gmail.com");
		String enteredvalue=driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println("Entered Email id is  "+enteredvalue);
		driver.close();
	}

}
