package com.ssmk.adapter;


import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;

import java.util.List;

/**
 * Created by ASUS on 2017/7/9.
 */

public class EvaluateAdapter<T> extends BaseQuickAdapter<T,BaseViewHolder> {

    public EvaluateAdapter(@LayoutRes int layoutResId, @Nullable List<T> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, T item) {
        FontHelper.applyFont(mContext,helper.getView(R.id.evaluate_hao), FontHelper.WRYHL);
        FontHelper.applyFont(mContext,helper.getView(R.id.evaluate_inpo),2);
        FontHelper.applyFont(mContext,helper.getView(R.id.evaluate_title),FontHelper.WRYH);

    }
}
