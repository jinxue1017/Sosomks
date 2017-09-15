package com.ssmk.module.my.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class AboutMeActivity extends MVPBaseActivity {
    @BindView(R.id.img_logo)
    ImageView mImgLogo;
    @BindView(R.id.tv_name_gs)
    TextView mTvNameGs;
    @BindView(R.id.tv_address_http)
    TextView mTvAddressHttp;
    @BindView(R.id.tv_about_shengji)
    TextView mTvAboutShengji;
    @BindView(R.id.autula_about_new)
    AutoRelativeLayout mAutulaAboutNew;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.bangzhu)
    TextView bangzhu;
    @BindView(R.id.back)
    TextView back;
    @BindView(R.id.ar_feedback)
    AutoRelativeLayout arFeedback;

    @OnClick({R.id.img_logo, R.id.autula_about_new, R.id.top_iv_back,R.id.ar_feedback})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_logo:
                startActivity(new Intent(this, MessageActivity.class));
                break;
            case R.id.autula_about_new:
                dialogdata();
                break;
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.ar_feedback:
                startActivity(new Intent(this, FeedbackActivity.class));
                break;
        }
    }

    //dialog显示更新
    private void dialogdata() {
        //点击button跳转页面显示一个dialog，定义他的格式
        final Dialog dialog = new Dialog(this, R.style.Theme_Light_Dialog);
        //显示dialog
        dialog.show();
//                实例化view并指定布局
        LayoutInflater inflater = LayoutInflater.from(this);
        View viewDialog = inflater.inflate(R.layout.adapter_list_dialog, null);
        //           根据view找控件
        Button dialogbut = (Button) viewDialog.findViewById(R.id.but_dialog_gengxin);
        dialogbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        //定义dialog的宽高
        Display display = this.getWindowManager().getDefaultDisplay();
        int width = display.getWidth();
        int height = display.getHeight();
//设置dialog的宽高为屏幕的宽高
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(width, height);
        dialog.setContentView(viewDialog, layoutParams);
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initview() {
        mTopTvTitle.setText("关于我们");

        FontHelper.applyFont(this, mTopTvTitle, 5);
        FontHelper.applyFont(this, mTvNameGs, 5);
        FontHelper.applyFont(this, mTvAddressHttp, 5);
        FontHelper.applyFont(this, bangzhu, 5);
        FontHelper.applyFont(this, mTvAboutShengji, 5);
        FontHelper.applyFont(this, back, 5);

    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_about_me;
    }


}
