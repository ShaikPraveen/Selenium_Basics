package com.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Radiobutton_Getoptions 
{
	
	public static void main(String[] args) {
		
		 WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("http://facebook.com");
	     
	     Select sele=new Select(driver.findElement(By.id("month")));
	     
	     //Count Number of Months in Months drop down
	     
	     List<WebElement> month_list=sele.getOptions();
	     
	     int total_months= month_list.size();
	     
	     Assert.assertEquals(total_months, 13);
	     
	     System.out.println("The Number of Months Are "+total_months);
	     
	     for(WebElement ele :month_list) 
	     {
	    	String month_names= ele.getText();
	    	System.out.println("Moth Name is  "+month_names);
	     }
	     
	     driver.close();
	}

}
