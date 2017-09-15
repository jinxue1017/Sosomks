package com.ssmk.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ssmk.R;
import com.ssmk.bean.RegionBean;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.my.activity.CityActivity;
import com.ssmk.module.my.activity.RegionActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/28 20:51
 * 邮箱：17600157003@163.com
 */

public class Region_adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<RegionBean.DataBean> mList = new ArrayList<>();

    public Region_adapter(Context context, List<RegionBean.DataBean> rows) {
        mContext = context;
        mList = rows;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.city_item,null);
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
                Intent intent = new Intent(mContext, CityActivity.class);
                intent.putExtra("regionNo", mList.get(position).getRegionNo());
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

        public ViewHolder(View itemView){
            super(itemView);
            ButterKnife.bind(this, itemView);
            FontHelper.applyFont(mContext, city_name, FontHelper.PFR);

        }
    }
}
