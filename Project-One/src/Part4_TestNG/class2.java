package Part4_TestNG;


import org.testng.Assert;
import org.testng.annotations.*;

public class class2 {
	
	@Test(groups= {"smoke"})
	public void demo1()
	{
	   System.out.println("hello21"); 
	   Assert.assertTrue(false);
	}
	
	
	@Test()
	public void demo2()
	{
	   System.out.println("hello22"); 

	}
	
	@Test
	public void demo3()
	{
	   System.out.println("hello23"); 
	   
	}
	
	
	@BeforeSuite
	public void demobs()
	{
		System.out.println("=======beforesuite2");
	}
	
	@AfterSuite
	public void demoas()
	{
		System.out.println("=======aftersuite2");
	}
	
	
	@BeforeClass
	public void demobc()
	{
		System.out.println("=======beforeclass2");
	}
	
	@AfterClass
	public void demoac()
	{
		System.out.println("=======afterclass2");
	}
	

}
