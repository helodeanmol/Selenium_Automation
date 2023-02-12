package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");

		// Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames :- " + allFrames.size());
		driver.switchTo().frame(0);

		// Will find draggable web element
		WebElement draggableElement = driver.findElement(By.id("draggable"));

		// Using Actions class, Drag the Web Element
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggableElement, 30, 40).build().perform();
		
		// Drag the Web Element and Click and Hold using coordinates
		Thread.sleep(2000);
		act.clickAndHold(draggableElement).dragAndDropBy(draggableElement, 30, 40).build().perform();

	}

}
