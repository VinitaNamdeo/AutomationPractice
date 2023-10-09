package day1.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement usernameInput=driver.findElement(By.name("username"));
	       
	    usernameInput.sendKeys("Admin");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("admin123");
		   driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
        String title = driver.getTitle();
        String exptitle = "OrangeHRM";
        System.out.println("is title of the application same as expected?:"+ title.equals(exptitle));
        WebElement logoutButton=driver.findElement(By.className("oxd-userdropdown-link"));
        logoutButton.click();

	}

}
