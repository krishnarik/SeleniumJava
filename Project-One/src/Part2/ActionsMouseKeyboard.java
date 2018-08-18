package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();		
		myDriver.get("https://www.msn.com");
		
		myDriver.manage().window().maximize();
		
		Actions myAction = new Actions(myDriver);
		
		
		
			for(int i=1;i<=6;i++)
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

}
}
