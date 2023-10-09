package day5.dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
 	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		
		driver.get("https://demo.actitime.com/tasks/tasklist.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement addnew = driver.findElement(By.cssSelector("div.addNewButton"));
		addnew.click();
		//Select slt=new Select(addnew);
		//System.out.println("Is dropdown multiselect? :"+ slt.isMultiple());
		List<WebElement> addnewtaskoptions = driver.findElements(By.cssSelector("div.addNewMenu>div"));
		System.out.println("Options count: "+addnewtaskoptions.size());
		
		addnewtaskoptions.get(2).click();
	
		
       driver.findElement(By.cssSelector("tr.selectCustomerRow>td>div .comboboxButton")).click();
          wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".customerSelector .searchItemList")));
      List<WebElement> menuoptions = driver.findElements(By.cssSelector("tr.selectCustomerRow .searchItemList>div"));
           if(menuoptions.size()>2) {
        	   menuoptions.get(menuoptions.size()-2).click();
        	   driver.findElement(By.cssSelector(".projectSelectorRow .comboboxButton")).click();
        	   List<WebElement> projectoptions = driver.findElements(By.cssSelector(".projectSelector  .searchItemList>div"));
        	   if(projectoptions.size()>3) {
        		   projectoptions.get(3).click();
        	   }
        	   else {
        		   projectoptions.get(0).click();
        		   driver.findElement(By.xpath("//td//input[@placeholder= 'Enter Project Name']")).sendKeys("Smoke Testing");
        	   }
           }
           else {
        	   //wait.until(ExpectedConditions.visibilityOfElementLocated(""))
        	   menuoptions.get(0).click();
        	   
        	   List<WebElement> newInputCustomer = driver.findElements(By.cssSelector("newCustomerProjectField"));
        	   newInputCustomer.get(0).sendKeys("Vini");
        	   newInputCustomer.get(1).sendKeys("Smoke Testing");
        	   //Thread.sleep(1000);
        	   //driver.findElement(By.cssSelector("input.newCustomer")).sendKeys("vini");
        	  // driver.findElement(By.cssSelector("input.newProject")).sendKeys("automation");
           }
           //Thread.sleep(1000);
           //driver.findElement(By.xpath("//td//input[@placeholder='Enter task name']")).sendKeys("API");
           //wait.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElements(By.cssSelector(".taskTableContainer .inputFieldWithPlaceholder")))).click();
           //driver.findElement(By.cssSelector(".taskTableContainer .inputFieldWithPlaceholder")).click();
           List<WebElement> taskenter = driver.findElements(By.cssSelector(".taskTable .nameCell>input"));
           WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait2.until(ExpectedConditions.elementToBeClickable(taskenter.get(0))); taskenter.get(0).click();
          
        		   taskenter.get(0).sendKeys("api");
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement commit = driver.findElement(By.cssSelector(".buttonsBox .commitButtonPlaceHolder"));
            wait3.until(ExpectedConditions.visibilityOf(commit));
            wait3.until(ExpectedConditions.elementToBeSelected(commit));
          
            commit.click();
	}
	
	
	

}
          /* System.out.println(menuoptions.size());
           
           for(int j=0;j<menuoptions.size();j++) {
        	   Actions action1 = new Actions(driver);
        	   action1.moveToElement(menuoptions.get(j)).build().perform();
   			System.out.println(menuoptions.get(j).getText());
   		} 
           driver.manage().timeouts();
          
   		Actions action2 = new Actions(driver); 
   		action2.moveToElement(menuoptions.get(2)).click().build().perform();
   	
   		
   	
   		
   		
   		
   		
   		
   		List<WebElement> projectoptions = driver.findElements(By.cssSelector("tr.projectSelectorRow>td>div>div>div>div>div>div>div"));
           projectoptions.get(2).click();
           
           //driver.findElement(By.cssSelector("td.nameCell>input")).sendKeys("task");
           //System.out.println(m2.getText());
		
           //scrollableContainer   .contentWrapper>div>.itemRow
		//div.focused
           //div>.comboboxButton.focused>div>div>
   		//div>.emptySelection
	}

}*///tr.projectSelectorRow>td>div>div>div>div>div>div>div- locator of select project-total items-12
