package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//enter application url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		//get current title from application
		//System.out.println("title: "+driver.getTitle());
		String title = driver.getTitle();	
		System.out.println("title: "+ title);
		System.out.println("title length: " + title.length());
		//get current url from application
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url: "+ currentUrl);
		System.out.println("Current url length: " + currentUrl.length());
		
		driver.close();

	}

}
