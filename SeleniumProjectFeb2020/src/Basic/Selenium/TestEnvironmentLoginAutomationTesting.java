package Basic.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestEnvironmentLoginAutomationTesting {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:tek-school.com/retail/");
		
		driver.manage().window().maximize();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    WebElement MyAccount = driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a")) ;
		WebElement Login = driver.findElement(By.xpath("//*[@id=\'top-links\']/ul/li[2]/ul/li[2]/a"));
		
		MyAccount.click();
		Login.click();
		
		WebElement Email = driver.findElement(By.id("input-email"));
     	WebElement Password = driver.findElement(By.id("input-password"));
		WebElement LoginButton = driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input"));
		
		Email.sendKeys("sdet@tekschool.com");
		Password.sendKeys("Welcome1");
		
		LoginButton.click();
		
		Thread.sleep(10000);

		driver.close();
	}

}
