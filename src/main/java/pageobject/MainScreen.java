package pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.ActionController;

/**
 * Created by v.matviichenko
 */
public class MainScreen  {
	protected AndroidDriver<MobileElement> driver;
	protected ActionController actionController;

	public MainScreen(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		this.actionController = new ActionController(driver);
	}
}
