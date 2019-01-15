package tests;

import static enums.Constants.DIVIDER;
import static enums.Constants.EXPECTED_RESULT_SIN;
import static enums.MathOperations.DIVIDE;
import static enums.MathOperations.PI;
import static enums.MathOperations.RIGHT_PARENTHESES;
import static enums.MathOperations.SIN;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import pageobject.CalculatorPageObject;
import singelton.AppiumDriverSingleton;

/**
 * Created by v.matviichenko
 */
public class TestSin {
	private AppiumDriver driver;
	private CalculatorPageObject pageObject;

	@Before
	public void setup() throws Exception {
		driver = AppiumDriverSingleton.getInstance();
		pageObject = new CalculatorPageObject(driver);
	}

	@Test
	public void testSine() {
		pageObject.selectAdvancedOptions();
		pageObject.selectMathOperation(SIN);
		pageObject.selectMathOperation(PI);
		pageObject.goBack();
		pageObject.selectMathOperation(DIVIDE);
		pageObject.clickOnDigitButton(DIVIDER);
		pageObject.selectAdvancedOptions();
		pageObject.clickOnParenthesisButton(RIGHT_PARENTHESES);
		pageObject.goBack();
		pageObject.clickOnEqualButton();

		assertThat("Result of sin(30) is wrong", Double.valueOf(pageObject.resultView().getText()), equalTo(EXPECTED_RESULT_SIN));
	}
}
