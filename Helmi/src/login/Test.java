package login;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
	 driver.get("https://stresstest.helmi.fi");
     driver.findElement(By.name("username")).sendKeys("superuser");
	 driver.findElement(By.name("password")).sendKeys("superuser");
	 driver.findElement(By.className("buttonLogin")).click();

	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 
	 //Changing the language to English
	 driver.findElement
     (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();
	 
	 // Clicking on Facility
     driver.findElement
     (By.xpath("//*[@id='contentBoxContainer']/div/div/div/div[1]/div/div[2]/ul/li[5]/a")).click();
     System.out.println("Testinggggg1");
	
     driver.manage().timeouts() .implicitlyWait(100, TimeUnit.SECONDS);
     
     // Clicking on Facility available in the reservations
    driver.findElement(By.className("entity_add_plus")).click();
	    System.out.println("Testinggggg3");
	}

}
