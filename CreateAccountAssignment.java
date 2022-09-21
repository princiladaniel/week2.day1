package week2.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click(); 
		 driver.findElement(By.linkText("Accounts")).click();
		 driver.findElement(By.linkText("Create Account")).click();
		 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys(" Debit Limited Account");
		 driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("Selenium Automation Tester");
		 driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("sample");
		 driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Avadibranch");
		 driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1000");
		 //driver.findElement(By.xpath("(//select[@class='inputBox'])[2]/option[4]"));
		 WebElement industrydrop = driver.findElement(By.name("industryEnumId"));
		 Select industry=new Select(industrydrop);
		industry.selectByVisibleText("Computer Software");
		 WebElement ownershipdrop = driver.findElement(By.name("ownershipEnumId"));
		 Select ownership=new Select(ownershipdrop);
		 ownership.selectByVisibleText("S-Corporation");
		 WebElement sourcedrop = driver.findElement(By.name("dataSourceId"));
		 Select source =new Select(sourcedrop);
		 source.selectByValue("LEAD_EMPLOYEE");
		 WebElement marketdrop = driver.findElement(By.name("marketingCampaignId"));
		 Select market =new Select(marketdrop);
		 market.selectByIndex(6);
		 WebElement statedrop = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		 Select state =new Select(statedrop);
		 state.selectByValue("TX");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		 
		 
		
	}

}
/*1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 
 * 2. Enter UserName and Password Using Id Locator
 * 
 * 3. Click on Login Button using Class Locator
 * 
 * 4. Click on CRM/SFA Link
 * 
 * 5. Click on Accounts Button
 * 
 * 6. Click on Create Account
 *  
 * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
 * 
 * 8. Enter DEscriptiion as "Selenium Automation Tester"
 * 
 * 9. Enter LocalName Field Using Xpath Locator
 * 
 * 10. Enter SiteName Field Using Xpath Locator
 * 
 * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
 * 
 * 12. Select Industry as ComputerSoftware
 * 
 * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
 * 
 * 14. Select Source as Employee using SelectByValue
 * 
 * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
 * 
 * 16. Select State/Province as Texas using SelectByValue 
 * 
 * 17. Click on Create Account using Xpath Locator




 */