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
import com.ssmk.adapter.CitySon_adapter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.CitySonBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class CitySonActivity extends MVPBaseActivity {


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
        mTopTvTitle.setText("选择县区");
    }

    @Override
    protected void initdata() {
        Intent intent = getIntent();
        String extra = intent.getStringExtra("regionNo");
        HashMap<String, String> map = new HashMap<>();
        map.put("regionNo", extra);
        RetrofitClientUtlis.getInstance(this, Url.BASEURL3).createBaseApi().post2(Url.getAppRegionCityXianList, map, new BaseObserBean2<CitySonBean>(this, CitySonBean.class) {
            @Override
            public void Next(CitySonBean data) {
                List<CitySonBean.DataBean> data1 = data.getData();
                CitySon_adapter adapter = new CitySon_adapter(CitySonActivity.this, data1);
                LinearLayoutManager manager = new LinearLayoutManager(CitySonActivity.this);
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
