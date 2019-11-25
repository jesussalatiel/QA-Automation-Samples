package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	private WebDriver driver = null;

	@FindBy(name = "uid")
	private WebElement userName = null;
	@FindBy(name = "password")
	private WebElement password = null;
	@FindBy(name = "btnLogin")
	private WebElement login = null;
	@FindBy(className = "barone")
	private WebElement titleName = null;

	public Login(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Set User Name in textbox
	public void setUserName(String strUserName) {
		userName.sendKeys(strUserName);
	}

	// Set password in password textbox
	public void setPassword(String strPassword) {
		password.sendKeys(strPassword);
	}

	// Click on the button
	public void clickLogin() {
		login.click();
	}

	// Get the title of Login Page
	public String getLoginTitle() {
		return titleName.getText();
	}

	public void loginToGuru(String username, String password) {
		// Fill user name
		this.setUserName(username);
		// Fill password
		this.setPassword(password);
		// Click Login Button
		this.clickLogin();
	}
}
