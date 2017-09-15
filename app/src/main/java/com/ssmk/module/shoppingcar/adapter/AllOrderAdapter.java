package com.ssmk.module.shoppingcar.adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;
import com.ssmk.R;
import com.ssmk.module.shoppingcar.bean.OrderAllBean;
import com.ssmk.module.shoppingcar.bean.SkuInfoBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author：郑志强
 * data：2017/7/6 19:19
 * function：
 */

public class AllOrderAdapter extends RecyclerView.Adapter<AllOrderAdapter.MyViewHolder> implements View.OnClickListener {
    private Context mContext;
    private List<OrderAllBean.DataBean> list = new ArrayList<>();

    public AllOrderAdapter(Context context) {
        mContext = context;
    }

    public void setData(List<OrderAllBean.DataBean> datas) {
        Log.i("=====", "setData: "+datas.size());
             if (datas!=null){
                 list.addAll(datas);
             }
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.allorder_recycler_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        //将创建的View注册点击事件
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popupView = LayoutInflater.from(mContext).inflate(R.layout.order_cancel_popup, null);
                PopupWindow popWin = new PopupWindow(popupView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                //设置点击空白处消失
                popWin.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                popWin.setTouchable(true);
                popWin.setOutsideTouchable(true);

                // 设置背景颜色变暗
                final Activity activity = (Activity) mContext;
                WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                lp.alpha = 0.4f;
                activity.getWindow().setAttributes(lp);
                popWin.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                        lp.alpha = 1f;
                        activity.getWindow().setAttributes(lp);
                    }
                });
                popWin.showAtLocation(holder.itemView, Gravity.BOTTOM, 0, 0);
            }
        });
        holder.btn_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View popupView2 = LayoutInflater.from(mContext).inflate(R.layout.order_pay_popup, null);
                PopupWindow popWin2 = new PopupWindow(popupView2, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
                //设置点击空白处消失
                popWin2.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                popWin2.setTouchable(true);
                popWin2.setOutsideTouchable(true);
                // 设置背景颜色变暗
                final Activity activity = (Activity) mContext;
                WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                lp.alpha = 0.4f;
                activity.getWindow().setAttributes(lp);
                popWin2.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    @Override
                    public void onDismiss() {
                        WindowManager.LayoutParams lp = activity.getWindow().getAttributes();
                        lp.alpha = 1f;
                        activity.getWindow().setAttributes(lp);
                    }
                });
                popWin2.showAtLocation(holder.itemView, Gravity.BOTTOM, 0, 0);
            }
        });


        //将position保存在itemView的Tag中，以便点击时进行获取
        holder.itemView.setTag(position);

        //=============================================

        String skuInfo = list.get(position).getOrderInfoDetailList().get(0).getSkuInfo();
        Gson gson=new Gson();
        SkuInfoBean skuInfoBean = gson.fromJson(skuInfo, SkuInfoBean.class);

        // Glide.with(mContext).load(skuInfoBean.getCommodityFormatJson().getGoodsFormatPhoto()).into(holder.allorder_shop_iv);
         holder.allorder_shop_name.setText(list.get(position).getGoodsName());
         holder.allorder_shop_count.setText(list.get(position).getOrderInfoDetailList().get(0).getPurchaseSize()+"");
         holder.allorder_shop_price.setText(list.get(position).getOrderPrice());
         holder.allorder_shop_size.setText(list.get(position).getOrderInfoDetailList().get(0).getSizeNumberId());
         //holder.allorder_shop_color.setText(skuInfoBean.getCommodityFormatJson().getGoodsFormatName());
         holder.allorder_shop_state.setText(list.get(position).getOrderStatus());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v, (int) v.getTag());
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        Button btn_cancel, btn_pay;
        private ImageView allorder_shop_iv;
        private TextView allorder_shop_state;
        private TextView allorder_shop_name;
        private TextView allorder_shop_count;
        private TextView allorder_shop_size;
        private TextView allorder_shop_color;
        private TextView allorder_shop_price;

        public MyViewHolder(View itemView) {
            super(itemView);
            btn_cancel = (Button) itemView.findViewById(R.id.allorder_btn1);
            btn_pay = (Button) itemView.findViewById(R.id.allorder_btn2);
            allorder_shop_iv = (ImageView) itemView.findViewById(R.id.allorder_shop_iv);
            allorder_shop_state = (TextView) itemView.findViewById(R.id.allorder_shop_state);
            allorder_shop_name = (TextView) itemView.findViewById(R.id.allorder_shop_name);
            allorder_shop_count = (TextView) itemView.findViewById(R.id.allorder_shop_count);
            allorder_shop_size = (TextView) itemView.findViewById(R.id.allorder_shop_size);
            allorder_shop_color = (TextView) itemView.findViewById(R.id.allorder_shop_color);
            allorder_shop_price = (TextView) itemView.findViewById(R.id.allorder_shop_price);


        }
    }

    public static interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private OnItemClickListener mOnItemClickListener = null;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }
}
