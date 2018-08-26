package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import com.udacity.gradle.builditbigger.MainActivity.JokeEndpointsAsyncTask;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class TestJokeEndpointsAsyncTask {

    public static final String LOG_TAG = TestJokeEndpointsAsyncTask.class.getSimpleName();


    @Before
    public void before() {
        // DO NOTHING
    }

    @Test
    public void testJokeEndpointsAsyncTask() throws InterruptedException {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        final CountDownLatch latch = new CountDownLatch(1);

        JokeEndpointsAsyncTask testTask = new JokeEndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String joke) {
                assertNotNull(joke);
                if (joke != null){
                    assertTrue(joke.length() > 0);
                    latch.countDown();
                }
            }
        };

        testTask.execute(appContext);

        latch.await();
    }

}