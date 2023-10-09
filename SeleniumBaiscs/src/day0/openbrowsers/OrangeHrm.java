package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//enter application url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//get current title from application
		System.out.println("title: "+driver.getTitle());
		String title = driver.getTitle();	
		
		System.out.println("title length: " + title.length());
		//get current url from application
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url: "+ currentUrl);
		System.out.println("Current url length: " + currentUrl.length());
		//String sourceCode=driver.getPageSource();
		//System.out.println("Source code: "+sourceCode);
		//System.out.println("Source code lenght: "+sourceCode.length());
		//close browser
		driver.close();

	}

}
