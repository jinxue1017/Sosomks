package com.ssmk.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ssmk.R;
import com.ssmk.module.merchant.bean.PopBeans;

import java.util.List;

/**
 * Created by ASUS on 2017/7/10.
 */

public class PopMenuAdapter extends BaseQuickAdapter<PopBeans,BaseViewHolder> {

    public PopMenuAdapter(@LayoutRes int layoutResId, @Nullable List<PopBeans> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PopBeans item) {
        helper.setText(R.id.pop_liebiao_tv,item.getLiebiao());
    }
}
