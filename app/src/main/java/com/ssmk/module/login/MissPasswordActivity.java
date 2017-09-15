package com.ssmk.module.login;

import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.StringUtils;
import com.example.retrofitlibrary.BaseObserBean;
import com.example.retrofitlibrary.BaseResponse;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.ResponseBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.annotations.NonNull;


public class MissPasswordActivity extends MVPBaseActivity {


    @BindView(R.id.input_phone)
    EditText inputPhone;
    @BindView(R.id.input_password)
    EditText inputPassword;
    @BindView(R.id.btn)
    Button btn;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.tv_phone)
    TextView tvPhone;
    @BindView(R.id.tv_password)
    TextView tvPassword;

    @OnClick({R.id.btn, R.id.top_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.btn:
                submit();
                break;
        }
    }

    public void submit() {
        String phone = inputPhone.getText().toString();
        String password = inputPassword.getText().toString();
        if (StringUtils.length(phone) < 6 && StringUtils.length(phone) > 16) {
            Toast.makeText(this, "请输入6到16位的密码", Toast.LENGTH_LONG).show();
            return;
        } else if (StringUtils.length(password) < 6 && StringUtils.length(password) > 16) {
            Toast.makeText(this, "请输入6到16位的密码", Toast.LENGTH_LONG).show();
            return;
        }
        if (phone == null || "".equals(phone)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else if (password == null || "".equals(password)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else {
            HashMap<String, String> map = new HashMap<>();
            SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
            String phoneNumber = personInfo.getString("phoneNumber", null);
            map.put("phoneNumber",phoneNumber);
            map.put("password", password);

            RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.FORGETPASSWORD, map, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
                @Override
                public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                    int code = responseBeanBaseResponse.getCode();
                    if (code == 200) {
                        Toast.makeText(MissPasswordActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MissPasswordActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                    }
                }
            });

        }


    }


    @Override
    protected void initview() {
        topTvTitle.setText("修改密码");
        FontHelper.applyFont(this,tvPassword,5);
        FontHelper.applyFont(this,tvPhone,5);
        FontHelper.applyFont(this,btn,1);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.change_password;
    }

    @Override
    public void UpData(Object o) {

    }

}
