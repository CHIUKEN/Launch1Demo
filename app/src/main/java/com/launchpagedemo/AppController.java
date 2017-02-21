package com.launchpagedemo;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by chiu on 2017/2/20.
 */

public class AppController extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));

    }
}
