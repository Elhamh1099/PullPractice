package Basic.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver" , "C:\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
	
	driver.get("https://canvas.instructure.com/login/canvas");
	
	
		Thread.sleep(5000);
	
	
	

	
	driver.quit();
	
	}

}
