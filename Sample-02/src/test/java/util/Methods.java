package util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Methods {
	private static Logger log = LogManager.getLogger(Methods.class.getName());
	private static WebDriver driver;
	static String expectedMsg;
	static String actualMsg;
	static int flag;
	private static List<String> fligths;
	private static List<String> costs;
	
	public Methods(WebDriver driv) {
		driver	= driv; 
		fligths	= new ArrayList<String>();
		costs	= new ArrayList<String>();
	} // validateMessage
	
	public static void validateMessage(String locator, String value, String param) {
		expectedMsg = param;
		actualMsg 	= null;
		if (locator.equals("XPath"))
			actualMsg = driver.findElement(By.xpath(value)).getText();
		Assert.assertEquals(expectedMsg, actualMsg);		
	} // validateMessage

	public static void Fill(String los,String locator, String value, String param) {
		if (locator.contentEquals("XPath")) {
			driver.findElement(By.xpath(value)).clear();
			driver.findElement(By.xpath(value)).sendKeys(param);
		} // if
		log.info(los +": " + param);
	} // Fill

	public static String FillDropdown(String los,String locator, String value, String param) {
		Select selElem = null;
		if (locator.contentEquals("XPath")) {
			selElem = new Select(driver.findElement(By.xpath(value)));
			selElem.selectByVisibleText(param.trim());
			log.info(los +": "+ selElem.getFirstSelectedOption().getText());
		} // if
		return selElem.getFirstSelectedOption().getText();
	} // FillDropdown

	public static void Click(String los,String locator, String value) {
		if (locator.contentEquals("XPath")) 
			driver.findElement(By.xpath(value)).click();
		log.info(los);
	} // FillDropdown

	public static void PrintConsole(String locator, String value) {
		WebElement table 		 = null;
		List<WebElement> allRows = null; 
		List<WebElement> cells   = null;
		StringBuilder sb		 = null;
		if (locator.contentEquals("XPath")) { 
			table	= driver.findElement(By.xpath(value));
			allRows = table.findElements(By.tagName("tr"));
			for(int i=1; i<allRows.size(); i++) {
				sb	 = new StringBuilder();
				cells= allRows.get(i).findElements(By.tagName("td")); 
				for (WebElement cell : cells) { 
					sb.append(cell.getText().equals("DEPART")? "\t\t\t\t":"\t\t");
					sb.append(cell.getText());
				} // for
				System.out.println(sb.toString());
			} // for
		} // if
	} // PrintConsole
	
	public static void selectFligth(String locator, String value, Boolean departure) {
		WebElement table 		 = null;
		List<WebElement> allRows = null;
		List<WebElement> cells   = null;
		WebElement cell			 = null;
		if (locator.contentEquals("XPath")) { 
			table	= driver.findElement(By.xpath(value));
			allRows = table.findElements(By.tagName("tr"));
			if(!allRows.isEmpty() && allRows.size()>3) {
				cells= allRows.get(departure? 4: allRows.size()>4? 8:6).findElements(By.tagName("td"));
			} // if
			else
				cells= allRows.get(4).findElements(By.tagName("td"));
			cell= cells.get(0);
			cell.click();
			fligths.add(cells.get(1).getText());
			log.info(departure? "Select cheapper fligth": "Select 2nd or 3th most expensive fligth");
		} // if
	} // selectFligth

	public static void validateSumary(String locator, String value, List<String> fecha, List<String> destino,String passengers) {
		WebElement table 		 = null;
		List<WebElement> allRows = null;
		List<WebElement> cells   = null;
		if (locator.contentEquals("XPath")) {
			log.info("\n ---Sumary review start---");
			table	= driver.findElement(By.xpath(value));
			allRows = table.findElements(By.tagName("tr"));
			cells= allRows.get(0).findElements(By.tagName("td"));
			informationReview(cells.get(0).getText(), destino.get(0).concat(" to ").concat(destino.get(1)), "Depart fligth");
			informationReview(cells.get(1).getText(), fecha.get(0), "Depart date");
			cells= allRows.get(3).findElements(By.tagName("td"));
			informationReview(cells.get(0).getText(), destino.get(1).concat(" to ").concat(destino.get(0)), "Return fligth");
			informationReview(cells.get(1).getText(), fecha.get(1), "Return date");
			cells= allRows.get(2).findElements(By.tagName("td"));
			informationReview(cells.get(0).getText(), fligths.get(0), "Depart fligth information");
			cells= allRows.get(5).findElements(By.tagName("td"));
			informationReview(cells.get(0).getText(), fligths.get(1), "Return fligth information");
			cells= allRows.get(6).findElements(By.tagName("td"));
			informationReview(cells.get(1).getText(), passengers, "Passengers");
			costs.add(allRows.get(7).findElements(By.tagName("td")).get(1).getText());
			costs.add(allRows.get(8).findElements(By.tagName("td")).get(1).getText());
			log.info("\n ---Sumary review complete---");
		} // if
	} // validateSumary
	
	private static void informationReview(String value1, String value2,String section) {
		log.info(section.concat(value1.equals(value2)?" correct": " incorrect"));
	} // informationReview
	
	public static void bookRevision(String locator, String value, List<String> fecha, List<String> destino,String passengers, List<String> information) {
		WebElement table 		 = null;
		List<WebElement> allRows = null;
		if (locator.contentEquals("XPath")) { 
			log.info("\n ---Book sumary check start---");
			table	= driver.findElement(By.xpath(value));
			allRows = table.findElements(By.tagName("tr"));
			getInformationReview(allRows, 3, destino.get(0).concat(" to ").concat(destino.get(1)), "Depart fligth");
			getInformationReview(allRows, 3, fecha.get(0), "Depart date");
			getInformationReview(allRows, 3, fligths.get(0), "Depart fligth information");
			getInformationReview(allRows, 5, destino.get(1).concat(" to ").concat(destino.get(0)), "Return fligth");
			getInformationReview(allRows, 5, fecha.get(1), "Return date");
			getInformationReview(allRows, 5, fligths.get(1), "Return fligth information");
			getInformationReview(allRows, 7, passengers, "Passengers");
			getInformationReview(allRows, 9, information.get(0), "First name");
			getInformationReview(allRows, 9, information.get(1), "Middle nae");
			getInformationReview(allRows, 9, information.get(2), "Last name");
			getInformationReview(allRows, 9, information.get(3), "Billing adress");
			getInformationReview(allRows, 9, information.get(4), "Billing city");
			getInformationReview(allRows, 9, information.get(5), "Billing state");
			getInformationReview(allRows, 9, information.get(6), "Billing zip code");
			getInformationReview(allRows, 11, information.get(7), "Delivery adress");
			getInformationReview(allRows, 11, information.get(8), "Delivery city");
			getInformationReview(allRows, 11, information.get(9), "Delivery state");
			getInformationReview(allRows, 11, information.get(10), "Delivery zip code");
		} // if
		log.info("\n ---Book sumary check complete---");
	} // bookRevision
	
	private static void getInformationReview(List<WebElement> allRows, int index, String value, String message) {
		List<WebElement> cells   = null;
		List<WebElement> labels  = null;
		cells = allRows.get(index).findElements(By.tagName("td"));
		labels= cells.get(0).findElements(By.tagName("font"));
		checkInformation(labels.get(0).getText(), value, message);
	} // getInformationReview
	
	private static void checkInformation(String value1, String value2,String section) {
		log.info(section.concat(value1.contains(value2)?" correct": " incorrect"));
	} // checkInformation
	
}