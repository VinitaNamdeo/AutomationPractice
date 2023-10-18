package testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.SauceDemoCart;
import webpages.SauceDemoChekOut;
import webpages.SauceDemoFinish;
import webpages.SauceDemoHome;
import webpages.SauceDemoLogin;

public class SauceDemoScript extends SeleniumUtility {
	WebDriver driver;
	SauceDemoLogin getSauceDemoLogin;
	SauceDemoHome getSauceDemoHome;
	SauceDemoFinish getSauceDemoFinish;
	SauceDemoChekOut getSauceDemoChekOut;
	SauceDemoCart getSauceDemoCart;
	static String Item1, Item2;
	
	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://www.saucedemo.com/");
		getSauceDemoLogin = new SauceDemoLogin(driver);
		getSauceDemoHome = new SauceDemoHome(driver);
		getSauceDemoFinish = new SauceDemoFinish(driver);
		getSauceDemoChekOut = new SauceDemoChekOut(driver);
		getSauceDemoCart = new SauceDemoCart(driver);
}
	@Test(priority=1)
	public void login() {
		getSauceDemoLogin.loginInSauceDemo("standard_user", "secret_sauce");
		String expectedTitle="Swag Labs";
		String actualTitle= getCurrentTitleOfApplication();
		Assert.assertEquals(expectedTitle,actualTitle);
		
	}
	
	@Test(priority=2)
	public void addItems() {
		Item1 = getSauceDemoHome.getItems().get(0).getText();
		Item2 = getSauceDemoHome.getItems().get(1).getText();
		getSauceDemoHome.getItemsAddButton().get(0).click();
		getSauceDemoHome.getItemsAddButton().get(1).click();
	}
	@Test(priority=3)
	public void checkCart() {
		String addedItem1=getSauceDemoCart.getaddedItems().get(0).getText();
		String addedItem2=getSauceDemoCart.getaddedItems().get(1).getText();
		Assert.assertEquals(Item1, addedItem1);
		Assert.assertEquals(Item2, addedItem2);
		getSauceDemoCart.getChekOutButton().click();
	}
	@Test(priority=4)
	public void chekOutdetails() {
		getSauceDemoChekOut.getfillDetails().get(0).sendKeys("Shefali");
		getSauceDemoChekOut.getfillDetails().get(1).sendKeys("Singh");
		getSauceDemoChekOut.getfillDetails().get(2).sendKeys("486661");
		getSauceDemoChekOut.getContinueButton().click();
	}
	@Test(priority=5)
	public void FinishOrder() {
		getSauceDemoFinish.getFinishButton().click();
		String OrderSuccessmsg=getSauceDemoFinish.getOrderSuccessMsg().getText();
		Assert.assertEquals(OrderSuccessmsg, "Thank you for your order!");
		getSauceDemoFinish.getbackHomeButton().click();
	}
	



}
