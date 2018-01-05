package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helmi_login {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		// setting up the driver which we use
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
	
	// Initializing the browser	
       WebDriver driver = new ChromeDriver();
  
       //String baseurl = "https://stresstest.helmi.fi";	   
      
    //Accessing the URl's
       driver.get("baseurl");
       
       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
       System.out.println("Testinggggg1");
//       driver.findElement(By.name("username")).sendKeys("superuser");
//       System.out.println("Testinggggg2");
//       driver.findElement(By.name("password")).sendKeys("superuser");
//       driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//       //driver.findElement(By.cssSelector("#i1491898540234 > table > tbody > tr:nth-child(3) > td > div > div.loginPropertyEditorWrapper > input")).click();
//       driver.findElement(By.className("buttonLogin")).click();
//    //driver.findElement(By.xpath("//*[@id='i1491898539679']/table/tbody/tr[3]/td/div/div[2]/input")).click();
//       //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//       WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement signin = wait.until(
//                   ExpectedConditions.visibilityOfElementLocated(By.className("buttonLogin")));
//       driver.switchTo().alert().dismiss();
//       System.out.println("Testinggggg3"); 
//       
//       /*WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement signin = wait.until(
//                   ExpectedConditions.visibilityOfElementLocated(By.className("buttonLogin"))); */
//       
       }
}


