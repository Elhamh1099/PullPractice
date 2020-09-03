 package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//WebElement Search = driver.findElement(By.xpath("//*[@name='search']"));
		WebElement Desktop = driver.findElement(By.xpath("//a[text() ='Desktops']"));
		//Search.click();
		WebElement Mac = driver.findElement(By.xpath("//a[text() ='Mac (1)']"));
		//Search.sendKeys("Computer");
		
        Desktop.click();
		Mac.click();
		
		String outputPath = "C:\\Users\\Ghezal\\eclipse-workspace\\SeleniumProjectFeb2020\\PracticeScreenshots\\";
		ScreenShotUtility.screenShot(driver, outputPath, "Mac");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
		
		
	}

}
