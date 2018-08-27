package Part4_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class3 {
	
	@BeforeTest
	public void demobt()
	{
	   System.out.println("=======beforetest"); 

	}
	
	@Test(groups= {"smoke"})
	public void demo1()
	{
	   System.out.println("hello31"); 

	}
	
	
	@Test
	public void demo2()
	{
	   System.out.println("hello32"); 

	}
	
	@Test
	public void demo3()
	{
	   System.out.println("hello33"); 

	}
	
	@AfterTest
	public void demoat()
	{
	   System.out.println("=====aftertest"); 

	}

}
