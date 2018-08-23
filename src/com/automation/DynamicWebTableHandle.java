package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTableHandle
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\Q_Edge\\Launching_Browsers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("gopikamma");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gopikamma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[8]/td[2]/a
		
		
		//Method: 1
		
	
		/*String before_xpath="//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath="]/td[2]/a";
		
		for (int i = 4; i <=8; i++)
		{
			String name=driver.findElement(By.xpath(before_xpath + i + after_xpath )).getText();
			System.out.println(name);
			
			if (name.contains("Tom Peter")) 
			{
				
				
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}*/
		
		//Method:2
		
		driver.findElement(By.xpath("//a[contains(text(),'praveen shaik')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'David Desouze')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		
		
		
		
		
	}

}
