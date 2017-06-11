package im.getsocial.calc;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Dzen on 6/11/17.
 */

public class Calculator {

    public static final String SECOND_ARGUMENT = "Second argument";
    public static final String FIRST_ARGUMENT = "First argument";
    public static final String MINUS = "-";
    public static final String DIVIDE = "/";
    public static final String RESULT = "Result";


    public void fillInFirstArgument(int value) {
        onView(withHint(FIRST_ARGUMENT)).perform(typeText(String.valueOf(value)));
    }

    public void fillInSecondArgument(int value) {
        onView(withHint(SECOND_ARGUMENT)).perform(typeText(String.valueOf(value)));
    }

    public void performSubtraction() {
        onView(withText(MINUS)).perform(click());
    }

    public void performDivision() {
        onView(withText(DIVIDE)).perform(click());
    }

    public void verifyResultEquals(int value) {
        onView(withHint(RESULT)).check(matches(withText(Integer.toString(value))));
    }
}