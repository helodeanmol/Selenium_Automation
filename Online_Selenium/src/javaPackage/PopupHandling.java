package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);

		// Print how many windows are opened
		Set<String> PopupID = driver.getWindowHandles();
		System.out.println(PopupID);
		System.out.println(PopupID.size());

		Iterator<String> abc = PopupID.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();

		// Print the title of Popup Window2 (Child Window)
		driver.switchTo().window(Window2);
		System.out.println(Window2); // alphanumeric ID of popup window 1
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);

		// Print the title of Popup Window1 (Parent Window)
		driver.switchTo().window(Window1);
		System.out.println(Window1); // alphanumeric ID of popup window 1
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
