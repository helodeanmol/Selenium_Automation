package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1 {

	public static void main(String[] args) throws InterruptedException {
		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");

		// Introducing JavascriptExecutor interface and cast the interfaces
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Locate web element using JavascriptExecutor
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		jse.executeScript("document.getElementById('pass').value='1234'");

		// Scroll down using JavascriptExecutor
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, 400)");

		// Scroll up using JavascriptExecutor
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0, -400)");
	}

}
