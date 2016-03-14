package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;

public class BoardMarketFragment extends BaseFragment {

    public static BoardMarketFragment newInstance() {
        Bundle args = new Bundle();
        BoardMarketFragment fragment = new BoardMarketFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle 
            savedInstanceState) {
        return inflater.inflate(R.layout.fragment_board_market, container, false);
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {

    }
}
