package com.lsz.movie;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public abstract class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view, savedInstanceState);
    }

    protected abstract void initView(View view, Bundle savedInstanceState);
}
