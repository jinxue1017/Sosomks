package com.ssmk.module.merchant.Presenter;

import android.content.Context;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.merchant.bean.GoodsBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建者:      CaiJianNan
 * 创建时间:   2017/8/3 20:51
 * 描述: TODO
 */

public class MerShoppingPresenter implements BasePresenter {
    private String id;
    private Context mContext;

    public MerShoppingPresenter(String id, Context context, BaseView baseView) {
        this.id = id;
        mContext = context;
        mBaseView = baseView;
    }

    private BaseView mBaseView;
    @Override
    public void SetDataModel(Object o) {

    }


    @Override
    public void GetDataModel(){
        Map<String,String> map = new HashMap<>();
        map.put("pageNo","0");
       // map.put("sellerId","36");
        map.put("sellerId",id+"");
      //  map.put("sellerId","102");
        //map.put("reserve2",id+"");
       // map.put("reserve2","122");
        RetrofitClientUtlis.getInstance(mContext,
                Url.BaseShoppingInpo)
                .createBaseApi()
                .post2(Url.inpo,map
                        , new BaseObserBean2<GoodsBean>(mContext, GoodsBean.class) {
            @Override
            public void Next(GoodsBean data) {
                mBaseView.UpData(data);
            }
        });
    }
}
