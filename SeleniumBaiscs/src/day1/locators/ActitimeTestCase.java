package day1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
           driver.get("https://demo.actitime.com/login.do");
           WebElement usernameInput=driver.findElement(By.id("username"));
	       usernameInput.clear();
	       usernameInput.sendKeys("admin");
           WebElement passwordInput = driver.findElement(By.name("pwd"));
           passwordInput.clear();
           passwordInput.sendKeys("manager");
   		   driver.findElement(By.id("loginButton")).click();
           String title = driver.getTitle();
           String exptitle = "actiTIME - Login";
           System.out.println("is title of the application same as expected?:"+ title.equals(exptitle));
           String expurl = "https://demo.actitime.com/user/submit_tt.do";
           System.out.println(driver.getCurrentUrl());
           System.out.println("is user successfully logged in: "+ driver.getCurrentUrl().equals(expurl));
           driver.findElement(By.className("logoutCell preventPanelsHiding")).click();
          driver.findElement(By.id("logoutLink")).click();
	}

}
