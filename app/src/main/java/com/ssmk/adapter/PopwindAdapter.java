package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.PopowindBean;
import com.ssmk.module.merchant.view.DetailsActivity;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/1014:38
 */

public class PopwindAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<PopowindBean.DataBean> mPopwindList;

    public PopwindAdapter(Context mContext, List<PopowindBean.DataBean> mPopwindList) {
        this.mContext = mContext;
        this.mPopwindList = mPopwindList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View view=View.inflate(mContext, R.layout.shopping_adapter_item,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder= (ViewHolder) holder;
        viewHolder.shoppingAdapterInpo.setText(mPopwindList.get(position).getSellerName());
        //商品列表条目点击跳转到商品详情
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, DetailsActivity.class));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPopwindList==null?0:mPopwindList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.shopping_adapter_iv)
        ImageView shoppingAdapterIv;
        @BindView(R.id.shopping_adapter_inpo)
        TextView shoppingAdapterInpo;
        @BindView(R.id.shopping_adapter_price)
        TextView shoppingAdapterPrice;
        @BindView(R.id.shopping_adapter_liji)
        Button shoppingAdaoterLiji;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            FontHelper.applyFont(mContext,shoppingAdapterInpo, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdapterPrice, FontHelper.PFR);
            FontHelper.applyFont(mContext,shoppingAdaoterLiji, FontHelper.PFR);
        }
    }
}
