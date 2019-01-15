package tests;

import static enums.Constants.DIVIDER;
import static enums.Constants.FIRST_INT;
import static enums.Constants.SECOND_INT;
import static enums.Constants.THIRD_INT;
import static enums.MathOperations.DIVIDE;
import static enums.MathOperations.LEFT_PARENTHESES;
import static enums.MathOperations.MINUS;
import static enums.MathOperations.MULTIPLY;
import static enums.MathOperations.PI;
import static enums.MathOperations.RIGHT_PARENTHESES;
import static enums.MathOperations.SIN;

import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import pageobject.CalculatorPageObject;
import singelton.AppiumDriverSingleton;

/**
 * Created by v.matviichenko
 */
public class TestHistory {
	private AppiumDriver driver;
	private CalculatorPageObject pageObject;

	@Before
	public void setup() throws Exception {
		driver = AppiumDriverSingleton.getInstance();
		pageObject = new CalculatorPageObject(driver);
	}

	@Test
	public void testHistory() {
		pageObject.openHistory();
	}
}
