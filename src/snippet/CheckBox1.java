package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Boolean b = driver.findElement(By.xpath("//label[text()=' Senior Citizen']")).isSelected();
		Assert.assertFalse(b);

		driver.findElement(By.xpath("//label[text()=' Senior Citizen']")).click();
		Boolean b2 = driver.findElement(By.xpath("//label[text()=' Senior Citizen']")).isSelected();
		Assert.assertTrue(b2);
		/*
		 * List<WebElement>
		 * ls=driver.findElements(By.xpath("//input[@type='checkbox']"));
		 * System.out.println("number of checkboxes available are:"+ls.size());
		 * 
		 * for(WebElement options:ls) { if(options.getText().equals(" Senior Citizen"));
		 * options.click(); break;
		 */

	}

}
