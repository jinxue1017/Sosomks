package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.home.bean.Home_bean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.view.DetailsActivity;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chengqianlang on 2017/7/5.
 * 精选好货
 */

public class HomeMidRecyclerAdapter extends RecyclerView.Adapter<HomeMidRecyclerAdapter.ViewHolder> {
    private Context mContext;
    List<Home_bean.ShopsRecommendBean> shopsRecommend;

    public HomeMidRecyclerAdapter(Context context, List<Home_bean.ShopsRecommendBean> shopsRecommend) {
        mContext = context;
        this.shopsRecommend = shopsRecommend;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.home_mid_item, parent, false);
        final ViewHolder holder = new ViewHolder(view);
        holder.midview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Intent intent = new Intent(mContext, DetailsActivity.class);
                //goodsId为0
                if (shopsRecommend != null && shopsRecommend.size() > 0) {
                    intent.putExtra("goodsid", String.valueOf(shopsRecommend.get(position).getGoodsId()));
//                    LogUtils.e("dadadadada",shopsRecommend.get(position).getGoodsId());
                }

                mContext.startActivity(intent);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        if (shopsRecommend != null && shopsRecommend.size() > 0) {
            Home_bean.ShopsRecommendBean bean = shopsRecommend.get(position);
            if (bean.getGoodsName() != null) {
                holder.mHomeMidItemTvname.setText(bean.getGoodsName());
            }
            if (bean.getRecommendSort() != null) {
                holder.mHomeMidItemTvoldmoney.setText("¥" + bean.getGoodsPrice());
            }
            if (bean.getIsShow() != null) {
                holder.mHomeMidItemTvmoney.setText("¥" + bean.getDiscountPrice());
            }
            Glide.with(mContext).load(bean.getGoodsPhoto1()).error(R.drawable.a2222).into(holder.mHomeMidItemIv);

        }


    }


    @Override
    public int getItemCount() {
        if (shopsRecommend != null && shopsRecommend.size() > 0) {
            return shopsRecommend.size();
        } else {
            return 10;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.home_mid_item_iv)
        ImageView mHomeMidItemIv;
        @BindView(R.id.home_mid_item_tvname)
        TextView mHomeMidItemTvname;
        @BindView(R.id.home_mid_item_tvmoney)
        TextView mHomeMidItemTvmoney;
        @BindView(R.id.home_mid_item_tvoldmoney)
        TextView mHomeMidItemTvoldmoney;
        View midview;

        public ViewHolder(View itemView) {
            super(itemView);
            AutoUtils.autoSize(itemView);
            ButterKnife.bind(this, itemView);
            midview = itemView;
            mHomeMidItemTvoldmoney.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
            FontHelper.applyFont(mContext, mHomeMidItemTvname, FontHelper.WRYH);
            FontHelper.applyFont(mContext, mHomeMidItemTvmoney, FontHelper.WRYH);
            FontHelper.applyFont(mContext, mHomeMidItemTvoldmoney, FontHelper.WRYH);
        }
    }

}
