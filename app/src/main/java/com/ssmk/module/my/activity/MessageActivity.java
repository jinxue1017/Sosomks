package com.ssmk.module.my.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class MessageActivity extends MVPBaseActivity {

    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;

    @OnClick({R.id.top_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
        }
    }


    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.we);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_queue;
    }

    @Override
    public void UpData(Object o) {

    }
}
