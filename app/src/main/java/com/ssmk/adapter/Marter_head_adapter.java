package com.ssmk.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.ssmk.module.merchant.view.RecyclerViewListener;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Marter_head_adapter extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener {


    private List<ShoppingFeileiBean.MerchantsTypeDataBean> list = new ArrayList<>();
    private Context context;
    private MyViewHolder myViewHolder;

    private RecyclerViewListener.OnItemClickListener listener;
    private RecyclerViewListener.OnItemLongClickListener longListener;


    public Marter_head_adapter(Context context) {
        this.context = context;
    }

    public void setOnItemClickListener(RecyclerViewListener.OnItemClickListener listener) {
        this.listener = listener;
    }

    public void setOnLongItemClickListener(RecyclerViewListener.OnItemLongClickListener longListener) {
        this.longListener = longListener;
    }

    public void setData(List<ShoppingFeileiBean.MerchantsTypeDataBean> datas) {

        if (datas != null) {

            list.addAll(datas);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myHolder = (MyViewHolder) holder;
        myHolder.itemView.setTag(position);


        myHolder.tvName.setText(list.get(position).getTypeName());

        Glide.with(context).load(list.get(position).getOriginalIcon()).into(myHolder.ivIcon);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.OnItemClick(v, (Integer) v.getTag());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (longListener != null) {
            longListener.OnLongItemClick(v, (Integer) v.getTag());
        }
        return false;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.iv_icon)
        ImageView ivIcon;
        @BindView(R.id.tv_name)
        TextView tvName;

        public MyViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
            AutoUtils.auto(itemView);
            FontHelper.applyFont(context, tvName, FontHelper.WRYHL);
        }

    }
}
