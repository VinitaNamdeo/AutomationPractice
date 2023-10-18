package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class SauceDemoLogin extends SeleniumUtility {
	
	public SauceDemoLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(id="login-button")
	private WebElement loginbutton;
	
	public WebElement getuser() {
		return usernameField;
	}
	public WebElement getpass() {
		return passwordField;
	}
	
	public WebElement getloginButton() {
		return loginbutton;
	}
	

	public void loginInSauceDemo(String username,String password) {
		typeInput(usernameField, username);
		typeInput(passwordField, password);
		clickOnElement(loginbutton);
	}

}
