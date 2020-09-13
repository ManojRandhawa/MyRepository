package Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng 
{
	@Test
	public void t()
	{
		System.out.println("test");
	}
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite");
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void axlass()
	{
		System.out.println("After Class");
	}
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test");
	}
	@AfterTest
	public void atest()
	{
		System.out.println("After test");
	}
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("After Method");
	}

}
