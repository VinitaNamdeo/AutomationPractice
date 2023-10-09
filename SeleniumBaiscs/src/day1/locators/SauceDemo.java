package day1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();;
		// TODO Auto-generated method stub
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Title of the application: "+ driver.getTitle());
	  String exptitle = "Swag Labs";
      System.out.println("Is title same as expected title? :"+ driver.getTitle().equals(exptitle));
      String urlafterlogin = driver.getCurrentUrl();
      String expUrlAfterLogin = "https://www.saucedemo.com/inventory.html";
      System.out.println("Is user successfully logged in? :"+ urlafterlogin.equals(expUrlAfterLogin));
	  driver.findElement(By.id("react-burger-menu-btn")).click();
	  driver.findElement(By.id("logout_sidebar_link")).click();
	}

}
