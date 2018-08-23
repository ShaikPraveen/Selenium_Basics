package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Verify_Radiobutton 
{
	public static void main(String[] args) {
		
		 WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("http://facebook.com");
	     
	     String month_list[]= {"Month","Jan","Feb","Mar","Apr", "May", "Jun", "Jul","Aug","Sept","Oct", "Nov","Dec"};
	    
	     Select sele=new Select(driver.findElement(By.id("month")));
	     
	     List<WebElement> alldropdownvalues=sele.getOptions();
	     System.out.println(alldropdownvalues.size());
	     
	    for (int i = 0; i < alldropdownvalues.size(); i++)
	    {
	    	Assert.assertEquals(month_list[i],alldropdownvalues.get(i).getText() );
		}
	    
	    System.out.println("ASSERTION SUCCESS");
	    
	    driver.close();
	
	}

	

}
