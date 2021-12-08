package week2.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmenttestCaseTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		
		 driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Find Contacts")).click();
		 driver.findElement(By.linkText("Email")).click();
		 //driver.findElement(By.xpath("//span[text()='Email']")).click();
		 driver.findElement(By.xpath("//label[text()='Email Address:']/following::input")).sendKeys("Princila@testleaf");
		 driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		 String Browsertitle = driver.getTitle();
		 System.out.println(Browsertitle);
		 driver.close();
	}

}
/* Test case 2:

Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Find Contacts
Click Email Tab
Type email as babu@testleaf.com
Click Find Contacts
Close the browser*/