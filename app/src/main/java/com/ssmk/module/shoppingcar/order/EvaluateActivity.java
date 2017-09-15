package com.ssmk.module.shoppingcar.order;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;

import butterknife.BindView;

public class EvaluateActivity extends MVPBaseActivity implements View.OnClickListener {
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.evaluate);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mTopIvBack.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_evaluate;
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
        }
    }
}
