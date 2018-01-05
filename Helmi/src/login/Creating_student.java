package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Creating_student {
	//@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();*/

	    /*System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();*/
		
	driver.get("https://stresstest.helmi.fi");
	//driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
// Application login	
	 driver.findElement(By.name("username")).sendKeys("superuser");
	 driver.findElement(By.name("password")).sendKeys("superuser");
	 driver.findElement(By.className("buttonLogin")).click();
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

//Changing the language to English
	 driver.findElement
     (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();

//Selecting from drop down for Educational Institution
	Select dropdown = new Select(driver.findElement(By.id("runtimeSessionFaculty")));
	dropdown.selectByVisibleText("Alakoulu");
	 
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
// Clicking on Student module
	 driver.findElement(By.xpath("//*[@id='menupalkki']/div/ul/li[3]/a/span")).click();

//Clicking on Student search option 	 
	 driver.findElement(By.xpath("//*[@id='contentBoxContainer']/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();	 
	
//Clicking on New student button 	 
	// driver.findElement(By.xpath("//*[@className='entity_add']/div[4]/div/div[3]/div/h3/div")).click();	 	 
	 driver.findElement(By.className("entity_add")).click();
	
//Creating student profile
	 //<Page_1>
	 driver.findElement(By.name("lastName")).sendKeys("cris1ss");
	 driver.findElement(By.name("firstNames")).sendKeys("cris1ss");
	 driver.findElement(By.name("firstName")).sendKeys("cris1ss");
	 driver.findElement(By.name("birthDate")).sendKeys("06.03.2016");
	 driver.findElement(By.name("ssnPostfix")).sendKeys("3337");

// Clicking on Continue button
     WebElement button = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
	 button.click();
	
//<Page_2> 
	//Selecting from drop down for User group
		
	 Select dropdown1 = new Select(driver.findElement(By.name("facultyPermissionSettings")));
		dropdown1.selectByVisibleText("Oletuskäyttäjäryhmä oppilaille");
		
//Page Scroll down actions
		
		/*((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		*/

		Select dropdown2 = new Select(driver.findElement(By.name("departmentClass")));
		dropdown2.selectByVisibleText("1A");
		
		Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.name("departmentClass")); 
        
        actions.moveToElement(mainMenu);
        actions.click().build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform(); 
        actions.sendKeys(Keys.PAGE_DOWN).perform(); 
        actions.sendKeys(Keys.PAGE_DOWN).perform(); 
		
		//((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	    /*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");*/
	
// Highlighting the save button 
    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        
	WebElement Savebutton= driver.findElement(By.xpath("//input[@value='Save']"));
	Actions act =new Actions(driver);
	act.moveToElement(Savebutton).perform();

// Clicking on Save button 
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	
  }

}
