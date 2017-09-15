package com.ssmk.module.merchant.view;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.SPUtils;
import com.bumptech.glide.Glide;
import com.example.retrofitlibrary.BaseObserBean2;
import com.example.retrofitlibrary.RetrofitClientUtlis;
import com.google.gson.Gson;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.home.utils.GildeImage;
import com.ssmk.module.merchant.Presenter.CartMainLink;
import com.ssmk.module.merchant.Presenter.DetailsPreseter;
import com.ssmk.module.merchant.Presenter.DetailsPreseterSizeView;
import com.ssmk.module.merchant.Presenter.DetailsPreseterView;
import com.ssmk.module.merchant.bean.CommodBean;
import com.ssmk.module.merchant.bean.CommodityAndSellerList;
import com.ssmk.module.merchant.bean.CommodityInfoList;
import com.ssmk.module.merchant.bean.LiJiBean;
import com.ssmk.module.merchant.bean.ShoppingCartData;
import com.ssmk.module.merchant.bean.ShopsCartBean;
import com.ssmk.module.shoppingcar.OrderActivity;
import com.ssmk.url.Url;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

import static com.ssmk.R.id.detailsa_yunfei;
import static com.umeng.socialize.utils.DeviceConfig.context;
/**
 * 作者：${CaiJianNan}
 * 时间2017/6/29 09:40
 * 邮箱：17600157003@163.com
 */
public class DetailsActivity extends MVPBaseActivity implements View.OnClickListener {


