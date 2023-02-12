package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launching browser instance
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");

		// Create List - All Companies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies :- " + allCompanies.size());

		// Create List - Total Current Price
		List<WebElement> totalCurrentPrice = driver
				.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total Current Price :- " + totalCurrentPrice.size());

		String expectedCompName = "RPG Life Sciences";
		
		for (int i = 0; i < allCompanies.size(); i++) {
			if (allCompanies.get(i).getText().equalsIgnoreCase(expectedCompName)) {
				System.out.println(allCompanies.get(i).getText() + " ==== " + totalCurrentPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
			}
		}

	}

}
