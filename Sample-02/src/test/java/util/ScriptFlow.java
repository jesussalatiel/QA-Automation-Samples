package util;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ScriptFlow {
	private static Logger log = LogManager.getLogger(ScriptFlow.class.getName());
	static WebDriver driver;
	static Methods method;
	private static String fechaTmp;
	private static List<String> fecha;
	private static List<String> destino;
	private static List<String> information;
	private static String passengers;
	
	public static void openBrowser(String param) {
		log.debug("Setting "+param+" driver property");
		switch (param) {
		case "Chrome":			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver= new ChromeDriver();
		break;
		case "Mozilla":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver		= new FirefoxDriver();
		break;
		case "IE":
			System.setProperty("webdriver.IE.driver", "IEDriverServer.exe");
			driver		= new InternetExplorerDriver();
		break;
		} // switch
		method		= new Methods(driver);
		fecha		= new ArrayList<String>();
		destino		= new ArrayList<String>();
		information	= new ArrayList<String>();
	} // openBrowser

	public static void maximizeBrowser() {
		log.info("Window Maximized");
		driver.manage().window().maximize();
	} // maximizeBrowser

	public static void implementWait() {
		log.info("Implicit Wait");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} // implementWait

	public static void navigateTo(String baseUrl) {
		log.info("Navigate to " + baseUrl);
		driver.get(baseUrl);
	} // navigateTo
	
	public static void setUserName(String locator, String value, String param) {
		method.Fill("UserName",locator,value,param);
	} // setUserName
	
	public static void setPassword(String locator, String value, String param) {
		method.Fill("Password",locator,value,param);
	} // setPassword
	
	public static void login(String locator, String value) {
		method.Click("Sign in", locator, value);
	}
	public static void validateFilgthPage(String locator, String value, String param) {
		method.validateMessage(locator, value,param); 
	} // login
	
	public static void selectTrip(String locator, String value) {
		method.Click("Select trip type", locator, value);
	} // selectTrip
	
	public static void selectPassengers(String locator, String value, String param) {
		passengers= method.FillDropdown("Passengers",locator,value,param).trim();
	} // selectPassengers
	
	public static void selectDepartureCity(String locator, String value, String param) {
		destino.add(method.FillDropdown("Departure city",locator,value,param));
	} // selectDepartureCity
	
	public static void selectDepartureMonth(String locator, String value, String param) {
		fechaTmp= obtenerNumeroMes(method.FillDropdown("Departure month",locator,value,param)).concat("/");
	} // SelectDepartureMonth
	
	public static void selectDepartureDay(String locator, String value, String param) {
		fechaTmp= fechaTmp.concat(method.FillDropdown("Departure day",locator,value,param)).concat("/").concat(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
		fecha.add(fechaTmp);
		log.info("Depeature date:" + fechaTmp);
	} // selectDepartureDay
	
	public static void selectArrivalCity(String locator, String value, String param) {
		destino.add(method.FillDropdown("Arrival city",locator,value,param));
	} // selectArrivalCity
	
	public static void selectArrivalMonth(String locator, String value, String param) {
		fechaTmp= obtenerNumeroMes(method.FillDropdown("Arrival month",locator,value,param)).concat("/");
	} // selectArrivalMonth
	
	public static void selectArrivalDay(String locator, String value, String param) {
		fechaTmp= fechaTmp.concat(method.FillDropdown("Arrival day",locator,value,param)).concat("/").concat(String.valueOf(Calendar.getInstance().get(Calendar.YEAR)));
		fecha.add(fechaTmp);
		log.info("Arrival date:" + fechaTmp);
	} // selectArrivalDay
	
	public static void SelectTypeTrip(String locator, String value) {
		method.Click("Class trip", locator, value);
	} // SelectTypeTrip
	
	public static void selectAirline(String locator, String value, String param) {
		method.FillDropdown("Airline",locator,value,param);
	} // selectAirline
	
	public static void clickContinue(String locator, String value) {
		method.Click("Continue", locator, value);
	} // clickContinue
	
	public static void validateSelectFilgthPage(String locator, String value, String param) {
		method.validateMessage(locator, value,param); 
	} // validateSelectFilgthPage
	
	public static void validateTrip(String locator, String value) {
		method.validateMessage(locator, value,destino.get(0).concat(" to ").concat(destino.get(1))); 
	} // validateTrip
	
	public static void validateDate(String locator, String value) {
		method.validateMessage(locator, value,fecha.get(0)); 
	} // validateDate
	
	public static void printConsole(String locator, String value) {
		method.PrintConsole(locator, value); 
	} // printConsole
	
	public static void selectDepartFligth(String locator, String value) {
		method.selectFligth(locator, value,true);
	} // selectDepartFligth
	
	public static void validateReturnTrip(String locator, String value) {
		method.validateMessage(locator, value,destino.get(1).concat(" to ").concat(destino.get(0))); 
	} // validateReturnTrip
	
	public static void validateReturnDate(String locator, String value) {
		method.validateMessage(locator, value,fecha.get(1)); 
	} // validateReturnDate
	
	public static void printConsoleReturn(String locator, String value) {
		method.PrintConsole(locator, value);
	} // printConsoleReturn
	
	public static void selectReturnFligth(String locator, String value) {
		method.selectFligth(locator, value,false);
	} // selectReturnFligth
	
	public static void clickContinuePurchase(String locator, String value) {
		method.Click("continue", locator, value);
	} // clickContinuePurchase
	
	public static void validateSumary(String locator, String value) {
		method.validateSumary(locator, value, fecha, destino, passengers);
	} // validateSumary
	
	public static void setFirstNamePassenger1(String locator, String value, String param) {
		method.Fill("first name passenger 1",locator,value,param);
	} // setFirstNamePassenger1
	
	public static void setLastNamePassenger1(String locator, String value, String param) {
		method.Fill("last name passenger 1",locator,value,param);
	} // setLastNamePassenger1
	
	public static void selectMealPassenger1(String locator, String value, String param) {
		method.FillDropdown("meal passenger 1",locator,value,param);
	} // selectMealPassenger1
	
	public static void setFirstNamePassenger2(String locator, String value, String param) {
		method.Fill("first name passenger 2",locator,value,param);
	} // setFirstNamePassenger2
	
	public static void setLastNamePassenger2(String locator, String value, String param) {
		method.Fill("last name passenger 2",locator,value,param);
	} // setLastNamePassenger2
	
	public static void selectMealPassenger2(String locator, String value, String param) {
		method.FillDropdown("meal passenger 2",locator,value,param);
	} // selectMealPassenger2
	
	public static void selectCardTipe(String locator, String value, String param) {
		method.FillDropdown("meal passenger 2",locator,value,param);
	} // selectCardTipe
	
	public static void setCardNumber(String locator, String value, String param) {
		method.Fill("card number",locator,value,param);
	} // setCardNumber
	
	public static void selectExpirationMonth(String locator, String value, String param) {
		method.FillDropdown("expitarion month",locator,value,param);
	} // selectExpirationMonth
	
	public static void selectExpirationYear(String locator, String value, String param) {
		method.FillDropdown("expiration year",locator,value,param);
	} // selectExpirationYear
	
	public static void setFirstName(String locator, String value, String param) {
		method.Fill("first name",locator,value,param);
		information.add(param);
	} // setFirstName
	
	public static void setMiddleName(String locator, String value, String param) {
		method.Fill("middle name",locator,value,param);
		information.add(param);
	} // setMiddleName
	
	public static void setLastName(String locator, String value, String param) {
		method.Fill("last name",locator,value,param);
		information.add(param);
	} // setLastName
	
	public static void setBillingAdress(String locator, String value, String param) {
		method.Fill("billing adress",locator,value,param);
		information.add(param);
	} // setBillingAdress
	
	public static void setBillingCity(String locator, String value, String param) {
		method.Fill("billing city",locator,value,param);
		information.add(param);
	} // setBillingCity
	
	public static void setBillingState(String locator, String value, String param) {
		method.Fill("billing state",locator,value,param);
		information.add(param);
	} // setBillingState
	
	public static void setBillingZipCode(String locator, String value, String param) {
		method.Fill("billing zip code",locator,value,param);
		information.add(param);
	} // setBillingZipCode
	
	public static void setDeliveryAdress(String locator, String value, String param) {
		method.Fill("delivery adress",locator,value,param);
		information.add(param);
	} // setDeliveryAdress
	
	public static void setDeliveryCity(String locator, String value, String param) {
		method.Fill("delivery city",locator,value,param);
		information.add(param);
	} // setDeliveryCity
	
	public static void setDeliveryState(String locator, String value, String param) {
		method.Fill("delivery state",locator,value,param);
		information.add(param);
	} // setDeliveryState
	
	public static void setDeliveryZipCode(String locator, String value, String param) {
		method.Fill("delivery zip code",locator,value,param);
		information.add(param);
	} // setDeliveryZipCode
	
	public static void clickSecurePurchase(String locator, String value) {
		method.Click("Secure purchase", locator, value);
	}
	public static void validatePuechase(String locator, String value, String param) {
		method.validateMessage(locator, value,param); 
	} // validatePuechase
	
	public static void validateBook(String locator, String value) {
		method.bookRevision(locator, value,fecha,destino,passengers,information); 
	} // validatePuechase
	
	public static void closeBrowser() {
		log.info("closeBrowser");
		driver.close();
	} // closeBrowser
	
	private static String obtenerNumeroMes(String mes) {
		String regresar=  null;
		switch(mes) {
		case "January":
			regresar="1";
		break;
		case "February":
			regresar="2";
		break;
		case "March":
			regresar="3";
		break;
		case "April":
			regresar="4";
		break;
		case "May":
			regresar="5";
		break;
		case "June":
			regresar="6";
		break;
		case "July":
			regresar="7";
		break;
		case "August":
			regresar="8";
		break;
		case "September":
			regresar="9";
		break;
		case "October":
			regresar="10";
		break;
		case "November":
			regresar="11";
		break;
		case "December":
			regresar="12";
		break;	
		} // switch
		return regresar;
	} // obtenerNumeroMes

}
