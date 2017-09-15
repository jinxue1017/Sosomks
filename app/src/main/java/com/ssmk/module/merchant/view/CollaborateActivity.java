package com.ssmk.module.merchant.view;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

import butterknife.BindView;
import butterknife.OnClick;

import static com.umeng.socialize.utils.DeviceConfig.context;

/**
 * Created by ASUS on 2017/7/10.
 */

public class CollaborateActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.join_comit)
    Button joinComit;
    @BindView(R.id.title_iv_back)
    ImageView titleIvBack;
    @BindView(R.id.title_name)
    TextView titleName;
    @BindView(R.id.title_iv_help)
    ImageView titleIvHelp;
    @BindView(R.id.editText2)
    EditText editText2;

    private PopupWindow popWin;

    @Override
    protected void initview() {
        titleName.setText("我要合作");
        titleIvHelp.setImageResource(R.drawable.fenxiang);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.merchant_join;
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
                View popview = LayoutInflater.from(this).inflate(R.layout.fenxiang_popwindow, null);
                popWin = new PopupWindow(popview, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                //设置点击空白处消失
                popWin.setTouchable(true);
                popWin.setOutsideTouchable(true);
                popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                // 设置背景颜色变暗
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 0.7f;
                getWindow().setAttributes(lp);
                popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getWindow().getAttributes();
                        lp.alpha = 1f;
                        getWindow().setAttributes(lp);
                    }
                });
                popWin.showAtLocation(joinComit, Gravity.BOTTOM, 0, 0);
                RadioButton pengyouquan = (RadioButton) popview.findViewById(R.id.pop_pengyouquan);
                RadioButton weixin = (RadioButton) popview.findViewById(R.id.pop_weixin);
                RadioButton weibo = (RadioButton) popview.findViewById(R.id.pop_weibo);
                RadioButton qq = (RadioButton) popview.findViewById(R.id.pop_qq);
                RadioButton kongjian = (RadioButton) popview.findViewById(R.id.pop_kongjian);
                TextView quxiao = (TextView) popview.findViewById(R.id.pop_quxiao);
                pengyouquan.setOnClickListener(this);
                weixin.setOnClickListener(this);
                weibo.setOnClickListener(this);
                qq.setOnClickListener(this);
                kongjian.setOnClickListener(this);
                quxiao.setOnClickListener(this);
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pop_pengyouquan:
                new ShareAction(CollaborateActivity.this).setPlatform(SHARE_MEDIA.WEIXIN)
                        .withText("hello")
                        .setCallback(umShareListener)
                        .share();
                break;
            case R.id.pop_weixin:
                showfenxiang(SHARE_MEDIA.WEIXIN);
                break;
            case R.id.pop_weibo:
                showfenxiang(SHARE_MEDIA.SINA);
                break;
            case R.id.pop_qq:
                UMImage image = new UMImage(context, "http://imgqn.koudaitong.com/upload_files/2015/06/02/Fi3n5MNwbQ8BkYJV1pNSM7dCARsM.jpg%21580x580.jpg");
                new ShareAction(this)
                        .setPlatform(SHARE_MEDIA.QQ)
                        .setCallback(umShareListener)
                        .withText("hello world!").withMedia(image).share();
                break;
            case R.id.pop_kongjian:
                showfenxiang(SHARE_MEDIA.QZONE);
                break;
            case R.id.pop_quxiao:
                popWin.dismiss();
                break;
        }
    }

    public void showfenxiang(SHARE_MEDIA qq) {
        new ShareAction(this)
                .setPlatform(qq)
                .setCallback(umShareListener)
                .withText("hello world!").share();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

    }

    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onStart(SHARE_MEDIA platform) {
            //分享开始的回调
        }

        @Override
        public void onResult(SHARE_MEDIA platform) {
            Log.d("plat", "platform" + platform);

            Toast.makeText(CollaborateActivity.this, platform + " 分享成功啦", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(CollaborateActivity.this, platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if (t != null) {
                Log.d("throw", "throw:" + t.getMessage());
            }
        }

        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(CollaborateActivity.this, platform + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };
}
