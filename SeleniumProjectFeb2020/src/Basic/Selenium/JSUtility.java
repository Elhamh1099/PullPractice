package Basic.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSUtility {

	// JS executers

	// scroll page down

	public static void scrollPageDownWithJS(WebDriver driver) {
		JavascriptExecutor JS = ((JavascriptExecutor) driver);

		JS.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

	// click n element using JSE

	public static void clickElementusingJS(WebElement element, WebDriver driver) {
		JavascriptExecutor JS = ((JavascriptExecutor) driver);
		JS.executeScript("arguments[0].click", element);

	}

	// send keys using JSE
	// we can use SendKeys with JSExecutor if WebElement has either one of ID, Name,

	public static void sendKeysWithJS(WebDriver driver, String element, String value) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");
	}
	// how to select calendar date using JS Executor

	public static void selectCalendarDateWithJS(WebDriver driver, String date, WebElement element) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);
	}

	
		
	}


