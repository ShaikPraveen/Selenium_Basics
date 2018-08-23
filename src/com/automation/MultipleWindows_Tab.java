package com.automation;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows_Tab 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window id "+parentwindow);
		
		Set<String> allwindows=driver.getWindowHandles();
		
		int count=allwindows.size();
		System.out.println(count);
		
		ArrayList<String> tabs=new ArrayList<String>(allwindows);
	
		driver.switchTo().window(tabs.get(3));
		driver.close();
	 
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Employer Zone")).click();
		
		
		
		
		
		
		
	
	}

}
