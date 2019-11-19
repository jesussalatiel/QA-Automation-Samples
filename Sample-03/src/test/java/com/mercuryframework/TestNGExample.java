package com.mercuryframework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestNGExample {

	private WebDriver driver = null;
	private WebElement searchBox = null;
	private By searchBoxSelector = By.id("search_query_top");
	private WebDriverWait wait = null;
	private By resultsLocator = By.cssSelector("span.heading-counter");

	@BeforeClass
	@Parameters({ "URL", "BrowserType" })
	public void beforeClass(String URL, String BrowserType) {
		if(BrowserType.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(BrowserType.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(URL);

		System.out.println("Opening: "+BrowserType);
	}

	@Test
	public void searchBlouses() {
		searchBox = driver.findElement(searchBoxSelector);
		searchBox.clear();
		searchBox.sendKeys("blouse");
		searchBox.submit();
		wait = new WebDriverWait(driver, 7);

		// Wait the presence of element on the page
		wait.until(ExpectedConditions.presenceOfElementLocated(resultsLocator));

		// Print the results
		System.out.println("This is the number results: " + driver.findElement(resultsLocator).getText());

		// Verify if the item is displayed
		assertTrue(driver.findElement(resultsLocator).isDisplayed(), "The result number is not present");
	}

	@AfterClass
	public void afterClass() {
		if (driver != null) {
			driver.close();
		}
	}

}
