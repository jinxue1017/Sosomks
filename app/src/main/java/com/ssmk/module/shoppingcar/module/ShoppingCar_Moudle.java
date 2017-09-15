package com.ssmk.module.shoppingcar.module;

import android.content.Context;
import android.text.TextUtils;

import com.blankj.utilcode.util.LogUtils;
import com.example.retrofitlibrary.BaseObserver;
import com.example.retrofitlibrary.BaseSuccess;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.google.gson.Gson;
import com.heima.easysp.SharedPreferencesUtils;
import com.ssmk.module.home.bean.Home_bean;
import com.ssmk.module.home.moudle.Home_Moudle_Interface;
import com.ssmk.module.home.presenter.Home_present_Interface;
import com.ssmk.module.home.url.Home_service;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by chengqianlang on 2017/7/11.
 */

public class ShoppingCar_Moudle<T> implements Home_Moudle_Interface,BaseSuccess<T> {
    private Context mContext;
    private Home_present_Interface mhpi;

    public ShoppingCar_Moudle(Context context, Home_present_Interface hpi) {
        mContext = context;
        mhpi = hpi;
    }

    @Override
    public void getHomeData() {
        Home_service home_service = RetrofitClientUtlis.getInstance(mContext, Home_service.homeurl)
                .create(Home_service.class);
        home_service.getHomeData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver(this));
    }

    @Override
    public void Sueccess(T o) {
        Home_bean home_bean= (Home_bean) o;
        List<Home_bean.AppNewsBean> appNews = home_bean.getAppNews();
        List<Home_bean.ShopsCarouselBean> shopsCarousel = home_bean.getShopsCarousel();
        List<Home_bean.ShopsRecommendBean> shopsRecommend = home_bean.getShopsRecommend();
        Gson gson = new Gson();
        String homejson = gson.toJson(home_bean);
        LogUtils.e("aaa",homejson);
        if (!TextUtils.isEmpty(homejson)) {
            SharedPreferencesUtils.init(mContext, "HomeData").putString("homejson", homejson);
        }
        mhpi.getHomeData(appNews,shopsCarousel,shopsRecommend);

    }

    @Override
    public void Error(String str) {

    }
}
