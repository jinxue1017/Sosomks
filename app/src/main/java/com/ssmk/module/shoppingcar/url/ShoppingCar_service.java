package com.ssmk.module.shoppingcar.url;

import com.ssmk.module.home.bean.Home_bean;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by chengqianlang on 2017/7/11.
 */

public interface ShoppingCar_service {
    String shoppingcarurl="http://47.94.227.190:8080/glhr-main/";
    @GET("shopsCart/ getShopsCartList.do")
    Observable<Home_bean> getHomeData();
}
