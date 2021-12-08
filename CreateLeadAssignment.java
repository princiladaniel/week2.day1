package week2.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment {

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
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Create Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("organization");
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("princy");
		 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rose");
		 driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8056378337");
		 driver.findElement(By.name("submitButton")).click();
		 //select is class, Locate the select tag
		 WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Create object for select
		 Select dropdown=new Select(elesource);
		 //Select the value visible text
		 dropdown.selectByVisibleText("Employee");
		 WebElement markcomp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select dropdown1=new Select(markcomp);
		 dropdown1.selectByValue("9001");
		// WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		 //Select dropdown2=new Select(industry);
		 //int size = 0;
		//dropdown2.selectByIndex(size-2);
		 WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select dropdown3=new Select(owner);
		 dropdown3.selectByIndex(5);
		 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select dropdown4=new Select(country);
		 dropdown4.selectByVisibleText("India");
		 driver.findElement(By.name("submitButton")).click();
		 String lastpagetitle = driver.getTitle();
		 System.out.println(lastpagetitle);
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
* 5. Click on Leads Button
* 
* 6. Click on create Lead Button
* 
* 7. Enter CompanyName using id Locator
* 
* 8. Enter FirstName using id Locator
* 
* 9. Enter LastName using id Locator
* 
* 10. Select value as Employee in Source Using SelectbyVisible text
* 
* 11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
* 
* 12. Select value as Telecommunications from the bottom (size-2) in Industry using SelectByIndex
* 
* 13. Select value as Corporation in OwnerShip field Using SelectbyIndex
* 
* 14. Select value as India in Country Field Using SelectbyVisibletext
*  
* 15. Click on create Lead Button Using name Locator
* 
* 16. Get the Title of the resulting Page
* 

*/