package com.ssmk.module.home.view;

import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.liaoinstan.springview.container.BaseHeader;
import com.ssmk.R;

/**
 * Created by chengqianlang on 2017/7/13.
 */

public class Home_RefreshHead extends BaseHeader {

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
            mHomerefreshTv.setText("松开立即刷新");
        }
        else {
            mHomerefreshTv.setText("下拉刷新");

        }
    }

    @Override
    public void onStartAnim() {
        mHomerefreshTv.setText("正在刷新");
        mBackground.start();
    }

    @Override
    public void onFinishAnim() {
        mBackground.stop();
    }
}
