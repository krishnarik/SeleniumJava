package Part4_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



public class hello {
	
	@Test(groups= {"smoke","smoke1"})
	public void demo1()
	{
	   System.out.println("hello11"); 

	}
	
	
	@Test
	public void demo2()
	{
	   System.out.println("hello12"); 

	}
	
	@Test
	public void demo3()
	{
	   System.out.println("hello13"); 

	}
	
	@BeforeMethod(groups= {"smoke","smoke1"})
	public void demobm()
	{
		System.out.println("=======beforemethod");
	}
	
	@AfterMethod
	public void demoam()
	{
		System.out.println("=======aftermethod");
	}
	
	@BeforeSuite
	public void demobs()
	{
		System.out.println("=======beforesuite");
	}
	
	@AfterSuite
	public void demoas()
	{
		System.out.println("=======aftersuite");
	}
	
	
	@BeforeClass
	public void demobc()
	{
		System.out.println("=======beforeclass");
	}
	
	@AfterClass
	public void demoac()
	{
		System.out.println("=======afterclass");
	}
	
	
}