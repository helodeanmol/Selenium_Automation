package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURL {

	public static void main(String[] args) throws InterruptedException {

		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");

		// Launching Chrome browser instance
		WebDriver driver = new ChromeDriver();

		// manage() method
		driver.manage().window().maximize();

		// Open application URL using get() and navigate() method
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");

		// Refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();

		// Navigate to forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Navigate to back
		Thread.sleep(3000);
		driver.navigate().back();

		// Fetch current URL
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// Get Title of the web page
		Thread.sleep(3000);
		System.out.println(driver.getTitle());

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("anmolhelode@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();

		// Close the current browser instance
		Thread.sleep(3000);
		driver.close();

		// Close all browser instance
		Thread.sleep(3000);
		driver.quit();
	}

}
