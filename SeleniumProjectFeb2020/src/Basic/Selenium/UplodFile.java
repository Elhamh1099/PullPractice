package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodFile {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
  
		// in order to upload a file we use sendkeys method 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String baseURL = "http://xndev.com/display-image/";
		driver.get(baseURL);
		
		// we need to get the Element
		
		WebElement uploadFile = driver.findElement(By.xpath("//*[@id=\"post-2554\"]/div/input"));
		
		String filePath = "C:\\Users\\Ghezal\\Desktop.txt";
		
		uploadFile.sendKeys(filePath);
		
		
	}

}
