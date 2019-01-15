package tests;

import core.TestBase;
import org.junit.Before;
import org.junit.Test;
import pageobject.CalculatorPageObject;

/**
 * Created by v.matviichenko
 */
public class TestHistory extends TestBase {
	private CalculatorPageObject pageObject;

	@Before
	public void setup() {
		pageObject = new CalculatorPageObject(driver);
	}

	@Test
	public void testHistory() {
		pageObject.openHistory();
	}
}
