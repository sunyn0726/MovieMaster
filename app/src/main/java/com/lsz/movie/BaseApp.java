package com.lsz.movie;

import android.app.Application;

import com.lsz.movie.util.libs.FrescoHelper;

public class BaseApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        FrescoHelper.getInstance().init(this);
    }
}
