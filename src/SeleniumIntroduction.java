import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome - ChromeDriver -> Methods
		// Firefox - FirefoxDriver -> Methods

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");    // navigate to the URL of the web page
		System.out.println(driver.getTitle());           // print the page title
		System.out.println(driver.getCurrentUrl());      // print the current URL to confirm we are on the right page
		driver.quit();                                   // quit() closes all windows and ends the session; close() only closes the current window

	}
}