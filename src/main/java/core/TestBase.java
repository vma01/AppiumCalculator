package core;

import java.io.IOException;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import pageobject.CalculatorPageObject;
import utils.DriverManager;


/**
 * Created by v.matviichenko
 */
public class TestBase {
	protected static DriverManager driverManager = new DriverManager();
	protected static AndroidDriver<MobileElement> driver;
	protected static CalculatorPageObject pageObject;

	private static boolean initialized;

	@BeforeClass
	public static void setUp() throws IOException {
		if (!initialized) {
			driver = driverManager.setUp();
			pageObject = new CalculatorPageObject(driver);
			driver.resetApp();

			initialized = true;
		}
	}
}
