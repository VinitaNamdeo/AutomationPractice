package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenBrowser2 {

	public static void main(String[] args) {
		
		//ChromeDriver cdriver=new ChromeDriver();
				//or
		WebDriver driver=new ChromeDriver();
		//enter application url
		driver.get("https://www.google.com");
		//get current title from application
		String actualTitle=driver.getTitle();
		String expectedTitle="Google";
		System.out.println("is google search page opened? "+actualTitle.equals(expectedTitle));
		//close browser
		driver.close();
	}
}
/*
 * 1. open chrome browser
 * 2. enter google url
 * 3. validate google search page opened or not
 * 			page title should be "Google"
 * 4. close browser 
 */

/**
 * automate following scenarios for the below mentioned application
 * 	1. https://demo.actitime.com/
 *  2. https://demo.vtiger.com/vtigercrm/index.php
 *  3. https://opensource-demo.orangehrmlive.com/
 *  4. https://flipkart.com/
 *  5. https://www.amazon.in/
 *  
 *  step1: open browse
 *  step2: enter application url
 *  Step3: print title and its length
 *  Step4: print current url and its length
 *  Step5: validate followings-
 *  			a. title
 *  			b. url
 *  Step6: close browser  
 */
