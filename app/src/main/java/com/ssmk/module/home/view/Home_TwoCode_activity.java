package com.ssmk.module.home.view;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.uuzuche.lib_zxing.activity.CaptureFragment;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**首页二维码扫描
 * Created by chengqianlang on 2017/7/10.
 */

public class Home_TwoCode_activity extends MVPBaseActivity {
    @BindView(R.id.twocode_toolbar)
    Toolbar mTwocodeToolbar;
    @BindView(R.id.twocode_light)
    ImageView mTwocodeLight;
    @BindView(R.id.twocode_pic)
    ImageView mTwocodePic;
    private CaptureFragment captureFragment;
    //手电筒开关
    public static boolean isOpen = false;

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initview() {
        //toolbar返回键监听
        mTwocodeToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        captureFragment = new CaptureFragment();
        // 为二维码扫描界面设置定制化界面
        CodeUtils.setFragmentArgs(captureFragment, R.layout.my_camera);
        captureFragment.setAnalyzeCallback(analyzeCallback);
        getSupportFragmentManager().beginTransaction().replace(R.id.twocode_fra, captureFragment).commit();
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_home_twocode;
    }


    /**
     * 二维码解析回调函数
     */
    CodeUtils.AnalyzeCallback analyzeCallback = new CodeUtils.AnalyzeCallback() {
        @Override
        public void onAnalyzeSuccess(Bitmap mBitmap, String result) {
            Log.e("aaa",result);
            Toast.makeText(Home_TwoCode_activity.this,"扫描成功",Toast.LENGTH_SHORT).show();
            finish();
        }

        @Override
        public void onAnalyzeFailed() {
           Toast.makeText(Home_TwoCode_activity.this,"扫描失败",Toast.LENGTH_SHORT).show();
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.twocode_light, R.id.twocode_pic})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.twocode_light:
                if (!isOpen) {
                    CodeUtils.isLightEnable(true);
                    isOpen = true;
                } else {
                    CodeUtils.isLightEnable(false);
                    isOpen = false;
                }
                break;
            case R.id.twocode_pic:
                break;
        }
    }
}
