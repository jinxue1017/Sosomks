package com.ssmk.module.home.view;


import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;

import butterknife.BindView;

public class Home_Help_activity extends MVPBaseActivity {

    @BindView(R.id.help_toolbar)
    Toolbar mHelpToolbar;
    @BindView(R.id.help_tv_location)
    TextView mHelpTvLocation;
    @BindView(R.id.help_tv_mid)
    TextView mHelpTvMid;

    @Override
    protected void initview() {

        FontHelper.applyFont(this, mHelpTvLocation, FontHelper.WRYHL);
        FontHelper.applyFont(this,mHelpTvMid,FontHelper.WRYHL);
        mHelpToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_home__help;
    }

    @Override
    public void UpData(Object o) {

    }

}
