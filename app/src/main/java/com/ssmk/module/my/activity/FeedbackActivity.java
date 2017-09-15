package com.ssmk.module.my.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;
import butterknife.OnClick;


public class FeedbackActivity extends MVPBaseActivity {


    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.tv_feedback)
    TextView tvFeedback;

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
       /* Resources res = this.getResources();
        String title = res.getString(R.string.we);*/
        mTopTvTitle.setText("意见反馈");
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_feedback;
    }

    @Override
    public void UpData(Object o) {

    }

}
