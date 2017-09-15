package com.ssmk.module.merchant.Presenter;

import android.content.Context;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.ssmk.module.shoppingcar.bean.TestBean;
import com.ssmk.url.Url;

/**
 * 创建者:      CaiJianNan
 * 创建时间:   2017/7/17 20:36
 * 描述: TODO
 */

public class MerchantPresenter implements BasePresenter {

    public MerchantPresenter(BaseView baseView, Context context) {
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

        RetrofitClientUtlis.getInstance(context, Url.BASESHOPPING)
                .createBaseApi()
                .post(Url.SHOPPINGFEILEI
                        , new BaseObserBean2<ShoppingFeileiBean>(context,ShoppingFeileiBean.class) {
                            @Override
                            public void Next(ShoppingFeileiBean data) {
                                baseView.UpData(data);
                            }
                        });
    }
}
