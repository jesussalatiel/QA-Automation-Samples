package com.sample.Sample01;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.ChromeDriverManager;

class Sample01ApplicationTests {

	/* Setup WebPage */
	private static WebDriver driver = null;
	private static String verificationErrorString = null;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static String baseURL = "https://www.facebook.com/";

	/* TestData */
	private static String userFacebook = "test@test.com";
	private static String passwordFacebook = "password";
	private static String expectedTitle = "Facebook - Log In or Sign Up";
	private static String dataSearch = "Xonacatlán Red Vecinal";

	@BeforeClass(alwaysRun = true)
	public void setup() throws Exception {
		/* SetProperty */
		ChromeDriverManager.chromedriver().setup();
		/* Setup Chrome */
		ChromeOptions optionsChrome = new ChromeOptions();
		/* Disable the message "" */
		optionsChrome.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		optionsChrome.setExperimentalOption("useAutomationExtension", false);
		optionsChrome.addArguments("start-maximized");
		/* Disable PopUp (Save Password and Receive Notifications) */
		optionsChrome.addArguments("disable-popup-blocking");
		optionsChrome.addArguments("--disable-notifications");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("--disable-notifications", false);
		optionsChrome.setExperimentalOption("prefs", prefs);
		/* Initializer driver setup */
		driver = new ChromeDriver(optionsChrome);
		/* Clean Cache */
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		/* Set URL */
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/* Software Messages */
		System.out.println("Test Application");
	}

	@Test(priority = 1)
	public void facebookTitle() throws Exception {
		String actualTitle = driver.getTitle();
		System.out.println("Title: " + actualTitle);
		assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 2)
	public void facebookLogin() throws Exception {
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(userFacebook);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(passwordFacebook);
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);

	}

	@Test(priority = 3)
	public void searchElement()throws Exception {
		String searchXPath = "//input[@data-testid='search_input']";
		String nameXPath = "//a[@href='/groups/XonacatlanRedVecinal/']";
		

		
		driver.findElement(By.xpath(searchXPath)).click();
		driver.findElement(By.xpath(searchXPath)).sendKeys(dataSearch);
		driver.findElement(By.xpath(searchXPath)).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(nameXPath)).click();
		driver.findElement(By.xpath(nameXPath)).sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-autocomplete=\'list\']")).click();
		//driver.findElement(By.xpath("//div[@data-testid=\"status-attachment-mentions-input\"]")).click();
		//driver.findElement(By.xpath("//div[@data-testid=\"status-attachment-mentions-input\"]")).sendKeys("Hola");
		
		//driver.findElement(By.xpath("//span[@data-text=\"true\"]")).click();
		//driver.findElement(By.xpath("//span[@data-text=\"true\"]")).sendKeys("HOla");
		
		Thread.sleep(2000);
	}


	/*@Test(priority = 14)
	public void scrollFacebook() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 5; i++) {
			js.executeScript("window.scrollBy(0,200)");
			Thread.sleep(1000);
		}
	}*/

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
