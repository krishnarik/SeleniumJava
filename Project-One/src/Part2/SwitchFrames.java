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



/*
 
 public class Day1 {

public static int gotoframe(WebDriver driver1,By by)

{

driver1.switchTo().defaultContent();

int i;

int num = -1;

int a=driver1.findElements(By.tagName("iframe")).size();

for(i=0;i<a;i++)

{

driver1.switchTo().defaultContent();

driver1.switchTo().frame(i);

int b=driver1.findElements(by).size();

if(b>0)

{

num=i;

break;

}

}

driver1.switchTo().defaultContent();

return num;

}}

================================================================


public class Day extends Day1{

public static void main(String[] args) {

// TODO Auto-generated method stub

WebDriver driver=new FirefoxDriver();

WebDriverWait wd=new WebDriverWait(driver,7);

driver.get("https://fantasycricket.dream11.com/IN/");

driver.manage().window().maximize();

int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

driver.switchTo().frame(m);

driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

driver.switchTo().defaultContent();

wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

if(j!=-1)

{

driver.switchTo().frame(j);

//WebDriverWait wd=new WebDriverWait(driver,5);

//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

}

else{

System.out.println("ops");

}

}

}
 
 
 
 
 
 
 
 
 
 */



