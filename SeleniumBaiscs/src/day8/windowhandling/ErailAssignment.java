package day8.windowhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ErailAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://erail.in/");
		driver.manage().window().maximize();
        String homeWinId=driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		Set<String> allWinIds=driver.getWindowHandles();
		allWinIds.remove(homeWinId);
		String childWinId=allWinIds.iterator().next();
		driver.switchTo().window(childWinId);
    	Thread.sleep(2000);
		WebElement chekmark = driver.findElement(By.xpath("//div[2]//div//div[2]//div//div[2]//ul//li[2]//span"));
		wait.until(ExpectedConditions.visibilityOf(chekmark));
		chekmark.click();
		List<WebElement> pkgname = driver.findElements(By.xpath("//div[2]//div//div[2]//div//h5"));
		List<WebElement> pkgprice = driver.findElements(By.cssSelector("div>.col-12.col-md-2>div>strong"));
		for(int i=0; i<pkgname.size(); i++) {
		String pkg= pkgname.get(i).getText();
		String price =	pkgprice.get(i).getText();
	  System.out.println("pkg name: "+ pkg+ "pkg price: "+ price );
				
			}
		
		
		
		
		
       
	}

}
