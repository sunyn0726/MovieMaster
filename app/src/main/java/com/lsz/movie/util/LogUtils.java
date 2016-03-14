package com.lsz.movie.util;

import android.util.Log;

public class LogUtils {

    private static final String TAG = "Tao";

    public static void i(String msg) {
        Log.i(TAG, msg);
    }

    public static void d(String msg) {
        Log.d(TAG, msg);
    }

    public static void e(String msg) {
        Log.e(TAG, msg);
    }

    public static void v(String msg) {
        Log.v(TAG, msg);
    }

    public static void i(String tag, String msg) {
        Log.i(TAG + "->" + tag, msg);
    }

    public static void d(String tag, String msg) {
        Log.i(TAG + "->" + tag, msg);
    }

    public static void e(String tag, String msg) {
        Log.i(TAG + "->" + tag, msg);
    }

    public static void v(String tag, String msg) {
        Log.i(TAG + "->" + tag, msg);
    }
}
