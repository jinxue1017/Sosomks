package com.ssmk.module.merchant.Presenter;

import android.content.Context;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;
import com.ssmk.module.merchant.bean.ShangpinBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/2214:17
 * 请求商品分类
 */
public class ShangpinPrestenser implements BasePresenter{
    private Context mContext;
    private BaseView mBaseView;
    private int id;
    public ShangpinPrestenser(Context context, BaseView baseView) {
        mContext = context;
        mBaseView = baseView;
    }
    @Override
    public void SetDataModel(Object o){

    }

    public void setId(int id) {
        this.id = id;
        GetDataModel();
    }
    @Override
    public void GetDataModel(){
        Map<String,String> map = new HashMap<>();
        map.put("sellerId",id+"");
        RetrofitClientUtlis.getInstance(mContext, Url.Shangpinfenlei).createBaseApi().post2(Url.fenleiitem,map, new BaseObserBean2<ShangpinBean>(mContext, ShangpinBean.class){
            @Override
            public void Next(ShangpinBean data){
              mBaseView.UpData(data);
            }
        });
    }
}
