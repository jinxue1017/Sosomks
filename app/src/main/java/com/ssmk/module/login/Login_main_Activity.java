package com.ssmk.module.login;

import android.content.Intent;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.example.retrofitlibrary.BaseObserBean;
import com.example.retrofitlibrary.BaseResponse;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.base.BaseSwipeBackActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.shoppingcar.module.MessageEvent;
import com.ssmk.url.Url;
import com.ssmk.utlis.EventBusMessage;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.bean.SHARE_MEDIA;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;


public class Login_main_Activity extends BaseSwipeBackActivity implements View.OnClickListener{

    @BindView(R.id.img_phonenumber)
    ImageView imgPhonenumber;
    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.img_password)
    ImageView imgPassword;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.find_password)
    TextView findPassword;
    @BindView(R.id.img_show)
    ImageView imgShow;
    @BindView(R.id.img_hidden)
    ImageView imgHidden;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;
    @BindView(R.id.tv_disanfang)
    TextView tvDisanfang;
    @BindView(R.id.img_qq)
    ImageView imgQq;
    @BindView(R.id.login_qq)
    RelativeLayout loginQq;
    @BindView(R.id.img_weixin)
    ImageView imgWeixin;
    @BindView(R.id.login_weixin)
    RelativeLayout loginWeixin;
    private UMShareConfig config;
    private UMShareAPI mShareAPI;
    private Boolean flag = true;;
    private SPUtils spUtils;

    @Override
    protected void initview() {
        config = new UMShareConfig();
        config.isNeedAuthOnGetUserInfo(true);
        config.isOpenShareEditActivity(true);
        config.setSinaAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setFacebookAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setShareToLinkedInFriendScope(UMShareConfig.LINKED_IN_FRIEND_SCOPE_ANYONE);

        mShareAPI = UMShareAPI.get(this);
        mShareAPI.setShareConfig(config);

        spUtils = new SPUtils("personInfo");

        FontHelper.applyFont(this,inputPhone,1);
        FontHelper.applyFont(this,inputPassword,1);
        FontHelper.applyFont(this,btnLogin,5);
        FontHelper.applyFont(this,btnRegister,1);
        FontHelper.applyFont(this,tvDisanfang,1);


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        mShareAPI.onActivityResult(requestCode,resultCode,data);
    }
    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.login_main;
    }

    @Override
    public void UpData(Object o) {

    }


    public void submit(){
        String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();

        if (!RegexUtils.isMobileSimple(phone)){
            Toast.makeText(this,"请输入正确的手机号",Toast.LENGTH_LONG).show();
            return;
        }else if (StringUtils.length(password)<6 && StringUtils.length(password)>16){
            Toast.makeText(this,"请输入6到16位的密码",Toast.LENGTH_LONG).show();
            return;
        }
        if (phone==null || "".equals(phone)){
            Toast.makeText(this,"请输入手机号",Toast.LENGTH_LONG).show();
            return;
        }
        else if (password==null || "".equals(password)){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
            return;
        }else {
            HashMap<String, String> map = new HashMap<>();
            map.put("phoneNumber",phone);
            map.put("password",password);
            //RetrofitClientUtlis.getInstance(this,Url.BASEURL).createBaseApi().post(Url.LOGIN, map,new BaseObserver(this));
            RetrofitClientUtlis.getInstance(this,Url.BASEURL).createBaseApi().post(Url.LOGIN, map, new BaseObserBean<BaseResponse>(this) {
                @Override
                public void onNext(@NonNull BaseResponse responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code==200){
                        Toast.makeText(Login_main_Activity.this,"登录成功",Toast.LENGTH_LONG).show();
                        spUtils.put("token",responseBeanBaseResponse.getToken());
                        spUtils.put("loginState",true);
                        Log.d("00000000000", "onNext: "+responseBeanBaseResponse.getToken());
                        //获取用户信息
                        //...

                        finish();
                    } else if (code==201){
                        Toast.makeText(Login_main_Activity.this,"登录异常",Toast.LENGTH_LONG).show();
                    } else if (code==202){
                        Toast.makeText(Login_main_Activity.this,"手机号不正确",Toast.LENGTH_LONG).show();
                    } else if (code==203){
                        Toast.makeText(Login_main_Activity.this,"密码不正确",Toast.LENGTH_LONG).show();
                    } else if (code==204){
                        Toast.makeText(Login_main_Activity.this,"手机号与密码不正确",Toast.LENGTH_LONG).show();
                    } else if (code==205){
                        Toast.makeText(Login_main_Activity.this,"手机号或密码不存在",Toast.LENGTH_LONG).show();
                    }
                }
            });

        }
    }

    public void testSubmit(){
        String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();


        if (phone==null || "".equals(phone)){
            Toast.makeText(this,"请输入手机号",Toast.LENGTH_LONG).show();
            return;
        }
        else if (password==null || "".equals(password)){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
            return;
        }else {
            HashMap<String, String> map = new HashMap<>();
            map.put("phoneNumber",phone);
            map.put("password",password);
            //RetrofitClientUtlis.getInstance(this,Url.BASEURL).createBaseApi().post(Url.LOGIN, map,new BaseObserver(this));
            RetrofitClientUtlis.getInstance(this,Url.BASEURL).createBaseApi().post(Url.LOGIN, map, new BaseObserBean<BaseResponse>(this) {
                @Override
                public void onNext(@NonNull BaseResponse responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code==200){
                        Toast.makeText(Login_main_Activity.this,"登录成功",Toast.LENGTH_LONG).show();
                        spUtils.put("token",responseBeanBaseResponse.getToken());
                        spUtils.put("loginState",true);
                        Log.d("00000000000", "onNext: "+responseBeanBaseResponse.getToken());
                        //获取用户信息
                        //...
                        EventBus.getDefault().post(new MessageEvent(1));
                        finish();
                    } else if (code==201){
                        Toast.makeText(Login_main_Activity.this,"登录异常",Toast.LENGTH_LONG).show();
                    } else if (code==202){
                        Toast.makeText(Login_main_Activity.this,"手机号不正确",Toast.LENGTH_LONG).show();
                    } else if (code==203){
                        Toast.makeText(Login_main_Activity.this,"密码不正确",Toast.LENGTH_LONG).show();
                    } else if (code==204){
                        Toast.makeText(Login_main_Activity.this,"手机号与密码不正确",Toast.LENGTH_LONG).show();
                    } else if (code==205){
                        Toast.makeText(Login_main_Activity.this,"手机号或密码不存在",Toast.LENGTH_LONG).show();
                    }
                }
            });

        }
    }








    @OnClick({R.id.btn_login,R.id.btn_register,R.id.login_qq,R.id.login_weixin,R.id.find_password,R.id.img_show,R.id.img_hidden})
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login:
//                submit();
                testSubmit();///测试
                break;
            case R.id.btn_register:
                startActivity(new Intent(this,Register_main_Activity.class));
                break;
            case R.id.find_password:
                startActivity(new Intent(this,FinishPhoneActivity.class));
                break;
            //第三方登录
            case R.id.login_qq:
