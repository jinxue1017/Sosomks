package com.ssmk.module.shoppingcar.order;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.ssmk.R;
import com.ssmk.base.MVPBaseFragment;
import com.ssmk.module.shoppingcar.bean.OrderAllBean;
import com.ssmk.module.shoppingcar.bean.SkuInfoBean;
import com.ssmk.module.shoppingcar.presenter.AllOrderPresenter;
import com.ssmk.module.shoppingcar.adapter.AllOrderAdapter;

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

public class AllOrder_Fragment_all<T> extends MVPBaseFragment<T> {

    private List<OrderAllBean.DataBean> list = new ArrayList<>();
    @BindView(R.id.allorder_recycler)
    RecyclerView mAllorderRecycler;
    Unbinder unbinder;
    private AllOrderAdapter adapter;

    @Override
    protected void initdata() {
        AllOrderPresenter allOrderPresenter = new AllOrderPresenter(getActivity(), this);
        allOrderPresenter.GetDataModel();

    }

    @Override
    protected void initView() {

        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        mAllorderRecycler.setLayoutManager(manager);

    }


    @Override
    protected int layoutRes() {
        return R.layout.allorder_fragment;
    }

    @Override
    public void UpData(Object o) {

        OrderAllBean orderAllBean = (OrderAllBean) o;
        List<OrderAllBean.DataBean> data = orderAllBean.getData();

        adapter = new AllOrderAdapter(getActivity());
        adapter.setData(data);
        mAllorderRecycler.setAdapter(adapter);
        //list.addAll(data);

        adapter.setOnItemClickListener(new AllOrderAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(getActivity(), WaitPayActivity.class);
                startActivity(intent);
            }
        });
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
