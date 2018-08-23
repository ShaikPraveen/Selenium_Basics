package com.automation;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Total_Links
{
	public static void main(String[] args)
	{
		 // Find the Number of links and text of that particular links
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		   List<WebElement> linklist = driver.findElements(By.tagName("input"));
		   System.out.println("Total Number of links are "+linklist.size());
		   
		   for (int i = 0; i < linklist.size(); i++)
		   {
			   String linkText=linklist.get(i).getText();
			   System.out.println(linkText);
			
		}
		   driver.close();
		 
	}

}
