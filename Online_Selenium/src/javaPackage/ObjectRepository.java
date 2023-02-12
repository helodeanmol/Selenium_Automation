package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectRepository {

	public static void main(String[] args) throws Exception {

		// Specify the location of properties file
		File src = new File("C:\\Users\\anmol\\eclipse-workspace\\Online_Selenium\\Repository\\Object_Repo.properties");

		// Create FileInputStream class Object to load the file
		FileInputStream fis = new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);

		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL")); // Open URL
		
		// getProperty method accept key and it returns value for the same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(2000);
		driver.quit();
	}

}
