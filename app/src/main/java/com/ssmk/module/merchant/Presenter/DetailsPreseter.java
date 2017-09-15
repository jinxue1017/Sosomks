package com.ssmk.module.merchant.Presenter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.ssmk.adapter.DetailsColoAdapter;
import com.ssmk.adapter.DetailsSizeAdapter;
import com.ssmk.module.merchant.bean.ShoppingCartData;

import java.util.List;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/19 19:04
 */

public class DetailsPreseter {
    private Context context;
    private DetailsColoAdapter detailsColoAdapter;
    private DetailsSizeAdapter detailsSizeAdapter;
    private DetailsPreseterView detailsPreseterView;
    private DetailsPreseterSizeView detailsPreseterSizeView;
    private int po;
    public void setDetailsPreseterSizeView(DetailsPreseterSizeView detailsPreseterSizeView) {
        this.detailsPreseterSizeView = detailsPreseterSizeView;
    }

    public void setDetailsPreseterView(DetailsPreseterView detailsPreseterView) {
        this.detailsPreseterView = detailsPreseterView;
    }

    public DetailsPreseter(Context context) {
        this.context = context;
    }

    public  void OnColoSize(RecyclerView colorecycler, RecyclerView sizecycler, final List<ShoppingCartData> list,final TextView colo,final TextView size){
        //颜色适配器
        GridLayoutManager colomanager = new GridLayoutManager(context,5,LinearLayoutManager.VERTICAL,false);
        colorecycler.setLayoutManager(colomanager);
        detailsColoAdapter = new DetailsColoAdapter(context,list);
        detailsColoAdapter.setColoAdapterView(new DetailsColoAdapterView() {
            @Override
            public void OnDetails(int pos) {
                po = pos;
                colo.setText(list.get(pos).getGoodsFormatName());
                detailsSizeAdapter.notifyDataSetChanged();
                detailsPreseterView.OnDetails(pos);
            }
        });
        colorecycler.setAdapter(detailsColoAdapter);
     //尺码适配器
        GridLayoutManager sizemanager = new GridLayoutManager(context,5,LinearLayoutManager.VERTICAL,false);
        sizecycler.setLayoutManager(sizemanager);
         detailsSizeAdapter = new DetailsSizeAdapter(context,list,po);
        detailsSizeAdapter.setColoAdapterView(new DetailsColoAdapterView() {
            @Override
            public void OnDetails(int pos) {
                size.setText(list.get(po).getCommoditySizeJsonList().get(pos).getSizeNumberName());
                detailsPreseterSizeView.OnDetails(pos);
            }
        });
        sizecycler.setAdapter(detailsSizeAdapter);
    }

}
