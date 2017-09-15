package com.ssmk.module.my;


import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.base.MVPBaseFragment;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.login.Login_main_Activity;
import com.ssmk.module.my.activity.AboutMeActivity;
import com.ssmk.module.my.activity.MyCollectActivity;
import com.ssmk.module.my.activity.PersonMessageActivity;
import com.ssmk.module.my.activity.SettingActivity;
import com.ssmk.module.shoppingcar.AddressActivity;
import com.ssmk.module.shoppingcar.order.AllOrderActivity;
import com.ssmk.utlis.EventBusMessage;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;
import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Context.MODE_PRIVATE;


/**
 * MVPPlugin
 * 邮箱 784787081@qq.com
 */

public class MypageFragment extends MVPBaseFragment {
    @BindView(R.id.autolayout_aboutwe)
    AutoRelativeLayout autolayout_aboutwe;
    @BindView(R.id.autolayout_newaddress)
    AutoRelativeLayout autolayout_addess;
    @BindView(R.id.autola_setting)
    AutoRelativeLayout autola_seeting;
    @BindView(R.id.img_lingdang)
    ImageView mImgLingdang;

    @BindView(R.id.autulayout)
    AutoRelativeLayout mAutulayout;
    @BindView(R.id.img_qbu)
    ImageView mImgQbu;
    @BindView(R.id.img_daifahuo)
    ImageView mImgDaifahuo;
    @BindView(R.id.img_daishouhuo)
    ImageView mImgDaishouhuo;
    @BindView(R.id.img_pingjia)
    ImageView mImgPingjia;
    @BindView(R.id.img_shouhou)
    ImageView mImgShouhou;
    @BindView(R.id.img_shoucang)
    ImageView mImgShoucang;
    @BindView(R.id.img_dizhi)
    ImageView mImgDizhi;
    @BindView(R.id.img_setting)
    ImageView mImgSetting;
    @BindView(R.id.img_my)
    ImageView mImgMy;
    @BindView(R.id.img_fenxiang)
    ImageView mImgFenxiang;
    @BindView(R.id.img_dafen)
    ImageView mImgDafen;
    @BindView(R.id.autolayout_mycollect)
    AutoRelativeLayout autolayoutMycollect;
    @BindView(R.id.ar_quanbu)
    AutoRelativeLayout arQuanbu;
    @BindView(R.id.ar_daifahuo)
    AutoRelativeLayout arDaifahuo;
    @BindView(R.id.ar_daishouahuo)
    AutoRelativeLayout arDaishouahuo;
    @BindView(R.id.ar_daipingjia)
    AutoRelativeLayout arDaipingjia;
    @BindView(R.id.ar_shouhou)
    AutoRelativeLayout arShouhou;
    Unbinder unbinder;
    @BindView(R.id.but_login)
    Button butLogin;
    @BindView(R.id.circimg)
    CircleImageView circimg;
    @BindView(R.id.t1)
    TextView t1;
    @BindView(R.id.t2)
    TextView t2;
    @BindView(R.id.t3)
    TextView t3;
    @BindView(R.id.t4)
    TextView t4;
    @BindView(R.id.t5)
    TextView t5;
    @BindView(R.id.tv_shoucang)
    TextView tvShoucang;
    @BindView(R.id.tv_dizhi)
    TextView tvDizhi;
    @BindView(R.id.tv_setting)
    TextView tvSetting;
    @BindView(R.id.tv_our)
    TextView tvOur;
    @BindView(R.id.tv_share)
    TextView tvShare;
    @BindView(R.id.tv_pingjia)
    TextView tvPingjia;
    Unbinder unbinder1;
    private SharedPreferences personInfo;

