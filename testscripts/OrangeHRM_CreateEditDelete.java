package testscripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webpages.OrangeHRM_AddEmployee;
import webpages.OrangeHRM_DashboardPage;
import webpages.OrangeHRM_LoginPage;
import webpages.OrangeHRM_PIM_EmployeeList;
import webpages.OrangeHRM_PersonalDetails;

public class OrangeHRM_CreateEditDelete extends SeleniumUtility{
	WebDriver driver;
	OrangeHRM_LoginPage getOrangeHRM_LoginPage;
	OrangeHRM_DashboardPage getOrangeHRM_DashboardPage;
	OrangeHRM_PIM_EmployeeList getOrangeHRM_PIM_EmployeeList;
	OrangeHRM_AddEmployee getOrangeHRM_AddEmployee;
	OrangeHRM_PersonalDetails getOrangeHRM_PersonalDetails;
	static String EmpId=null;

	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		// initialize your required WebPage class
		getOrangeHRM_LoginPage = new OrangeHRM_LoginPage(driver);
		getOrangeHRM_DashboardPage = new OrangeHRM_DashboardPage(driver);
		getOrangeHRM_PIM_EmployeeList = new OrangeHRM_PIM_EmployeeList(driver);
		getOrangeHRM_AddEmployee = new OrangeHRM_AddEmployee(driver);
		getOrangeHRM_PersonalDetails = new OrangeHRM_PersonalDetails(driver);
	} 

	@Test(priority=1)
	public void testLogin() {
		getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		String expectedHomeUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualHomeUrl=getCurrentUrlOfApplication();
		Assert.assertTrue(actualHomeUrl.contains(expectedHomeUrl),"Home page not opened");
	}
	@Test(priority=2)
	public void pimCreate() throws InterruptedException {
		getOrangeHRM_PIM_EmployeeList.clickOnPIMButton();
		getOrangeHRM_AddEmployee.clickOnAddEmp();
		 Actions actions = new Actions(driver);
		getOrangeHRM_AddEmployee.getAddEmpDetails().get(1).sendKeys("Rachel");
		getOrangeHRM_AddEmployee.getAddEmpDetails().get(2).sendKeys("Rachel");
		getOrangeHRM_AddEmployee.getAddEmpDetails().get(3).sendKeys("Geller");
		EmpId=getOrangeHRM_AddEmployee.getAddEmpDetails().get(4).getText();
		getOrangeHRM_AddEmployee.clickOnCreateLogin();
		getOrangeHRM_AddEmployee.enterUsername("Rachel_");
		getOrangeHRM_AddEmployee.enterPassword("@Gelng99_");
		getOrangeHRM_AddEmployee.clickonSaveButton();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void fillPersonalDetails() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		getOrangeHRM_PersonalDetails.getLicenseDetails().get(1).sendKeys("UL45MS");
		getOrangeHRM_PersonalDetails.getLicenseDetails().get(2).click();
		getOrangeHRM_PersonalDetails.getLicenseMonthYear().get(0).click();
		getOrangeHRM_PersonalDetails.getLicenseMonth().get(2).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-200)");
		getOrangeHRM_PersonalDetails.getLicenseMonthYear().get(1).click();
		Thread.sleep(2000);
		getOrangeHRM_PersonalDetails.getLicenseYear().get(10).click();
		getOrangeHRM_PersonalDetails.getLicenseDate().get(7).click();
		js.executeScript("window.scrollBy(0,-200)");
		getOrangeHRM_PersonalDetails.getNationMarital().get(0).click();
		getOrangeHRM_PersonalDetails.getNation().get(4).click();
		getOrangeHRM_PersonalDetails.getNationMarital().get(1).click();
		getOrangeHRM_PersonalDetails.getMarital().get(1).click();
		getOrangeHRM_PersonalDetails.getGender().get(0).click();
		getOrangeHRM_PersonalDetails.getLicenseDetails().get(3).click();
		getOrangeHRM_PersonalDetails.getdobMonthYear().get(0).click();
		getOrangeHRM_PersonalDetails.getdobMonth().get(4).click();
		getOrangeHRM_PersonalDetails.getdobMonthYear().get(1).click();
		getOrangeHRM_PersonalDetails.getdobYear().get(30).click();
		getOrangeHRM_PersonalDetails.getdobDate().get(2).click();
		js.executeScript("arguments[0].click();", getOrangeHRM_PersonalDetails.getSaveButton().get(0));
	}
	@Test(priority=4)
	public void searchNedit(){
		getOrangeHRM_PIM_EmployeeList.clickOnPIMButton();
		getOrangeHRM_PIM_EmployeeList.enterName("Rachel");
		getOrangeHRM_PIM_EmployeeList.clickOnSearchButton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		int numofemp=getOrangeHRM_PIM_EmployeeList.getEditEmp().size();
		if(getOrangeHRM_PIM_EmployeeList.getEditEmp().size()>1) {
			for(int k=0; k<numofemp; k++) {
				String empId=getOrangeHRM_PIM_EmployeeList.getEmpIDS().get(k).getText();
				if(empId==EmpId) {
					getOrangeHRM_PIM_EmployeeList.getEditEmp().get(k).click();
				}
				else {continue;}
			}}
			else {
				getOrangeHRM_PIM_EmployeeList.getEditEmp().get(0).click();
			}
		
	}//.oxd-table-row--clickable>div:nth-child(2)
	@Test(priority=5)
    public void searchNDelete() throws InterruptedException{
    	getOrangeHRM_PIM_EmployeeList.clickOnPIMButton();
		getOrangeHRM_PIM_EmployeeList.enterName("Rachel");
		getOrangeHRM_PIM_EmployeeList.clickOnSearchButton();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		int numofemp=getOrangeHRM_PIM_EmployeeList.getEditEmp().size();
		System.out.println(getOrangeHRM_PIM_EmployeeList.getEditEmp().size());
		if(getOrangeHRM_PIM_EmployeeList.getEditEmp().size()>1) {
			for(int k=0; k<numofemp; k++) {
				String empId=getOrangeHRM_PIM_EmployeeList.getEmpIDS().get(k).getText();
				if(empId==EmpId) {
					getOrangeHRM_PIM_EmployeeList.getEditEmp().get(k);
					js.executeScript("arguments[0].click();", getOrangeHRM_PIM_EmployeeList.getdeleteicon());
					js.executeScript("arguments[0].click();", getOrangeHRM_PIM_EmployeeList.getdeleteButton());

				}
				else {continue;}
			}}
			else {
				getOrangeHRM_PIM_EmployeeList.getEditEmp().get(0);
				js.executeScript("arguments[0].click();", getOrangeHRM_PIM_EmployeeList.getdeleteicon());
				js.executeScript("arguments[0].click();", getOrangeHRM_PIM_EmployeeList.getdeleteButton());

			}
		
	}
	
	

}
