package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestion2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ja");
		List<WebElement> lsAutoSuggestion=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		System.out.println("Elements available in suggestion when user enter ind are:"+lsAutoSuggestion.size());
	
		for(WebElement option:lsAutoSuggestion) {
			String actualText="India";
		//	System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("India"));
			option.click();
			break;
			/*
			
			if(lsAutoSuggestion.equals(actualText));
		
			lsAutoSuggestion.get(i).click();
			System.out.println("You have selected:"+actualText);*/
		
		}

	}

}
