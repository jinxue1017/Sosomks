package com.ssmk.module.home.view;

import com.ssmk.module.home.bean.Home_bean;

import java.util.List;

/**
 * Created by chengqianlang on 2017/7/11.
 */

public interface Home_View_Interface {
    void setRecyclerAdapter(List<Home_bean.AppNewsBean> appNews, List<Home_bean.ShopsCarouselBean> shopsCarousel, List<Home_bean.ShopsRecommendBean> shopsRecommend);
}
