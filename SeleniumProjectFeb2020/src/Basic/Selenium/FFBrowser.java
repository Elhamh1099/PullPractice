package Basic.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");

		//executable path
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://tek-school.com/retail/");
		
	 String Title = driver.getTitle();
	 
	 System.out.println(" Website title is " + Title);
	 
	 Thread.sleep(5000);
	 driver.close();

	
	}
	
	

}
