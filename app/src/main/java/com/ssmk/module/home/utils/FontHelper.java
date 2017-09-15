package com.ssmk.module.home.utils;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.ssmk.appliaction.MyAppliacton.PingFang_Bold;
import static com.ssmk.appliaction.MyAppliacton.PingFang_Light;
import static com.ssmk.appliaction.MyAppliacton.PingFang_Medium;
import static com.ssmk.appliaction.MyAppliacton.PingFang_Regular;
import static com.ssmk.appliaction.MyAppliacton.msyh;
import static com.ssmk.appliaction.MyAppliacton.msyhbd;
import static com.ssmk.appliaction.MyAppliacton.msyhl;

/**
 * Created by chengqianlang on 2017/7/5.
 * 字体工具类
 */

public class FontHelper {
    public static final int WRYH=1;
    public static final int PFL=2;
    public static final int WRYHBD=3;
    public static final int PFM=4;
    public static final int WRYHL=5;
    public static final int PFBD=6;
    public static final int PFR=7;
    public static void applyFont(final Context context, final View root, final int fontName) {
        try {
            if (root instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) root;
                for (int i = 0; i < viewGroup.getChildCount(); i++)
                    applyFont(context, viewGroup.getChildAt(i), fontName);
            } else if (root instanceof TextView){

                switch (fontName){
                    case 1:
                        ((TextView) root).setTypeface(msyh);
                        break;
                    case 2:
                        ((TextView) root).setTypeface(PingFang_Light);
                        break;
                    case 3:
                        ((TextView) root).setTypeface(msyhbd);
                        break;
                    case 4:
                        ((TextView) root).setTypeface(PingFang_Medium);
                        break;
                    case 5:
                        ((TextView) root).setTypeface(msyhl);
                        break;
                    case 6:
                        ((TextView) root).setTypeface(PingFang_Bold);
                        break;
                    case 7:
                        ((TextView) root).setTypeface(PingFang_Regular);
                        break;

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
