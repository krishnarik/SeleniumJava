package Part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker1 {

public static void main(String[] args) {
// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver myDriver = new ChromeDriver();
myDriver.get("https://www.path2usa.com/travel-companions");
//April 23
myDriver.findElement(By.xpath(".//*[@id='travel_date']")).click();


while(!myDriver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
myDriver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}


//List<WebElement> dates= myDriver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
int count=myDriver.findElements(By.className("day")).size();

for(int i=0;i<count;i++)
{
String text=myDriver.findElements(By.className("day")).get(i).getText();
if(text.equalsIgnoreCase("21"))
{
myDriver.findElements(By.className("day")).get(i).click();
break;
}

}
}

}


