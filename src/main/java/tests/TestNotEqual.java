package tests;

import static enums.Constants.EXPECTED_RESULT_SIN;
import static enums.Constants.FIRST_INT;
import static enums.Constants.SECOND_INT;
import static enums.Constants.THIRD_INT;
import static enums.MathOperations.LEFT_PARENTHESES;
import static enums.MathOperations.MINUS;
import static enums.MathOperations.MULTIPLY;
import static enums.MathOperations.RIGHT_PARENTHESES;
import static org.junit.Assert.assertNotEquals;

import core.TestBase;
import org.junit.Before;
import org.junit.Test;
import pageobject.CalculatorPageObject;

/**
 * Created by v.matviichenko
 */
public class TestNotEqual extends TestBase {
	private CalculatorPageObject pageObject;

	@Before
	public void setup() {
		pageObject = new CalculatorPageObject(driver);
	}

	@Test
	public void testNotEqual() {
		pageObject.selectAdvancedOptions();
		pageObject.clickOnParenthesisButton(LEFT_PARENTHESES);
		pageObject.goBack();
		pageObject.clickOnDigitButton(FIRST_INT);
		pageObject.selectMathOperation(MINUS);
		pageObject.clickOnDigitButton(SECOND_INT);
		pageObject.selectAdvancedOptions();
		pageObject.clickOnParenthesisButton(RIGHT_PARENTHESES);
		pageObject.goBack();
		pageObject.selectMathOperation(MULTIPLY);
		pageObject.clickOnDigitButton(THIRD_INT);
		pageObject.clickOnEqualButton();

		assertNotEquals("Result is equal", Integer.valueOf(pageObject.resultView().getText()), EXPECTED_RESULT_SIN);
	}
}
