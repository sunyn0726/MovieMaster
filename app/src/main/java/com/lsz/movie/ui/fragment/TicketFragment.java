package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;
import com.lsz.movie.entity.BoxAnalyseEntity;
import com.lsz.movie.presenter.PresenterFactory;
import com.lsz.movie.util.LogUtils;
import com.lsz.movie.view.BoxAnalyseView;

public class TicketFragment extends BaseFragment implements BoxAnalyseView {

    private static final String TAG = "TicketFragment";

    public static TicketFragment newInstance() {
        Bundle args = new Bundle();
        TicketFragment fragment = new TicketFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ticket, container, false);
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        PresenterFactory.getInstance().getBoxAnalysePresenter(this).getBoxAnalysePresenter
                ("2016-03-14");
    }

    @Override
    public void getBoxAnalyseOnSuccess(BoxAnalyseEntity data) {
        if (data != null) {

        }
    }

    @Override
    public void getBoxAnalyseOnFail(String msg) {
        LogUtils.i(TAG, msg);
    }
}
