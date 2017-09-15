package com.ssmk.module.my.activity;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.adapter.City_adapter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.CityBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class CityActivity extends MVPBaseActivity {


    @BindView(R.id.top_iv_back)
    ImageView topIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.city_recycler)
    RecyclerView city_recycler;

    @OnClick({R.id.top_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
        }
    }


    @Override
    protected void initview() {
       /* Resources res = this.getResources();
        String title = res.getString(R.string.we);*/
        mTopTvTitle.setText("选择市区");
    }

    @Override
    protected void initdata() {
        Intent intent = getIntent();
        String extra = intent.getStringExtra("regionNo");
        HashMap<String, String> map = new HashMap<>();
        map.put("regionNo", extra);
        RetrofitClientUtlis.getInstance(this, Url.BASEURL3).createBaseApi().post2(Url.getAppRegionCityXianList, map, new BaseObserBean2<CityBean>(this, CityBean.class) {
            @Override
            public void Next(CityBean data) {

                List<CityBean.DataBean> data1 = data.getData();
                City_adapter adapter = new City_adapter(CityActivity.this, data1);
                LinearLayoutManager manager = new LinearLayoutManager(CityActivity.this);
                city_recycler.setLayoutManager(manager);
                city_recycler.setAdapter(adapter);
            }
        });
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_city;
    }

    @Override
    public void UpData(Object o) {

    }

}
