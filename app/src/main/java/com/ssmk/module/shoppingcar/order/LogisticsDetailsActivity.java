package com.ssmk.module.shoppingcar.order;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.shoppingcar.adapter.LogisticsDetailsAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LogisticsDetailsActivity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.logistics_recycler)
    RecyclerView mLogisticsRecycler;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.logistics_details);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mTopIvBack.setOnClickListener(this);
        mLogisticsRecycler.setLayoutManager(new LinearLayoutManager(this));
        LogisticsDetailsAdapter adapter = new LogisticsDetailsAdapter();
        mLogisticsRecycler.setAdapter(adapter);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_logistics_details;
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
        switch (v.getId()){
            case R.id.top_iv_back:
                finish();
                break;
        }
    }
}
