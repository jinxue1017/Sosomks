package com.ssmk.module.merchant.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ssmk.R;
import com.ssmk.adapter.CitiesAdapter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.merchant.Data;
import com.ssmk.module.merchant.bean.CitiesBean;
import com.ssmk.utlis.QuickIndexView;
import com.google.gson.Gson;

import butterknife.BindView;

/**
 * Created by ASUS on 2017/7/10.
 */

public class CityListingActivity extends MVPBaseActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.quickIndexView)
    QuickIndexView quickIndexView;

    private CitiesAdapter adapter;
    @Override
    protected void initview() {
        quickIndexView = (QuickIndexView) findViewById(R.id.quickIndexView);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        Gson gson = new Gson();
        CitiesBean citiesBean = gson.fromJson(Data.citiesJson, CitiesBean.class);
        adapter = new CitiesAdapter(this,citiesBean.getDatas());
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initdata() {

    }

    @Override
    protected int layoutRes() {
        return R.layout.city_activity;
    }

    @Override
    public void UpData(Object o) {

    }

}
