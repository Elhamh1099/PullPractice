package MyAutomation;


import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectsAndMore {

	public static void main (String [] arg) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("http://tek-school.com/hotel/");
	
	Thread.sleep(3000);
	
	Select drpMenu = new Select(driver.findElement(By.xpath("//button[@class='nav_toggle']")));	
	
	}
}





