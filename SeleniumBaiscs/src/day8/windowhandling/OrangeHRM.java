package day8.windowhandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 String homeWinId=driver.getWindowHandle();
	 System.out.println(homeWinId);
	 Thread.sleep(2000);
	WebElement PIM = driver.findElement(By.xpath("//div//div//aside//div[2]//ul//li[2]//a//span"));
	PIM.click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//header//nav//ul//li[3]//a")).click();
	Thread.sleep(2000);
	List<WebElement> inputfield= driver.findElements(By.xpath("//form//input"));

		inputfield.get(1).sendKeys("Vini");
		inputfield.get(2).sendKeys("Namdeo");
		inputfield.get(3).sendKeys("Namdeo");
		inputfield.get(4).sendKeys("0971");
		//inputfield.get(5).click();
		driver.findElement(By.xpath("//form//span")).click();
		List<WebElement> login = driver.findElements(By.xpath("//form//div//div//div[3]//div//div//input"));
		login.get(0).sendKeys("vinnu02");
		List<WebElement> password = driver.findElements(By.xpath("//form//div//div//div[4]//input"));
		for(int i=0; i<password.size(); i++) {
			password.get(i).sendKeys("@Gdtman123_");
		}
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//header//nav//ul//li[2]//a")).click();
      
	 //driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("aman");
	 //driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sharma");
	 
	
	List<WebElement> input=driver.findElements(By.xpath("//div//form//div//div[2]//div//input"));
    input.get(0).sendKeys("Vini");
  
   // driver.findElement(By.xpath("//div//form//div[3]//div//div[2]//div//div[2]//i")).click();
    //List<WebElement> status = driver.findElements(By.cssSelector(".oxd-select-dropdown"));
    // status.get(3).click();
	
	//driver.findElement(By.xpath("//div//form//div[4]//div//div[2]//div//div[2]//i")).click();
    //List<WebElement> include = driver.findElements(By.cssSelector("div.oxd-select-dropdown.--position-bottom"));
    
    //driver.findElement(By.xpath("//div//form//div[6]//div//div[2]")).click();
    //List<WebElement> title = driver.findElements(By.cssSelector("div.oxd-select-dropdown.--position-bottom"));
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.cssSelector(".oxd-table-row--clickable")).click();
     driver.manage().window().maximize();
    List<WebElement> editDetails = driver.findElements(By.xpath("//form//div//div[2]//div//div//div[2]//input"));
    		Thread.sleep(3000);
    editDetails.get(1).sendKeys("SD45611C9");
    editDetails.get(2).click();
    List<WebElement> monthyear= driver.findElements(By.cssSelector(".oxd-calendar-wrapper>div>ul>li>div"));
   monthyear.get(0).click();
    List<WebElement> monthSelect = driver.findElements(By.cssSelector(".oxd-calendar-wrapper>div>ul>li>ul>li"));
    System.out.println(monthSelect.size());
    monthSelect.get(0).click();
    monthyear.get(1).click();
    //driver.findElement(By.cssSelector("li>.oxd-calendar-selector-year-selected")).click();
    //driver.findElement(By.xpath("//form//div//div[2]//div//div//div[2]")).click();
   List<WebElement> yearSelect = driver.findElements(By.cssSelector(".oxd-calendar-dropdown>li"));
   yearSelect.get(28).click();
   List<WebElement> dateSelect = driver.findElements(By.cssSelector(".oxd-calendar-dates-grid>div"));
   dateSelect.get(8).click();
   Thread.sleep(3000);
// Scroll down the web page by 100 pixels
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,-200)");
  List<WebElement> NationMarital= driver.findElements(By.xpath("//form//div[3]//div//div//div//div[2]//div//div//div[2]"));
  wait.until(ExpectedConditions.visibilityOfAllElements(NationMarital));
  System.out.println(NationMarital.size());
  Actions actions = new Actions(driver); 
  actions.moveToElement(NationMarital.get(0)).click().build().perform();
  
  //wait.until(ExpectedConditions.visibilityOfAllElements(NationMarital));
  Thread.sleep(3000);
  //wa it.until(ExpectedConditions.visibilityOf( NationMarital.get(0)));
  //NationMarital.get(0).click();
  List<WebElement> Nation = driver.findElements(By.cssSelector("div>.oxd-select-option>span"));
  //By locator = By.cssSelector("div>.oxd-select-option>span");
  //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

  System.out.println(Nation.size());
  //System.out.println(Nation.get(1).getText());
  
  Nation.get(3).click();
   
   Thread.sleep(3000);
   //wait.until(ExpectedConditions.elementToBeClickable(NationMarital.get(1)));
   //wait.until(ExpectedConditions.visibilityOf(NationMarital.get(1)));
   actions.moveToElement(NationMarital.get(1)).click().build().perform();

   //driver.findElement(By.xpath("//form//div//div[2]//div//div//div//div//div[2]//i")).click();
   List<WebElement> Marital = driver.findElements(By.cssSelector("div>.oxd-select-option"));
  System.out.println(Marital.size());
  Marital.get(1).click();
   List<WebElement> gender= driver.findElements(By.xpath("//form//div//div[2]//div//div//div[2]//div[2]//span"));
   gender.get(0).click();
   
   WebElement save= driver.findElement(By.xpath("//button[@type='submit']"));
   actions.moveToElement(save).click().build().perform();
    //editDetails.get(3).
   // editDetails.get(4).sendKeys("D45611C");
   ////form//div[3]//div//div[2]//div//div//div
  //form//div//div[2]//div//div//div[2]
    //.oxd-calendar-wrapper>div>ul>li>div
	}}

	


