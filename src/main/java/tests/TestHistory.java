package tests;

import static enums.Constants.EXPECTED_HISTORY_SIZE;
import static org.junit.Assert.assertEquals;

import core.TestBase;
import org.junit.Test;

/**
 * Created by v.matviichenko
 */
public class TestHistory extends TestBase {

	@Test
	public void testHistory() {
		pageObject.openHistory();
		int historySize = pageObject.getHistory().size();

		assertEquals("Size history is wrong", historySize, EXPECTED_HISTORY_SIZE);
	}
}
