package Basic.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		// By.id - Fastest Locator
		// By.name
		// By.className - 
		// By.Cssseletor - Faster
		// By.Xpath - slow but you can travel back and forth to child to parent and siblings
		// By.linkText
		
		// syntax for Locators 
		//WebElement elementname = driver.findElement(By.id("value of ID"); 
		//WebElement elementname = driver.findElement(By.name("value of name");
		//WebElement elementname = driver.findElement(By.classname("value of classname");
		//WebElement elementname = driver.findElement(By.cssselector("value of cssselector");
		//WebElement elementname = driver.findElement(By.Xpath("value of Xpath");
		//WebElement elementname = driver.findElement(By.id("value of ID");
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//By.id
		
		WebElement username = driver.findElement(By.id("email"));
		
		
		
		//By.Xpath
		//sytax for Xpath //[@attribute='value']
		//1. Absolute Xpath 
		// starts with single slash (/)
		// starts from head of the HTML mode and goes all the way to element to laction 
		// Not recommended for Automation at all
		
		//2. Relative Xpath
		// starts with double slass (//)
		// starts mainly from element tag 
		// 95% used in Automation - UI Automation 
		
		
		WebElement username1 = driver.findElement(By.xpath("//input[@id='email']"));
		
		
		// by css selector 
		// syntax  tag[attribute=value] for id, name, class
		
		WebElement username2 = driver.findElement(By.cssSelector("input[name='email']"));
		
	
		
		
		
		
		
		
		

	}

}