//                if(mShareAPI!=null){
//                    mShareAPI.deleteOauth(Login_main_Activity.this, SHARE_MEDIA.QQ, new UMAuthListener() {
//                        @Override
//                        public void onStart(SHARE_MEDIA share_media) {
//
//                        }
//
//                        @Override
//                        public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
//
//                        }
//
//                        @Override
//                        public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {
//
//                        }
//
//                        @Override
//                        public void onCancel(SHARE_MEDIA share_media, int i) {
//
//                        }
//                    });
//                }
                mShareAPI.getPlatformInfo(Login_main_Activity.this, SHARE_MEDIA.QQ, authListener);
                break;
            case R.id.login_weixin:
                mShareAPI.getPlatformInfo(Login_main_Activity.this, SHARE_MEDIA.WEIXIN, authListener);
                break;
            case R.id.img_show:
                showPassword();
                break;
            case R.id.img_hidden:
                showPassword();
                break;
        }
    }

    private void showPassword() {
        if(flag){
            //选择状态 显示明文--设置为可见的密码
            inputPassword.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            imgShow.setVisibility(View.GONE);
            imgHidden.setVisibility(View.VISIBLE);
            flag=false;
        }else {
            //默认状态显示密码--设置文本 要一起写才能起作用 InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD
            inputPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            imgShow.setVisibility(View.VISIBLE);
            imgHidden.setVisibility(View.GONE);
            flag=true;
        }
    }


    UMAuthListener authListener = new UMAuthListener() {
        /**
         * @desc 授权开始的回调
         * @param platform 平台名称
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }
        /**
         * @desc 授权成功的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param data 用户资料返回
         */
        @Override
        public void onComplete(SHARE_MEDIA platform, int action, Map<String, String> data) {
            if (action==UMAuthListener.ACTION_GET_PROFILE){
            spUtils.put("name",data.get("name"));
            spUtils.put("iconurl",data.get("iconurl"));
            spUtils.put("gender",data.get("gender"));
            spUtils.put("loginState",true);
            // 设置结果，并进行传送
            EventBus.getDefault().post(new EventBusMessage(data.get("iconurl")));
            /*Toast.makeText(Login_main_Activity.this, "成功了", Toast.LENGTH_LONG).show();
            Set<String> set = data.keySet();
            for (String string : set) {
                Log.i("msg", "============================Map=========================");
                Log.i("msg", string + "::::" + data.get(string));
                String str = data.get(string);
                // 设置头像
                if (string.equals("profile_image_url")) {
                    *//*ImageLoader.getInstance().displayImage(str,
                            menu_headicon, options);
                    ImageLoader.getInstance().displayImage(str,
                            headicon, options);*//*
                }
                // 设置昵称
                if (string.equals("screen_name")) {
                    //menu_name.setText(str);
                }*/
                finish();}

        }

        /**
         * @desc 授权失败的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {

            Toast.makeText(Login_main_Activity.this, "登录失败:" + t.getMessage(),Toast.LENGTH_LONG).show();
        }

        /**
         * @desc 授权取消的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         */
        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(Login_main_Activity.this, "取消登录", Toast.LENGTH_LONG).show();
        }
    };



}
