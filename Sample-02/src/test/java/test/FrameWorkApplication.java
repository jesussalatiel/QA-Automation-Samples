package test;


import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;
import util.ReadExcel;
import util.ScriptFlow;

public class FrameWorkApplication {
	private static Logger log = LogManager.getLogger(FrameWorkApplication.class.getName());

	@Test
	public void KeywordDFTest() throws IOException {
		String[][] data= null;
		try {
			PropertyConfigurator.configure("log4j.properties");
			data= ReadExcel.getData("Script.xlsx", "Sheet1");
				for (int i = 1; i < data.length; i++) {			
					switch (data[i][2]) {
					case "openBrowser":
						ScriptFlow.openBrowser(data[i][5]);
						break;
					case "maximizeBrowser":
						ScriptFlow.maximizeBrowser();
						break;
					case "implementWait":
						ScriptFlow.implementWait();
						break;
					case "navigateTo":
						ScriptFlow.navigateTo(data[i][5]);
						break;
					case "setUserName":
						ScriptFlow.setUserName(data[i][3],data[i][4],data[i][5]);
						break;
					case "setPassword":
						ScriptFlow.setPassword(data[i][3],data[i][4],data[i][5]);
						break;
					case "login":
						ScriptFlow.login(data[i][3],data[i][4]);
						break;		
					case "validateFilgthPage":
						ScriptFlow.validateFilgthPage(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectTrip":
						ScriptFlow.selectTrip(data[i][3],data[i][4]);
						break;	
					case "selectPassengers":
						ScriptFlow.selectPassengers(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectDepartureCity":
						ScriptFlow.selectDepartureCity(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectDepartureMonth":
						ScriptFlow.selectDepartureMonth(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectDepartureDay":
						ScriptFlow.selectDepartureDay(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectArrivalCity":
						ScriptFlow.selectArrivalCity(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectArrivalMonth":
						ScriptFlow.selectArrivalMonth(data[i][3],data[i][4],data[i][5]);
						break;
					case "selectArrivalDay":
						ScriptFlow.selectArrivalDay(data[i][3],data[i][4],data[i][5]);
						break;
					case "SelectTypeTrip":
						ScriptFlow.SelectTypeTrip(data[i][3],data[i][4]);			
						break;
					case "selectAirline":
						ScriptFlow.selectAirline(data[i][3],data[i][4],data[i][5]);
						break;
					case "clickContinue":
						ScriptFlow.clickContinue(data[i][3],data[i][4]);
						break;
					case "validateSelectFilgthPage":
						ScriptFlow.validateSelectFilgthPage(data[i][3],data[i][4],data[i][5]);
						break;	
					case "validateTrip":
						ScriptFlow.validateTrip(data[i][3],data[i][4]);
						break;	
					case "validateDate":
						ScriptFlow.validateDate(data[i][3],data[i][4]);
						break;	
					case "printConsole":
						ScriptFlow.printConsole(data[i][3],data[i][4]);
						break;	
					case "selectDepartFligth":
						ScriptFlow.selectDepartFligth(data[i][3],data[i][4]);
						break;	
					case "validateReturnTrip":
						ScriptFlow.validateReturnTrip(data[i][3],data[i][4]);
						break;	
					case "validateReturnDate":
						ScriptFlow.validateReturnDate(data[i][3],data[i][4]);
						break;	
					case "printConsoleReturn":
						ScriptFlow.printConsoleReturn(data[i][3],data[i][4]);
						break;	
					case "selectReturnFligth":
						ScriptFlow.selectReturnFligth(data[i][3],data[i][4]);
						break;	
					case "clickContinuePurchase":
						ScriptFlow.clickContinuePurchase(data[i][3],data[i][4]);
						break;	
					case "validateSumary":
						ScriptFlow.validateSumary(data[i][3],data[i][4]);
						break;	
					case "setFirstNamePassenger1":
						ScriptFlow.setFirstNamePassenger1(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setLastNamePassenger1":
						ScriptFlow.setLastNamePassenger1(data[i][3],data[i][4],data[i][5]);
						break;	
					case "selectMealPassenger1":
						ScriptFlow.selectMealPassenger1(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setFirstNamePassenger2":
						ScriptFlow.setFirstNamePassenger2(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setLastNamePassenger2":
						ScriptFlow.setLastNamePassenger2(data[i][3],data[i][4],data[i][5]);
						break;	
					case "selectMealPassenger2":
						ScriptFlow.selectMealPassenger2(data[i][3],data[i][4],data[i][5]);
						break;	
					case "selectCardTipe":
						ScriptFlow.selectCardTipe(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setCardNumber":
						ScriptFlow.setCardNumber(data[i][3],data[i][4],data[i][5]);
						break;	
					case "selectExpirationMonth":
						ScriptFlow.selectExpirationMonth(data[i][3],data[i][4],data[i][5]);
						break;	
					case "selectExpirationYear":
						ScriptFlow.selectExpirationYear(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setFirstName":
						ScriptFlow.setFirstName(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setMiddleName":
						ScriptFlow.setMiddleName(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setLastName":
						ScriptFlow.setLastName(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setBillingAdress":
						ScriptFlow.setBillingAdress(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setBillingCity":
						ScriptFlow.setBillingCity(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setBillingState":
						ScriptFlow.setBillingState(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setBillingZipCode":
						ScriptFlow.setBillingZipCode(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setDeliveryAdress":
						ScriptFlow.setDeliveryAdress(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setDeliveryCity":
						ScriptFlow.setDeliveryCity(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setDeliveryState":
						ScriptFlow.setDeliveryState(data[i][3],data[i][4],data[i][5]);
						break;	
					case "setDeliveryZipCode":
						ScriptFlow.setDeliveryZipCode(data[i][3],data[i][4],data[i][5]);
						break;	
					case "clickSecurePurchase":
						ScriptFlow.clickSecurePurchase(data[i][3],data[i][4]);
						break;	
					case "validatePuechase":
						ScriptFlow.validatePuechase(data[i][3],data[i][4],data[i][5]);
						break;	
					case "validateBook":
						ScriptFlow.validateBook(data[i][3],data[i][4]);
						break;	
					case "closeBrowser":
						ScriptFlow.closeBrowser();
						break;	
					default:
						System.out.println("Método "+data[i][2]+ "No encontrado");
						break;
					} // switch					
				} // for		
		} // try
		catch(FileNotFoundException fnf) {
				log.error(fnf.getMessage());
		} // catch
	} // keyWordDFTest		
} // frameworkApplication