package com.ssmk.module.shoppingcar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.ssmk.R;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * author：郑志强
 * data：2017/7/7 11:47
 * function：
 */

public class LogisticsDetailsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.logistics_item_express, null);
                viewHolder = new ViewHolderExpress(view);
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.logistics_item_follow, null);
                viewHolder = new ViewHolderFollow(view);
                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.logistics_item_info, null);
                viewHolder = new ViewHolderInfo(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //根据条目的类型给holder中的控件填充数据
        int itemViewType = getItemViewType(position);
        switch (itemViewType) {
            case 0:
                ViewHolderExpress vh = (ViewHolderExpress) holder;
                break;
            case 1:
                ViewHolderFollow vh1 = (ViewHolderFollow) holder;
                break;
            case 2:
                ViewHolderInfo vh2 = (ViewHolderInfo) holder;
                if (position==2){
                    vh2.mRelayout_yuandp.setVisibility(View.VISIBLE);
                    vh2.mRelayout_yuan.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

    @Override
    public int getItemCount() {
        //获取条目数，模拟数据，这里是写死的
        return 6;
    }
    @Override
    public int getItemViewType(int position) {
        //跟据position对应的条目返回去对应的样式（Type）
        if (position ==0) {
            return 0;
        } else if (position==1) {
            return 1;
        } else return 2;
    }

    class ViewHolderExpress extends RecyclerView.ViewHolder {

        public ViewHolderExpress(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
        }
    }

    class ViewHolderFollow extends RecyclerView.ViewHolder {

        public ViewHolderFollow(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
        }
    }

    class ViewHolderInfo extends RecyclerView.ViewHolder{
        RelativeLayout mRelayout_yuandp,mRelayout_yuan;
        public ViewHolderInfo(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
            mRelayout_yuandp= (RelativeLayout) itemView.findViewById(R.id.relayout_yuandp);
            mRelayout_yuan= (RelativeLayout) itemView.findViewById(R.id.relayout_yuan);
        }
    }
}
