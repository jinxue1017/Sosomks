package com.ssmk.module.merchant.view;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.liaoinstan.springview.container.BaseFooter;
import com.ssmk.R;

/**
 * Created by wangchengzhe on 2017/8/10.
 */

public class ShoppingLoadFooter extends BaseFooter {

    ImageView mHomerefreshIv;
    TextView mHomerefreshTv;
    private AnimationDrawable mBackground;

    @Override
    public View getView(LayoutInflater inflater, ViewGroup viewGroup) {
        View view = inflater.inflate(R.layout.home_refreshhead, viewGroup, true);
        mHomerefreshIv = (ImageView) view.findViewById(R.id.homerefresh_iv);
        mHomerefreshTv = (TextView) view.findViewById(R.id.homerefresh_tv);
        mHomerefreshIv.setBackgroundResource(R.drawable.loadanim);
        mBackground = (AnimationDrawable) mHomerefreshIv.getBackground();
        return view;
    }

    @Override
    public void onPreDrag(View rootView) {

    }

    @Override
    public void onDropAnim(View rootView, int dy) {

    }

    @Override
    public void onLimitDes(View rootView, boolean upORdown) {
        if (!upORdown){
            mHomerefreshTv.setText("松开立即加载");
        }
        else {
            mHomerefreshTv.setText("上拉刷新");

        }
    }

    @Override
    public void onStartAnim() {
        mHomerefreshTv.setText("正在加载...");
        mBackground.start();
    }

    @Override
    public void onFinishAnim() {
        mBackground.stop();
    }
}
