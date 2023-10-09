package day0.openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		System.out.println("Open amazon application");
		driver.get("https://www.amazon.in/");

		String applntitle = driver.getTitle();
		String exptitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		System.out.println("application title: " + applntitle);
		System.out.println("validate title? "+applntitle.equals(exptitle));

		System.out.println("application title length: " + applntitle.length());
		System.out.println("application current url: " + driver.getCurrentUrl());
		System.out.println("application current url length: " + driver.getCurrentUrl().length());
		System.out.println("Done");
		driver.close();

	}

}
