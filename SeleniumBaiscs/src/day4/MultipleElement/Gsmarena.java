package day4.MultipleElement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.ClassFileLocator.ForUrl;

//div.brandmenu-v2>ul>li>a

public class Gsmarena {
	
	public static void main(String[] args) {
		
		List<WebElement> listdevice = getElements("https://www.gsmarena.com/", "div.brandmenu-v2>ul>li>a");
		System.out.println("Total count of device: "+ listdevice.size());
		for(int i=0;i<listdevice.size();i++) {
			System.out.println(listdevice.get(i).getText());
	}}
public static List<WebElement> getElements(String url, String selector) {
	int count = 0; 
	WebDriver driver = new ChromeDriver();	
	driver.get(url);
	driver.manage().window().maximize();
	List<WebElement> devicelist = driver.findElements(By.cssSelector(selector));
	return devicelist;
	
}

}