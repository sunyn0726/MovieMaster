package com.lsz.movie.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

public class FragmentTabUtils implements RadioGroup.OnCheckedChangeListener {

    private FragmentManager mManager;
    private List<Fragment> mFragments;
    private int mContainerId;
    private OnTabCheckListener mListener;

    public interface OnTabCheckListener {

        void onCheck(RadioGroup group, int checkedId, int position);
    }

    public FragmentTabUtils(FragmentManager manager, RadioGroup groupTab, List<Fragment>
            fragments, int container, OnTabCheckListener listener) {
        mManager = manager;
        mFragments = fragments;
        mContainerId = container;
        mListener = listener;

        groupTab.setOnCheckedChangeListener(this);
        ((RadioButton) groupTab.getChildAt(0)).setChecked(true);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        for (int i = 0; i < group.getChildCount(); i++) {
            Fragment fragment = mFragments.get(i);
            if (group.getChildAt(i).getId() == checkedId) {
                // 防止重复点击按钮多次添加
                if (!fragment.isAdded()) {
                    mManager.beginTransaction().add(mContainerId, fragment).commit();
                }
                mManager.beginTransaction().show(fragment).commit();

                if (mListener != null) {
                    mListener.onCheck(group, checkedId, i);
                }
            } else {
                mManager.beginTransaction().hide(fragment).commit();
            }
        }
    }

}
