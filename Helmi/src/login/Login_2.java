package login;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Login_2 {

	//private static String baseurl;
	
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
	 //driver.findElement( By.className("pulldown")).click();
	 
	 //Changing the language to English
	 driver.findElement
     (By.xpath (".//*[@id='menupalkki']/div/ul[1]/li[10]/span/a[3]/img")).click();

	Select dropdown = new Select(driver.findElement(By.id("runtimeSessionFaculty")));
			 
	 dropdown.selectByVisibleText("Alakoulu");
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 driver.findElement(By.xpath(".//*[@id='menupalkki']/div/ul[1]/li[8]/a/span")).click();
	  System.out.println("Testinggggg1"); 
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 driver.findElement(By.xpath(".//*[@id='plans-list']/ui-view/div/div[2]/div[2]/table/tbody/tr[9]/td[1]/a")).click();
	  System.out.println("Testinggggg2"); 
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 //driver.findElement(By.className("translate-cloak")).click();
	   
	 //driver.findElement(By.cssSelector("html/body/ui-view/div[1]/ul/li[5]/a")).click();
	 System.out.println("Testinggggg3");
	 //driver.findElement(By.name("Työkalut"));
	 
	/* WebElement test = driver.findElement(By.name("Työkalut"));
	 test.click();
	 
	 System.out.println("Testinggggg4");		 
	 
	 */
	 WebElement test1 = driver.findElement(By.xpath("/html/body/ui/view/div[1]/ul/li[5]/a"));
	 test1.click();
	 System.out.println("Testinggggg5");		 
	 System.out.println("Testingggggnew");	
	 
	 //driver.findElement(By.xpath(".//*[@id='tools']/div[2]/ul/li[2]/a")).click();
   //driver.close();
	
	}
	
 }



