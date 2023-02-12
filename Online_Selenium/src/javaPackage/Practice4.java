package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class Practice4 {

	@Test
	public void locateElements() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");		
		
		//find element by id
		driver.findElement(By.id("email"));
		System.out.println("found email field");
		
		//find element by className
		Thread.sleep(2000);
		driver.findElement(By.className(""));
		System.out.println("found email field");
		
		//find element by xpath
		
		//find element by cssSelector
		
		//find element by linkText
		
		//find element by partial linkText
		
		//find element by tagName
	}

}
