package com.ssmk.module.login;

import android.content.SharedPreferences;
import android.util.Log;
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


public class ChangePasswordActivity extends MVPBaseActivity {


    @BindView(R.id.btn_finish)
    Button btnFinish;
    @BindView(R.id.input_pass)
    EditText inputPass;
    @BindView(R.id.input_xin_pass)
    EditText inputXinPass;
    @BindView(R.id.input_xin_pass2)
    EditText inputXinPass2;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.yuan)
    TextView yuan;
    @BindView(R.id.xin)
    TextView xin;
    @BindView(R.id.zai)
    TextView zai;

    @OnClick({R.id.btn_finish, R.id.top_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_finish:
                submit();
                break;
            case R.id.top_iv_back:
                finish();
                break;
        }
    }

    public void submit() {
        String phone = inputPass.getText().toString();
        String password = inputXinPass.getText().toString();
        String password2 = inputXinPass2.getText().toString();
        if (StringUtils.length(phone) < 6 && StringUtils.length(phone) > 16) {
            Toast.makeText(this, "请输入6到16位的密码", Toast.LENGTH_LONG).show();
            return;
        } else if (StringUtils.length(password) < 6 && StringUtils.length(password) > 16) {
            Toast.makeText(this, "请输入6到16位的密码", Toast.LENGTH_LONG).show();
            return;
        }
        if (phone == null || "".equals(phone)) {
            Toast.makeText(this, "原密码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else if (password == null || "".equals(password)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else if (password2 == null || "".equals(password2)) {
            Toast.makeText(this, "密码不能为空", Toast.LENGTH_LONG).show();
            return;
        } else if (!password2.equals(password)) {
            Toast.makeText(this, "您两次输入的密码不一致，请重新输入", Toast.LENGTH_LONG).show();
            return;
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put("oldPassword", phone);
            map.put("newPassword", password);

            HashMap<String, String> mapTop = new HashMap<>();
            SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
            String token = personInfo.getString("token", null);
            Log.d("token----------->", "submit: "+token);
            mapTop.put("token", token);
            if (!StringUtils.isEmpty(token)){
                RetrofitClientUtlis.getInstance(this, Url.BASEURL,mapTop).createBaseApi().post(Url.UPDATEPASSWORD, map, new BaseObserBean<BaseResponse<ResponseBean>>(this) {
                    @Override
                    public void onNext(@NonNull BaseResponse<ResponseBean> responseBeanBaseResponse) {
                        int code = responseBeanBaseResponse.getCode();
                        if (code == 200) {
                            Toast.makeText(ChangePasswordActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                            finish();
                        } else {
                            Toast.makeText(ChangePasswordActivity.this, responseBeanBaseResponse.getMsg(), Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }else {
                Toast.makeText(this, "服务器错误", Toast.LENGTH_LONG).show();
            }



        }


    }


    @Override
    protected void initview() {
        topTvTitle.setText("修改密码");
        FontHelper.applyFont(this,yuan,1);
        FontHelper.applyFont(this,xin,1);
        FontHelper.applyFont(this,zai,1);
        FontHelper.applyFont(this,btnFinish,1);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.change_form_password;
    }

    @Override
    public void UpData(Object o) {

    }

}
