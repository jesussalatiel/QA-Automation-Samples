package com.sample.Sample01;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.ChromeDriverManager;

class Sample01ApplicationTests {

	/*Setup WebPage*/
	private static WebDriver driver = null;
	private static String verificationErrorString = null;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static String baseURL = "https://www.facebook.com/";

	/* TestData */
	private static String userFacebook = "testdata@hotmail.com";
	private static String passwordFacebook = "passwordtest";
	private static String expectedTitle = "Facebook - Log In or Sign Up";

	@BeforeClass(alwaysRun = true)
	public void setup() throws Exception {
		/*SetProperty*/
		ChromeDriverManager.chromedriver().setup();
		/*Setup Chrome*/
		ChromeOptions optionsChrome = new ChromeOptions();
		optionsChrome.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		optionsChrome.setExperimentalOption("useAutomationExtension", false);
		optionsChrome.addArguments("start-maximized");
		driver = new ChromeDriver(optionsChrome);
		/*Clean Cache*/
        driver.manage().deleteAllCookies();
        Thread.sleep(5000);
		driver.get(baseURL);		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void facebookTitle() throws Exception {
		String actualTitle = driver.getTitle();
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

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
