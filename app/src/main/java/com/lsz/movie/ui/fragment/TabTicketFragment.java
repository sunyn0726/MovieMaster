package com.lsz.movie.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.lsz.movie.BaseFragment;
import com.lsz.movie.R;
import com.lsz.movie.ui.adapter.BasePagerAdapter;
import com.lsz.movie.ui.widget.TitleBuilder;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class TabTicketFragment extends BaseFragment {

    private static final String TAG = "TabTicketFragment";
    @Bind(R.id.pager_ticket)
    ViewPager mPagerTicket;
    @Bind(R.id.group_title)
    RadioGroup mGroupTitle;

    public static TabTicketFragment newInstance() {
        Bundle args = new Bundle();
        TabTicketFragment fragment = new TabTicketFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_ticket, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        initTitle(view);
        initPager();
    }

    private void initPager() {
        final List<Fragment> fragments = new ArrayList<>();
        fragments.add(TicketAnalyseFragment.newInstance());
        fragments.add(TicketPresellFragment.newInstance());
        fragments.add(TicketNorthAmericaFragment.newInstance());

        BasePagerAdapter adapter = new BasePagerAdapter(getFragmentManager(), fragments);
        mPagerTicket.setAdapter(adapter);
        mPagerTicket.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                RadioButton radioButton = (RadioButton) mGroupTitle.getChildAt(position);
                radioButton.setChecked(true);
            }
        });
    }

    private void initTitle(View view) {
        new TitleBuilder(view).setTab(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        }, "票房分析", "预售票房", "北美票房");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
