package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);

		// Verify Alert Text
		System.out.println(driver.switchTo().alert().getText());
		String expectedResult = "Do you confirm action?";
		Assert.assertEquals(driver.switchTo().alert().getText(), expectedResult);
		System.out.println("Alert Text Verified");

		// Accept the Alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Accept Alert Worked");

		// Dismiss the Alert
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.close();
	}

}
