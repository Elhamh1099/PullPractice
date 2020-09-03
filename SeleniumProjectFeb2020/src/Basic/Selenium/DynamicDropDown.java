package Basic.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// static dropdown will have select tag and we can select class to handle static
		// dropdown
		// how do we handle the dynamic dropdown?

		// 1. Get locator of element (Xpath,ID,Name,etc)
		// 2. Use Find Element
		// 3. Click on that element
		// 4. Clear the value of the element
		// 5. type value using sendKeys
		// 6. once dropwdown is open
		// 7. store all values of dropdown in a list
		// 8. write a loop or itrator
		// 9. inside the loop you write an if condition
		// 10. you write logical operators to click o value
		// 11. for click you can use JSExecutor or .click() method

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");

		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));

		from.click();

		from.clear();

		Thread.sleep(3000);

		from.sendKeys("wash");

		// list of dynamic dropdown opens

		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));

		for (WebElement city : departure) {
			try {
				if (city.getText().trim().contains("WAS"))
					JSUtility.clickElementusingJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
		}

		Thread.sleep(3000);

		WebElement numPass = driver.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numPass);
		
		select.selectByVisibleText("9");
		
        Thread.sleep(3000);
		
		WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
		WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		
		String depDate = "05/20/2020";
		String retDate = "07/31/2020";
		
		JSUtility.selectCalendarDateWithJS(driver, depDate, departureDate);
		JSUtility.selectCalendarDateWithJS(driver, retDate, arrivalDate);
		
		Thread.sleep(3000);
		
		searchButton.click();
		
		

	}

}
