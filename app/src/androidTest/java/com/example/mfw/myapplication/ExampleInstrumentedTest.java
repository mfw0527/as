package com.example.mfw.myapplication;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.mfw.myapplication", appContext.getPackageName());
    }

    public void pra(){
        System.out.println("this is a test");
    }

    public void task(){
        System.out.println("this is the b task");
    }
    public void finalVersion(){
        System.out.println("This is the finally version");
    }

}
