package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver = null;
	private By homePageUserName = By.xpath("//table//tr[@class='heading3']");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// Get the User Name from Home Page
	public String getHomePageDashBoardUserName() {
		return driver.findElement(homePageUserName).getText();
	}
}
