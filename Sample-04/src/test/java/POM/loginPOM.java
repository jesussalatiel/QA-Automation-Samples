package POM;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginPOM {

	private WebDriver driver = null;
	private String URL = "http://demo.guru99.com/V4/";
	private Login objLogin = null;
	private HomePage objHomePage = null;

	@BeforeClass
	public void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@Test(priority = 0)
	public void testHomePageAppearCorrect() throws InterruptedException {
		// Create Login Page Object
		objLogin = new Login(driver);
		// verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		// login to application
		objLogin.loginToGuru99("mgr123", "mgr!23");
		// Go to the next Page
		objHomePage = new HomePage(driver);
		// Verify Home Page
		Assert.assertTrue(objHomePage.getHomePageDashBoardUserName().toLowerCase().contains("manger id : mgr123"));
		Thread.sleep(2000);
	}

	@AfterClass
	public void AfterClass() {
		if (driver != null) {
			driver.close();
		}
	}
}
