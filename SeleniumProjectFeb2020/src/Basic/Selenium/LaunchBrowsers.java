package Basic.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowsers {

	public static void main(String[] args) throws InterruptedException{
		// 1. setup system property
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
		// 2. we need to use webdriver Interface to launch chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		// manage driver
		
		driver.manage().window().fullscreen(); // this will open the browser in full screen
		driver.manage().window().maximize();
		// 3. Launch Chrome Browser to navigate http://tek-school.com/retail/
		driver.get("http://tek-school.com/retail/");
		//4. get the title and also it can verify if we're on the right page
		
		String siteTitile = driver.getTitle();
		System.out.println(siteTitile);
		// add a hard break: it takes in millie seconds
		Thread.sleep(5000);
		// now lets close the browser
		// Interview Q: what is the difference between driver.close and driver.quit?
		// driver.close will  close only one window which was opened by webdriver.
		// driver.quit will close all windows which was opened by webdriver.
		driver.close();
		
		

	}

}
