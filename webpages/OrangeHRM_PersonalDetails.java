package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_PersonalDetails extends SeleniumUtility {
	
	public OrangeHRM_PersonalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//form//div//div[2]//div//div//div[2]//input")
	private List<WebElement> LicenseDetails;
	
	@FindBy(css=".oxd-calendar-wrapper>div>ul>li>div")
	private List<WebElement> LicenseMonthYear;
	
	@FindBy(css=".oxd-calendar-wrapper>div>ul>li>ul>li")
	private List<WebElement> LicenseMonth;
	
	@FindBy(css=".oxd-calendar-dropdown>li")
	private List<WebElement> LicenseYear;
	
	@FindBy(css=".oxd-calendar-dates-grid>div")
	private List<WebElement> LicenseDate;
	
	@FindBy(xpath="//form//div[3]//div//div//div//div[2]//div//div//div[2]")
	private List<WebElement> NationMarital;
	
	@FindBy(css="div>.oxd-select-option>span")
	private List<WebElement> Nation;
	
	@FindBy(css="div>.oxd-select-option")
	private List<WebElement> Marital;
	
	@FindBy(xpath="//form//div//div[2]//div//div//div[2]//div[2]//span")
	private List<WebElement> gender;
	
	@FindBy(css=".oxd-calendar-wrapper>div>ul>li")
	private List<WebElement> dobMonthYear;
	
	@FindBy(css=".oxd-calendar-wrapper>div>ul>li>ul>li")
	private List<WebElement> dobMonth;
	
	@FindBy(css=".oxd-calendar-wrapper>div>ul>li:nth-child(2)>ul>li")
	private List<WebElement> dobYear;
	
	@FindBy(css="div>.oxd-calendar-wrapper .oxd-calendar-dates-grid>div")
	private List<WebElement> dobDate;
	
	@FindBy(xpath="//button[@type='submit']")
	private List<WebElement> SaveDetails;
	
	public List<WebElement> getLicenseDetails() {
		return LicenseDetails;
	}
	public List<WebElement> getLicenseMonthYear() {
		return LicenseMonthYear;
	}
	
	public List<WebElement> getLicenseMonth() {
		return LicenseMonth;
	}
	public List<WebElement> getLicenseYear() {
		return LicenseYear;
	}
	public List<WebElement> getLicenseDate() {
		return LicenseDate;
	}
	
	public List<WebElement> getNationMarital() {
		return NationMarital;
	}
	
	public List<WebElement> getNation() {
		return Nation;
	}
	
	public List<WebElement> getMarital() {
		return Marital;
	}
	public List<WebElement> getGender(){
		return gender;
	}
	public List<WebElement> getdobMonthYear(){
		return dobMonthYear;
	}
	
	public List<WebElement> getdobMonth(){
		return dobMonth;
	}
	public List<WebElement> getdobYear(){
		return dobYear;
	}
	public List<WebElement> getdobDate(){
		return dobDate;
	}
	
	public List<WebElement> getSaveButton() {
		return SaveDetails;
	}
	public void ClickOnSaveButton() {
		clickOnElement(SaveDetails.get(0));
	}
	
	
	
	
	

}
