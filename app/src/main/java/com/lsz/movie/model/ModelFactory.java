package com.lsz.movie.model;

import com.lsz.movie.model.impl.BoxAnalyseModel;

public class ModelFactory {

    private static ModelFactory mFactory;

    private ModelFactory() {

    }

    public static ModelFactory getInstance() {
        return mFactory == null ? new ModelFactory() : mFactory;
    }

    public BoxAnalyseModel getBoxAnalyseModel() {
        return new BoxAnalyseModel();
    }

}
