package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.ssmk.module.merchant.view.Shopping_Activity;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 11:11
 * 邮箱：17600157003@163.com
 */
public class Marter_item_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @BindView(R.id.marter_item_iv)
    ImageView marterItemIv;
    private boolean bo = false;
    private List<ShoppingFeileiBean.MerchantsDataBean.MerchantsSellerInfoBean> list = new ArrayList<>();
    public Marter_item_Adapter(Context mContext, List<ShoppingFeileiBean.MerchantsDataBean.MerchantsSellerInfoBean> list) {
        this.mContext = mContext;
        this.list = list;
    }

    public void setBo(boolean bo1){
        this.bo = bo1;
    }
    private Context mContext;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.marter_item_adapter, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        if (bo) {
            viewHolder.mermatJuli.setVisibility(View.VISIBLE);
            Log.e("bo", "onBindViewHolder: " + bo + "Visible");
        } else {
            viewHolder.mermatJuli.setVisibility(View.GONE);
            Log.e("bo", "onBindViewHolder: " + bo + "GONE");
        }
        Glide.with(mContext).load(list.get(position).getSellerIcon()).into(((ViewHolder) holder).marterItemIv);
        viewHolder.shoppNamePinyin.setText(list.get(position).getSellerLoginName());
        viewHolder.shoppName.setText(list.get(position).getSellerName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("=====", "onClick: 条目：" + list.get(position).getSellerId());
                Intent intent = new Intent(mContext, Shopping_Activity.class);
                intent.putExtra("id", String.valueOf(list.get(position).getSellerId()));
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.marter_item_iv)
        ImageView marterItemIv;
        @BindView(R.id.mermat_rayout)
        RelativeLayout mermatRayout;
        @BindView(R.id.shopp_name)
        TextView shoppName;
        @BindView(R.id.mermat_km1)
        TextView mermatKm1;
        @BindView(R.id.mermat_km2)
        TextView mermatKm2;
        @BindView(R.id.mermat_juli)
        RelativeLayout mermatJuli;
        @BindView(R.id.shopp_name_pinyin)
        TextView shoppNamePinyin;

        public ViewHolder(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
