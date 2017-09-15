package com.ssmk.module.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
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
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.ResponseBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;
import com.ssmk.utlis.EventBusMessage;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.bean.SHARE_MEDIA;

import org.greenrobot.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;

public class Register_main_Activity extends MVPBaseActivity {

    @BindView(R.id.img_phonenumber)
    ImageView imgPhonenumber;
    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.img_password)
    ImageView imgPassword;
    @BindView(R.id.input_yanzhengma)
    EditText inputYanzhengma;
    @BindView(R.id.btn_getinfo)
    Button btn_getinfo;
    @BindView(R.id.img_phonenumber3)
    ImageView imgPhonenumber3;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.img_password4)
    ImageView imgPassword4;
    @BindView(R.id.input_password2)
    EditText inputPassword2;
    @BindView(R.id.button)
    Button button;
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
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    @BindView(R.id.tv_xieyi)
    TextView tvXieyi;
    @BindView(R.id.cb_xieyi)
    CheckBox cbXieyi;
    private Timer timer = new Timer();
    int time = 60;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                btn_getinfo.setText("重新发送 " + time + " s");
                btn_getinfo.setEnabled(false);
            }else  if (msg.what == 2) {
                btn_getinfo.setText("重新发送");
                btn_getinfo.setEnabled(true);
            }

        }
    };
    private UMShareConfig config;
    private SPUtils spUtils;
    private UMShareAPI mShareAPI;


    @OnClick({R.id.btn_getinfo, R.id.button, R.id.login_qq, R.id.login_weixin, R.id.top_iv_back,R.id.tv_xieyi})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_getinfo:
                time = 90;
                sendpass();
                break;
            case R.id.tv_xieyi:
                startActivity(new Intent(this,PersonXieyiActivity.class));
                break;
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.button:
                submit();
                break;
            //第三方登录
            case R.id.login_qq:
                if(mShareAPI!=null){
                    mShareAPI.deleteOauth(Register_main_Activity.this, SHARE_MEDIA.QQ, new UMAuthListener() {
                        @Override
                        public void onStart(SHARE_MEDIA share_media) {

                        }

                        @Override
                        public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {

                        }

                        @Override
                        public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

                        }

                        @Override
                        public void onCancel(SHARE_MEDIA share_media, int i) {

                        }
                    });
                }
                mShareAPI.getPlatformInfo(Register_main_Activity.this, SHARE_MEDIA.QQ, authListener);
                break;
            case R.id.login_weixin:
                break;
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
            finish();

        }

        /**
         * @desc 授权失败的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, int action, Throwable t) {

            Toast.makeText(Register_main_Activity.this, "登录失败:" + t.getMessage(),Toast.LENGTH_LONG).show();
        }

        /**
         * @desc 授权取消的回调
         * @param platform 平台名称
         * @param action 行为序号，开发者用不上
         */
        @Override
        public void onCancel(SHARE_MEDIA platform, int action) {
            Toast.makeText(Register_main_Activity.this, "取消登录", Toast.LENGTH_LONG).show();
        }
    };


    private void sendpass() {
        //发送验证之后Button的操作
        String phone = inputPhone.getText().toString();
        if (!RegexUtils.isMobileSimple(phone)) {
            Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_LONG).show();
            return;
        }
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (time > 0) {
                    mHandler.sendEmptyMessage(1);
                    time--;
                } else {
                    mHandler.sendEmptyMessage(2);
                }
            }
        }, 0, 1000);
        HashMap<String, String> map = new HashMap<>();
        map.put("phoneNumber",phone);
        RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.GETYZM, map, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
            @Override
            public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                int code = responseBeanBaseResponse.getCode();
                if (code == 200) {
                    Toast.makeText(Register_main_Activity.this, "成功"+responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(Register_main_Activity.this, "失败"+responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        timer.cancel();
    }

    @Override
    protected void initview() {
        topTvTitle.setText("新人注册");
        FontHelper.applyFont(this, inputPhone, 1);
        FontHelper.applyFont(this, inputYanzhengma, 1);
        FontHelper.applyFont(this, inputPassword, 1);
        FontHelper.applyFont(this, inputPassword2, 1);
        FontHelper.applyFont(this, button, 1);
        FontHelper.applyFont(this, cbXieyi, 1);
        FontHelper.applyFont(this, tvDisanfang, 1);

        config = new UMShareConfig();
        config.isNeedAuthOnGetUserInfo(true);
        config.isOpenShareEditActivity(true);
        config.setSinaAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setFacebookAuthType(UMShareConfig.AUTH_TYPE_SSO);
        config.setShareToLinkedInFriendScope(UMShareConfig.LINKED_IN_FRIEND_SCOPE_ANYONE);

        mShareAPI = UMShareAPI.get(this);
        mShareAPI.setShareConfig(config);

        spUtils = new SPUtils("personInfo");

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
        return R.layout.register_main;
    }

    @Override
    public void UpData(Object o) {

    }


    public void submit() {
        final String phone = inputPhone.getText().toString();
        String yanzheng = inputYanzhengma.getText().toString();
        final String password = inputPassword.getText().toString();
        String password2 = inputPassword2.getText().toString();

        if (!RegexUtils.isMobileSimple(phone)) {
            Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_LONG).show();
            return;
        } else if (StringUtils.length(password) < 6 && StringUtils.length(password) > 16) {
            Toast.makeText(this, "请输入6到16位的密码", Toast.LENGTH_LONG).show();
            return;
        }


        if (password2 == null || "".equals(password2)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_LONG).show();
            return;
        } else if (yanzheng == null || "".equals(yanzheng)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_LONG).show();
            return;
        } else if (phone == null || "".equals(phone)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_LONG).show();
            return;
        } else if (password == null || "".equals(password)) {
            Toast.makeText(this, "请输入密码", Toast.LENGTH_LONG).show();
            return;
        } else if (!password.equals(password2)) {
            Toast.makeText(this, "您两次输入的密码不一致，请重新输入", Toast.LENGTH_LONG).show();
            return;
        } else {
            HashMap<String, String> map2 = new HashMap<>();
            map2.put("phoneNumber", phone);
            map2.put("verifyCode", yanzheng);
            Log.d("000000000000000000000000000000", "submit: "+yanzheng+"xxx"+phone);
            RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.JUDGEYZM, map2, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
                @Override
                public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code == 200) {
                        HashMap<String, String> map = new HashMap<>();
                        map.put("phoneNumber", phone);
                        map.put("password", password);
                        RetrofitClientUtlis.getInstance(Register_main_Activity.this, Url.BASEURL).createBaseApi().post(Url.REGISTER, map, new BaseObserBean<BaseResponse<ResponseBean>>(Register_main_Activity.this) {
                            @Override
                            public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                                int code = responseBeanBaseResponse.getCode();
                                if (code == 200) {
                                    Toast.makeText(Register_main_Activity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                                    SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
                                    personInfo.edit().putString("token",responseBeanBaseResponse.getToken()).commit();
                                } else{
                                    Toast.makeText(Register_main_Activity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                    }else {
                        Toast.makeText(Register_main_Activity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                    }
                }
            });


        }
    }

}
