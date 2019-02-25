/*
 *
 * Created by Lloyd Smith on 2/24/19 7:34 PM.
 * Copyright (c) 2019. All rights reserved.
 * Last modified 2/21/19 6:49 PM.
 */

package com.lloydsmithexampledomain.meijerapp;

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

        assertEquals("com.lloydsmithexampledomain.meijerapp", appContext.getPackageName());
    }
}