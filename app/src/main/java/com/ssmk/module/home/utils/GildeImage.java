package com.ssmk.module.home.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.ssmk.R;
import com.youth.banner.loader.ImageLoader;

/**
 *@类用途：banner的加载图片器
 *@作者：程千浪
 *@创建时间：2017/7/10 15:49
 */

public class GildeImage extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path).error(R.drawable.banner).into(imageView);
    }
}
