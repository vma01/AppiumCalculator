package utils;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.DEVICE_NAME;
import static io.appium.java_client.remote.MobileCapabilityType.PLATFORM_VERSION;
import static org.openqa.selenium.remote.CapabilityType.PLATFORM_NAME;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by v.matviichenko
 */
public class DriverManager {
	private AndroidDriver driver;

	public AndroidDriver<MobileElement> setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(PLATFORM_NAME, "Android");
		capabilities.setCapability(DEVICE_NAME, "Android Emulator");
		capabilities.setCapability(PLATFORM_VERSION, "8.1");

		capabilities.setCapability(APP_PACKAGE, "com.android.calculator2");
		capabilities.setCapability(APP_ACTIVITY, "com.android.calculator2.Calculator");

		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}
}
