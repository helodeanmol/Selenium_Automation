package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {

		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();

		// 1st way - It is not good approach to handle multiple web elements
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click(); // Female radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click(); // Male radio button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click(); // Custom radio button

		// 2nd way - by creating list of all radio buttons
		List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total Radio Buttons :- " + radios.size());

		System.out.println(radios.get(1).isEnabled()); // Male button is enabled or not
		System.out.println(radios.get(0).isDisplayed()); // Female button is selected or not
		System.out.println(radios.get(2).isSelected()); // Custom button is selected or not
		Thread.sleep(3000);
		radios.get(1).click();
		Thread.sleep(3000);
		System.out.println(radios.get(2).isSelected()); // Custom button is selected or not

		// 3rd way
		List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		String ExpectedResult = "Female";
		for (int i = 0; i < radios1.size(); i++) {
			if (radios1.get(i).getText().equalsIgnoreCase(ExpectedResult)) {
				radios1.get(i).click();
				System.out.println(ExpectedResult + " Clicked");
				break;

			}

		}

	}

}
