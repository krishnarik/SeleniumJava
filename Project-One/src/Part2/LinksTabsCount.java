package Part2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinksTabsCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1. Give me the count of links on the page.
		//2. Count of footer section-
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		
		myDriver.get("http://qaclickacademy.com/practice.php");
		myDriver.manage().window().maximize();
		
		System.out.println(myDriver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=myDriver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		/*//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}*/
		
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> myColEleList = coloumndriver.findElements(By.tagName("a"));
		System.out.println(myColEleList.size());
		
		//Actions myAction = new Actions(myDriver);
		
		for(WebElement myLink:myColEleList) {
			System.out.println(myLink.getAttribute("href"));
			myLink.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			//myAction.sendKeys(myLink, Keys.chord(Keys.CONTROL,Keys.ENTER)).build().perform();
			//myColEleList.iterator
			Thread.sleep(5000L);
		}
		
		
		
		/*while(myColEleList.listIterator().hasNext())
		{
			myAction.sendKeys(myColEleList.listIterator().next(), Keys.chord(Keys.CONTROL,Keys.ENTER)).build().perform();
			//myColEleList.iterator
			Thread.sleep(5000L);
		}*/
		
		// get title of all the tabs
		
		
		/*while(myDriver.getWindowHandles().iterator().hasNext())
		{
			myDriver.switchTo().window(myDriver.getWindowHandles().iterator().next());
			System.out.println(myDriver.getTitle());
			
		}*/
		
		Set<String> abc=myDriver.getWindowHandles();//4
		
		for(String myHandle:abc) {
			System.out.println(myHandle);
			myDriver.switchTo().window(myHandle);
			System.out.println(myDriver.getTitle());
		}
		/*Iterator<String> it=abc.iterator();		
		while(it.hasNext())
		{
			
		   myDriver.switchTo().window(it.next());
		   System.out.println(myDriver.getTitle());
		
		}*/
		
		
	}

}
