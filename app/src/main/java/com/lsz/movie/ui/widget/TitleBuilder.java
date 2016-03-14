package com.lsz.movie.ui.widget;

import android.app.Activity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.lsz.movie.R;

public class TitleBuilder {

    private View mViewTitle;

    public TitleBuilder(View view) {
        mViewTitle = view;
    }

    public TitleBuilder(Activity activity) {
        mViewTitle = activity.findViewById(R.id.title_bar);
    }

    public void setTab(RadioGroup.OnCheckedChangeListener listener, String... tabText) {
        RadioGroup group = (RadioGroup) mViewTitle.findViewById(R.id.group_title);
        group.setVisibility(View.VISIBLE);
        group.setOnCheckedChangeListener(listener);

        for (int i = 0; i < tabText.length; i++) {
            RadioButton radioButton = (RadioButton) group.getChildAt(i);
            radioButton.setVisibility(View.VISIBLE);
            radioButton.setText(tabText[i]);
        }
    }

}
