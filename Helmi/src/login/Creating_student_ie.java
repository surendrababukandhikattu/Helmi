package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Creating_student_ie {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.ie.driver","C:\\Selenium\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.manage().window().maximize();
	
		driver.get("https://stresstest.helmi.fi");
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//img[@title='Englanti']")).click();
	    
// Application login	
	 driver.findElement(By.name("username")).sendKeys("superuser");
	 driver.findElement(By.name("password")).sendKeys("superuser");
	
	 driver.findElement(By.className("buttonLogin")).click();
	// driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

//Changing the language to English
	 
	// driver.findElement(By.xpath("//img[@title='Englanti']")).click();
	 //driver.findElement (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();

//Selecting from drop down
	Select dropdown = new Select(driver.findElement(By.name("runtimeSessionFaculty")));
	dropdown.selectByVisibleText("Alakoulu");
	 
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
// Clicking on Student module
	 driver.findElement(By.xpath("//*[@className='menuBarLayout'][@id='menupalkki']/div/ul[1]/li[3]/a/span")).click();
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//Clicking on Student search option 	 
	 driver.findElement(By.xpath("//*[@id='contentBoxContainer']/div/div/div/div[1]/div/div[1]/ul/li[1]/a")).click();	 
	
//Clicking on New student button 	 
	// driver.findElement(By.xpath("//*[@className='entity_add']/div[4]/div/div[3]/div/h3/div")).click();	 	 
	 driver.findElement(By.className("entity_add")).click();
	
//Creating student profile
	 //<Page_1>
	 driver.findElement(By.name("lastName")).sendKeys("cris1s");
	 driver.findElement(By.name("firstNames")).sendKeys("cris1s");
	 driver.findElement(By.name("firstName")).sendKeys("cris1s");
	 driver.findElement(By.name("birthDate")).sendKeys("06.03.2014");
	 driver.findElement(By.name("ssnPostfix")).sendKeys("9994");
	 
     WebElement button = driver.findElement(By.xpath("//*[contains(@type,'submit')]"));
	 button.click();
	
//<Page_2> 
	//Selecting from drop down
		
	 Select dropdown1 = new Select(driver.findElement(By.name("facultyPermissionSettings")));
		dropdown1.selectByVisibleText("Oletuskäyttäjäryhmä oppilaille");
		
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		
		
//Page Scroll down
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	   // JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,400)");
	
// Highlighting the save button 
		
   /*WebElement Savebutton= driver.findElement(By.xpath(".//*[@id='i1496121528370']/div[9]/div/input[1]"));
	Actions act =new Actions(driver);
	act.moveToElement(Savebutton).perform();
	
	driver.findElement(By.xpath(".//*[@id='i1496121528370']/div[9]/div/input[1]")).click();*/
	
		WebElement Savebutton= driver.findElement(By.xpath("//input[@value='Save']"));
		Actions act =new Actions(driver);
		act.moveToElement(Savebutton).perform();
		
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		
		//("//input[@value='Save']")
}
}
