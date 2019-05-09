package com.example.activitylifecycle;

import android.app.Application;

/**
 * Created by 51772819 on 09,May,2019
 * Hcl Technologies,
 * India.
 */
public class GlobalApplication extends Application {

    public String helloFromGlobalApplication = "Hello From GlobalApplication";

    private static GlobalApplication singleton;

    public static GlobalApplication getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}
