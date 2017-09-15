package com.ssmk.adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.ssmk.R;
import com.ssmk.module.home.utils.FontHelper;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.List;

/**
 * Created by chengqianlang on 2017/7/8.
 */

public class HomeHistoryAdapter<T> extends BaseQuickAdapter<T,BaseViewHolder> {


    public HomeHistoryAdapter(@LayoutRes int layoutResId, @Nullable List data) {
        super(layoutResId, data);
    }


    @Override
    protected void convert(BaseViewHolder helper, Object item) {
        AutoUtils.auto(helper.itemView);
        FontHelper.applyFont(mContext,helper.getView(R.id.hisitem_tv_name),FontHelper.PFR);
        FontHelper.applyFont(mContext,helper.getView(R.id.hisitem_tv_time),FontHelper.PFR);

    }
}
