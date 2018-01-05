package login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creating_facility {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//baseurl = "https://stresstest.helmi.fi";
	
	//driver.get("baseurl");
	driver.get("https://stresstest.helmi.fi");
	
	 driver.findElement(By.name("username")).sendKeys("superuser");
	 driver.findElement(By.name("password")).sendKeys("superuser");
	 driver.findElement(By.className("buttonLogin")).click();
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 driver.findElement
     (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();
	 
	 // Clicking on Facility
     driver.findElement
     (By.xpath("//*[@id='contentBoxContainer']/div/div/div/div[1]/div/div[2]/ul/li[5]/a")).click();
     System.out.println("Testinggggg1");
	// Clicking on Facility available in the reservations
     
     /*WebDriver driver1 = new ChromeDriver();*/
     /*JavascriptExecutor jse = (JavascriptExecutor)driver;
     jse.executeScript("window.scrollBy(0,-250)", "");
    
     System.out.println("OK");
     */
     /*Robot robot = new Robot();
     robot.keyPress(KeyEvent.VK_PAGE_DOWN);
     robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
     
     System.out.println("Testinggggg2");
	 
     driver.manage().timeouts() .implicitlyWait(100, TimeUnit.SECONDS);
	 //driver.findElement(By.xpath(".//*[@id='i1496120471718']/a/text()")).click();
	 
	 driver.findElement(By.className("entity_add")).click();
	    System.out.println("Testinggggg3");
	}

}
