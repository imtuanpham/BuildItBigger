package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Following tests
 * 1) parseSandwichJson
 */
@RunWith(AndroidJUnit4.class)
public class TestJokeEndpointsAsyncTask {


    @Before
    public void before() {
        // DO NOTHING
    }

    @Test
    public void testJokeEndpointsAsyncTask() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        new TestAsyncTask().execute(appContext);
    }

    public static class TestAsyncTask extends MainActivity.JokeEndpointsAsyncTask {
        @Override
        protected void onPostExecute(String joke) {
            assert joke.length() != 0;
        }
    }

}