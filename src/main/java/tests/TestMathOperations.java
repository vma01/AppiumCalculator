package tests;

import static enums.MathOperations.MINUS;
import static enums.MathOperations.PLUS;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import enums.MathOperations;
import io.appium.java_client.AppiumDriver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import pageobject.CalculatorPageObject;
import singelton.AppiumDriverSingleton;

/**
 * Created by v.matviichenko
 */
@RunWith (Parameterized.class)
public class TestMathOperations {
	private AppiumDriver driver;
	private CalculatorPageObject pageObject;

	@Parameterized.Parameter()
	public int firstValue;

	@Parameterized.Parameter(1)
	public int secondValue;

	@Parameterized.Parameter(2)
	public int expectedResult;

	@Parameterized.Parameter(3)
	public MathOperations operation;


	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][]{
				{2, 3, 5, PLUS},
				{10, 2, 8, MINUS}};
		return Arrays.asList(data);
	}

	@Before
	public void setup() throws Exception {
		driver = AppiumDriverSingleton.getInstance();
		pageObject = new CalculatorPageObject(driver);
	}

    @Test
    public void testMathOperation(){
        pageObject.clickOnDigitButton(firstValue);
        pageObject.clickOnMathOperation(operation);
        pageObject.clickOnDigitButton(secondValue);
        pageObject.equalButton().click();

        assertEquals("Operation sum doesn't work", Integer.parseInt(pageObject.resultView().getText()), expectedResult);
    }
}
