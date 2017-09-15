package com.ssmk.home;


import android.content.Intent;
import android.os.Handler;
import android.support.annotation.IdRes;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.ShowDialog;
import com.ssmk.module.home.view.Home_fragment;
import com.ssmk.module.merchant.view.MerChantFragment;
import com.ssmk.module.my.MypageFragment;
import com.ssmk.module.shoppingcar.ShoppingCarFragment;

import butterknife.BindView;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class HomeActivity<T> extends MVPBaseActivity<T> {

    @BindView(R.id.intofra_fral)
    FrameLayout mIntofraFral;
    @BindView(R.id.home_rb_home)
    RadioButton mHomeRbHome;
    @BindView(R.id.home_rb_pinpai)
    RadioButton mHomeRbPinpai;
    @BindView(R.id.home_rb_shoppingcar)
    RadioButton mHomeRbShoppingcar;
    @BindView(R.id.home_rb_my)
    RadioButton mHomeRbMy;
    @BindView(R.id.home_rg_bottom)
    RadioGroup mHomeRgBottom;
    private boolean canExist = false;
    private Handler handler = new Handler();

    @Override
    protected void initview() {
        //初始化视图，加载首页fragment
        replaceFra(R.id.intofra_fral, new Home_fragment(), "home");
        ShowDialog.showLocdialog(this, "是否使用当前位置");
        ShowDialog.showLocdialog(this, "是否打开NFC");

    }

    @Override
    protected void initdata() {
        mHomeRgBottom.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                switch (checkedId) {
                    case R.id.home_rb_home:
                        replaceFra(R.id.intofra_fral, new Home_fragment(), "home");
                        break;
                    case R.id.home_rb_pinpai:
                        replaceFra(R.id.intofra_fral, new MerChantFragment(), "pinpai");
                        break;
                    case R.id.home_rb_shoppingcar:
                        replaceFra(R.id.intofra_fral, new ShoppingCarFragment(), "shoppingcar");
                        break;
                    case R.id.home_rb_my:
                        replaceFra(R.id.intofra_fral, new MypageFragment(), "my");
                        break;
                }
            }
        });
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }


    @Override
    public void UpData(T o) {

    }


    /**
     * 退出程序
     */
    @Override
    public void onBackPressed() {
        if (canExist) {
            finish();
        } else {
            if (!canExist) {
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        canExist = false;
                    }
                }, 2000);
            }
            canExist = true;
            Toast.makeText(this, "再点击一次退出程序", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        //加载购物车
        mHomeRbShoppingcar.setChecked(true);

    }

}
