package com.infofactors.selenium.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Handling_Textbox_Suggestions
{
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("hyd");;
		
		List<WebElement> allitems=driver.findElements(By.xpath("html/body/ul[1]/li/a"));
		System.out.println("Total List in hyd "+ allitems.size());
		
		 /* for (int i = 0; i <allitems.size() ; i++) 
		  {
			  String allitemsNames=allitems.get(i).getText();
			  System.out.println("List of Names are "+allitemsNames);
		}*/
	    
	      for(WebElement ele :allitems) 
	      {
	    	  System.out.println(ele.getText());
	      }
	    
	      driver.close();
	    
	}
	

}
