package com.ssmk.module.shoppingcar.order;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OnlyRefundActivity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.btn_commit)
    Button mBtnCommit;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.apply_refund);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mTopIvBack.setOnClickListener(this);
        mBtnCommit.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_only_refund;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.btn_commit:
                Intent intent = new Intent(OnlyRefundActivity.this, RefundActivity.class);
                startActivity(intent);
                break;
        }
    }
}
