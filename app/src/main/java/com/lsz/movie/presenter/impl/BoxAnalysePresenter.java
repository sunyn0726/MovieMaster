package com.lsz.movie.presenter.impl;

import com.lsz.movie.entity.BoxAnalyseEntity;
import com.lsz.movie.model.ModelFactory;
import com.lsz.movie.presenter.IBoxAnalysePresenter;
import com.lsz.movie.view.BoxAnalyseView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BoxAnalysePresenter implements IBoxAnalysePresenter {

    private BoxAnalyseView mView;

    public BoxAnalysePresenter(BoxAnalyseView view) {
        mView = view;
    }

    @Override
    public void getBoxAnalysePresenter(String date) {
        ModelFactory.getInstance().getBoxAnalyseModel().getBoxAnalyse(date, new
                Callback<BoxAnalyseEntity>() {

            @Override
            public void onResponse(Call<BoxAnalyseEntity> call, Response<BoxAnalyseEntity>
                    response) {
                mView.getBoxAnalyseOnSuccess(response.body());
            }

            @Override
            public void onFailure(Call<BoxAnalyseEntity> call, Throwable t) {
                mView.getBoxAnalyseOnFail(t.getMessage());
            }
        });
    }
}
