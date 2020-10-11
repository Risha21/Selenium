package snippet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("risha");
		// driver.findElement(By.cssSelector("#alertbtn")).click();
		driver.findElement(By.cssSelector("#confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		// driver.switchTo().alert().accept();
		String expectedText = "Hello risha, Are you sure you want to confirm";
driver.switchTo().alert().getText();
		String actualText = null;
		Assert.assertEquals(actualText, expectedText, "accepted");
		/*
		 * if(driver.switchTo().alert().getText().equalsIgnoreCase(expectedText)) {
		 * driver.switchTo().alert().accept(); System.out.println("accepted the alert");
		 * } else { driver.switchTo().alert().dismiss();
		 * System.out.println("rejected the alert");
		 */
	}

}
