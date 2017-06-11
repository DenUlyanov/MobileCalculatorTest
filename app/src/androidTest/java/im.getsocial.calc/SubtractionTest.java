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
    public void simplePositiveResultSubtractionTest() {
        calculator.fillInFirstArgument(9);
        calculator.fillInSecondArgument(7);
        calculator.performSubtraction();
        calculator.verifyResultEquals(2);
    }

    @Test
    public void bigIntegerPositiveResultSubtractionTest() {
        calculator.fillInFirstArgument(123456789);
        calculator.fillInSecondArgument(9);
        calculator.performSubtraction();
        calculator.verifyResultEquals(123456780);
    }

    @Test
    public void negativeResultSubtractionTest() {
        calculator.fillInFirstArgument(10);
        calculator.fillInSecondArgument(99);
        calculator.performSubtraction();
        calculator.verifyResultEquals(-89);
    }
}