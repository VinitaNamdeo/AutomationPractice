package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemoChekOut extends SeleniumUtility{
	public SauceDemoChekOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form//div//div//input")
	private List<WebElement> fillDetails;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}
	
	public List<WebElement> getfillDetails(){
		return fillDetails;
	}
}
