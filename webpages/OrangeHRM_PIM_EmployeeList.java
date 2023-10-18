package webpages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class OrangeHRM_PIM_EmployeeList extends SeleniumUtility {
	
	public OrangeHRM_PIM_EmployeeList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div//div//aside//div[2]//ul//li[2]//a//span")
	private WebElement PIM;
	
	@FindBy(xpath="//header//nav//ul//li[2]//a")
	private WebElement viewEmpList;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement EmpName ;
	
	@FindBy(xpath="//form//div[2]//div//div[2]//input")
	private WebElement EmpID ;
	
	@FindBy(xpath="//form//div[3]//div[2]//div[2]")
	private List<WebElement> EmpStatus  ;
	
	@FindBy(xpath="//form//div[6]//div[2]//div[2]")
	private List<WebElement> JobTitle;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement search;
	
	@FindBy(css=".oxd-table-row--clickable")
	private List<WebElement> EditEmp;
	
	@FindBy(css=".oxd-table-row--clickable>div:nth-child(2)")
	private List<WebElement> EmpIDS;
	
	//.oxd-table-row--clickable>div:nth-child(9)>div>button
	
	@FindBy(xpath="//button[1][@class='oxd-icon-button oxd-table-cell-action-space']")
	private WebElement deleteIcon;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	private WebElement deleteButton;
	
	
	public WebElement getPIM() {
		return PIM;	
	}
	public WebElement getviewEmpList() {
		return viewEmpList;	
	}
	public WebElement getEmpName() {
		return EmpName;	
	}
	public WebElement getID() {
		return EmpID;	
	}
	public WebElement getSearchButton() {
		return search;	
	}
	public List<WebElement> getEditEmp() {
		return EditEmp;	
	}
	public void clickOnPIMButton() {
		clickOnElement(PIM);
	}
	public void clickOnviewEmp() {
		clickOnElement(viewEmpList);
	}
	public void enterName(String text) {
		typeInput(EmpName, text);
	}
	public void enterID(String text) {
		typeInput(EmpID, text);
	}
	public void clickOnSearchButton() {
		clickOnElement(search);
	}
	public List<WebElement> getEmpIDS() {
		return EmpIDS;
	}
	public WebElement getdeleteButton() {
		return deleteButton;
	}
	public WebElement getdeleteicon() {
		return deleteIcon;
	}
	public void clickOndeleteButton() {
		clickOnElement(deleteButton);
	}
	public void clickOndeleteicon() {
		clickOnElement(deleteIcon);
	}

}
