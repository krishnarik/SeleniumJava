package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
/*		
		myDriver.get("https://www.msn.com");	
		myDriver.manage().window().maximize();		
		Actions myAction = new Actions(myDriver);
		
		//mouseover
		 
		 WebElement myElement=myDriver.findElement(By.xpath("//a[contains(@href,'bing.com')]));
		 myAction.moveToElement(myElement).build().perform();
		
		int count=myDriver.findElements(By.xpath("//a[contains(@href,'bing.com')]")).size();
		
			for(int i=1;i<=count;i++)
			{
			try {
				myAction.moveToElement(myDriver.findElement(By.xpath("(//a[contains(@href,'bing.com')])["+i+"]"))).build().perform();
				Thread.sleep(3000L);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("===================="+i+"==================");	
				e.printStackTrace();
			}
			}
*/
		
		myDriver.get("https://www.amazon.com");
		
		
		//myDriver.findElement(By.cssSelector("#twotabsearchtextbox")).click();
		//myDriver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("AAA");
		//myDriver.findElement(By.cssSelector("#twotabsearchtextbox")).// no doubleclick,contextclick(right click),mouseover for webelement 
		
		//to overcome above scenario,use actions class by supplying webelement
		//composite actions - multiple keyboard/mouse activites
		
		WebElement myElement=myDriver.findElement(By.cssSelector("#twotabsearchtextbox"));
		new Actions(myDriver).click(myElement).keyDown(Keys.SHIFT).sendKeys("aaa").doubleClick().build().perform();
		
		//alternate way
		
		Actions myAction = new Actions(myDriver);
		myAction.moveToElement(myElement).click().keyDown(Keys.SHIFT).sendKeys("aaa").doubleClick().build().perform();
}
}
