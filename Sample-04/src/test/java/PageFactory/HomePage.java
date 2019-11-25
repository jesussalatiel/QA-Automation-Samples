package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver = null;
	@FindBy(xpath = "//table//tr[@class='heading3']")
	private WebElement homePageUserName = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Get the User Name from Home Page
	public String getHomePageDashBoardUserName() {
		return homePageUserName.getText();
	}
}
