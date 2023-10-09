package day0.openbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		/*
		 1. Set the required browser driver executable path using:
				System.setProperty( key, value);
	     2. After setting the path of driver executable, create an instance of required browser
		 */
		//System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\SeleniumBasics\\drivers\\chromedriver.exe");
				//or
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		ChromeDriver cdriver=new ChromeDriver();
	}
}
/*
 * Every time selenium will open new browser, it won;t work on already opened browser
 * browser opened by selenium, won't be having
 * 	- history
 *  - download history
 *  - cookies
 *  - plugin
 *  
 *  in Selenium 3.0: 
 *  	System.setProperty( key, value); this was mandatory to setup driver executable path
 *  in Selenium 4.0:
 *  	System.setProperty( key, value); this is not required
 */