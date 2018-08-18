
public class Wait_Imp_Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
 
 
 //Implicit wait
 // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
  
driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
driver.findElement(By.id("H-destination")).sendKeys("nyc");
driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);


//Explicit wait
 
WebDriverWait d=new WebDriverWait(driver,20);
d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
//Thread.sleep(5000L);

driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();
  
  
  
  
  
  
 * 
 * 
 *  
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
