package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("https://stresstest.helmi.fi");
	//driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//img[@title='Englanti']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,120);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Username']")));
	
	driver.findElement(By.xpath("//div[text()='Username']/following-sibling::div/input")).sendKeys("superuser");
	
	driver.findElement(By.xpath("//div[text()='Password']/following-sibling::div/input")).sendKeys("superuser");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	   driver.findElement(By.xpath("//a[text()='Logout']")).click();
	   
	   
	  // driver.close();
	   
		//$x("//div[text()='Username']/following-sibling::div/input[@class='text propertyUserNamePassword']") 
	/*
	driver.findElement(By.xpath("//img[@title='Englanti']")).click();
	
	WebDriverWait wait=new WebDriverWait(driver,120);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Username']"))); 
	 //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//div[text()='Username']/following-sibling::div/input")).sendKeys("superuser");
	 driver.findElement(By.xpath("//div[text()='Password']/following-sibling::div/input")).sendKeys("superuser");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();*/
	 
	 
	/* driver.findElement(By.name("username")).sendKeys("superuser");
	 driver.findElement(By.name("password")).sendKeys("superuser");
	 driver.findElement(By.className("buttonLogin")).click();
	 driver.findElement
     (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();
	 
	 driver.findElement(By.xpath("//li/a[text()='Facilities']	")).click();
	 driver.findElement(By.xpath("//a[contains(text(), 'New premises')]")).click();
	 driver.findElement(By.xpath("//label[text()='Name']/following-sibling::span/span/input")).click();	
		
		
		*/
	}

}
