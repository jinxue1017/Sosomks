package com.ssmk.adapter;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.mylhyl.acp.Acp;
import com.mylhyl.acp.AcpListener;
import com.mylhyl.acp.AcpOptions;
import com.ssmk.R;
import com.ssmk.module.home.bean.Home_bean;
import com.ssmk.module.home.bean.WabUrlBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.home.utils.GildeImage;
import com.ssmk.module.home.view.HomeWabActivity;
import com.ssmk.module.home.view.Home_History_activity;
import com.ssmk.module.home.view.Home_NFC_activity;
import com.ssmk.module.home.view.Home_TwoCode_activity;
import com.ssmk.url.Url;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerClickListener;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chengqianlang on 2017/6/28.
 */

public class HomeRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    List<Home_bean.AppNewsBean> appNews;
    List<Home_bean.ShopsCarouselBean> shopsCarousel;
    List<Home_bean.ShopsRecommendBean> shopsRecommend;
    private ArrayList<Object> mvplist;


    public HomeRecyclerAdapter(Context context, List<Home_bean.AppNewsBean> appNews, List<Home_bean.ShopsCarouselBean> shopsCarousel, List<Home_bean.ShopsRecommendBean> shopsRecommend) {
        mContext = context;
        this.appNews = appNews;
        this.shopsCarousel = shopsCarousel;
        this.shopsRecommend = shopsRecommend;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 1:
                View home_vp = LayoutInflater.from(mContext).inflate(R.layout.home_item_vp, parent, false);
                VpPart vpPart = new VpPart(home_vp);
                return vpPart;
            case 2:
                View threebutpart = LayoutInflater.from(mContext).inflate(R.layout.home_item_threebut, parent, false);
                Threebutpart tbp = new Threebutpart(threebutpart);
                return tbp;
            case 3:
                View midpart = LayoutInflater.from(mContext).inflate(R.layout.home_item_mid, parent, false);
            Mid mid = new Mid(midpart);
            return mid;
        }
        View home_item = LayoutInflater.from(mContext).inflate(R.layout.home_item, parent, false);
        final Item item = new Item(home_item);
   /*     item.itemview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, DetailsActivity.class));
            }
        });*/
        return item;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder instanceof Item) {
            if (position > 2) {
               int  mposition=position - 3;
                ((Item) holder).bindItemdata(appNews.get(mposition),mposition);
            }
        }

    }

    @Override
    public int getItemCount() {
        if (appNews != null && appNews.size() > 0) {
            return appNews.size() + 3;
        } else {
            return 10;
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
        }
        return 0;
    }

    public class VpPart extends RecyclerView.ViewHolder {
        Banner mBanner;

        public VpPart(View itemView) {
            super(itemView);
            AutoUtils.autoSize(itemView);
            mBanner = (Banner) itemView.findViewById(R.id.item_vp_banner);
            mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
            mBanner.setIndicatorGravity(BannerConfig.RIGHT);
            mBanner.setImageLoader(new GildeImage());
            mvplist = new ArrayList<>();
            if (shopsCarousel != null && shopsCarousel.size() > 0) {
                mvplist.clear();
                for (int i = 0; i < shopsCarousel.size(); i++) {
                    if (shopsCarousel.get(i).getPhotoPath() != null) {
                        mvplist.add(shopsCarousel.get(i).getPhotoPath());
                    }
                }
            } else {
                mvplist.clear();
                for (int j = 0; j < 5; j++) {
                    mvplist.add(R.drawable.banner);
                }
            }
            mBanner.setImages(mvplist);
            mBanner.start();
            mBanner.setOnBannerClickListener(new OnBannerClickListener() {
                @Override
                public void OnBannerClick(int position) {
                    Intent intent = new Intent(mContext, HomeWabActivity.class);
                    //1代表轮播图
                    intent.putExtra("WabUrl",new WabUrlBean(shopsCarousel.get(position).getApPath(),1));
                    LogUtils.e("哒哒哒",shopsCarousel.get(position).getApPath());
                    mContext.startActivity(intent);
                }
            });
        }

    }

    public class Threebutpart extends RecyclerView.ViewHolder {
        @BindView(R.id.threebut_iv_shopping)
        ImageView mThreebutIvShopping;
        @BindView(R.id.threebut_tv_shopping)
        TextView mThreebutTvShopping;
        @BindView(R.id.threebut_iv_nfc)
        ImageView mThreebutIvNfc;
        @BindView(R.id.threebut_tv_nfc)
        TextView mThreebutTvNfc;
        @BindView(R.id.threebut_iv_twocode)
        ImageView mThreebutIvTwocode;
        @BindView(R.id.threebut_tv_twocode)
        TextView mThreebutTvTwocode;
        @BindView(R.id.threebut_iv_history)
        ImageView mThreebutIvHistory;
        @BindView(R.id.threebut_tv_history)
        TextView mThreebutTvHistory;
        @BindView(R.id.threebut_ll_shopping)
        LinearLayout mThreebutLlShopping;
        @BindView(R.id.threebut_ll_nfc)
        LinearLayout mThreebutLlNfc;
        @BindView(R.id.threebut_ll_twocode)
        LinearLayout mThreebutLlTwocode;
        @BindView(R.id.threebut_ll_history)
        LinearLayout mThreebutLlHistory;

        Threebutpart(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            FontHelper.applyFont(mContext, mThreebutTvShopping, FontHelper.PFL);
            FontHelper.applyFont(mContext, mThreebutTvNfc, FontHelper.PFL);
            FontHelper.applyFont(mContext, mThreebutTvTwocode, FontHelper.PFL);
            FontHelper.applyFont(mContext, mThreebutTvHistory, FontHelper.PFL);
            //nfc页面
            mThreebutLlNfc.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, Home_NFC_activity.class);
                    mContext.startActivity(intent);
                }
            });
            //历史页面
            mThreebutLlHistory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, Home_History_activity.class);
                    mContext.startActivity(intent);
                }
            });
            //二维码的点击事件
            mThreebutLlTwocode.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //调用6.0动态权限
                    Acp.getInstance(mContext).request(new AcpOptions.Builder()
                                    .setPermissions(Manifest.permission.CAMERA)
                                    .build(),
                            new AcpListener() {
                                @Override
                                public void onGranted() {
                                    Intent intent = new Intent(mContext, Home_TwoCode_activity.class);
                                    mContext.startActivity(intent);
                                }

                                @Override
                                public void onDenied(List<String> permissions) {
                                    Toast.makeText(mContext, "拒绝权限", Toast.LENGTH_SHORT).show();
                                }
                            });
                }
            });
        }
    }

    public class Mid extends RecyclerView.ViewHolder {
        @BindView(R.id.mid_lltop)
        LinearLayout mMidLltop;
        @BindView(R.id.mid_recycle)
        RecyclerView mMidRecycle;
        @BindView(R.id.mid_llup)
        LinearLayout mMidLlup;
        @BindView(R.id.mid_tv_jxhh)
        TextView mMidTvJxhh;
        @BindView(R.id.mid_tv_ttzx)
        TextView mMidTvTtzx;

        Mid(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            HomeMidRecyclerAdapter midadapter = new HomeMidRecyclerAdapter(mContext, shopsRecommend);
            mMidRecycle.setAdapter(midadapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext);
            linearLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
            mMidRecycle.setLayoutManager(linearLayoutManager);
            FontHelper.applyFont(mContext, mMidTvJxhh, FontHelper.WRYHBD);
            FontHelper.applyFont(mContext, mMidTvTtzx, FontHelper.WRYHBD);
        }
    }

    public class Item extends RecyclerView.ViewHolder {
        @BindView(R.id.home_item_iv)
        ImageView mHomeItemIv;
        @BindView(R.id.home_item_tvname)
        TextView mHomeItemTvname;
        @BindView(R.id.home_item_tvtime)
        TextView mHomeItemTvtime;
        View itemview;

        Item(View view) {
            super(view);
            AutoUtils.autoSize(view);
            ButterKnife.bind(this, view);
            itemview = view;
            FontHelper.applyFont(mContext, mHomeItemTvname, FontHelper.PFM);
            FontHelper.applyFont(mContext, mHomeItemTvtime, FontHelper.PFM);
        }
        private void bindItemdata(final Home_bean.AppNewsBean bean, final int mposition) {
            if (!TextUtils.isEmpty(bean.getNewsTitle())) {
                mHomeItemTvname.setText(bean.getNewsTitle());
            }
            if (!TextUtils.isEmpty((String) bean.getCreateTime())) {
                mHomeItemTvtime.setText((String) bean.getCreateTime());
            }
            Glide.with(mContext).load(bean.getNewsPath()).error(R.drawable.a2222).into(mHomeItemIv);
            itemview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WabUrlBean wabUrlBean=new WabUrlBean(Url.HOME_DETAILS+bean.getNewsId()+Url.HOME_DETAILS_TYPE,2);
                    Intent intent=new Intent(mContext,HomeWabActivity.class);
                    intent.putExtra("WabUrl",wabUrlBean);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
