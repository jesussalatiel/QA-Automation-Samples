package com.sample.Sample01;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class Sample01Application {

	private static WebDriver driver = null;
	private static WebDriver driver2 = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriverManager.chromedriver().setup();
		FirefoxDriverManager.firefoxdriver().setup();

		driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		Thread.sleep(2000);
		driver.quit();
		
		
		driver2 = new FirefoxDriver();
		driver2.get("http://www.google.com/");
		Thread.sleep(2000);
		driver2.quit();
		

	}

}
