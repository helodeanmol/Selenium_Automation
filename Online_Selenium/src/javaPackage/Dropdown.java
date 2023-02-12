package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		// Setting the property of chrome driver and passing chromedrive path
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(3000);

		// 1st way - Not recommended but industry mostly use
		List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("Total dropdown values :- " + birthMonth.size());
		System.out.println(birthMonth.get(8).isEnabled()); // True
		birthMonth.get(8).click(); // September

		// 2nd way - recommended
		WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(bm);
		month.selectByVisibleText("Apr"); // Select by visible text - Apr
		month.selectByValue("12"); // Select by value - Dec
		month.selectByIndex(0); // Select by value - Jan
		System.out.println(month.getFirstSelectedOption().getText()); // Get current selected value

		// 3rd way - will store all dropdown values in a list
		List<WebElement> dropdown = month.getOptions();
		System.out.println("Total dropdown values :- " + dropdown.size());
		for (int i = 0; i < dropdown.size(); i++) {
			String dropdownValues = dropdown.get(i).getText();
			if (dropdownValues.equalsIgnoreCase("Aug")) {
				dropdown.get(i).click();
			}
		}

		// 4th way - check if the dropdown support multi selections
		System.out.println(month.isMultiple()); // false
		month.selectByVisibleText("Dec"); // Select by visible text - Dec
		month.selectByValue("10"); // Select by value - Oct
		month.selectByIndex(10); // Select by value - Nov
		// month.deselectAll(); // deselect all selected values (use when multiple
		// values are slected)

		// 5th way
		bm.sendKeys("Feb");

		// 6th way
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Mar");

	}

}
