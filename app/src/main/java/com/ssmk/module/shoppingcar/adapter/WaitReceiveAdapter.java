package com.ssmk.module.shoppingcar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ssmk.R;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * author：郑志强
 * data：2017/7/7 11:47
 * function：
 */

public class WaitReceiveAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_info, null);
                viewHolder = new ViewHolderInfo(view);
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_order, null);
                viewHolder = new ViewHolderOrder(view);
                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_user, null);
                viewHolder = new ViewHolderUser(view);
                break;
            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_goods, null);
                viewHolder = new ViewHolderGoods(view);
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
                ViewHolderInfo vh0= (ViewHolderInfo) holder;
                break;
            case 1:
                ViewHolderOrder vh1 = (ViewHolderOrder) holder;
                vh1.weixin.setVisibility(View.VISIBLE);
                break;
            case 2:
                ViewHolderUser vh2 = (ViewHolderUser) holder;
                break;
            case 3:
                ViewHolderGoods vh3 = (ViewHolderGoods) holder;
                break;
        }
    }

    @Override
    public int getItemCount() {
        //获取条目数，模拟数据，这里是写死的
        return 4;
    }
    @Override
    public int getItemViewType(int position) {
        //跟据position对应的条目返回去对应的样式（Type）
        if (position ==0) {
            return 0;
        } else if (position==1) {
            return 1;
        } else if (position==2) {
            return 2;
        }else return 3;
    }

    class ViewHolderInfo extends RecyclerView.ViewHolder {

        public ViewHolderInfo(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
        }
    }

    class ViewHolderOrder extends RecyclerView.ViewHolder {
        ImageView weixin;
        public ViewHolderOrder(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
            weixin= (ImageView) itemView.findViewById(R.id.orderdetails_weixin);
        }
    }

    class ViewHolderUser extends RecyclerView.ViewHolder {

        public ViewHolderUser(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
        }
    }

    class ViewHolderGoods extends RecyclerView.ViewHolder{

        public ViewHolderGoods(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
        }
    }


}
