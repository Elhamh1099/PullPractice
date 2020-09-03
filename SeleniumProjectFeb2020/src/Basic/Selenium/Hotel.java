package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://tek-school.com/hotel/");
		
		System.out.println(driver.getTitle());
		
		String outputPath = "C:\\Users\\Elham\\eclipse-workspace\\SeleniumProjectFeb2020\\output\\";
		
		ScreenShotUtility.screenShot(driver, outputPath, "HotelHomePage");
		
		WebElement signin = driver.findElement(By.xpath("//span[@class='hide_xs']"));
		signin.click();
	
		Thread.sleep(5000);
		
		ScreenShotUtility.screenShot(driver, outputPath, "Sign in Page");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("TekSchooooooool@IDKmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("00000000");
		WebElement SignInButton = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		SignInButton.click();
		
	    ScreenShotUtility.screenShot(driver, outputPath, "failing sign in");
		
		driver.close();
		driver.quit();
	}

}
