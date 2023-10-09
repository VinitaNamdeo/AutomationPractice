package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Open flipkart application");
		driver.get("https://flipkart.com/");
		
		String applntitle = driver.getTitle();
		String exptitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println("validate title? "+applntitle.equals(exptitle));

		System.out.println("application title: "+ applntitle);
		System.out.println("application title length: "+ applntitle.length());
		System.out.println("application current url: "+ driver.getCurrentUrl());
		System.out.println("application current url length: "+ driver.getCurrentUrl().length());
		System.out.println("Done");
		driver.close();
	}

}
