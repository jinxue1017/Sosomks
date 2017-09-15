package com.ssmk.module.my.activity;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.adapter.Collection_adapter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.bean.CollectionBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;


public class MyCollectActivity extends MVPBaseActivity {
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView mTopTvOther;
    @BindView(R.id.collect_recycler)
    RecyclerView collectRecycler;

    @OnClick({R.id.top_iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            case R.id.top_tv_other:
                finish();
                break;
        }
    }


    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.shoucnag);
        mTopTvTitle.setText(title);
        mTopTvOther.setText("编辑");
        FontHelper.applyFont(this, mTopTvTitle, 5);
    }

    @Override
    protected void initdata() {
        SharedPreferences personInfo = getSharedPreferences("personInfo", MODE_PRIVATE);
        String token = personInfo.getString("token", null);
        HashMap<String, String> map = new HashMap<>();
        map.put("token", token);
        RetrofitClientUtlis.getInstance(this, Url.BASEURL).createBaseApi().post(Url.CollectionList, map, new BaseObserBean2<CollectionBean>(this, CollectionBean.class) {
            @Override
            public void Next(CollectionBean data) {
                List<CollectionBean.DataBean.RowsBean> rows = data.getData().getRows();
                Collection_adapter adapter = new Collection_adapter(MyCollectActivity.this, rows);
                LinearLayoutManager manager = new LinearLayoutManager(MyCollectActivity.this);
                collectRecycler.setAdapter(adapter);
                collectRecycler.setLayoutManager(manager);
            }
        });

    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_my_collect;
    }

    @Override
    public void UpData(Object o) {

    }

}
