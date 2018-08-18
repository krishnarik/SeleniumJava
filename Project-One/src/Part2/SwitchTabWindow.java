package Part2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTabWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();

		 myDriver.get("https://www.google.com"); 
		myDriver.findElement(By.linkText("Learn more")).click();   //.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click(); 

		System.out.println("Before Switching"); 
		System.out.println(myDriver.getTitle());


		Set<String> ids = myDriver.getWindowHandles(); 
		Iterator<String> it = ids.iterator(); 
		String parentid=it.next(); 
		String childid=it.next(); 
		myDriver.switchTo().window(childid); 
		System.out.println("After Switching"); 
		System.out.println(myDriver.getTitle());

		 
		myDriver.switchTo().window(parentid); 
		System.out.println(" Switching BAck to parent"); 
		System.out.println(myDriver.getTitle()); 

	}

}
