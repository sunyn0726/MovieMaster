package com.lsz.movie;

import android.app.Application;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //FrescoHelper.getInstance().init(this);
    }
}
