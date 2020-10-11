package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("indi");
		
		List<WebElement> dropdown=driver.findElements(By.xpath("//ul[@role='listbox']"));
		System.out.println(dropdown.size());*/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement autosuggestion=driver.findElement(By.xpath("//input[@id='autosuggest']"));
		
		autosuggestion.sendKeys("chi");
		List<WebElement> list= driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		System.out.println("numbers of elements available in list are:"+list.size());
		
		
		for(int i=0;i<list.size();i++) {
			String listText=list.get(i).getText();
			System.out.println("Text  for all the elements available for chi are:"+listText);
		}
		driver.findElement(By.xpath("//a[text()='China']")).click();
		
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Flight Booking')]")).click();
		//WebElement element=driver.findElement(By.xpath("//div[@id='discount-checkbox']")).getSize();
		//Auto Selection
		//driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("india");
		//driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("india");*/
	/*	driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Time in");
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//ul[@class='erkvQe']"));
		String textToSelect="headlines today";
		//System.out.println(autosuggestion.size());
		
		//Traverse each auto-suggest result and click on the result "time in india", if
        // this suggestion is displayed.
		for(WebElement allsuggestions:autosuggestion) {
			
			if(allsuggestions.equals(textToSelect));
			{
			System.out.println("selected value is:"+textToSelect);
			allsuggestions.click();
	//	for(int i=0;i<autosuggestion.size();i++) {
			
			//String allsuggestions=autosuggestion.get(i).getText();
			//System.out.println(allsuggestions);*/
		
		}
		
	}
	



