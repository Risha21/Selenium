package snippet;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		for (int i = 0; i < 3; i++) {

			WebElement addCucumber = driver.findElement(By.xpath(
					"//div[@class='product']/h4[text()='Cucumber - 1 Kg']/following::div['stepper-input']/a[2]"));
			addCucumber.click();
			
		}
		WebElement cucumber = driver.findElement(By.xpath(
				"//div[@class='product']/h4[text()='Cucumber - 1 Kg']/following::div[@class='product-action']/child::button[text()='ADD TO CART']"));
		cucumber.click();
		
		System.out.println("number of elements added to ccart are:"+cucumber);
		
		WebElement cart=driver.findElement(By.xpath("//img[@class=\" \"]"));
		cart.click();
		
		WebElement checkOut=driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']"));
		checkOut.click();
		
		WebElement placeOrder=driver.findElement(By.xpath("//button[text()='Place Order']"));
		placeOrder.click();
		
	//elect s=new Select(driver.findElement(By.xpath("//option[@value='China']")));
		
		
		System.out.println("Order is placed successfully");

	
	
	//select country
	WebElement select=driver.findElement(By.xpath("//select[@style='width: 200px;']"));
	select.click();
	List<WebElement> options=driver.findElements(By.xpath("//select[@style='width: 200px;']/option"));
	System.out.println(options.size());
	
	//iterating through all the countries and selecting country of our choice
	
	for(int i=0;i<options.size();i++) {
		String expectedCountry="India";
		if(options.get(i).getText().equals(expectedCountry));
		
		options.get(i).click();
		
		//System.out.println("Selected country is:"+options.get(i));
		//break;
	}
		//assert.assertEquals(actual, expectedCountry);
		
	
	

}
	
}
