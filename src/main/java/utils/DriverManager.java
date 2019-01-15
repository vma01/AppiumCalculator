package utils;

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

	private static ThreadLocal<AndroidDriver<MobileElement>> driverThreadLocal = new ThreadLocal<>();

	public AndroidDriver<MobileElement> setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("platformVersion", "8.1");

		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		capabilities.setCapability("sessionOverride", true);


		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public AndroidDriver<MobileElement> getDriver() {
		return driverThreadLocal.get();
	}
}
