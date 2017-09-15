package com.ssmk.module.shoppingcar.presenter;


import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.blankj.utilcode.util.SPUtils;
import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.base.BasePresenter;
import com.ssmk.base.IBaseView;
import com.ssmk.module.shoppingcar.bean.TestBean;
import com.ssmk.module.shoppingcar.bean.TestShopsBean;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import okhttp3.RequestBody;

import static com.umeng.socialize.utils.DeviceConfig.context;


/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 8:23
 * 编写人  :  王成哲
 */
public class ShoppingCarPresenter implements BasePresenter<TestBean> {
    private Context mContext;
    private IBaseView mBaseView;

    public ShoppingCarPresenter(Context context, IBaseView baseView){
        this.mContext=context;
        this.mBaseView=baseView;
    }

    @Override
    public void SetDataModel(TestBean testBean) {

    }

    @Override
    public void GetDataModel() {
        Map<String, String> map = new HashMap<>();
        SPUtils spUtils=new SPUtils("personInfo");
        String token = spUtils.getString("token");
        if (TextUtils.isEmpty(token)){
            mBaseView.succeed(false,1);
            return;
        }
        map.put("token",token );
        RetrofitClientUtlis.getInstance(context, Url.shopsCartl,map)
                .createBaseApi()
                .get(Url.shopsCart3
                        , new BaseObserBean2<TestBean>(context, TestBean.class) {
                            @Override
                            public void Next(TestBean data) {
                                if (data.getCode()==200){
                                    List<TestShopsBean> group = data.getGroup();
                                    mBaseView.succeed(data,1);
                                }else {

                                }


                            }
                        });
    }

    public void postDeleteCar(int tag,Map<String ,String> map1) {
        Map<String, String> map = new HashMap<>();
        SPUtils spUtils=new SPUtils("personInfo");
        String token = spUtils.getString("token");
        map.put("token",token );
        RetrofitClientUtlis.getInstance(context, Url.shopsCartl,map)
                .createBaseApi()
                .post2(Url.delShopsCart, map1, new BaseObserBean2<Object>(context) {
                    @Override
                    public void Next(Object data) {
                        mBaseView.succeed(data,2);
                        Log.e("fff", "Next: "+data.toString());
                                            }

                    @Override
                    public void onError(Throwable e) {

                    }
                }
               );
    }

    public void upDataShoppingCar(String route, final int tag) {

        Map<String, String> mapToken = new HashMap<>();
        SPUtils spUtils=new SPUtils("personInfo");
        String token = spUtils.getString("token");
        mapToken.put("token",token );
        RequestBody body=RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"),route);
        RetrofitClientUtlis.getInstance(context, Url.shopsCartl,mapToken)
                .createBaseApi()
                .executePostJson(Url.updShopsCartList, body, new BaseObserBean2<Object>(context) {
                            @Override
                            public void Next(Object data) {
                                mBaseView.succeed(data,tag);
                            }
                            @Override
                            public void onError(Throwable e) {
                                mBaseView.error(e.toString(),tag);
                            }
                        }
                );
    }
}
