package day4.MultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


//div.review-nav>div:nth-child(2)>a:nth-child(2)
public class SamsungPhones {

	public static void main(String[] args) {

		getpageCount("https://www.gsmarena.com/samsung-phones-9.php", "div.nav-pages>a", "div.makers>ul>li>a");
		//System.out.println("Total count of device: "+ listdevice.size());
	
	}
public static void getpageCount(String url, String selector1, String selector2) {
	int pagecount = 0; 
	WebDriver driver = new ChromeDriver();	
	driver.get(url);
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("div.brandmenu-v2>ul>:nth-child(1)")).click();
	List<WebElement> navpages = driver.findElements(By.cssSelector(selector1));
	List<WebElement> navpage = driver.findElements(By.cssSelector("div>.nav-pages>strong"));
	pagecount = navpage.size()+navpages.size();
	System.out.println(pagecount);
	//List<WebElement> devicelist = driver.findElements(By.cssSelector(selector2));
     int j=0;
	while(j<=pagecount) {
       driver.findElement(By.cssSelector("div>.nav-pages>strong")).click();
     List<WebElement> devicelist = driver.findElements(By.cssSelector(selector2));
          for(int i=0; i<devicelist.size();i++) {
	 System.out.println(devicelist.get(i).getText());}
          j++;
       driver.findElement(By.cssSelector("div.review-nav>div:nth-child(2)>a:nth-child(2)")).click();

     }
	
         

}}
