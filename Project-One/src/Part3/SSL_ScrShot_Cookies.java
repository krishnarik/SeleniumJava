package Part3;

import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;		

public class SSL_ScrShot_Cookies{	
    

    public static void main(String[] args)		
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.msn.com");
		//driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

       				
        // Input Email id and Password If you are already Register		
        //driver.findElement(By.name("username")).sendKeys("abc123");							
        //driver.findElement(By.name("password")).sendKeys("123xyz");							
        //driver.findElement(By.name("submit")).click();					
        		
        // create file named Cookies to store Login Information		
        File file = new File("C:\\Users\\Admin\\Downloads\\Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+"||||"+ck.getValue()+"||||"+ck.getDomain()+"||||"+ck.getPath()+"||||"+ck.getExpiry()+"||||"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}








/*

SSL
================================================================
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class qw {

public static void main(String[] args) {
// TODO Auto-generated method stub

//SSl certificates

//Desired capabilities=
//general chrome profile
DesiredCapabilities ch=DesiredCapabilities.chrome();


//ch.acceptInsecureCerts(); --- one more method
 
 
ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

//Belows to your local browser
 
ChromeOptions c= new ChromeOptions();
c.merge(ch);
System.setProperty("webdriver.chrome.driver", "");
WebDriver driver=new ChromeDriver(c);
}

}


Cookies - ScrShot - Kill
=====================================================


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;



public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		//	driver.manage().deleteCookieNamed("sessionKey");
		
		//click on any link-------question is signout,delete cookie,load home page
			//login page- verify login url
			
			
			//scrshot
			 //==========================
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
			
			//kill
			//============================
			 WindowsUtils.killByName("excel.exe");
		
		
	}

}








*/