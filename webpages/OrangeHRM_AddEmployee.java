package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_AddEmployee extends SeleniumUtility{
 
	 public OrangeHRM_AddEmployee(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	 
	 }
	 
	   @FindBy(xpath="//header//nav//ul//li[3]//a")
		private WebElement AddEmp;
	 
	 
		@FindBy(xpath="//form//input")
		private List<WebElement> AddEmpDetails;
		
		@FindBy(xpath="//form//span")
		private WebElement CreatLoginDetailButton ;
		  
		@FindBy(xpath="//form//div[3]//div//div[2]//input[@class='oxd-input oxd-input--active']    ")
		private WebElement Username ;
		 
		@FindBy(xpath="//form//div//div//div[4]//input")
		private List<WebElement> Password;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement Save;
		
		public WebElement getAddEmp() {
			return AddEmp;
		}
		
		public List<WebElement> getAddEmpDetails(){
			return AddEmpDetails;
		}
		
		public WebElement getCreatLoginButton() {
			return CreatLoginDetailButton;
		}
		public WebElement getUsername() {
			return Username;
		}
		public void clickOnAddEmp() {
			clickOnElement(AddEmp);
		}
		
		public void clickOnCreateLogin() {
			clickOnElement(CreatLoginDetailButton);
		}
	
		public void enterUsername(String text) {
			typeInput(Username, text);
		}
		
		public void enterPassword(String text) {
			for(int i=0; i<Password.size(); i++) {
				WebElement element = Password.get(i);
				typeInput(element, text);
			}
		}
		public void clickonSaveButton()	{
			clickOnElement(Save);
		}
		
}
