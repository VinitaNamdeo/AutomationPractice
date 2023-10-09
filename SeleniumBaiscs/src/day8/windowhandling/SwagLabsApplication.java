package day8.windowhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsApplication {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.saucedemo.com/");
     driver.findElement(By.cssSelector("div>.login_credentials")).click();
     List<WebElement> login = driver.findElements(By.xpath("//div[contains(text(), '_user')]"));
   
     String[] userarray = login.get(0).getText().split("\n", 6);
     for(String str1:userarray) {
			System.out.println(str1);
		}
    List<WebElement> pass = driver.findElements(By.cssSelector("div>.login_password"));
     
     String[] passarray = pass.get(0).getText().split("\n");
     for(String str2:passarray) {
			System.out.println(str2);
		}   
    driver.findElement(By.id("user-name")).sendKeys(userarray[1]);
    driver.findElement(By.id("password")).sendKeys(passarray[1]);
    driver.findElement(By.id("login-button")).click();
    Thread.sleep(5000);
    List<WebElement> items = driver.findElements(By.xpath("//div[2]//div//div//div//div[2]//div//a//div"));
    String items1 =items.get(1).getText();
    String items2 = items.get(2).getText();
	List<WebElement> itemlist = driver.findElements(By.cssSelector(".inventory_item_description>div:nth-child(2)>button"));
	Thread.sleep(5000);
	itemlist.get(1).click();
    itemlist.get(2).click();
	
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	List<WebElement> selectedItem = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	String selectedItem1 = selectedItem.get(0).getText();
	System.out.println(selectedItem.get(0).getText());
	String selectedItem2 = selectedItem.get(1).getText();
	System.out.println(selectedItem.get(1).getText());
	System.out.println("Are item in cart is same as we selected or not?: " + items1.equals(selectedItem1));
	System.out.println("Are item in cart is same as we selected or not?: " + items2.equals(selectedItem2));
    driver.findElement(By.xpath("//button[@id='checkout']")).click();
 List<WebElement> details = driver.findElements(By.xpath("//form//div//div//input"));
 details.get(0).sendKeys("Jon");
 details.get(1).sendKeys("Snow");
 details.get(2).sendKeys("486661");
 
	}
}
