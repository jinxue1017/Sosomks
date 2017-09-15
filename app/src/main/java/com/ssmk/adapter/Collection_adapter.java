package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.bean.CollectionBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.view.DetailsActivity;
import com.ssmk.module.my.activity.MyCollectActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 20:51
 * 邮箱：17600157003@163.com
 */

public class Collection_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<CollectionBean.DataBean.RowsBean> mList = new ArrayList<>();
    public Collection_adapter(MyCollectActivity baseObserBean2, List<CollectionBean.DataBean.RowsBean> rows) {
        mContext = baseObserBean2;
        mList = rows;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.collection_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder adapter = (ViewHolder) holder;
        adapter.item_title.setText(mList.get(position).getGoodsName());
        adapter.item_img.setImageResource(R.mipmap.ic_launcher);
        adapter.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);
                intent.putExtra("goodsid",mList.get(position).getGoodsId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_img)
        ImageView item_img;
        @BindView(R.id.item_title)
        TextView item_title;
        @BindView(R.id.item_msg)
        TextView item_msg;
        @BindView(R.id.item_price)
        TextView item_price;
        @BindView(R.id.item_ck)
        CheckBox item_ck;
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            FontHelper.applyFont(mContext,item_title, FontHelper.PFR);
            FontHelper.applyFont(mContext,item_msg, FontHelper.PFR);
            FontHelper.applyFont(mContext,item_price, FontHelper.PFR);
        }
    }
}
