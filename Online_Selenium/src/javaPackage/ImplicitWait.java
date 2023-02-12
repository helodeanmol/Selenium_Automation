package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How Stuff Works");

		// Handling Auto Suggestions
		List<WebElement> AllSuggestions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("Total Auto Suggestion :- " + AllSuggestions.size());

		String ExpectedRes = "how stuff works play";
		for (int i = 0; i < AllSuggestions.size(); i++) {
			if (AllSuggestions.get(i).getText().equalsIgnoreCase(ExpectedRes)) {
				AllSuggestions.get(i).click();	
				System.out.println(ExpectedRes + " Clicked ");
				break;
			}
		}

	}

}
