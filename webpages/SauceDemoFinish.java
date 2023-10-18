package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoFinish {
	public SauceDemoFinish(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finishButton;
	
	@FindBy(xpath="//button[@id='back-to-products']")
	private WebElement backHomeButton;
	
	@FindBy(xpath="//div//h2")
	private WebElement OrderSuccessMsg;
	
	public WebElement getFinishButton() {
		return finishButton;
	}
	public WebElement getbackHomeButton() {
		return backHomeButton;
	}
	public WebElement getOrderSuccessMsg() {
		return OrderSuccessMsg;
	}
}
