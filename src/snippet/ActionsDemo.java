package snippet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//Action class for mouse and keyboard interactions
		Actions a=new Actions(driver);
		//mouse hover,send caps data ,double click and select it
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//mouse hover to specific element
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, Sign in']"))).build().perform();
		//right click using actions class
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Your Account']"))).contextClick().build().perform();
		

	}

}
