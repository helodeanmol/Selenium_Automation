package com.facebook.genericPage;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	// Constructor

	public MasterPage() throws Exception {

		// Configuration properties file
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// Locators properties file
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Software\\chromedriver_win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE Browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void click(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).click();
	}

	public void enterData(String xpathKey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).sendKeys(or.getProperty(testData));
	}

	public void clearData(String xpathKey) {
		driver.findElement(By.xpath(or.getProperty(xpathKey))).clear();
	}

	public void moveToElement(String xpathKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathKey)))).build().perform();
	}

	public void clickListElement(String xpathKey, String testData) {
		List<WebElement> radios = driver.findElements(By.xpath(xpathKey));
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(or.getProperty(testData))) {
				radios.get(i).click();
			}
		}

	}

}
