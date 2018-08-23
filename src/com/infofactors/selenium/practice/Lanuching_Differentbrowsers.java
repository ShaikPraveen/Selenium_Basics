package com.infofactors.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Lanuching_Differentbrowsers
{
	public static void main(String[] args) {
		
		//FF 
		//CC
		//IE
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\Launching_Browsers_Latest\\chromedriver.exe");
		//System.setProperty("webdriver.ie.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\Launching_Browsers_Latest\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");

		WebDriver driver;
		//driver=new FirefoxDriver();
		driver=new ChromeDriver();
		//driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.seleniumhq.org/download/");
	    String pageTitle=driver.getTitle();
	    System.out.println("Current Project Title is "+pageTitle);//PareTitle
	    
	    String pageUrl=driver.getCurrentUrl();//pageURL
	    System.out.println(pageUrl);
	    
	    String pagewindowid=driver.getWindowHandle(); //returns current window id
	    System.out.println("Page Window id is "+pagewindowid);
	    
	    String pagesourcecode=driver.getPageSource();
	    System.out.println("Page Source Code is "+pagesourcecode);
	    driver.close();
			}

}
