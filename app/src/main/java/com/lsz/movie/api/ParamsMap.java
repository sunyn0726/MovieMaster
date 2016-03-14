package com.lsz.movie.api;

import java.util.HashMap;

public class ParamsMap extends HashMap<String, String> {

    public ParamsMap() {
        put(AppConstants.ParamKey.VHOST, AppConstants.ParamDefaultValue.VHOST);
    }

    public void put(String key, int value) {
        super.put(key, value + "");
    }

    @Override
    public String put(String key, String value) {
        return super.put(key, value);
    }
}
