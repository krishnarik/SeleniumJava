package Part4_TestNG;


import org.testng.annotations.*;

public class class2 {
	
	@Test(groups= {"smoke"})
	public void demo1()
	{
	   System.out.println("hello21"); 

	}
	
	
	@Test
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
