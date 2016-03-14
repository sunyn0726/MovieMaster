package com.lsz.movie.api;

import com.lsz.movie.entity.BoxAnalyseEntity;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiServer {

    @GET(AppConstants.RequestPath.BOX_ANALYSE)
    Call<BoxAnalyseEntity> getBoxAnalyse(@QueryMap Map<String, String> map);
}
