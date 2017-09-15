package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.bean.CitySonBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.view.DetailsActivity;
import com.ssmk.module.my.activity.CitySonActivity;
import com.ssmk.module.my.activity.NewaddressActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 20:51
 * 邮箱：17600157003@163.com
 */

public class CitySon_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<CitySonBean.DataBean> mList = new ArrayList<>();
    public CitySon_adapter(CitySonActivity baseObserBean2, List<CitySonBean.DataBean> rows) {
        mContext = baseObserBean2;
        mList = rows;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=LayoutInflater.from(mContext).inflate(R.layout.city_item,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ViewHolder adapter = (ViewHolder) holder;
        adapter.city_name.setText(mList.get(position).getRegionName());
        adapter.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, NewaddressActivity.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.city_name)
        TextView city_name;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            FontHelper.applyFont(mContext,city_name, FontHelper.PFR);

        }
    }
}
