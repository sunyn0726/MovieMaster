package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;
import com.lsz.movie.ui.widget.TitleBuilder;

public class TabBoardMarketFragment extends BaseFragment {

    public static TabBoardMarketFragment newInstance() {
        Bundle args = new Bundle();
        TabBoardMarketFragment fragment = new TabBoardMarketFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_board_market, container, false);
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        initTitle(view);
    }

    private void initTitle(View view) {
        new TitleBuilder(view).setTab(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        }, "排片", "上座率");
    }
}
