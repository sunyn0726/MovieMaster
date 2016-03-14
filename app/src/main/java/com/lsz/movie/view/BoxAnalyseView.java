package com.lsz.movie.view;

import com.lsz.movie.entity.BoxAnalyseEntity;

public interface BoxAnalyseView {

    void getBoxAnalyseOnSuccess(BoxAnalyseEntity data);

    void getBoxAnalyseOnFail(String msg);

}
