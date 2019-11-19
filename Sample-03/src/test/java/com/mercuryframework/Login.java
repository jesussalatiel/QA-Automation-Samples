package com.mercuryframework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	private Object data[][] = null;
	private WebDriver driver = null;
	private String URL = "http://automationpractice.com/index.php";
	private By signInLocator = By.linkText("Sign in");
	private By emailLocator = By.id("email");
	private By passwordLocator = By.id("passwd");
	private WebDriverWait wait = null;
	private By buttonLoginLocator = By.id("SubmitLogin");
	private By buttonSignOutLocator = By.cssSelector("a.logout");

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@Test(dataProvider = "authentificationData")
	public void login(String email, String password) {
		if (driver.findElement(signInLocator).isDisplayed()) {
			driver.findElement(signInLocator).click();

			wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.presenceOfElementLocated(emailLocator));

			driver.findElement(emailLocator).sendKeys(email);
			driver.findElement(passwordLocator).sendKeys(password);

			driver.findElement(buttonLoginLocator).click();

			assertEquals(driver.findElement(buttonSignOutLocator).getText(), "Sign out");

			driver.findElement(buttonSignOutLocator).click();
		} else {
			System.out.println("Sign In not present");
		}
	}

	@DataProvider(name = "authentificationData")
	// Create the login data
	public Object[][] getData() {
		data = new Object[2][2];
		data[0][0] = "qs123@gmail.com";
		data[0][1] = "qs123";
		data[1][0] = "testng_qs@gmail.com";
		data[1][1] = "qs123";
		return data;
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
