import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		
		
		
		myDriver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

		myDriver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

		System.out.println(myDriver.switchTo().alert().getText());

		//driver.switchTo().alert().sendKeys("fesfe");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//??myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		myDriver.switchTo().alert().accept(); //Accept = ok done yes

		//driver.switchTo().alert().dismiss();

	}

}
