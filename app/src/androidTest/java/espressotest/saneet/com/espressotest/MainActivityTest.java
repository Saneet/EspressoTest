package espressotest.saneet.com.espressotest;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public final ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void home() {
        onView(withId(R.id.navigation_home)).perform(click());
        onView(withId(R.id.message)).check(matches(withText(R.string.title_home)));
    }

    @Test
    public void dashboard() {
        onView(withId(R.id.navigation_dashboard)).perform(click());
        onView(withId(R.id.message)).check(matches(withText(R.string.title_dashboard)));
    }

    @Test
    public void notifications() {
        onView(withId(R.id.navigation_notifications)).perform(click());
        onView(withId(R.id.message)).check(matches(withText(R.string.title_notifications)));
    }
}