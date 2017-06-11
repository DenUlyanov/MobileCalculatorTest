package im.getsocial.calc;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Dzen on 6/5/17.
 */

public class SubtractionTest {

    @Rule
    public ActivityTestRule<MainActivity> myActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    Calculator calculator = new Calculator();

    @Test
    public void basicSubstructionTest() {
        calculator.fillInFirstArgument(10);
        calculator.fillInSecondArgument(10);
        calculator.performSubtraction();
        calculator.verifyResultEquals(0);
    }

    @Test
    public void negativeResultSubtractionTest() {
        calculator.fillInFirstArgument(10);
        calculator.fillInSecondArgument(99);
        calculator.performSubtraction();
        calculator.verifyResultEquals(-89);

    }
}