    @BindView(R.id.detailsa_finsh)
    ImageView detailsaFinsh;
    @BindView(R.id.detailsa_text3)
    TextView detailsaText3;
    @BindView(R.id.detailsa_fenxiang)
    ImageView detailsaFenxiang;
    @BindView(R.id.detailsa_banner)
    Banner detailsaBanner;
    @BindView(R.id.detailsa_price)
    TextView detailsaPrice;
    @BindView(R.id.detailsa_chajia)
    TextView detailsaChajia;
    @BindView(R.id.detailsa_dizhi)
    TextView detailsaDizhi;
    @BindView(R.id.detailsa_xiaoliang)
    TextView detailsaXiaoliang;
    @BindView(R.id.detailsa_inpo)
    TextView detailsaInpo;
    @BindView(detailsa_yunfei)
    TextView detailsaYunfei;
    @BindView(R.id.detailsa_tuihuo)
    TextView detailsaTuihuo;
    @BindView(R.id.detailsa_tv)
    TextView detailsaTv;
    @BindView(R.id.detailsa_xuanze)
    TextView detailsaXuanze;
    @BindView(R.id.detailsa_xuanze_iv)
    ImageView detailsaXuanzeIv;
    @BindView(R.id.detailsa_koubei)
    TextView detailsaKoubei;
    @BindView(R.id.detailsa_bnt1)
    Button detailsaBnt1;
    @BindView(R.id.detailsa_bnt2)
    Button detailsaBnt2;
    @BindView(R.id.detailsa_bnt3)
    Button detailsaBnt3;
    @BindView(R.id.detailsa_recycler)
    RecyclerView detailsaRecycler;
    @BindView(R.id.detailsa_pingjia)
    Button detailsaPingjia;
    @BindView(R.id.detailsa_text1)
    TextView detailsaText1;
    @BindView(R.id.detailsa_jijie)
    TextView detailsaJijie;
    @BindView(R.id.detailsa_jijie_edit)
    TextView detailsaJijieEdit;
    @BindView(R.id.detailsa_chengfen)
    TextView detailsaChengfen;
    @BindView(R.id.detailsa_chengfen_edit)
    TextView detailsaChengfenEdit;
    @BindView(R.id.detailsa_fengge)
    TextView detailsaFengge;
    @BindView(R.id.detailsa_fengge_edit)
    TextView detailsaFenggeEdit;
    @BindView(R.id.detailsa_qiongchang)
    TextView detailsaQiongchang;
    @BindView(R.id.detailsa_qiongchang_edit)
    TextView detailsaQiongchangEdit;
    @BindView(R.id.detailsa_lin)
    LinearLayout detailsaLin;
    @BindView(R.id.detailsa_text2)
    TextView detailsaText2;
    @BindView(R.id.detailsa_xiangqing_recycler)
    RecyclerView detailsaXiangqingRecycler;
    @BindView(R.id.detailsa_xiaoxi)
    ImageView detailsaXiaoxi;
    @BindView(R.id.detailsa_yuanxin)
    ImageView detailsaYuanxin;
    @BindView(R.id.detailsa_gouwucar)
    Button detailsaGouwucar;
    @BindView(R.id.detailsa_liji)
    Button detailsaLiji;
    @BindView(R.id.detailsa_gouwuche)
    ImageView detailsaGouwuche;
    private List<String> image = new ArrayList<>();
    private PopupWindow popWin;
    private ImageView popuwindowIv;
    private TextView popviewColor;
    private TextView popviewSzie;
    private CommodBean data;
    //private ShopsCartBean carData;
    private String mGoodsName;
    private String mGoodsId;
    private String mSellerName;
    private int mSellerId;
    private CartAddView cartAddView;
    private Button popGouwucar;
    private Button popGouwucar2;
    private Button popjiaru;
    private Button popdetailsaliji;
    private TextView popwrapcontent;
    private ShopsCartBean carData;
    private int goodsNumber;
    private RecyclerView colorecycler;
    private RecyclerView sizecycler;
    private int colopor;
    private int sizepor;
    private String DetailsSkuId;
    //p层对象
    private DetailsPreseter detailsPreseter;
    private List<ShoppingCartData> list;
    Handler hh = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                data = (CommodBean) msg.obj;
                Log.i("TAG", "handleMessage: "+data.toString());
                image.add((String) data.getCommodityData().getGoodsPhoto1());
                image.add((String) data.getCommodityData().getGoodsPhoto2());
                image.add((String) data.getCommodityData().getGoodsPhoto3());
                image.add((String) data.getCommodityData().getGoodsPhoto4());
                image.add((String) data.getCommodityData().getGoodsPhoto5());
                image.add((String) data.getCommodityData().getGoodsPhoto6());
                detailsaBanner.setIndicatorGravity(BannerConfig.RIGHT);
                detailsaBanner.setImages(image);
                detailsaBanner.setImageLoader(new GildeImage());
                detailsaBanner.isAutoPlay(true);
                detailsaBanner.start();
                //价格
                String price = (String) data.getCommodityData().getGoodsPrice();
                detailsaChajia.setText("￥" + price);
                //优惠价格
                String memberPrice = (String) data.getCommodityData().getMemberPrice();
                detailsaPrice.setText("￥" + memberPrice);
                //商家名称
                mSellerName = (String) data.getCommodityData().getSellerName();
                //销量
                int goodsSales = data.getCommodityData().getGoodsSales();
                detailsaXiaoliang.setText("销量  " + goodsSales);
                //商品介绍
                String goodsIntroduce = data.getCommodityData().getGoodsIntroduce();
                //商家id
                mSellerId = data.getCommodityData().getSellerId();
                //商家名字
                detailsaText3.setText(data.getCommodityData().getSellerName());
                //商品id
                mGoodsId = data.getCommodityData().getGoodsId();
                //商品名称
                mGoodsName = data.getCommodityData().getGoodsName();
                detailsaInpo.setText(mGoodsName);
                //免运费
                detailsaYunfei.setText(data.getCommodityData().getGoodsService());
                //时间
                detailsaJijieEdit.setText(data.getCommodityData().getCreateTime());
                //成分
                detailsaChengfen.setText(data.getCommodityData().getGoodsType());
           data.getCommodityData().getReserve1();
            }
            //添加购物车请求返回判断状态
         if(msg.what==1){
             carData = (ShopsCartBean) msg.obj;
             if(carData.getCode()==200){
               Toast.makeText(DetailsActivity.this,carData.getMsg(),Toast.LENGTH_SHORT).show();
              }
             if(carData.getCode()==201){
                 Toast.makeText(DetailsActivity.this,carData.getMsg(),Toast.LENGTH_SHORT).show();
              }
              if(carData.getCode()==0){
                  Toast.makeText(DetailsActivity.this,carData.getMsg(),Toast.LENGTH_SHORT).show();
              }
          }

        }
    };
    private ShoppingCartData shoppingCartData;


    @Override
    protected void initview() {
        FontHelper.applyFont(this, detailsaPrice, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaChajia, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaDizhi, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaXiaoliang, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaInpo, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaYunfei, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaTuihuo, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaXuanze, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaKoubei, FontHelper.WRYHL);

        FontHelper.applyFont(this, detailsaBnt1, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaBnt2, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaBnt3, FontHelper.WRYHL);


        FontHelper.applyFont(this, detailsaPingjia, FontHelper.PFBD);
        FontHelper.applyFont(this, detailsaJijie, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaJijieEdit, FontHelper.WRYHL);

        FontHelper.applyFont(this, detailsaPingjia, FontHelper.WRYH);
        FontHelper.applyFont(this, detailsaJijie, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaJijieEdit, FontHelper.WRYHL);

        FontHelper.applyFont(this, detailsaChengfen, FontHelper.WRYH);
        FontHelper.applyFont(this, detailsaChengfenEdit, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaFengge, FontHelper.WRYHL);


        FontHelper.applyFont(this, detailsaFenggeEdit, FontHelper.WRYH);
        FontHelper.applyFont(this, detailsaQiongchang, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaQiongchangEdit, FontHelper.WRYHL);

        FontHelper.applyFont(this, detailsaLiji, FontHelper.WRYHL);
        FontHelper.applyFont(this, detailsaGouwucar, FontHelper.WRYHL);

    }
    @Override
    protected void initdata() {
        Intent intent = getIntent();
        String goodsid = intent.getStringExtra("goodsid");
//        LogUtils.e("dadadadada",goodsid);
        if (goodsid != null) {
            CommodityInfo(goodsid);
        }
//        Details_Adapter_shangpingitem adapter = new Details_Adapter_shangpingitem(R.layout.detailsa_adapter_item, list);
//        Details_Adapter_photoitem photoitem = new Details_Adapter_photoitem(R.layout.detailas_adapter_spitem, image);
//        detailsaRecycler.setLayoutManager(new LinearLayoutManager(this));
//        detailsaRecycler.setAdapter(adapter);
//        detailsaXiangqingRecycler.setLayoutManager(new LinearLayoutManager(this));
//        detailsaXiangqingRecycler.setAdapter(photoitem);
    }

    @Override
    protected int layoutRes() {
        return R.layout.detailsa_ctivity;
    }

    @Override
    public void UpData(Object o) {

    }


    @OnClick({
            R.id.detailsa_liji,
            R.id.detailsa_pingjia,
            R.id.detailsa_finsh,
            R.id.detailsa_fenxiang,
            R.id.detailsa_tv,
            R.id.detailsa_xuanze,
            R.id.detailsa_bnt1,
            R.id.detailsa_bnt2,
            R.id.detailsa_bnt3,
            R.id.detailsa_gouwucar,
            R.id.detailsa_gouwuche
    })
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.detailsa_finsh:
                finish();
                break;
            case R.id.detailsa_fenxiang:
                //得到CommodityData中Reserve的json字符串
                View popview = LayoutInflater.from(this).inflate(R.layout.fenxiang_popwindow, null);
                popWin = new PopupWindow(popview, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                //设置点击空白处消失
                popWin.setTouchable(true);
                popWin.setOutsideTouchable(true);
                popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                // 设置背景颜色变暗
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 0.7f;
                getWindow().setAttributes(lp);
                popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = getWindow().getAttributes();
                        lp.alpha = 1f;
                        getWindow().setAttributes(lp);
                    }
                });
                popWin.showAtLocation(detailsaGouwucar, Gravity.BOTTOM, 0, 0);
                RadioButton pengyouquan = (RadioButton) popview.findViewById(R.id.pop_pengyouquan);
                RadioButton weixin = (RadioButton) popview.findViewById(R.id.pop_weixin);
                RadioButton weibo = (RadioButton) popview.findViewById(R.id.pop_weibo);
                RadioButton qq = (RadioButton) popview.findViewById(R.id.pop_qq);
                RadioButton kongjian = (RadioButton) popview.findViewById(R.id.pop_kongjian);
                TextView textView = (TextView) popview.findViewById(R.id.pop_quxiao);
                pengyouquan.setOnClickListener(this);
                weixin.setOnClickListener(this);
                weibo.setOnClickListener(this);
                qq.setOnClickListener(this);
                kongjian.setOnClickListener(this);
                textView.setOnClickListener(this);
                break;

            case R.id.detailsa_tv:
                //点击弹出选择尺寸添加购物车popView方法
                initDataCarBar();
                break;
            case R.id.detailsa_xuanze:

                break;
            case R.id.detailsa_bnt1:
                break;
            case R.id.detailsa_bnt2:
                break;
            case R.id.detailsa_bnt3:
                break;
            case R.id.detailsa_pingjia:
                startActivity(new Intent(DetailsActivity.this, EvaluateActivity.class));
                break;
            case R.id.detailsa_gouwucar:
                initDataCarBar();
                break;
            case R.id.detailsa_liji:
                initDataCarBar();
                break;
            case R.id.detailsa_gouwuche:
                initDataCarBar();
                break;

        }
    }

    //popView添加方法
    private void initDataCarBar() {
        View popupView = getLayoutInflater().inflate(R.layout.size_popupwindow, null);
        popWin = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
        //设置点击空白处消失
        popWin.setTouchable(true);
        popWin.setOutsideTouchable(true);
        popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
        // 设置背景颜色变暗
        WindowManager.LayoutParams l = getWindow().getAttributes();
        l.alpha = 0.7f;
        getWindow().setAttributes(l);
        popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow().getAttributes();
                lp.alpha = 1f;
                getWindow().setAttributes(lp);
            }
        });
        popWin.showAtLocation(detailsaBanner, Gravity.CENTER, 0, 0);
        ImageView guanbi = (ImageView) popupView.findViewById(R.id.pupowindoe_guanbi);
        guanbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popWin.dismiss();
            }
        });
        getPopView(popupView,data);
    }

    //popView的所有逻辑赋值点击赋值方法
    private void getPopView(View popview, CommodBean data) {
        list = new ArrayList<>();
        //初始化popview控件
        initData(popview);
        //赋值图片
        Glide.with(this).load(data.getCommodityData().getGoodsPhoto1()).into(popuwindowIv);
        //解析
        String str = (String) data.getCommodityData().getReserve1();
        Gson gson=new Gson();
        ShoppingCartData[] shoppingCartDatas = gson.fromJson(str, ShoppingCartData[].class);
        for (int i = 0; i  <= shoppingCartDatas.length-1; i++) {
            list.add(shoppingCartDatas[0]);
        }
        //p层对象
        detailsPreseter = new DetailsPreseter(DetailsActivity.this);
        //传递p层所需要的数据
        detailsPreseter.OnColoSize(colorecycler,sizecycler,list,popviewColor,popviewSzie);
       /* popviewColor.setText(list.get(colopor).getGoodsFormatName());
        popviewSzie.setText(list.get(colopor).getCommoditySizeJsonList().get(sizepor).getSizeNumberName());*/
        //点击颜色的接口回调
        detailsPreseter.setDetailsPreseterView(new DetailsPreseterView() {
            @Override
            public void OnDetails(int po) {
            colopor = po;
            }
        });
        //点击尺码接口回调
        detailsPreseter.setDetailsPreseterSizeView(new DetailsPreseterSizeView() {
            @Override
            public void OnDetails(int pos) {
            sizepor = pos;
            }
        });

        //自定义View购物车加减数量变化
        cartAddView = (CartAddView) popview.findViewById(R.id.pop_crataddview);
        //cartAddView.setNum(1);
        cartAddView.setMainLink(new CartMainLink() {
            @Override
            public void onCartLink(int num) {
                goodsNumber = num;
                Toast.makeText(getApplicationContext(), goodsNumber +"", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //初始化控件
    private void initData(final View popview) {
        popuwindowIv = (ImageView) popview.findViewById(R.id.popuwindow_iv);
        popviewColor = (TextView) popview.findViewById(R.id.popuwindow_color);
        popviewSzie = (TextView) popview.findViewById(R.id.popuwindow_szie);
        popdetailsaliji = (Button) popview.findViewById(R.id.detailsa_liji);
        popGouwucar2 = (Button) popview.findViewById(R.id.pop_gouwucar);
        colorecycler = (RecyclerView) popview.findViewById(R.id.pop_colorrecycler);
        sizecycler = (RecyclerView) popview.findViewById(R.id.pop_sizerecycler);

        //立即购买点击事件
        popdetailsaliji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             
               LiJiBean liJiBean = new LiJiBean();
                //图片
                liJiBean.setGoodsPhoto1(data.getCommodityData().getGoodsPhoto1());
               List<CommodityAndSellerList> commodityAndSellerLists = new ArrayList<CommodityAndSellerList>();
                CommodityAndSellerList commodityAndSellerList = new CommodityAndSellerList();
                commodityAndSellerList.setSellerid(data.getCommodityData().getSellerId()+"");
                commodityAndSellerList.setSellerName(data.getCommodityData().getSellerName());
                CommodityInfoList commodityInfoList = new CommodityInfoList();
                commodityInfoList.setCartId("");
                commodityInfoList.setFreight(0+"");
                commodityInfoList.setGoodsCode(data.getCommodityData().getGoodsCode());
                commodityInfoList.setGoodsFormatId(list.get(colopor).getGoodsFormatId());
                commodityInfoList.setGoodsId(data.getCommodityData().getGoodsId());
                commodityInfoList.setGoodsName(data.getCommodityData().getGoodsName());
                commodityInfoList.setGoodsPrice(data.getCommodityData().getGoodsPrice());
                commodityInfoList.setPurchaseSize(goodsNumber+"");
                if(!list.get(colopor).getGoodsFormatName().equals("")){
                    commodityInfoList.setSizeNumberId(list.get(colopor).getCommoditySizeJsonList().get(sizepor).getSizeNumberId());
                    commodityInfoList.setSkuId(DetailsSkuId);
                }
                commodityAndSellerList.setCommodityInfoList(commodityInfoList);
                commodityAndSellerLists.add(commodityAndSellerList);
                liJiBean.setCommodityAndSellerList(commodityAndSellerLists);
                Intent intent = new Intent(DetailsActivity.this, OrderActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("liji",liJiBean);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        //加入购物车点击事件方法
        popGouwucar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, String> stringStringHashMap = new HashMap<>();
                HashMap<String, String> cartmap = new HashMap<>();
                cartmap.put("sellerId",data.getCommodityData().getSellerId()+"");
                cartmap.put("sellerName",data.getCommodityData().getSellerName());
                cartmap.put("goodsId",data.getCommodityData().getGoodsId());
                try {
                    String goodsName = String.valueOf(data.getCommodityData().getGoodsName().getBytes("UTF-8"));
                    cartmap.put("goodsName",goodsName);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                cartmap.put("goodsNumber",goodsNumber+"");
                if(list.get(colopor).getGoodsFormatId()!=null){
                    cartmap.put("goodsFormatId",list.get(colopor).getGoodsFormatId());
                }
                if(list!=null&&list.get(colopor).getCommoditySizeJsonList().size()>0){
                    cartmap.put("sizeNumberId",list.get(colopor).getCommoditySizeJsonList().get(sizepor).getSizeNumberId());
                }
                SPUtils spUtils=new SPUtils("personInfo");
                String token = spUtils.getString("token", null);
                cartmap.put("goodsCode",data.getCommodityData().getGoodsCode());
                stringStringHashMap.put("token",token);
                cartmap.put("token", token);RetrofitClientUtlis.getInstance(DetailsActivity.this, Url.shopsCartl,stringStringHashMap).createBaseApi().post2(Url.shopsCartl2, cartmap, new BaseObserBean2<ShopsCartBean>(DetailsActivity.this, ShopsCartBean.class) {
                   @Override
                   public void Next(ShopsCartBean data) {
                       Message obtain = Message.obtain();
                       obtain.what = 1;
                       obtain.obj = data;
                        hh.sendMessage(obtain);
                   }
               });
         }

        });
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pop_pengyouquan:
                new ShareAction(DetailsActivity.this).setPlatform(SHARE_MEDIA.WEIXIN)
                        .withText("hello")
                        .setCallback(umShareListener)
                        .share();
                break;
            case R.id.pop_weixin:
                showfenxiang(SHARE_MEDIA.WEIXIN);
                break;
            case R.id.pop_weibo:
                showfenxiang(SHARE_MEDIA.SINA);
                break;
            case R.id.pop_qq:
                UMImage image = new UMImage(context,"http://imgqn.koudaitong.com/upload_files/2015/06/02/Fi3n5MNwbQ8BkYJV1pNSM7dCARsM.jpg%21580x580.jpg");
                new ShareAction(this)
                        .setPlatform(SHARE_MEDIA.QQ)
                        .setCallback(umShareListener)
                        .withText("hello world!").withMedia(image).share();
                break;
            case R.id.pop_kongjian:
                showfenxiang(SHARE_MEDIA.QZONE);
                break;
            case R.id.pop_quxiao:
                popWin.dismiss();
                break;
        }

    }
    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onStart(SHARE_MEDIA platform) {
            //分享开始的回调
        }
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Log.d("plat", "platform" + platform);
            Toast.makeText(DetailsActivity.this, platform + " 分享成功啦", Toast.LENGTH_SHORT).show();

        }
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(DetailsActivity.this, platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if (t != null) {
                Log.d("throw", "throw:" + t.getMessage());
            }
        }
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(DetailsActivity.this, platform + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);

    }
    public void showfenxiang(SHARE_MEDIA qq) {
        new ShareAction(this)
                .setPlatform(qq)
                .setCallback(umShareListener)
                .withText("hello world!").share();
    }
    public void addShop(int sellerId, String sellerName, String goodsId, String goodsName, String gsId, String skuId, int goodsNumber) {
        DetailsSkuId = skuId;
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        HashMap<String, String> addshop = new HashMap<>();
        addshop.put("sellerId",Integer.toString(sellerId));
        addshop.put("goodsNumber", Integer.toString(goodsNumber));
        addshop.put("sellerName", sellerName);
        addshop.put("goodsId", goodsId);
        addshop.put("goodsName", goodsName);
        addshop.put("gsId", gsId);
        addshop.put("skuId", DetailsSkuId);
        SharedPreferences personInfo = getSharedPreferences("personInfo", Context.MODE_PRIVATE);
        String token = personInfo.getString("token", null);
        stringStringHashMap.put("token", token);
                RetrofitClientUtlis.getInstance(this, Url.addshopurl, stringStringHashMap).createBaseApi().post(Url
                        .addshopurl2, addshop, new BaseObserBean2<String>(this) {
                    @Override
                    public void Next(String data) {
                Log.d("HLLTAG", data);
            }
        });
    }

    public void CommodityInfo(String goodsid) {

        HashMap<String, String> addshop = new HashMap<>();
        addshop.put("goodsId", goodsid);

        RetrofitClientUtlis.getInstance(this, Url.commodurl).createBaseApi().post2(Url.commodurl2, addshop,
                new BaseObserBean2<CommodBean>(this, CommodBean.class) {
            @Override
            public void Next(CommodBean data) {
                Message obtain = Message.obtain();
                obtain.what = 0;
                obtain.obj = data;
                hh.sendMessage(obtain);
            }
        });
    }
}


