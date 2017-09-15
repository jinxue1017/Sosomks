package com.ssmk.module.shoppingcar.presenter;

import android.content.Context;
import android.util.Log;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.shoppingcar.bean.OrderAllBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

public class AllOrderPresenter implements BasePresenter {

    public AllOrderPresenter(Context context, BaseView baseView) {

        this.baseView = baseView;
        this.context = context;
    }

    private BaseView baseView;
    private Context context;

    @Override
    public void SetDataModel(Object o) {

    }

    @Override
    public void GetDataModel() {
        Map<String, String> map = new HashMap<>();
        Map<String, String> mapHeader = new HashMap<>();

        map.put("orderStatus", "0");
        mapHeader.put("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjI1MiwicHdkIjoiZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2UiLCJpYXQiOjE1MDA0MzYyNzg1MDIsImV4dCI6MTUwMTA0MTA3ODUwMn0.ws2972b0tfqUWbiluxEEtv_2mbAjZzk3k9lTFxyHIvA");

        RetrofitClientUtlis.getInstance(context, Url.BASEORDER,mapHeader)
                .createBaseApi()
                .post2(Url.ALLORDER_LINK, map, new BaseObserBean2<OrderAllBean>(context, OrderAllBean.class) {
                    @Override
                    public void Next(OrderAllBean data) {
                        Log.i("=====", "Next: "+data.getCode());
                        baseView.UpData(data);
                    }
                });

    }
}
