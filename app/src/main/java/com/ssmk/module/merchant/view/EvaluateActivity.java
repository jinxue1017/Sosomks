package com.ssmk.module.merchant.view;

import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.adapter.EvaluateAdapter;
import com.ssmk.base.MVPBaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by ASUS on 2017/7/9.
 */

public class EvaluateActivity extends MVPBaseActivity {

    @BindView(R.id.evaluate_hengxiang)
    TextView evaluateHengxiang;
    @BindView(R.id.evaluate_recycler)
    RecyclerView evaluateRecycler;
    @BindView(R.id.evaluate_recycler2)
    RecyclerView evaluateRecycler2;
    @BindView(R.id.title_iv_back)
    ImageView titleIvBack;
    @BindView(R.id.title_name)
    TextView titleName;
    @BindView(R.id.title_iv_help)
    ImageView titleIvHelp;
    private List<String> list;
    private List<Integer> list2 = new ArrayList<>();

    @Override
    protected void initview() {
        titleName.setText("评价详情");
        titleIvHelp.setImageResource(R.drawable.fenxiang);
        list = new ArrayList<>();
        list.add("第一");
        list.add("第二");
        list.add("第三");
        for (int i = 0; i < 20; i++) {
            list2.add(R.drawable.pic3);
        }

    }

    @Override
    protected void initdata() {

        evaluateRecycler.setLayoutManager(new LinearLayoutManager(EvaluateActivity.this));
        EvaluateAdapter adapter = new EvaluateAdapter(R.layout.evaluate_adapter, list);
        evaluateRecycler.setAdapter(adapter);
        EvaluateAdapter adapter2 = new EvaluateAdapter(R.layout.evaluate_adapter2, list2);
        evaluateRecycler2.setLayoutManager(new LinearLayoutManager(EvaluateActivity.this, LinearLayoutManager.HORIZONTAL, true));
        evaluateRecycler2.setAdapter(adapter2);
    }

    @Override
    protected int layoutRes() {
        return R.layout.evaluate_activity;
    }

    @Override
    public void UpData(Object o) {

    }


    @OnClick({R.id.title_iv_back, R.id.title_iv_help})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.title_iv_back:
                finish();
                break;
            case R.id.title_iv_help:
                startActivity(new Intent(EvaluateActivity.this, CityListingActivity.class));
                break;
        }
    }

}
