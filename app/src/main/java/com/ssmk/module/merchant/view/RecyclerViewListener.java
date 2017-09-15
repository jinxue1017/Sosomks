package com.ssmk.module.merchant.view;

import android.view.View;

public class RecyclerViewListener {

    public interface OnItemClickListener{
        void OnItemClick(View v, int position);

    }

    public interface OnItemLongClickListener{
        void OnLongItemClick(View v,int position);

    }
}
