package utils;

import java.time.Duration;

import enums.Direction;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import singelton.AppiumDriverSingleton;


/**
 * Created by v.matviichenko
 */
public class GesturesController {
		private static final int SCROLL_TIMEOUT = 500;
		private AppiumDriverSingleton driver;

		public GesturesController(AppiumDriverSingleton appiumDriverSingleton) {
			this.driver = appiumDriverSingleton;
		}

		public void swipeInsideElement(Direction direction, final MobileElement element) {
			Point location = element.getLocation();
			Dimension size = element.getSize();

			int startY = 0;
			int startX = 0;
			int endY = 0;
			int endX = 0;

			if (direction.equals(Direction.LEFT)) {
				startY = element.getCenter().getY();
				endY = element.getCenter().getY();
				startX = location.getX() + size.getWidth();
				endX = location.getX();
			} else if (direction.equals(Direction.RIGHT)) {
				startY = element.getCenter().getY();
				endY = element.getCenter().getY();
				startX = location.getX();
				endX = location.getX() + size.getWidth();
			} else if (direction.equals(Direction.UP)) {
				startY = location.getY() + size.getHeight();
				endY = location.getY();
				startX = element.getCenter().getX();
				endX = element.getCenter().getX();
			} else if (direction.equals(Direction.DOWN)) {
				startY = location.getY();
				endY = location.getY() + size.getHeight();
				startX = element.getCenter().getX();
				endX = element.getCenter().getX();
			}

//			new TouchAction(driver)
//					.press(PointOption.point(startX, startY))
//					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(SCROLL_TIMEOUT)))
//					.moveTo(PointOption.point(endX, endY))
//					.release()
//					.perform();
		}
}
