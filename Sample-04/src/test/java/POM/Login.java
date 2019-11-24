package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	private WebDriver driver = null;
	private By userName = By.name("uid");
	private By password = By.name("password");
	private By titleText = By.className("barone");
	private By login = By.name("btnLogin");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	// Set user name in textbox
	public void setUserName(String strUserName) {
		driver.findElement(userName).sendKeys(strUserName);
	}

	// Set password in textbox
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}

	// Click on login button
	public void clickLogin() {
		driver.findElement(login).click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return driver.findElement(titleText).getText();
	}

	public void loginToGuru99(String strUserName, String strPassword) {
		// Fill user name
		this.setUserName(strUserName);
		// Fill password
		this.setPassword(strPassword);
		// Click Login button
		this.clickLogin();
	}
}
