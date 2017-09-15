package com.ssmk.module.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.ResponseBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;
import com.example.retrofitlibrary.BaseObserBean;
import com.example.retrofitlibrary.BaseResponse;
import com.example.retrofitlibrary.RetrofitClientUtlis;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;


public class FinishPhoneActivity extends MVPBaseActivity{

    @BindView(R.id.img_phonenumber)
    ImageView imgPhonenumber;
    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.img_password)
    ImageView imgPassword;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.img_show)
    Button imgShow;
    @BindView(R.id.btn_f)
    Button btn;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    private Timer timer = new Timer();;
    int time = 90;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                imgShow.setText("重新发送 " + time + " s");
                imgShow.setEnabled(false);
            }else  if (msg.what == 2) {
                imgShow.setText("重新发送");
                imgShow.setEnabled(true);
            }
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
                    time = 90;
                    mHandler.sendEmptyMessage(2);
                }
            }
        }, 0, 1000);
        HashMap<String, String> map = new HashMap<>();
        map.put("phoneNumber",phone);
        RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.GETYZM, map, new BaseObserBean<BaseResponse>(this) {
            @Override
            public void onNext(@NonNull BaseResponse responseBeanBaseResponse) {
                int code = responseBeanBaseResponse.getCode();
                if (code == 200) {
                    Toast.makeText(FinishPhoneActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
        timer.cancel();
    }


    @OnClick({R.id.top_iv_back,R.id.img_show,R.id.btn_f})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.btn_f:
                submit();
                break;
            case R.id.img_show:
                sendpass();
                break;
        }
    }

    public void submit() {
        final String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();

        if (!RegexUtils.isMobileSimple(phone)){
            Toast.makeText(this,"请输入正确的手机号",Toast.LENGTH_LONG).show();
            return;
        }

        if (phone == null || "".equals(phone)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_LONG).show();
            return;
        }
        else if  (password == null || "".equals(password)) {
            Toast.makeText(this, "请输入验证码", Toast.LENGTH_LONG).show();
            return;
        }else {
            HashMap<String, String> map = new HashMap<>();
            map.put("phoneNumber", phone);
            map.put("verifyCode", password);
            RetrofitClientUtlis.getInstance(this,Url.BASEURL).createBaseApi().post(Url.JUDGEYZM, map, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
                @Override
                public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code==200){
                        SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
                        personInfo.edit().putString("phoneNumber",phone).commit();
                        Toast.makeText(FinishPhoneActivity.this,"手机号校验成功",Toast.LENGTH_LONG).show();
                        startActivity(new Intent(FinishPhoneActivity.this,MissPasswordActivity.class));
                    }else {
                        Toast.makeText(FinishPhoneActivity.this,"校验错误",Toast.LENGTH_LONG).show();
                    }
                }
            });



        }

        }


    @Override
    protected void initview() {
        topTvTitle.setText("验证手机号");
        FontHelper.applyFont(this,inputPhone,1);
        FontHelper.applyFont(this,inputPassword,1);
        FontHelper.applyFont(this,btn,7);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.better_login_phone;
    }

    @Override
    public void UpData(Object o) {

    }

}
