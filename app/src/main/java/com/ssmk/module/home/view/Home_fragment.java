package com.ssmk.module.home.view;


import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.heima.easysp.SharedPreferencesUtils;
import com.liaoinstan.springview.widget.SpringView;
import com.ssmk.R;
import com.ssmk.adapter.HomeRecyclerAdapter;
import com.ssmk.base.MVPBaseFragment;
import com.ssmk.module.home.bean.Home_bean;
import com.ssmk.module.home.presenter.Home_present;
import com.ssmk.module.home.utils.GsonUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;


/**
 * Created by chengqianlang on 2017/6/28.
 */

public class Home_fragment extends MVPBaseFragment implements Home_View_Interface {

    @BindView(R.id.xrecycle_homef)
    RecyclerView mXrecycleHomef;
    Unbinder unbinder;
    @BindView(R.id.home_spview)
    SpringView mHomeSpview;
    private boolean mIsconnect;
    private Home_present mHomePresent;
    private String mHomejson;

    @Override
    public void UpData(Object o) {

    }

    @Override
    protected void initdata() {
        if (mIsconnect) {
            loadSpfData();

        } else {
            Toast.makeText(getActivity(), "当前网络不可用", Toast.LENGTH_SHORT).show();
            loadSpfData();
        }
    }

    @Override
    protected void initView() {
        //判断网络是否可用
        mIsconnect = NetworkUtils.isAvailableByPing();
        //取得spf中的数据
        mHomejson = SharedPreferencesUtils.init(getActivity(), "HomeData").getString("homejson");
        LogUtils.e("aa1", mHomejson);
        Log.e("TAG1234567",mHomejson);
        //实例化P层
        mHomePresent = new Home_present(this, getActivity());
        //recyclerview的上拉刷新
        mHomeSpview.setType(SpringView.Type.FOLLOW);
        mHomeSpview.setGive(SpringView.Give.TOP);
        mHomeSpview.setHeader(new Home_RefreshHead());
        mHomeSpview.setListener(new SpringView.OnFreshListener() {
            @Override
            public void onRefresh() {
                mHomePresent.senddata();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mHomeSpview.onFinishFreshAndLoad();
                    }
                }, 2000);
            }
            @Override
            public void onLoadmore() {

            }
        });

    }

    @Override
    protected int layoutRes() {
        return R.layout.home_fragment;

    }

    @Override
    public void setRecyclerAdapter(List<Home_bean.AppNewsBean> appNews, List<Home_bean.ShopsCarouselBean> shopsCarousel, List<Home_bean.ShopsRecommendBean> shopsRecommend) {
        initRecycleView(appNews, shopsCarousel, shopsRecommend);
    }

    //加载recyclerview
    private void initRecycleView(List<Home_bean.AppNewsBean> appNews, List<Home_bean.ShopsCarouselBean> shopsCarousel, List<Home_bean.ShopsRecommendBean> shopsRecommend) {
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(getActivity(), appNews, shopsCarousel, shopsRecommend);
        mXrecycleHomef.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        mXrecycleHomef.setLayoutManager(linearLayoutManager);
    }

    //加载SharedPreferences中的数据
    private void loadSpfData() {
        if (!TextUtils.isEmpty(mHomejson)) {
            Home_bean homebean = (Home_bean) new GsonUtils(mHomejson, Home_bean.class).jsonToGson();
            List<Home_bean.AppNewsBean> appNews = homebean.getAppNews();
            List<Home_bean.ShopsCarouselBean> shopsCarousel = homebean.getShopsCarousel();
            List<Home_bean.ShopsRecommendBean> shopsRecommend = homebean.getShopsRecommend();
            initRecycleView(appNews, shopsCarousel, shopsRecommend);
        } else {
            mHomePresent.senddata();
        }
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
