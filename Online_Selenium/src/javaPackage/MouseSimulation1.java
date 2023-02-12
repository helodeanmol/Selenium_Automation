package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();

		// Create Web Element Reference
		WebElement Electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));

		// Mouse Simulation using Actions class
		Actions act = new Actions(driver);

		// Mouse Hover to Electronics Web Element
		Thread.sleep(2000);
		act.moveToElement(Electronics).build().perform();

		// Right Click on Web Element
		Thread.sleep(2000);
		act.contextClick(Electronics).build().perform();

		// Release control from WebElement
		Thread.sleep(2000);
		act.release(Electronics).build().perform();

		// Perform key events
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();

		// Press enter key on Home Web Element
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		Thread.sleep(2000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home Menu Clicked");

	}

}
