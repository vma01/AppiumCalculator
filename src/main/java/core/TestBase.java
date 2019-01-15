package core;

import java.io.IOException;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import utils.DriverManager;


/**
 * Created by v.matviichenko
 */
public class TestBase {
	protected static DriverManager driverManager = new DriverManager();
	protected static AndroidDriver<MobileElement> driver;

	private static boolean initialized;

	@BeforeClass
	public static void setUp() throws IOException {
		if (!initialized) {
			driver = driverManager.setUp();
			driver.resetApp();

			initialized = true;
		}
	}

//	@After
//	public void launchApp() {
//		driver.launchApp();
//	}
}
