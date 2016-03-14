package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;
import com.lsz.movie.ui.widget.TitleBuilder;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TabCinemaFragment extends BaseFragment {

    @Bind(R.id.group_title)
    RadioGroup mGroupTitle;

    public static TabCinemaFragment newInstance() {
        Bundle args = new Bundle();
        TabCinemaFragment fragment = new TabCinemaFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_cinema, container, false);
        ButterKnife.bind(this, view);
        return view;
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
        }, "影院", "影投");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
