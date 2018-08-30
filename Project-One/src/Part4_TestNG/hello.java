package Part4_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class hello {
	
	@Test(groups= {"smoke","smoke1"})
	public void demo1()
	{
	   System.out.println("hello11"); 

	}
	
	@Parameters({"URL","loginname"})
	@Test
	public void demo2(String ddd,String fff)
	{
	   System.out.println("hello12"); 
	   System.out.println(ddd);
	   System.out.println(fff);

	}
	
	@Test
	public void demo3()
	{
	   System.out.println("hello13"); 

	}
	
	@BeforeMethod(groups= {"smoke","smoke1"})
	public void demobm()
	{
		System.out.println("=======beforemethod1");
	}
	
	@AfterMethod
	public void demoam()
	{
		System.out.println("=======aftermethod1");
	}
	
	@BeforeSuite
	public void demobs()
	{
		System.out.println("=======beforesuite1");
	}
	
	@AfterSuite
	public void demoas()
	{
		System.out.println("=======aftersuite1");
	}
	
	
	@BeforeClass
	public void demobc()
	{
		System.out.println("=======beforeclass1");
	}
	
	@AfterClass
	public void demoac()
	{
		System.out.println("=======afterclass1");
	}
	
	
}