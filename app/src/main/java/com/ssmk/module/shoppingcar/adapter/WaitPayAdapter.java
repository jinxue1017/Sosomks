package com.ssmk.module.shoppingcar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ssmk.R;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * author：郑志强
 * data：2017/7/7 11:47
 * function：
 */

public class WaitPayAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_order, null);
                viewHolder = new ViewHolderOrder(view);
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderdetails_item_user, null);
                viewHolder = new ViewHolderUser(view);
                break;
            case 2:
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
                ViewHolderOrder vh = (ViewHolderOrder) holder;
                break;
            case 1:
                ViewHolderUser vh1 = (ViewHolderUser) holder;
                break;
            case 2:
                ViewHolderGoods vh2 = (ViewHolderGoods) holder;
                break;
        }
    }

    @Override
    public int getItemCount() {
        //获取条目数，模拟数据，这里是写死的
        return 3;
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

    class ViewHolderOrder extends RecyclerView.ViewHolder {
        public ViewHolderOrder(View itemView) {
            super(itemView);
            AutoUtils.auto(itemView);
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
