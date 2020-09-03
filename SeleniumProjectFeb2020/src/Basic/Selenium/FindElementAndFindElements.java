package Basic.Selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementAndFindElements {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://tek-school.com/retail/");
		
		// FindElement 
		  // finds one element in UI 
		  // return type = WebElement
		  // Exception : No SuchElemntFoundException
		
		// Concept of FindElements
		  // finds many elements with same locator address or xpath or tag
		  // return type is ArrayList
		  // if no element is found will return an empty list and does not throw exception
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']")) ;
		desktop.click();
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size()); // how many links are present in this page 
		
		// print all the text elements for the list
		// write a for loop 
		
		for (int i = 0; i < allLinks.size(); i++) {
			
		String textOfElements =	allLinks.get(i).getText();
	
		System.out.println(textOfElements);
		
		if (textOfElements.equals("Desktops"));
		allLinks.get(i).click();
		
		//to exit the loop
		
		break;
		
		
		}
		
	// lets take a screenshot of the page we open 
		String outputPath = "C:\\Users\\Ghezal\\eclipse-workspace\\SeleniumProjectFeb2020\\output\\";
		
		ScreenShotUtility.screenShot(driver, outputPath, "TestEnvPic");
		
	}

}
