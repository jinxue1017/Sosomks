package com.ssmk.module.shoppingcar.order;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ApplyRefundActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.relayout_only_refund)
    RelativeLayout mRelayoutOnlyRefund;
    @BindView(R.id.relayout_sales_refund)
    RelativeLayout mRelayoutSalesRefund;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.apply_refund);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mTopIvBack.setOnClickListener(this);
        mRelayoutOnlyRefund.setOnClickListener(this);
        mRelayoutSalesRefund.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_apply_refund;
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
            case R.id.relayout_only_refund:
                Intent intent = new Intent(ApplyRefundActivity.this, OnlyRefundActivity.class);
                startActivity(intent);
                break;
            case R.id.relayout_sales_refund:
                Intent intent2 = new Intent(ApplyRefundActivity.this, SalesReturnActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
