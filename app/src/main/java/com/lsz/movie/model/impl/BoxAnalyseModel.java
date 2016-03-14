package com.lsz.movie.model.impl;

import com.lsz.movie.api.AppConstants;
import com.lsz.movie.api.ParamsMap;
import com.lsz.movie.entity.BoxAnalyseEntity;
import com.lsz.movie.model.BaseModel;
import com.lsz.movie.model.IBoxAnalyseModel;

import retrofit2.Callback;

public class BoxAnalyseModel extends BaseModel implements IBoxAnalyseModel {

    @Override
    public void getBoxAnalyse(String date, Callback<BoxAnalyseEntity> callback) {
        ParamsMap map = new ParamsMap();
        map.put(AppConstants.ParamKey.DATE, date);

        mServer.getBoxAnalyse(map).enqueue(callback);
    }
}
