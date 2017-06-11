package im.getsocial.calc;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Dzen on 6/11/17.
 */

public class DivisionTest {

    @Rule
    public ActivityTestRule<MainActivity> ActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    Calculator calculator = new Calculator();

    @Test
    public void positiveResultDivisionTest() {
        calculator.fillInFirstArgument(100);
        calculator.fillInSecondArgument(10);
        calculator.performDivision();
        calculator.verifyResultEquals(10);
    }

    @Test
    public void bigIntegerDivisionTest() {
        calculator.fillInFirstArgument(1234567890);
        calculator.fillInSecondArgument(1234567890);
        calculator.performDivision();
        calculator.verifyResultEquals(1);
    }
}