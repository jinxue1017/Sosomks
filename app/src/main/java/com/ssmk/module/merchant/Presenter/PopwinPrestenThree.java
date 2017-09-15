package com.ssmk.module.merchant.Presenter;

import android.content.Context;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.merchant.bean.PopwindThreeBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/1017:23
 */

public class PopwinPrestenThree implements BasePresenter {
    private Context mContext;
    private BaseView mBaseView;
    private int id;
    public PopwinPrestenThree(Context context, BaseView baseView) {
        mContext = context;
        mBaseView = baseView;
    }
    @Override
    public void SetDataModel(Object o) {
    }

    public void setId(int id) {
        this.id = id;
        GetDataModel();
    }

    @Override
    public void GetDataModel(){
        Map<String,String> map = new HashMap<>();
        map.put("pageNo","0");
        map.put("sellerId",id+"");
        //map.put("reserve2","122");
        RetrofitClientUtlis.getInstance(mContext, Url.BaseShoppingInpo).createBaseApi().post2(Url.inpo,map, new BaseObserBean2<PopwindThreeBean>(mContext, PopwindThreeBean.class) {
            @Override
            public void Next(PopwindThreeBean data) {
                mBaseView.UpData(data);
            }
        });
    }
}
