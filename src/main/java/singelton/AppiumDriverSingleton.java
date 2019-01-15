package singelton;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by v.matviichenko
 */
public class AppiumDriverSingleton {
	private static AppiumDriver driver = null;

	private AppiumDriverSingleton() {
	}

	public static AppiumDriver getInstance() throws MalformedURLException {
		if (driver == null) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("deviceName", "Android Emulator");
			capabilities.setCapability("platformVersion", "8.1");


			capabilities.setCapability("appPackage", "com.android.calculator2");
			capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
			capabilities.setCapability("sessionOverride", true);

			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	}
}
