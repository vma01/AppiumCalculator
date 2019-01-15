package pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.GesturesController;

/**
 * Created by v.matviichenko
 */
public class MainScreen  {
	protected AndroidDriver<MobileElement> driver;
	protected GesturesController gesturesController;

	public MainScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		this.gesturesController = new GesturesController(driver);
	}
}
