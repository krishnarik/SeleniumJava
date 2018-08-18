import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_2 {

public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver myDriver = new ChromeDriver();


myDriver.get("http://www.echoecho.com/htmlforms10.htm");

//findElement(s)

//driver.findElement(By.xpath("//input[@value='Milk']")).click();

int count =myDriver.findElements(By.xpath("//input[@name='group1']")).size();

for(int i=0;i<count;i++)

{

//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

String text=myDriver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

if(text.equals("Cheese"))

{

myDriver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

}

}

}

}


