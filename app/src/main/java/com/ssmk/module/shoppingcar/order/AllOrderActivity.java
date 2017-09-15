package com.ssmk.module.shoppingcar.order;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.shoppingcar.adapter.AllOrderVpAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * 我的订单界面
 */
public class AllOrderActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.allorder_tab)
    TabLayout mAllorderTab;
    @BindView(R.id.allorder_vp)
    ViewPager mAllorderVp;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    private String[] mTitles = new String[]{"全部", "待付款", "待发货", "待收货", "售后"};
    private List<Fragment> mList = new ArrayList<>();

    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.all_order);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {

        mList.add(new AllOrder_Fragment_all());
        mList.add(new AllOrder_Fragment_pay());
        mList.add(new AllOrder_Fragment_send());
        mList.add(new AllOrder_Fragment_receive());
        mList.add(new AllOrder_Fragment_sale());
        AllOrderVpAdapter vpAdapter = new AllOrderVpAdapter(getSupportFragmentManager(), mTitles, mList);
        mAllorderVp.setAdapter(vpAdapter);
        mAllorderTab.setupWithViewPager(mAllorderVp);
        mTopIvBack.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_all_order;
    }

    @Override
    public void UpData(Object o) {
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
        }
    }

}
