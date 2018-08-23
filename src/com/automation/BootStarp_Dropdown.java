package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStarp_Dropdown 
{
	public static void main(String[] args) {
		
		 WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("http://www.softmindinformatics.com/");
	     driver.findElement(By.linkText("Services")).click();
	     
	   List <WebElement>dd_menu=driver.findElements(By.xpath(".//*[@id='bs-example-navbar-collapse-1']/ul/li[3]/ul/li/a"));
	   System.out.println("The Number of links in Bootstrap size is  "+dd_menu.size());
	   
	    
	   
	    for (int i =0; i < dd_menu.size(); i++) 
	     {
	    	WebElement allhtml= dd_menu.get(i);
	    	String alldropnames= allhtml.getAttribute("innerHTML");//innerHTML is a Method
	    	
	    	if (alldropnames.contentEquals("Software Testing")) 
	    	{
	    		allhtml.click();
	    		break;
				
			}
	    	
	    	System.out.println("Values From Bootstrap Down is "+alldropnames);
		}
	 
		  driver.close();	
	}

}
