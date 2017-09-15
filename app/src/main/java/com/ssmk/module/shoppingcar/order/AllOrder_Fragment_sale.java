package com.ssmk.module.shoppingcar.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssmk.R;
import com.ssmk.base.MVPBaseFragment;
import com.ssmk.module.shoppingcar.adapter.AllOrderAdapter;
import com.ssmk.module.shoppingcar.bean.OrderAllBean;
import com.ssmk.module.shoppingcar.presenter.AllOrderPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author：郑志强
 * data：2017/7/6 19:41
 * function：
 */

public class AllOrder_Fragment_sale extends MVPBaseFragment {
    @BindView(R.id.allorder_recycler)
    RecyclerView mAllorderRecycler;
    Unbinder unbinder;
    private List<OrderAllBean.DataBean> list = new ArrayList<>();
    private AllOrderAdapter adapter;

    @Override
    protected void initdata() {

    }

    @Override
    protected void initView() {


    }

    @Override
    protected int layoutRes() {
        return R.layout.allorder_fragment;
    }

    @Override
    public void UpData(Object o) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
