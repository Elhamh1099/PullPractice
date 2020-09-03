package Basic.Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsAndPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("https://ksrtc.in/oprs-web/");

		// handle window pop ups
		// switch method and alert method
		// we can either accept alert to decline if possible
		// we can print alert message

		String pagetitle;
		WebElement searchBus = driver
				.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();

		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();

		Thread.sleep(5000);
		pagetitle = driver.getTitle();
		System.out.println("This is before switching windows  " + pagetitle);

		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();

		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator<String> it = WindowsHandles.iterator();
		String parentWindow = it.next();
		String childwindow = it.next();

		driver.switchTo().window(childwindow);
		pagetitle = driver.getTitle();
		System.out.println("This is After switching windows  " + pagetitle);

		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter User Name']"));
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		WebElement loginin = driver.findElement(By.xpath("//input[@value='Log in']"));

		userName.sendKeys("test@test.com");
		password.sendKeys("wrongPassword");
		loginin.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		String outputPath = "C:\\Users\\Ghezal\\eclipse-workspace\\SeleniumProjectFeb2020\\output\\";

		ScreenShotUtility.screenShot(driver, outputPath, "fail login");

		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
