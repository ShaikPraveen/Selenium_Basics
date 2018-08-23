package com.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RadiobButtons
{
   public static void main(String[] args) {
	
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     driver.get("http://facebook.com");
	     

	     
	     Select sele=new Select(driver.findElement(By.id("month")));
	     
	     WebElement option = sele.getFirstSelectedOption();
	     String defaultItem = option.getText();
	     System.out.println("Before selecting the Value is  "+defaultItem);
	     
	     //selectByIndex -> Starts from index position , index starts from 0
	     
	     sele.selectByIndex(1);
	     
	     //How to Print slected value
	     WebElement option1 = sele.getFirstSelectedOption();
	     String defaultItem1 = option1.getText();
	     System.out.println("After selecting the Value is  "+defaultItem1);
	     
	       sele.selectByValue("2");
	       
	       WebElement option2= sele.getFirstSelectedOption();
		   String defaultItem2 = option2.getText();
		   System.out.println("After selecting the Value is  "+defaultItem2);
		     
		     
		   sele.selectByVisibleText("May");
		     
		    WebElement option3 = sele.getFirstSelectedOption();
		    String defaultItem3 = option3.getText();
		    System.out.println("After selecting the Value is  "+defaultItem3); 
		    
		    driver.close();
	   
}


}
