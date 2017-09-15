package com.ssmk.module.my.activity;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.StringUtils;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.login.ChangePasswordActivity;
import com.ssmk.module.login.ChangePhoneActivity;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SettingActivity extends MVPBaseActivity {
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView mTopTvOther;
    @BindView(R.id.ar_changepass)
    AutoRelativeLayout arChangepass;
    @BindView(R.id.ar_changephone)
    AutoRelativeLayout arChangephone;
    @BindView(R.id.nfc)
    Switch nfc;
    @BindView(R.id.message)
    Switch message;
    @BindView(R.id.tv_changpass)
    TextView tvChangpass;
    @BindView(R.id.tv_changephone)
    TextView tvChangephone;
    @BindView(R.id.close_nfc)
    TextView closeNfc;
    @BindView(R.id.close_tongzhi)
    TextView closeTongzhi;

    @OnClick({R.id.top_iv_back, R.id.ar_changepass, R.id.ar_changephone})
    public void onClick(View view) {
        SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
        String token = personInfo.getString("token", null);
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.ar_changepass:
                if (!StringUtils.isEmpty(token)){
                    startActivity(new Intent(this, ChangePasswordActivity.class));
                }else {
                    Toast.makeText(this,"当前未登录",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ar_changephone:
                if (!StringUtils.isEmpty(token)){
                    startActivity(new Intent(this, ChangePhoneActivity.class));
                }else {
                    Toast.makeText(this,"当前未登录",Toast.LENGTH_SHORT).show();
                }

                break;
        }
    }

    @Override
    protected void initview() {
        mTopTvTitle.setText("设置");
        FontHelper.applyFont(this, mTopTvTitle, 5);
        FontHelper.applyFont(this, closeNfc, 5);
        FontHelper.applyFont(this, closeTongzhi, 5);
        FontHelper.applyFont(this, tvChangephone, 5);
        FontHelper.applyFont(this, tvChangpass, 5);

    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_setting;
    }

}
