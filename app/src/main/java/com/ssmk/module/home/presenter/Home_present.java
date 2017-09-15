package com.ssmk.module.home.presenter;

import android.content.Context;

import com.ssmk.module.home.bean.Home_bean;
import com.ssmk.module.home.moudle.Home_Moudle;
import com.ssmk.module.home.moudle.Home_Moudle_Interface;
import com.ssmk.module.home.view.Home_View_Interface;

import java.util.List;

/**
 * Created by chengqianlang on 2017/7/11.
 */

public class Home_present implements Home_present_Interface{

    private Home_Moudle_Interface mHomeMoudleInterface;
    private Home_View_Interface mHomeViewInterface;
    private Context mContext;

    public Home_present(Home_View_Interface homeViewInterface, Context context) {
        mHomeViewInterface = homeViewInterface;
        mContext = context;
        mHomeMoudleInterface=new Home_Moudle<>(mContext,this);
    }


    @Override
    public void getHomeData(List<Home_bean.AppNewsBean> appNews, List<Home_bean.ShopsCarouselBean> shopsCarousel, List<Home_bean.ShopsRecommendBean> shopsRecommend) {
        mHomeViewInterface.setRecyclerAdapter(appNews,shopsCarousel,shopsRecommend);
    }

    @Override
    public void senddata() {
        mHomeMoudleInterface.getHomeData();
    }
}
