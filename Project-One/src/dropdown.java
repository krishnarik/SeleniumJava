import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver myDriver = new ChromeDriver();
		
		
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    
		myDriver.get(baseURL);

		Select drpCountry = new Select(myDriver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		myDriver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(myDriver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
		
		//get selected items
		
		 System.out.println(fruits.getAllSelectedOptions().size());
		 
		 System.out.println(fruits.getFirstSelectedOption().getText()); 
		
		//deselect
		fruits.deselectByIndex(0);
		
		//deslect all
		
		fruits.deselectAll();

	}

}

/*
 // spicejet.com 
 
//click on source dropdown and select goa;in destination,select delhi(2)

driver.findElement(By.xpath("//a[@value='GOI']")).click();
driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();


//if dropdown has select tag

Select dropdown=new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));

dropdown.selectByIndex(4);
dropdown.selectByVisibleText("9 Adults");
dropdown.selectByValue("8");


//checkbox
 
//isselected() gives true or false

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click();

System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());

 
 */
