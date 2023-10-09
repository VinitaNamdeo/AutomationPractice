package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenBrowser {

	public static void main(String[] args) {
		
		//ChromeDriver cdriver=new ChromeDriver();
				//or
		WebDriver driver=new ChromeDriver();
		//enter application url
		driver.get("https://www.google.com");
		//get current title from application
		System.out.println("title: "+driver.getTitle());
		//get current url from application
		System.out.println("current url: "+driver.getCurrentUrl());
		//get page source
		String sourceCode=driver.getPageSource();
		//System.out.println("Source code: "+sourceCode);
		System.out.println("Source code lenght: "+sourceCode.length());
		//close browser
		driver.close();

	}

}