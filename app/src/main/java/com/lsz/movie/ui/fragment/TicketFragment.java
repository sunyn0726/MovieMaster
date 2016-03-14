package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;

public class TicketFragment extends BaseFragment {

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

    }
}
