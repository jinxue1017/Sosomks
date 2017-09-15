package com.ssmk.module.shoppingcar.order;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.shoppingcar.adapter.WaitSendAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WaitSendActivity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.committeddetails_recycler)
    RecyclerView mOrderdetailsRecycler;
    @BindView(R.id.committeddetails_cheak_logistics)
    Button mCommitteddetailsCheakLogistics;
    @BindView(R.id.committeddetails_refund)
    Button mCommitteddetailsRefund;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.order_details);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mOrderdetailsRecycler.setLayoutManager(new LinearLayoutManager(this));
        WaitSendAdapter adapter = new WaitSendAdapter();
        mOrderdetailsRecycler.setAdapter(adapter);
        mTopIvBack.setOnClickListener(this);
        mCommitteddetailsCheakLogistics.setOnClickListener(this);
        mCommitteddetailsRefund.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_wait_send;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.committeddetails_cheak_logistics:
                Intent intent = new Intent(WaitSendActivity.this, LogisticsDetailsActivity.class);
                startActivity(intent);
                break;
            case R.id.committeddetails_refund:
                Intent intent2 = new Intent(WaitSendActivity.this, ApplyRefundActivity.class);
                startActivity(intent2);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
