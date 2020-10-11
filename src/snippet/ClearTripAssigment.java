package snippet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripAssigment {

	static WebDriver driver;

	public static void radioButton() {
		// number of radio buttons available
		List<WebElement> sizeOfRadioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("following number of radio buttons available:" + sizeOfRadioButton.size());
		WebElement element = driver.findElement(By.xpath("//label[@for='OneWay']"));
		element.click();
	}

	public static void fromAutoSuggestion() {

		// Handling AutoSuggestions From and To WebElement from =
		WebElement from = driver.findElement(By.cssSelector("#FromTag"));
		from.sendKeys("ban");
		// capture list of elements available when user enters ban List<WebElement>
		List<WebElement> allFromList = driver.findElements(By.xpath("//li[@class='list' and @role='presentation']"));
		System.out.println("number of autosuggestion appeared for from options are:" + allFromList.size());
		String expectedValue = "Bangalore, IN - Kempegowda International Airport (BLR)";
		for (int i = 0; i < allFromList.size(); i++) {

			if (allFromList.get(i).getText().equals(expectedValue)) {
				allFromList.get(i).click();
			}

		}
	}

	public static void toAutoSuggestion() {

		// Handling AutoSuggestions From and To WebElement to =
		WebElement to = driver.findElement(By.xpath("//input[@id='ToTag']"));
		to.sendKeys("pun"); //
		// capture list of elements available when user enters pun List<WebElement>
		List<WebElement> allToList = driver.findElements(By.xpath("//ul[@id='ui-id-2']/child::li"));
		System.out.println("number of elements suggested for pun keyword are:" + allToList.size());

		for (int i = 0; i < allToList.size(); i++) {
			String expectedValue = "Punta Arenas, CL - Presidente Ibanez (PUQ)";

			if (allToList.get(i).equals(expectedValue)) {
				allToList.get(i).click();

			}

		}

	}

	public static void handleCalendar() {
		WebElement currentDate = driver.findElement(By.xpath("//input[@title='Depart date']"));
		// input[@title='Depart date']
		currentDate.click();
		System.out.println("calendar opened ");
		WebElement selectCurrentDate = driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]"));
		selectCurrentDate.click();
	}

	public static void selectAdults() {
		Select s = new Select(driver.findElement(By.name("adults")));
		s.selectByIndex(3);

	}

	public static void selectChildren() {
		Select s = new Select(driver.findElement(By.name("childs")));
		s.selectByIndex(3);

	}

	public static void clickMoreOptions() {
		driver.findElement(By.xpath("//a[@title='More search options']")).click();
	}

	public static void airlineName() {
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("indigo");
	}

	public static void searchFlights() {
		driver.findElement(By.id("SearchBtn")).click();

	}

	public static void errorMessage() {

		WebElement errorMessage = driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		System.out.println(errorMessage.getText());

	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\software\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		radioButton();
		fromAutoSuggestion();
		toAutoSuggestion();
		handleCalendar();
		selectAdults();
		selectChildren();
		clickMoreOptions();
		airlineName();
		searchFlights();
		errorMessage();
	}

}
