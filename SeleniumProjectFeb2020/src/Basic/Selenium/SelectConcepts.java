package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectConcepts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://tek-school.com/retail/");

		WebElement ltp = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));

		// action class - drag and drop, scroll up and down

		Actions action = new Actions(driver);

		action.moveToElement(ltp).build().perform();

		WebElement showAllLtp = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));

		// .click
		// .action class method

		action.click(showAllLtp).build().perform();

		Thread.sleep(5000);

		WebElement sortBy = driver.findElement(By.xpath("//select[@id='input-sort']"));

		Select select;

		select = new Select(sortBy);
		select.selectByVisibleText("Name (A - Z)");

		WebElement show = driver.findElement(By.xpath("//select[@id='input-limit']"));

		select = new Select(show);
		select.selectByVisibleText("100");
		ScreenShotUtility.screenShot(driver, "C:\\Users\\Ghezal\\eclipse-workspace\\SeleniumProjectFeb2020\\output\\",
				"dropdown");
		driver.close();

	}

}
