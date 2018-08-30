package Part4_TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class class3 {
	
	@BeforeTest
	public void demobt()
	{
	   System.out.println("=======beforetest"); 

	}
	
	@AfterTest
	public void demoat()
	{
	   System.out.println("=====aftertest"); 

	}
	
	@Test(groups= {"smoke"})
	public void demo1()
	{
	   System.out.println("hello31"); 

	}
	
	
	@Test(dependsOnMethods= {"demo3"})
	public void demo2()
	{
	   System.out.println("hello32"); 

	}
	
	
	
	@Test(dataProvider="getData")
	public void demo3(String ddd,String ggg)
	{
	   System.out.println("hello33"); 
	   System.out.println(ddd);
	   System.out.println(ggg);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="firstuser";
		data[0][1]="firstpass";
		
		data[1][0]="seconduser";
		data[1][1]="secondpass";
		
		data[2][0]="thirduser";
		data[2][1]="thirdpass";
		
		return data;
		
	}

}
