package com.lsz.movie.model;

import com.lsz.movie.entity.BoxAnalyseEntity;

import retrofit2.Callback;

public interface IBoxAnalyseModel {

    void getBoxAnalyse(String date, Callback<BoxAnalyseEntity> callback);
}
