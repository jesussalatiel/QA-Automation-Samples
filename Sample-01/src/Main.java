import Browser.driverChrome;

public class Main {
	public static void main(String args[]) {
		try {
			//new driverFirefox().setupFirefox();
			new driverChrome().setupChrome();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
