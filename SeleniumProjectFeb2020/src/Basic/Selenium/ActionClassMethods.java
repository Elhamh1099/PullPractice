package Basic.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethods {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String baseURL = "http://tek-school.com/retail/";
		driver.get(baseURL);
		
		Actions action = new Actions(driver);
		
		WebElement component = driver.findElement(By.xpath("//a[text()='Components']"));
		
		action.moveToElement(component).build().perform();
		Thread.sleep(5000);
		
		action.doubleClick(component).build().perform();
		Thread.sleep(5000);
		
		action.contextClick().build().perform();
		Thread.sleep(5000);
		
		WebElement termsCondition = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		
		action.moveToElement(termsCondition).build().perform();
		action.doubleClick(termsCondition).build().perform();
		Thread.sleep(5000);
		
        driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(5000);
		action.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
