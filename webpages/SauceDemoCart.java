package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemoCart extends SeleniumUtility {
	public SauceDemoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
  
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private List<WebElement> addedItems;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement chekoutButton;
	
	public List<WebElement> getaddedItems(){
		return addedItems;
	}
	public WebElement getChekOutButton() {
		return chekoutButton;
	}

}
