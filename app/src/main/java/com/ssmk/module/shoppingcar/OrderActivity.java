package com.ssmk.module.shoppingcar;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.merchant.Data;
import com.ssmk.module.merchant.bean.LiJiBean;
import com.ssmk.module.shoppingcar.adapter.OrderAdapter;
import com.ssmk.module.shoppingcar.bean.SubmitOrderBean;
import com.ssmk.module.shoppingcar.order.AllOrderActivity;
import com.ssmk.url.Url;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.RequestBody;

import static com.umeng.socialize.utils.DeviceConfig.context;

public class OrderActivity extends MVPBaseActivity implements View.OnClickListener {

    @BindView(R.id.order_recycler)
    RecyclerView mOrderRecycler;
    @BindView(R.id.btn_submit_order)
    Button mBtnSubmitOrder;
    @BindView(R.id.top_iv_back)
    ImageView mTopIvBack;
    @BindView(R.id.top_tv_title)
    TextView mTopTvTitle;
    @BindView(R.id.should_money)
    TextView shouldMoney;
    @BindView(R.id.rlBottom)
    RelativeLayout rlBottom;
    @BindView(R.id.activity_order)
    RelativeLayout activityOrder;
    @BindView(R.id.order_should_money)
    TextView orderShouldMoney;
    private String body1 = "{\"deliveryName\":\"张三\",\"deliveryTel\":\"13452639857\",\"addressDetail\":\"收货地址-北京顺义\",\"totalFreight\":0,\"totalPrice\":500,\"payMode\":\"微信\",\"commodityAndSellerList\":[{\"sellerId\":103,\"sellerName\":\"森马\",\"commodityInfoList\":[{\"goodsId\":\"42A34D35A56445AD8244B413CF397935\",\"cartId\":\"\",\"goodsName\":\"商品一\",\"goodsCode\":\"1503195253850755\",\"skuId\":\"088b12ba009b39eaa5b1efa1cf291da1\",\"goodsFormatId\":\"26\",\"sizeNumberId\":\"10\",\"goodsPrice\":145,\"freight\":0,\"purchaseSize\":2}]},{\"sellerId\":110,\"sellerName\":\"美特斯邦威\",\"commodityInfoList\":[{\"goodsId\":\"63CB12170FA1495790B9329F7123678B\",\"cartId\":\"\",\"goodsName\":\"商品二\",\"goodsCode\":\"1503145083894922\",\"skuId\":\"87fc31d71c23cf6c4969b1fe941614fd\",\"goodsFormatId\":\"13\",\"sizeNumberId\":\"10\",\"goodsPrice\":210,\"freight\":0,\"purchaseSize\":1}]}]}";

    @Override
    protected void initview() {
        Resources res = this.getResources();
        //确认订单
        String title = res.getString(R.string.affirm_order);
        mTopTvTitle.setText(title);

    }

    @Override
    protected void initdata() {

        Intent intent = getIntent();
        LiJiBean lijibean = (LiJiBean) intent.getSerializableExtra("liji");
        Data.liJiBean = lijibean;

        orderShouldMoney.setText(lijibean.getCommodityAndSellerList().get(0).getCommodityInfoList().getGoodsPrice());;
        mOrderRecycler.setLayoutManager(new LinearLayoutManager(this));
        OrderAdapter adapter = new OrderAdapter(this);

        mOrderRecycler.setAdapter(adapter);
        adapter.setOnItemClickLitener(new OrderAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(OrderActivity.this, AddressActivity.class);
                startActivity(intent);
            }
        });
        mBtnSubmitOrder.setOnClickListener(this);

        mTopIvBack.setOnClickListener(this);
    }

    @Override
    protected int layoutRes() {
        return R.layout.activity_order;
    }

    @Override
    public void UpData(Object o) {

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //返回键
            case R.id.top_iv_back:
                finish();
                break;
            //点击提交订单
            case R.id.btn_submit_order:

                Map<String, String> map1 = new HashMap<>();
                map1.put("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1aWQiOjI1MiwicHdkIjoiZTEwYWRjMzk0OWJhNTlhYmJlNTZlMDU3ZjIwZjg4M2UiLCJpYXQiOjE1MDA0MzYyNzg1MDIsImV4dCI6MTUwMTA0MTA3ODUwMn0.ws2972b0tfqUWbiluxEEtv_2mbAjZzk3k9lTFxyHIvA");
                map1.put("Content-Type", "application/json");
                Log.i("=====", "onClick: "+ body1);
                RequestBody body = RequestBody.create(RetrofitClientUtlis.JSON, body1);

                RetrofitClientUtlis.getInstance(this, Url.BASESUREORDER+"order/", map1)
                        .createBaseApi()
                        .executePostJson(
//                                Url.BASESUREORDER11,
                                "submitOrder.do",
                                body, new BaseObserBean2<SubmitOrderBean>(context, SubmitOrderBean.class) {
                            @Override
                            public void Next(SubmitOrderBean data) {
                                if (data.getCode() == 200) {

                                    Log.i("likaihu", "Next: " + data.getMsg());
                                    Intent intent = new Intent(OrderActivity.this, AllOrderActivity.class);
                                    startActivity(intent);
                                }

                            }

                        });


                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
