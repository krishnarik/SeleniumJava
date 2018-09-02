package Part3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ABCProperties {
	
	public WebDriver myDriver=null;
	
	@Test
	public void Login() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\git\\repository\\Project-One\\src\\Part3\\abc.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		
		if (prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 myDriver = new ChromeDriver();		
			myDriver.get("https://www.msn.com");
		}
		
		
		
	}

}
