package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//driver.get
		//driver.navigate
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// deleteallcookies 
		
		driver.manage().deleteAllCookies();
		
		//driver.get -- get website address -- will go straight to the next flow of execution
		// driver.navigate.to --  
		
		driver.get("http://tek-school.com/");
		Thread.sleep(5000);
		driver.navigate().to("http://tek-school.com/retail/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.close();
		
		
	
		
		
		
		
		
		
	}

}
