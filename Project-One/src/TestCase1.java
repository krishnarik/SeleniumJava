import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();		
		myDriver.get("https://www.msn.com");
		
        //??myDriver.findElement(By.tagName("mectrlname mectrlsignin")).click();		
		//??myDriver.findElement(By.className("mectrlname mectrlsignin")).click();
		
	     //myDriver.findElement(By.linkText("Sign in")).click();		 
		// myDriver.findElement(By.xpath("//*[@id='i0116']")).sendKeys("aaaaa");
		 //myDriver.findElement(By.cssSelector("#i0116")).sendKeys("bbb");
		
		//using reg exp
		
		//myDriver.findElement(By.xpath("//a[contains(@href,'login.live')]")).click();
		//myDriver.findElement(By.cssSelector("input[placeholder*='Email, phone,']")).sendKeys("aaa");
	}

}
