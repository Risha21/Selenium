import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.spicejet.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	  driver.findElement(By.xpath("//a[@value='BLR']")).click();
	 // driver.findElement(By.xpath("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
	  driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
	//  driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
	  
	//Select s=new Select(driver.findElement(By.xpath("//select[@class='valid']")));
	

	//  s.selectByValue("1");
	  //s.selectByIndex(6);
	  
	  
	  
	  
	  //Sign in
	 // driver.findElement(By.cssSelector("a[titile*='Sign in']")).click();
	/* driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click();
	  driver.findElement(By.cssSelector("input#login1")).sendKeys("hey doll");
	  driver.findElement(By.cssSelector("input#password")).sendKeys("hello");
	  driver.findElement(By.cssSelector("input.signinbtn")).click();
	  
	 Alert a= driver.switchTo().alert();
	System.out.println(a.getText()); */
	  

	}

}
