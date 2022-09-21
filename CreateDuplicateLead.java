package week2.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateDuplicateLead {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String Duptitle = driver.getTitle();
		System.out.println(Duptitle);
		String text = driver.findElement(By.className("smallSubmit")).getText();
		System.out.println(text);
		String firstname=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstname);
		if (leadID.contains("View Lead")) 
			System.out.println("Text matched");
		 else 
			System.out.println("Text not matched");
		
		
		driver.findElement(By.name("submitButton")).click();
		//driver.close();
	}
	

}

/* http://leaftaps.com/opentaps/control/main
 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		// Step 1: Download and attach the Chrome driver to this test case
		WebDriverManager.chromedriver().setup();

		// Step 2 : Launch the Chrome Browse
		ChromeDriver driver = new ChromeDriver();

		// Step 3: Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Step 4 : Maximize the Browser
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Step 5 :  Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Step 6 : Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();

		//Step 7 : Click on CRM/SFA Link

		driver.findElement(By.linkText("CRM/SFA")).click();

		//Step 8 : Click Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Step 9 : Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		//Step 10 : Click on Phone

		driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]")).click();


		Thread.sleep(5000);	

		//Step 13 : Capture name of First Resulting lead

		String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();


		System.out.println(name);

		//Step 14 : Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		Thread.sleep(5000);

		//Step 15 : Click Duplicate Lead

		driver.findElement(By.linkText("Duplicate Lead")).click();

		//Step 16 : Verify the title as 'Duplicate Lead'

		String title = driver.getTitle();
		System.out.println(title);


		if(title.contains("Duplicate Lead"))

			System.out.println("Title Matched");

		else 
			System.out.println("Title Not Matched");

		Thread.sleep(5000);
		//Step 17 :  Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();

		//Step 18 : Confirm the duplicated lead name is same as captured name
		String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text1);

		if(name.contains(text1)) {
			System.out.println("Succussfully Duplicate Lead Created ");
		}
		else
		{
			System.out.println("Duplicate Lead not created");
		}
		
		*/
	 
	