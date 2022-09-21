package week2.WebDriverManager;

import java.time.Duration;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebDriverManagerXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Find Contacts")).click();
		 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("princila.testleaf.com");
		 //driver.findelement(By.partialLinkText(""))
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Aspa");
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 Thread.sleep(3000);
		String contactid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(contactid);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	//td[contains(@class,'x-grid3-col x-grid3-cell')]//div
}
/* Classroom :
http://leafground.com/pages/checkbox.html
Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Find Contacts
Type first name with your name
Click Find Contacts
Print the first contact id
Click on the first matching contact id*/