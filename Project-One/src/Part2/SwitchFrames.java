package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();		
		myDriver.get("http://jqueryui.com/droppable"); 
		
		//driver.findElement(By.id("draggable")).click(); ---will fail as the element inside frame
		
		System.out.println(myDriver.findElements(By.tagName("iframe")).size());
		myDriver.switchTo().frame(0); 
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("???"))); 
		
		
		Actions a =new Actions(myDriver); 
		WebElement source =myDriver.findElement(By.id("draggable")); 
				
		WebElement target =myDriver.findElement(By.id("droppable")); 
		a.dragAndDrop(source, target).build().perform(); 
		
		//switching back to main window
		myDriver.switchTo().defaultContent(); 

	}

}
