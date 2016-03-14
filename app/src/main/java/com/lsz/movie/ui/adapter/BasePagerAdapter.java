package com.lsz.movie.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class BasePagerAdapter extends PagerAdapter {

    private List<Fragment> mFragments;
    private FragmentManager mManager;

    public BasePagerAdapter(FragmentManager manager, List<Fragment> data) {
        mManager = manager;
        mFragments = data;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment fragment = mFragments.get(position);
        if (!fragment.isAdded()) {
            mManager.beginTransaction().add(fragment, fragment.getClass().getName())
                    .commitAllowingStateLoss();
            mManager.executePendingTransactions();
        }
        View view = fragment.getView();
        if (view.getParent() == null) {
            container.addView(view);
        }
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mFragments.get(position).getView());
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
