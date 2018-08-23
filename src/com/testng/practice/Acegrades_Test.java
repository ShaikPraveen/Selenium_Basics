package com.testng.practice;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Acegrades_Test
{
	
	 @BeforeSuite
	 public void test1() 
	 {
		 System.out.println("Before Suite Method ->This Test1 Method");
	 }
	 
	 @BeforeClass
	 public void test2() 
	 {
		 System.out.println("Before Class Method ->This Test2 Method");
	 }
	 
	 @BeforeMethod
	 public void test3() 
	 {
		 System.out.println("Before  Method ->This Test3 Method");
	 }
	 
	 @BeforeTest
	 public void test4() 
	 {
		 System.out.println("Before Test Method ->This Test4 Method");
	 }
	 
	 @AfterSuite
	 public void test5() 
	 {
		 System.out.println("After Suite Method ->This Test1");
	 }
	 
	 @AfterClass
	 public void test6() 
	 {
		 System.out.println("After Class Method ->This Test6 Method");
	 }
	 
	 public void aceTest() 
	 {
		 System.out.println("Acegrades Application Testing");
	 }
	 
	 
	 @AfterMethod
	 public void test7() 
	 {
		 System.out.println("After  Method ->This Test7 Method");
	 }
	 
	 @AfterTest
	 public void test8() 
	 {
		 System.out.println("After Test Method ->This Test8 Method");
	 }
}
