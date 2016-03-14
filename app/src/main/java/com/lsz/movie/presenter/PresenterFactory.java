package com.lsz.movie.presenter;

import com.lsz.movie.presenter.impl.BoxAnalysePresenter;
import com.lsz.movie.view.BoxAnalyseView;

public class PresenterFactory {

    private static PresenterFactory mFactory;

    private PresenterFactory() {

    }

    public static PresenterFactory getInstance() {
        return mFactory == null ? new PresenterFactory() : mFactory;
    }

    public BoxAnalysePresenter getBoxAnalysePresenter(BoxAnalyseView view) {
        return new BoxAnalysePresenter(view);
    }

}
