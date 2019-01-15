package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.TestMathOperations;
import tests.TestNotEqual;
import tests.TestSin;

/**
 * Created by v.matviichenko
 */
@RunWith (Suite.class)
@Suite.SuiteClasses({TestMathOperations.class, TestNotEqual.class, TestSin.class})
public class TestSuits  {

}
