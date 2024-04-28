package com.example.imadassignment2_st10443365tristanhoskins

import android.view.View
import android.widget.ProgressBar
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class SecondActivityTest {

    @Before
    fun launchActivity() {
        ActivityScenario.launch(Second::class.java)
    }

    @Test
    fun testFeedButton() {
        onView(withId(R.id.feedB)).perform(click())
        onView(withId(R.id.hungerBar)).check(matches(withProgress(10)))
    }

    @Test
    fun testCleanButton() {
        onView(withId(R.id.cleanB)).perform(click())
        onView(withId(R.id.cleanBar)).check(matches(withProgress(10)))
    }

    @Test
    fun testPlayButton() {
        onView(withId(R.id.playB)).perform(click())
        onView(withId(R.id.happyBar)).check(matches(withProgress(10)))
    }

    private fun withProgress(expectedProgress: Int) =
        object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Progress should be $expectedProgress")
            }

            override fun matchesSafely(item: View): Boolean {
                if (item !is ProgressBar) return false
                return item.progress == expectedProgress
            }
        }
}

