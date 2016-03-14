package com.lsz.movie.model;

import com.lsz.movie.api.ApiServer;
import com.lsz.movie.api.AppConstants;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class BaseModel {

    public ApiServer mServer;

    public BaseModel(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(AppConstants.RequestPath.BASE_URL)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();

        mServer = retrofit.create(ApiServer.class);
    }
}
