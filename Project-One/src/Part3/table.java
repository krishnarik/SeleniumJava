package Part3;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.deploy.util.StringUtils;

//import com.sun.org.apache.xpath.internal.operations.Number;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		myDriver.get("https://www.cricbuzz.com/live-cricket-scorecard/18885/eng-vs-ind-3rd-test-india-tour-of-england-2018");
		
		WebElement myTable = myDriver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		List<WebElement> myRows = myTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		
		//int rows = myTable.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		//??System.out.println(myele.findElement(By.cssSelector("div(3)")).getText());
		//System.out.println(rows);
		
		int tot_score=0;
		int total=0;
		
		for (WebElement myele:myRows)
		{
			
			String number = myele.findElement(By.xpath("div[3]")).getText();
			try {
				System.out.println(myele.findElement(By.cssSelector("div:nth-child(3)")).getText());
				
			} catch (Exception e) {
				
			}
			
			
			try {
				tot_score=tot_score+Integer.parseInt(number);
				
			} catch (Exception e) {
				// TODO: handle exception
				
				
				
				if (myele.findElement(By.xpath("div[1]")).getText().equalsIgnoreCase("extras"))
				{
					tot_score=tot_score+Integer.parseInt(myele.findElement(By.xpath("div[2]")).getText());
				}
				
				if (myele.findElement(By.xpath("div[1]")).getText().equalsIgnoreCase("total"))
				{
					total=Integer.parseInt(myele.findElement(By.xpath("div[2]")).getText());
				}
			}			
		}
		
		if (tot_score==total) {
			System.out.println(tot_score);
			System.out.println(total);
			System.out.println(tot_score+"verified");
		}
		
		System.out.println(myDriver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		System.out.println(myDriver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[1]")).getText());
		System.out.println(myDriver.findElement(By.xpath("//div[text()='Total']/following-sibling::div[2]")).getText());
		
	}

}

