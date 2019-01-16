package utils;

import java.time.Duration;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


/**
 * Created by v.matviichenko
 */
public class ActionController {
	private static final int SCROLL_TIMEOUT = 500;
	private AndroidDriver<MobileElement> driver;

	public ActionController(AndroidDriver<MobileElement> androidDriver) {
		this.driver = androidDriver;
	}

	public void swipeElement(final MobileElement element) {
		Point location = element.getLocation();
		Dimension size = element.getSize();

		int startY = location.getY();
		int endY = location.getY() + size.getHeight();
		int startX = element.getCenter().getX();
		int endX = element.getCenter().getX();

		new TouchAction(driver)
			.press(PointOption.point(startX, startY))
			.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SCROLL_TIMEOUT)))
			.moveTo(PointOption.point(endX, endY))
			.release()
			.perform();
		}
}
