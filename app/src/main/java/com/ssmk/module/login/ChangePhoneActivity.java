package com.ssmk.module.login;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.RegexUtils;
import com.example.retrofitlibrary.BaseObserBean;
import com.example.retrofitlibrary.BaseResponse;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.ResponseBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;


public class ChangePhoneActivity extends MVPBaseActivity {


    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.img_show)
    Button imgShow;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.tv_phone)
    TextView phone;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.tv_phone_flag)
    TextView tvPhoneFlag;
    @BindView(R.id.tv_tishi)
    TextView tvTishi;
    @BindView(R.id.img_phonenumber)
    TextView imgPhonenumber;
    @BindView(R.id.img_password)
    TextView imgPassword;
    private Timer timer = new Timer();;
    int time = 60;
    Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                imgShow.setText("重新发送 " + time + " s");
                imgShow.setEnabled(false);
            }else  if (msg.what == 2) {
                time = 0;
                imgShow.setText("重新发送");
                imgShow.setEnabled(true);
            }

        }
    };

    @OnClick({R.id.top_iv_back,R.id.btn,R.id.img_show})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                submit();
                break;
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.img_show:
                time = 60;
                sendpass();
                break;
        }
    }

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
        //mHandler.sendEmptyMessageDelayed(1,1000);
    }

    @Override
    protected void onStop() {
        super.onStop();
        timer.cancel();
    }

    public void submit() {
        String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();
        if (!RegexUtils.isMobileSimple(phone)) {
            Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_LONG).show();
            return;
        }

        if (phone == null || "".equals(phone)) {
            Toast.makeText(this, "手机号不能为空", Toast.LENGTH_LONG).show();
            return;
        } else if (password == null || "".equals(password)) {
            Toast.makeText(this, "验证码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put("memberId", phone);
            map.put("phoneNumber", password);

            HashMap<String, String> head = new HashMap<>();
            map.put("token", phone);

            RetrofitClientUtlis.getInstance(this, Url.BASEURL, head).createBaseApi().post(Url.UPDATEPHONE, map, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
                @Override
                public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code == 200) {
                        Toast.makeText(ChangePhoneActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                    } else {
                        mHandler.sendEmptyMessage(2);
                        Toast.makeText(ChangePhoneActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                    }
                }
            });


        }


    }


    @Override
    protected void initview() {
        topTvTitle.setText("修改手机号");
        FontHelper.applyFont(this, tvPhoneFlag, 1);
        FontHelper.applyFont(this, tvTishi, 5);
        FontHelper.applyFont(this, imgPhonenumber, 1);
        FontHelper.applyFont(this, imgPassword, 1);
        FontHelper.applyFont(this, imgPhonenumber, 1);
        FontHelper.applyFont(this, imgPassword, 1);
        FontHelper.applyFont(this, btn, 1);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.change_phonenumber;
    }

    @Override
    public void UpData(Object o) {

    }

}
