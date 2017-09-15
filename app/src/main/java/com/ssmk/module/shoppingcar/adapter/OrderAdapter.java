package com.ssmk.module.shoppingcar.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.merchant.Data;
import com.ssmk.module.merchant.bean.CommodBean;
import com.ssmk.module.merchant.bean.CommodityAndSellerList;
import com.ssmk.module.merchant.bean.GoodsBean;
import com.ssmk.module.merchant.bean.LiJiBean;
import com.ssmk.module.shoppingcar.bean.ShopsOrderBean;

import java.util.ArrayList;
import java.util.List;

/**
 * author：郑志强
 * data：2017/7/7 11:47
 * function：
 */

public class OrderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<CommodityAndSellerList> listGoods = new ArrayList<>();
    private Double totalPrice = 0.00;
    private int count = 0;

    public OrderAdapter(Context context) {
        mContext = context;
    }


    public void setData(List<CommodityAndSellerList> dataGoods) {
        if (dataGoods != null) {
            listGoods.addAll(dataGoods);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_user, null);
                viewHolder = new ViewHolderUser(view);
                //将创建的View注册点击事件
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (mOnItemClickLitener != null) {
                            //注意这里使用getTag方法获取position
                            mOnItemClickLitener.onItemClick(v, (int) v.getTag());
                        }
                    }
                });
                break;
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_count, null);
                viewHolder = new ViewHolderCount(view);

                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_goods, null);
                viewHolder = new ViewHolderGoods(view);
                break;
            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_money, null);
                viewHolder = new ViewHolderMoney(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        LiJiBean liJiBean = Data.liJiBean;
        List<CommodityAndSellerList> commodityAndSellerList = liJiBean.getCommodityAndSellerList();
        //根据条目的类型给holder中的控件填充数据
        int itemViewType = getItemViewType(position);
        ViewHolderUser vh = null;
        switch (itemViewType) {
            case 0:
                vh = (ViewHolderUser) holder;
                vh.itemView.setTag(position);
                vh.order_user_name.setText("李开虎");
                vh.order_user_tel.setText("17600803266");
                vh.order_order_remain.setText("北京市丰台区太平桥东局81号");

                break;
            case 1:
                ViewHolderCount vh1 = (ViewHolderCount) holder;

                String sellerName = commodityAndSellerList.get(0).getSellerName();
                vh1.orderdetails_user_info.setText(sellerName);

                break;
            case 2:
                ViewHolderGoods vh2 = (ViewHolderGoods) holder;

                String goodsName = commodityAndSellerList.get(0).getCommodityInfoList().getGoodsName();
                String purchaseSize = commodityAndSellerList.get(0).getCommodityInfoList().getPurchaseSize();
                String sizeNumberId = commodityAndSellerList.get(0).getCommodityInfoList().getSizeNumberId();
                String goodsFormatId = commodityAndSellerList.get(0).getCommodityInfoList().getGoodsFormatId();
                String goodsPrice = commodityAndSellerList.get(0).getCommodityInfoList().getGoodsPrice();

                Glide.with(mContext).load(liJiBean.getGoodsPhoto1()).into(vh2.order_goods_iv);
                vh2.order_goods_name.setText(goodsName);
                vh2.order_goods_count.setText(purchaseSize);
                vh2.order_goods_size.setText(sizeNumberId);
                vh2.order_goods_color.setText(goodsFormatId);
                vh2.order_goods_price.setText(goodsPrice);

                break;
            case 3:
                ViewHolderMoney vh3 = (ViewHolderMoney) holder;
                String goodsPrice3 = commodityAndSellerList.get(0).getCommodityInfoList().getGoodsPrice();


                double v = Double.parseDouble(String.valueOf(goodsPrice3)) * count;
                this.totalPrice = v;
                //vh3.order_goods_money.setText("￥"+ totalPrice);
                vh3.order_goods_money.setText(goodsPrice3);
                break;
        }

    }

    @Override
    public int getItemCount() {
        //获取条目数，模拟数据，这里是写死的
        return 5;
    }

    @Override
    public int getItemViewType(int position) {
        //跟据position对应的条目返回去对应的样式（Type）
        if (position == 0) {
            return 0;
        } else if (position == 1) {
            return 1;
        } else if (position == 4) {
            return 3;
        } else
            return 2;
    }

    class ViewHolderUser extends RecyclerView.ViewHolder {

        private TextView order_user_name;
        private TextView order_user_tel;
        private TextView order_order_remain;

        public ViewHolderUser(View itemView) {
            super(itemView);

            order_user_name = (TextView) itemView.findViewById(R.id.order_user_name);
            order_user_tel = (TextView) itemView.findViewById(R.id.order_user_tel);
            order_order_remain = (TextView) itemView.findViewById(R.id.order_order_remain);
        }
    }

    class ViewHolderCount extends RecyclerView.ViewHolder {
        private TextView orderdetails_user_info;

        public ViewHolderCount(View itemView) {
            super(itemView);
            orderdetails_user_info = (TextView) itemView.findViewById(R.id.orderdetails_user_info);

        }
    }

    class ViewHolderGoods extends RecyclerView.ViewHolder {

        private ImageView order_goods_iv;
        private TextView order_goods_name;
        private TextView order_goods_count;
        private TextView order_goods_size;
        private TextView order_goods_color;
        private TextView order_goods_price;

        public ViewHolderGoods(View itemView) {
            super(itemView);

            order_goods_iv = (ImageView) itemView.findViewById(R.id.order_goods_iv);
            order_goods_name = (TextView) itemView.findViewById(R.id.order_goods_name);
            order_goods_count = (TextView) itemView.findViewById(R.id.order_goods_count);
            order_goods_size = (TextView) itemView.findViewById(R.id.order_goods_size);
            order_goods_color = (TextView) itemView.findViewById(R.id.order_goods_color);
            order_goods_price = (TextView) itemView.findViewById(R.id.order_goods_price);
        }
    }

    class ViewHolderMoney extends RecyclerView.ViewHolder {
        private TextView order_goods_money;

        public ViewHolderMoney(View itemView) {
            super(itemView);

            order_goods_money = (TextView) itemView.findViewById(R.id.order_goods_money);
        }
    }

    public interface OnItemClickLitener {
        void onItemClick(View view, int position);
    }

    private OnItemClickLitener mOnItemClickLitener;

    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener) {
        this.mOnItemClickLitener = mOnItemClickLitener;
    }

}
