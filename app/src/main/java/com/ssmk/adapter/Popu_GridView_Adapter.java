package com.ssmk.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.ssmk.module.merchant.bean.ShoppingFeileiBean;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * 创建者:      CaiJianNan
 * 创建时间:   2017/7/19 16:15
 * 描述: TODO
 */

public class Popu_GridView_Adapter extends BaseAdapter {
    private Context context;
    private List<ShoppingFeileiBean.MerchantsTypeDataBean> list = new ArrayList<>();

    public Popu_GridView_Adapter(Context context, List<ShoppingFeileiBean.MerchantsTypeDataBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.pop_grid_item, null);
            viewHolder = new ViewHolder();
            viewHolder.iv = (ImageView) convertView.findViewById(R.id.item_image);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.item_text);
            convertView.setTag(viewHolder);
            FontHelper.applyFont(context, viewHolder.tv, FontHelper.WRYH);
            AutoUtils.auto(convertView);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tv.setText(list.get(position).getTypeName());
        Glide.with(context).load(list.get(position).getOriginalIcon()).into(viewHolder.iv);

        return convertView;
    }

    public class ViewHolder {
        ImageView iv;
        TextView tv;

    }
}
