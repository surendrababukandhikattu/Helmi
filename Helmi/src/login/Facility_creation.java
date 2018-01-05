package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facility_creation {

	public static void main(String[] args) {
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
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
     driver.findElement(By.linkText("Satya")).click();
     System.out.println("Testinggggg2");
 	//driver.close();
	
     //(By.xpath(".//*[@id='i1496120466360']/tbody/tr[3]/td[1]/a")).click();
     //(By.partialLinkText("/facility.load.npf?npfId=129983661435i")).click();
     
	//Editing the faiclity abrevation and renaming it.
     
   /* driver.findElement(By.name("abbreviation")).clear();
    driver.findElement(By.name("abbreviation")).sendKeys("reservation");
	
	// selecting offices check in as Banglore
    Select dropdown = new Select(driver.findElement(By.id("schoolUnit")));
	 
	 dropdown.selectByVisibleText("Bangalore");
	 
	 //Saving the changes
	 
	 driver.findElement(By.className("button buttonSave")).click();
	 
	*/
	}

}
