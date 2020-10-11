package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckBox2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Handling RadioButton
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$txt_Fromdate']")).isEnabled());
		driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$txt_Fromdate']")).isEnabled());
		//Handling DropDown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[text()=' Bhopal (BHO)']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	
		
		
		
		//Handling calendar
		//select current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Handling Checkbox
		
		driver.findElement(By.xpath("//label[text()=' Senior Citizen']")).click();
		Boolean checked=driver.findElement(By.xpath("//label[text()=' Senior Citizen']")).isSelected();
		Assert.assertTrue(checked, "first option checked successfully");
		//driver.findElement(By.id("checkBoxOption1")).click();
	//	Boolean Unchecked=driver.findElement(By.id("checkBoxOption1")).isDisplayed();
	//	Assert.assertTrue(Unchecked);
		//count number of checkbox present in page
		List<WebElement> ls=driver.findElements(By.xpath("//div[@id='discount-checkbox']"));
		System.out.println("number of checkboxes available in page are:"+ls.size());
		
		//Select Static Dropdown
		driver.findElement(By.cssSelector("select[class='valid']")).click();
		//check size of dropdown
		
		
	Select s=new Select(driver.findElement(By.cssSelector("select[class='valid']")));
	s.selectByIndex(1);
	System.out.println(s.getOptions());
	
	
		
		
		

	}

}
