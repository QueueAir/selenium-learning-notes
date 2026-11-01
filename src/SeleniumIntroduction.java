import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) {

		// Invoking Browser
		// Chrome - ChromeDriver -> Methods
		// Firefox - FirefoxDriver -> Methods

		//Chrome launch
		//webdriver.chrome.driver -> value of path
		WebDriver driver = new ChromeDriver();
		
		//Firefox launch
		//Geckodriver
		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge launch
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");    // navigate to the URL of the web page
		System.out.println(driver.getTitle() + " [This is from Chrome]");           // print the page title
		System.out.println(driver.getCurrentUrl());      // print the current URL to confirm we are on the right page
		driver.quit();                                   // quit() closes all windows and ends the session; close() only closes the current window
		
		driver1.get("https://rahulshettyacademy.com");    // navigate to the URL of the web page
		System.out.println(driver1.getTitle() + " [This is from Firefox]");           // print the page title
		System.out.println(driver1.getCurrentUrl());      // print the current URL to confirm we are on the right page
		driver1.quit();  
		
		driver2.get("https://rahulshettyacademy.com");    // navigate to the URL of the web page
		System.out.println(driver2.getTitle() + " [This is from Edge]");           // print the page title
		System.out.println(driver2.getCurrentUrl());      // print the current URL to confirm we are on the right page
		driver2.quit();  

	}
}