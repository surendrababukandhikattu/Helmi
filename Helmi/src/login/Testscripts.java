package login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscripts {

	public static void main(String[] args) throws AWTException 
	{
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://stresstest.helmi.fi");
		//driver.get("https://www.facebook.com");
		//driver.manage().window().maximize();

// Application login	
		 driver.findElement(By.name("username")).sendKeys("superuser");
		 driver.findElement(By.name("password")).sendKeys("superuser");
		 driver.findElement(By.className("buttonLogin")).click();
		//driver.findElement(By.className("hohHeaderClock")).click();
		
		//((JavascriptExecutor)driver).executeScript(("window.scrollTo(0,400)"));
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		//WebDriverWait wait=new WebDriverWait(driver,120);
		
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Save']")));
				
				//WebElement button2 = driver.findElement(By.cssSelector(".button"));
				//button2.click();
				//WebElement button2 = driver.findElement(By.xpath(("//*[@id='i1496121378533']/div[9]/div/input[1]")));
				//button2.click();
	}		   
}
	


