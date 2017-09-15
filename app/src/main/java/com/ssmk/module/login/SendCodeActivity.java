package com.ssmk.module.login;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
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
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.annotations.NonNull;

public class SendCodeActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.input_phone)
    EditText mInputPhone;
    @BindView(R.id.input_yanzhengma)
    EditText mInputYanzhengma;
    @BindView(R.id.btn_getcode)
    Button mBtnGetcode;
    @BindView(R.id.button)
    Button mButton;
    private String mPhone;
    private String mVerifyCode;

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.send_code);
        mTopTvTitle.setText(title);
        FontHelper.applyFont(this, mInputPhone, 1);
        FontHelper.applyFont(this, mInputYanzhengma, 1);
        FontHelper.applyFont(this, mBtnGetcode, 1);
        FontHelper.applyFont(this, mButton, 1);
    }

    @Override
    protected void initdata() {
        mBtnGetcode.setOnClickListener(this);
        mButton.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_send_code;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.btn_getcode:
                getCode();
                break;
            case R.id.button:
                verifyCode();
                break;
        }
    }

    private void verifyCode() {
            mVerifyCode = mInputYanzhengma.getText().toString();
             Log.e("!!!!", "mPhone: "+mPhone);
             Log.e("!!!!", "verifyCode: "+mVerifyCode);
            if (mVerifyCode == null || "".equals(mVerifyCode)) {
                Toast.makeText(this, "请输入验证码", Toast.LENGTH_LONG).show();
                return;
            } else {
                HashMap<String, String> map = new HashMap<>();
                map.put("phoneNumber", mPhone);
                map.put("verifyCode", mVerifyCode);
                RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.VERITY, map, new BaseObserBean<BaseResponse<String>>(this) {
                    @Override
                    public void onNext(@NonNull BaseResponse<String> stringBaseResponse) {
                        int code=stringBaseResponse.getCode();
                        if (code==200){
                            Toast.makeText(SendCodeActivity.this,"验证码正确"+stringBaseResponse.getMsg(),Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(SendCodeActivity.this, Register_main_Activity.class);
                            startActivity(intent);
                            finish();
                        }else {
                            Toast.makeText(SendCodeActivity.this,"验证码错误"+stringBaseResponse.getMsg(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
    }

    private void getCode() {
        mPhone = mInputPhone.getText().toString();
        if (mPhone == null || "".equals(mPhone)) {
            Toast.makeText(this, "请输入手机号", Toast.LENGTH_LONG).show();
            return;
        }
        else {
            if (!RegexUtils.isMobileSimple(mPhone)) {
                Toast.makeText(this, "请输入正确的手机号", Toast.LENGTH_LONG).show();
                return;
            } else {
                HashMap<String, String> map = new HashMap<>();
                map.put("phoneNumber", mPhone);

                RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.SENDCODE, map, new BaseObserBean<BaseResponse<String>>(this) {
                    @Override
                    public void onNext(@NonNull BaseResponse<String> stringBaseResponse) {
                        int code = stringBaseResponse.getCode();
                        if (code == 200) {
                            Toast.makeText(SendCodeActivity.this, "发送验证码" + stringBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(SendCodeActivity.this, "发送失败" + stringBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                        }
                    }

                });
            }
        }
    }
}
