package com.ssmk.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import com.ssmk.R;
import com.ssmk.module.merchant.Presenter.DetailsColoAdapterView;
import com.ssmk.module.merchant.bean.ShoppingCartData;

import java.util.List;

/**
 * 类描述：添加购物车颜色尺码适配器
 * 创建人：lenovo
 * 创建时间：2017/8/19 19:50
 */

public class DetailsSizeAdapter extends RecyclerView.Adapter<DetailsSizeAdapter.ViewHolder> implements View.OnClickListener {
    private Context context;
    private List<ShoppingCartData> shoppingCartData;
    private DetailsColoAdapterView coloAdapterView;
    private ViewHolder viewHolder;
    private int po;

    public void setColoAdapterView(DetailsColoAdapterView coloAdapterView) {
        this.coloAdapterView = coloAdapterView;
    }

    public DetailsSizeAdapter(Context context, List<ShoppingCartData> shoppingCartData, int po) {
        this.context = context;
        this.shoppingCartData = shoppingCartData;
        this.po=po;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.details_colosizeitem,null);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.czCheckBox.setText(shoppingCartData.get(po).getCommoditySizeJsonList().get(position).getSizeNumberName());
        holder.czCheckBox.setTag(position);
        holder.czCheckBox.setOnClickListener(this);
    }

    @Override
    public int getItemCount() {
        return shoppingCartData.get(po).getCommoditySizeJsonList().size();
    }

    @Override
    public void onClick(View v) {
        if (coloAdapterView!=null){
            coloAdapterView.OnDetails((Integer) v.getTag());
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private CheckBox czCheckBox;
        public ViewHolder(View itemView) {
            super(itemView);
            czCheckBox = (CheckBox) itemView.findViewById(R.id.popu_colosize_checkbox);
        }
    }

}
