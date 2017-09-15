package com.ssmk.module.my.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.StringUtils;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * 新增收收货地址界面
 */
public class NewaddressActivity extends MVPBaseActivity {

    @BindView(R.id.tv_newaddress_diqu)
    TextView mTvNewaddressDiqu;
    @BindView(R.id.autulayou_xinzdizhi)
    AutoLinearLayout mAutulayouXinzdizhi;
    @BindView(R.id.but_shouhuo_refer)
    Button mButShouhuoRefer;
    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView topTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.ed_shouhuoren)
    EditText edShouhuoren;
    @BindView(R.id.ed_lianxifangshi)
    EditText edLianxifangshi;
    @BindView(R.id.ed_diqu)
    EditText edDiqu;
    @BindView(R.id.ed_dizhi)
    EditText edDizhi;
    @BindView(R.id.rb_shezhi)
    RadioButton rbShezhi;
    @BindView(R.id.getRegion)
    AutoRelativeLayout getRegion;
    private SPUtils personInfo;
    boolean flag = false;

    @OnClick({R.id.tv_newaddress_diqu, R.id.but_shouhuo_refer,R.id.getRegion})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.getRegion:
                flag = true;
                savaData();
                Intent intent = new Intent(NewaddressActivity.this, RegionActivity.class);
                startActivity(intent);
                break;
            case R.id.but_shouhuo_refer:
                submit();
                break;
        }
    }
    public void savaData(){
        String Shouhuoren = edShouhuoren.getText().toString();
        String Lianxifangshi = edLianxifangshi.getText().toString();
        String Dizhi = edDizhi.getText().toString();
        boolean b = rbShezhi.isChecked();
        personInfo = new SPUtils("personInfo");
        if (!StringUtils.isEmpty(Shouhuoren)){
            personInfo.put("Shouhuoren",Shouhuoren);
        }
        if (!StringUtils.isEmpty(Lianxifangshi)){
            personInfo.put("Lianxifangshi",Lianxifangshi);
        }
        if (!StringUtils.isEmpty(Dizhi)){
            personInfo.put("Dizhi",Dizhi);
        }
        personInfo.put("b",b);
    }
    public void getData(){
        String shouhuoren = personInfo.getString("Shouhuoren", null);
        String Lianxifangshi = personInfo.getString("Lianxifangshi", null);
        String Dizhi = personInfo.getString("Dizhi", null);
        boolean b = personInfo.getBoolean("b", false);
        if (!StringUtils.isEmpty(shouhuoren)){
            edShouhuoren.setText(shouhuoren);
        }
        if (!StringUtils.isEmpty(Lianxifangshi)){
            edLianxifangshi.setText(Lianxifangshi);
        }
        if (!StringUtils.isEmpty(Dizhi)){
            edDizhi.setText(Dizhi);
        }
        rbShezhi.setChecked(b);
    }


    public void submit() {
        String Shouhuoren = edShouhuoren.getText().toString();
        String Lianxifangshi = edLianxifangshi.getText().toString();
        String Dizhi = edDizhi.getText().toString();
        boolean b = rbShezhi.isChecked();
        if (!StringUtils.isEmpty(Shouhuoren) && !StringUtils.isEmpty(Shouhuoren) && !StringUtils.isEmpty(Shouhuoren) && !StringUtils.isEmpty(Shouhuoren)) {
           // RetrofitClientUtlis.getInstance(this, Url.BASEURL3).createBaseApi().get(Url.BASEURL2, null, new BaseObserBean2<>(this,));

        } else {
            Toast.makeText(NewaddressActivity.this, "您的输入有误，请完善信息", Toast.LENGTH_SHORT).show();
        }

    }


    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initview() {
        topTvTitle.setText("新增收货地址");
        if (flag){
            getData();
            flag = false;
        }
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_newaddress;
    }


}
