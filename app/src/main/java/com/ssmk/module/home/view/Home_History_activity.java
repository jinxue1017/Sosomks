package com.ssmk.module.home.view;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ssmk.R;
import com.ssmk.adapter.HomeHistoryAdapter;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.RecycleViewDivider;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Home_History_activity extends MVPBaseActivity {

    @BindView(R.id.history_toolbar)
    Toolbar mHistoryToolbar;
    @BindView(R.id.history_recycler)
    RecyclerView mHistoryRecycler;

    @Override
    protected void initview() {
        mHistoryToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    protected void initdata() {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(1);
        }
        HomeHistoryAdapter adapter = new HomeHistoryAdapter(R.layout.history_recycle_item, list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mHistoryRecycler.addItemDecoration(new RecycleViewDivider(
                Home_History_activity.this, LinearLayoutManager.HORIZONTAL, 4, getResources().getColor(R.color.divider_gray)));
        mHistoryRecycler.setAdapter(adapter);
        mHistoryRecycler.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_home__history;
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
}
