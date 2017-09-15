package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.GoodsBean;
import com.ssmk.module.merchant.bean.PopowindBean;
import com.ssmk.module.merchant.bean.PopwinTwoBean;
import com.ssmk.module.merchant.bean.PopwindFourBean;
import com.ssmk.module.merchant.bean.PopwindThreeBean;
import com.ssmk.module.merchant.bean.ShangpinBean;
import com.ssmk.module.merchant.view.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/10 14:09
 * 编写人  :  王成哲
 */

public class ShoppingAdaoter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<GoodsBean.DataBean> mDataBeanList=new ArrayList<>();
    private List<PopowindBean.DataBean> mPopwindBeanList=new ArrayList<>();
    private List<PopwinTwoBean.DataBean> mPopwindTwoBeanList=new ArrayList<>();
    private List<PopwindThreeBean.DataBean> mPopwindThreeBeanList=new ArrayList<>();
    private List<PopwindFourBean.DataBean> mPopwindFourBeanList=new ArrayList<>();
    private List<ShangpinBean.DataBean>mshangpindata=new ArrayList<>();
    public ShoppingAdaoter(Context context) {
        mContext = context;

    }
    public void setDataGoodsBean(List<GoodsBean.DataBean> mDataList){
        if (mDataList!=null){
            mDataBeanList.addAll(mDataList);
        }
    }
    public void setDataPopowindBean(List<PopowindBean.DataBean> mPopwindListlist){
        if (mPopwindListlist!=null){
            mPopwindBeanList.addAll(mPopwindListlist);
        }

    }
    public void setDataPopwinTwoBean(List<PopwinTwoBean.DataBean> mPopwindTwoList){
        if (mPopwindTwoList!=null){
            mPopwindTwoBeanList.addAll(mPopwindTwoList);
        }

    }
    public void setDataPopwindThreeBean(List<PopwindThreeBean.DataBean> mPopwindThreeList){
        if (mPopwindThreeList!=null){
            mPopwindThreeBeanList.addAll(mPopwindThreeList);
        }

    }
    public void setDataPopwindFourBean(List<PopwindFourBean.DataBean> mPopwindBeanList){
        if (mPopwindBeanList!=null){
            mPopwindFourBeanList.addAll(mPopwindBeanList);
        }

    }
    public void setShangpinDataBean(List<ShangpinBean.DataBean> mshangpinBeanList){
        if (mshangpinBeanList!=null){
            mshangpindata.addAll(mshangpinBeanList);
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.shopping_adapter_item, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final ViewHolder adapter = (ViewHolder) holder;

        adapter.shoppingAdapterInpo.setText(mDataBeanList.get(position).getGoodsName());
        adapter.shoppingAdapterPrice.setText(mDataBeanList.get(position).getDiscountPrice());
        Glide.with(mContext).load(mDataBeanList.get(position).getGoodsPhoto1()).error(R.drawable.a2222).into(adapter.shoppingAdapterIv);


        adapter.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("goodsid",mDataBeanList.get(position).getGoodsId());
                mContext.startActivity(intent);
            }
        });
        adapter.shoppingAdaoterLiji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataBeanList!=null?mDataBeanList.size():0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.shopping_adapter_iv)
        ImageView shoppingAdapterIv;
        @BindView(R.id.shopping_adapter_inpo)
        TextView shoppingAdapterInpo;
        @BindView(R.id.shopping_adapter_price)
        TextView shoppingAdapterPrice;
        @BindView(R.id.shopping_adapter_liji)
        Button shoppingAdaoterLiji;
        public ViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this,itemView);
            FontHelper.applyFont(mContext,shoppingAdapterInpo, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdapterPrice, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdaoterLiji, FontHelper.PFR);
        }
    }
}
