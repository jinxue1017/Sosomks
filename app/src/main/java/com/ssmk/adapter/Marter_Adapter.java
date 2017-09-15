package com.ssmk.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 09:55
 * 邮箱：17600157003@163.com
 */

public class Marter_Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final int ITEMONT = 0;
    private final int ITEMTWO = 1;
    @BindView(R.id.rl_item)
    RelativeLayout rlItem;

    private int index = -1;
    private int itemState = 0;
    private List<ShoppingFeileiBean.MerchantsDataBean> list;
    public List<Marter_item_Adapter> adapterList = new ArrayList<>();
    private Context mContext;
    private View view;
    public Marter_Adapter(Context mContext, List<ShoppingFeileiBean.MerchantsDataBean> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(mContext).inflate(R.layout.marter_adapter_item2, parent, false);
        ViewHolderOne2 holderOne2 = new ViewHolderOne2(view);
        return holderOne2;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        //likaihu Modify 点击type分类

        if (index == -1) {

            ViewHolderOne2 two = (ViewHolderOne2) holder;
            two.mMarterAdapterTv.setText(list.get(position).getTypeName());
            List<ShoppingFeileiBean
                    .MerchantsDataBean
                    .MerchantsSellerInfoBean>
                    merchantsSellerInfo
                    = list.get(position).getMerchantsSellerInfo();

            two.mMarterAtapterRecycler.setLayoutManager(new GridLayoutManager(mContext, 3));

            Marter_item_Adapter adapter = new Marter_item_Adapter(mContext, merchantsSellerInfo);
            two.mMarterAtapterRecycler.setAdapter(adapter);
            adapterList.add(adapter);

            two.mMarterAtapterRecycler.setAdapter(adapter);

            adapterList.add(adapter);
            adapter.notifyDataSetChanged();

        } else {

            ViewHolderOne2 two = (ViewHolderOne2) holder;

            two.mMarterAdapterTv.setText(list.get(index).getTypeName());
            List<ShoppingFeileiBean.MerchantsDataBean.MerchantsSellerInfoBean> merchantsSellerInfo = list.get(index).getMerchantsSellerInfo();
            two.mMarterAtapterRecycler.setLayoutManager(new GridLayoutManager(mContext, 3));
            Marter_item_Adapter adapter = new Marter_item_Adapter(mContext, merchantsSellerInfo);

            two.mMarterAtapterRecycler.setAdapter(adapter);
            adapterList.add(adapter);
            adapter.notifyDataSetChanged();
        }


    }

    public void setPosition(int position) {
        this.index = position;
    }

    @Override
    public int getItemCount() {
        if (index == -1) {
            return list != null ? list.size() : 0;

        } else {
            return 1;
        }
    }


    public class ViewHolderOne2 extends RecyclerView.ViewHolder {
        @BindView(R.id.marter_adapter_tv)
        TextView mMarterAdapterTv;
        @BindView(R.id.marter_atapter_recycler)
        RecyclerView mMarterAtapterRecycler;

        public ViewHolderOne2(View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
            AutoUtils.auto(itemView);
            FontHelper.applyFont(mContext, mMarterAdapterTv, FontHelper.WRYHL);
        }

    }

}
