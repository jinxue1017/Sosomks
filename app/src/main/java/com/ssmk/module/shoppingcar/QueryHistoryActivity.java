package com.ssmk.module.shoppingcar;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;

public class QueryHistoryActivity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.shop_title);
        mTopTvTitle.setText(title);
        mTopIvBack.setOnClickListener(this);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_query_history;
    }

    @Override
    public void UpData(Object o) {

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
