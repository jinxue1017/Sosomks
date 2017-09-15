package com.ssmk.module.home.presenter;

import com.ssmk.module.home.bean.Home_bean;

import java.util.List;

/**
 * Created by chengqianlang on 2017/7/11.
 */

public interface Home_present_Interface {
    void getHomeData(List<Home_bean.AppNewsBean> appNews,List<Home_bean.ShopsCarouselBean> shopsCarousel,List<Home_bean.ShopsRecommendBean> shopsRecommend);
    void senddata();
}
