package com.ssmk.module.my.activity;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;

public class SiteActivity extends MVPBaseActivity {
    @BindView(R.id.recyclerview_dizhi)
    RecyclerView mRecyclerviewDizhi;
    @BindView(R.id.but_xinzheng)
    Button mButXinzheng;
    @BindView(R.id.autulayout_shdizhi)
    AutoRelativeLayout mAutulayoutShdizhi;

    @OnClick({R.id.recyclerview_dizhi, R.id.but_xinzheng})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.recyclerview_dizhi:
                break;
            case R.id.but_xinzheng:
                startActivity(new Intent(this, NewaddressActivity.class));


                break;
        }
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initview() {

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_site;
    }
}
