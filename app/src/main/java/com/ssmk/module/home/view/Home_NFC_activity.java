package com.ssmk.module.home.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 防伪查询页面
 */
public class Home_NFC_activity extends MVPBaseActivity {

    @BindView(R.id.nfc_tv_l1)
    TextView nfcTvL1;
    @BindView(R.id.nfc_tv_l2)
    TextView nfcTvL2;
    @BindView(R.id.nfc_tv_l3_1)
    TextView nfcTvL31;
    @BindView(R.id.nfc_tv_l3_2)
    TextView nfcTvL32;
    @BindView(R.id.nfc_tv_l3_3)
    TextView nfcTvL33;
    @BindView(R.id.nfc_tv_l4)
    TextView nfcTvL4;
    @BindView(R.id.title_iv_back)
    ImageView mTitleIvBack;
    @BindView(R.id.title_name)
    TextView mTitleName;
    @BindView(R.id.title_iv_help)
    ImageView mTitleIvHelp;

    @Override
    protected void initview() {
        FontHelper.applyFont(this, nfcTvL32, FontHelper.PFBD);
        FontHelper.applyFont(this, mTitleName, FontHelper.WRYHL);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_home__nfc;
    }

    @Override
    public void UpData(Object o) {

    }


    @OnClick({R.id.title_iv_back, R.id.title_iv_help})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_iv_back:
                finish();
                break;
            case R.id.title_iv_help:
                startActivity(new Intent(Home_NFC_activity.this, Home_Help_activity.class));
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
