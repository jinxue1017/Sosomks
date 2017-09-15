package com.ssmk.module.shoppingcar;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.my.activity.NewaddressActivity;
import com.ssmk.module.shoppingcar.adapter.AddressAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class AddressActivity extends MVPBaseActivity{

    @BindView(R.id.shop_address_recycler)
    RecyclerView mShopAddressRecycler;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.top_tv_other)
    TextView topTvOther;
    @BindView(R.id.add_address)
    Button addAddress;

    @OnClick({R.id.add_address,R.id.top_iv_back})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.top_iv_back:
                finish();
                break;
            //添加到新地址监听跳到新增收货地址
            case R.id.add_address:
                startActivity(new Intent(this, NewaddressActivity.class));
                break;
        }
    }


    @Override
    protected void initview() {
        Resources res = this.getResources();
        String title = res.getString(R.string.select_address);
        mTopTvTitle.setText(title);
    }

    @Override
    protected void initdata() {
        mShopAddressRecycler.setLayoutManager(new LinearLayoutManager(this));
        mShopAddressRecycler.setAdapter(new AddressAdapter(this));
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_address;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        initdata();
    }
}
