package MyAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PNL {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.youtube.com/");
		
		WebElement search = driver.findElement(By.xpath("//*[@name=\"search_query\"]"));
		search.click();
		search.sendKeys("pnl blanka");
		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
		searchButton.click();
		
		
		
		
	}

}
