package com.infofactors.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Count_Numberoflinks 
{
	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String actlink,explink;
		     explink ="Flights123";
		   boolean linkexist=true;

		driver.get("https://www.cleartrip.com/");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of Links in Cleartrip Application are "+ alllinks.size());
	
		for(int i=0; i<alllinks.size(); i++) 
		{
			String linksNames=alllinks.get(i).getText();
			System.out.println(linksNames);	
			actlink=alllinks.get(i).getText();
			if (explink.equals(actlink)) 
			{
				linkexist=true;
				break;	
			}	
		}
		
	  
		/*for(WebElement ele : alllinks) 
		{
			String allLinksNames=ele.getText();
			System.out.println(allLinksNames);
			
		}*/
	     
		
		driver.close();
	}

}
