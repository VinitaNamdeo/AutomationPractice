package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemoHome extends SeleniumUtility {

	public SauceDemoHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[2]//div//div//div//div[2]//div//a//div")
	private List<WebElement> ItemsNames;
	

	@FindBy(css=".inventory_item_description>div:nth-child(2)>button")
	private List<WebElement> ItemsAddButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement CartButton;
	
  
   public List<WebElement> getItems(){
   return ItemsNames;
	}
   public List<WebElement> getItemsAddButton(){
	   return ItemsAddButton;
   }
   
   public WebElement getCartButton() {
	   return CartButton;
   }
}
