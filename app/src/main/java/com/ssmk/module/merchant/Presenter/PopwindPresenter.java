package com.ssmk.module.merchant.Presenter;

import android.content.Context;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.merchant.bean.PopowindBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/1015:29
 */

public class PopwindPresenter implements BasePresenter{
    private Context mContext;
    private BaseView mBaseView;
    private int id;
    public PopwindPresenter(Context context, BaseView baseView) {
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
//       map.put("reserve2","122");
        //map.put("pageNo","0");
        RetrofitClientUtlis.getInstance(mContext, Url.BaseShoppingInpo)
                .createBaseApi()
                .post2(Url.inpo,map,
                        new BaseObserBean2<PopowindBean>
                                (mContext, PopowindBean.class) {
            @Override
            public void Next(PopowindBean data) {
                mBaseView.UpData(data);
            }
        });
    }
}