    @OnClick({R.id.img_lingdang, R.id.circimg, R.id.autulayout, R.id.autola_setting, R.id.but_login
            , R.id.autolayout_aboutwe, R.id.autolayout_newaddress, R.id.autolayout_mycollect,
            R.id.ar_quanbu, R.id.ar_daifahuo, R.id.ar_daishouahuo, R.id.ar_daipingjia, R.id.ar_shouhou})
    public void onClick(View view) {
        switch (view.getId()) {
            //个人信息
            case R.id.img_lingdang:
                startActivity(new Intent(getActivity(), PersonMessageActivity.class));
                break;
            case R.id.circimg:
                startActivity(new Intent(getActivity(), PersonMessageActivity.class));
                break;
            //全部
            case R.id.ar_quanbu:
                startActivity(new Intent(getActivity(), AllOrderActivity.class));
                break;
            //待发货
            case R.id.ar_daifahuo:
                startActivity(new Intent(getActivity(), AllOrderActivity.class));
                break;
            //待收货
            case R.id.ar_daishouahuo:
                startActivity(new Intent(getActivity(), AllOrderActivity.class));
                break;
            //待评价
            case R.id.ar_daipingjia:
                startActivity(new Intent(getActivity(), AllOrderActivity.class));
                break;
            //售后
            case R.id.ar_shouhou:
                startActivity(new Intent(getActivity(), AllOrderActivity.class));
                break;
            //登录注册
            case R.id.but_login:
                Intent intent = new Intent(getActivity(), Login_main_Activity.class);
                //startActivityForResult(intent, 1);
                startActivity(intent);
                break;
            //我的收藏
            case R.id.autolayout_mycollect:
                startActivity(new Intent(getActivity(), MyCollectActivity.class));
                break;
            //设置
            case R.id.autola_setting:
                startActivity(new Intent(getActivity(), SettingActivity.class));
                break;
            //关于我们
            case R.id.autolayout_aboutwe:
                startActivity(new Intent(getActivity(), AboutMeActivity.class));
                break;
            //收货地址
            case R.id.autolayout_newaddress:
                startActivity(new Intent(getActivity(), AddressActivity.class));
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            circimg.setVisibility(View.VISIBLE);
            butLogin.setVisibility(View.GONE);
            String iconurl = data.getStringExtra("iconurl");
            Glide.with(getActivity()).load(iconurl).into(circimg);
        }
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected void initView() {
        getState();
        setTextWay();
    }

    private void setTextWay() {
        FontHelper.applyFont(getActivity(), t1, 1);
        FontHelper.applyFont(getActivity(), t2, 1);
        FontHelper.applyFont(getActivity(), t3, 1);
        FontHelper.applyFont(getActivity(), t4, 1);
        FontHelper.applyFont(getActivity(), t5, 1);
        FontHelper.applyFont(getActivity(), tvShoucang, 5);
        FontHelper.applyFont(getActivity(), tvDizhi, 5);
        FontHelper.applyFont(getActivity(), tvSetting, 5);
        FontHelper.applyFont(getActivity(), tvShare, 5);
        FontHelper.applyFont(getActivity(), tvOur, 5);
        FontHelper.applyFont(getActivity(), tvPingjia, 5);
        FontHelper.applyFont(getActivity(), butLogin, 1);
    }

    public void getState() {
        personInfo = getActivity().getSharedPreferences("personInfo", MODE_PRIVATE);
        boolean loginState = personInfo.getBoolean("loginState", false);
        String iconurl = personInfo.getString("iconurl", null);
        if (loginState) {
            circimg.setVisibility(View.VISIBLE);
            butLogin.setVisibility(View.GONE);
            if (iconurl==null){
                circimg.setImageResource(R.mipmap.ic_launcher);
            }else {
                Glide.with(getActivity()).load(iconurl).into(circimg);
            }
        } else {
            circimg.setVisibility(View.GONE);
            butLogin.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        getState();
    }

    @Override
    protected int layoutRes() {
        return R.layout.fragment_my_page;
    }


    @Override
    public void UpData(Object o) {

    }

   /* @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void getPersonInfo(String iconurl) {
        circimg.setVisibility(View.VISIBLE);
        butLogin.setVisibility(View.GONE);
        Glide.with(getActivity()).load(iconurl).into(circimg);
    }*/

    @Override
    public void MyEventData(EventBusMessage t) {
        super.MyEventData(t);
        String message = (String) t.getMessage();
        circimg.setVisibility(View.VISIBLE);
        butLogin.setVisibility(View.GONE);
        Glide.with(getActivity()).load(message).into(circimg);
    }

}
