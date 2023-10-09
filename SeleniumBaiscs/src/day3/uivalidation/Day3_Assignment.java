package day3.uivalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_Assignment {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement usernamebutton = driver.findElement(By.id("user-name"));

		System.out.println("Username field border color: " + usernamebutton.getCssValue("border-bottom"));

		WebElement loginbutton = driver.findElement(By.id("login-button"));
		System.out.println("is loginbutton field visible? " + loginbutton.isDisplayed());
		System.out.println("is loginbutton field enable? " + loginbutton.isEnabled());
		System.out.println("login field name: " + loginbutton.getAttribute("value"));
		System.out.println("loginbutton background color " + loginbutton.getCssValue("background-color"));
		System.out.println("loginbutton color: " + loginbutton.getCssValue("color"));
		
		loginbutton.click();
		System.out.println("is Username field visible? " + usernamebutton.isDisplayed());
		System.out.println("is Username field editable? " + usernamebutton.isEnabled());
		System.out.println("Username field default text " + usernamebutton.getAttribute("placeholder"));
		System.out.println("Username field border color after clicking on login button: " + usernamebutton.getCssValue("border-bottom"));

		WebElement errormsg = driver.findElement(By.xpath("//div//h3"));
		//System.out.println(errormsg.getText());
		
		System.out.println("is error msg visible? " + errormsg.isDisplayed());
		System.out.println("is error msg enable? " + errormsg.isEnabled());
		System.out.println("error msg:"+ errormsg.getText());
		System.out.println("error msg text size? " + errormsg.getCssValue("font-size"));
		System.out.println("error msg text color? " + errormsg.getCssValue("color"));
		//System.out.println("error msg text background color? " + errormsg.getCssValue("background-color"));
		WebElement errormsgbackground = driver.findElement(By.className("error-message-container"));
        System.out.println("error msg text background color? "+ errormsgbackground.getCssValue("background-color"));
		
        Point errorlocation = errormsg.getLocation();
        int error_xcord = errorlocation.getX();
        int error_ycord = errorlocation.getY();
        
        WebElement passwordfield = driver.findElement(By.id("password"));
        
        Point passwordlocation = passwordfield.getLocation();
        int pass_xcord = passwordlocation.getX();
        int pass_ycord = passwordlocation.getY();
        System.out.println("password y-cord: "+ pass_ycord);
        System.out.println("error y-cord: "+ error_ycord );
    
        System.out.println("Is error msg getting displayed below Passwordfield ? "+ (pass_ycord<error_ycord));
        

	}
	

}
