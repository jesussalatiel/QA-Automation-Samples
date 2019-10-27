package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverChrome {

	public void setupChrome() throws InterruptedException{
		// setting the driver executable
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		// Initiating your chromedriver
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// open browser with desried URL
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		// closing the browser
		driver.close();
	}
}
