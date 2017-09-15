package com.ssmk.module.home.url;

import com.ssmk.module.home.bean.Home_bean;

import io.reactivex.Observable;
import retrofit2.http.GET;


/**
 * Created by chengqianlang on 2017/7/11.
 */

public interface Home_service {
        String homeurl="http://47.94.227.190:8080/glhr-main/";
        @GET("shopsAlternatephoto/getHomeData.do")
        Observable<Home_bean> getHomeData();
}
