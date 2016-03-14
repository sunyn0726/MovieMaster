package com.lsz.movie.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.lsz.movie.BaseActivity;
import com.lsz.movie.R;
import com.lsz.movie.ui.fragment.BoardMarketFragment;
import com.lsz.movie.ui.fragment.CinemaFragment;
import com.lsz.movie.ui.fragment.LibraryFragment;
import com.lsz.movie.ui.fragment.TicketFragment;
import com.lsz.movie.util.FragmentTabUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HomeActivity extends BaseActivity {

    @Bind(R.id.group_tab)
    RadioGroup mGroupTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        initTab();
    }

    private void initTab() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(TicketFragment.newInstance());
        fragments.add(BoardMarketFragment.newInstance());
        fragments.add(CinemaFragment.newInstance());
        fragments.add(LibraryFragment.newInstance());

        new FragmentTabUtils(getSupportFragmentManager(), mGroupTab, fragments, R.id.container,
                null);
    }
}
