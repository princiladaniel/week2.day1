package week2.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentRadioButton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 // Launch URL "http://www.leafground.com/"
		 driver.get("http://www.leafground.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //Click on RadioButton
}	 
}
/*  Launch URL "http://www.leafground.com/"
	 * 
	 * 2. Click on RadioButton
	 * 
	 * 3. Click the RadioButton Option for Are you enjoying the classes?
	 * 
	 * 4. Get the text for default selected radio button
	 * 
	 * 5.  Get the text for ,Select your age group (Only if choice wasn't selected) if not 
	      Select your age Group and get the text.
	 *  */