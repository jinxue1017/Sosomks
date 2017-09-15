package com.ssmk.appliaction;

import android.app.Application;
import android.graphics.Typeface;

import com.blankj.utilcode.util.Utils;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;
import com.zhy.autolayout.config.AutoLayoutConifg;


/**
 * 作者：${CaiJianNan}
 * 时间2017/6/21 08:22
 * 邮箱：17600157003@163.com
 */

public class MyAppliacton extends Application{

    public static Typeface msyh;
    public static Typeface PingFang_Light;
    public static Typeface msyhbd;
    public static Typeface PingFang_Medium;
    public static Typeface msyhl;
    public static Typeface PingFang_Bold;
    public static Typeface PingFang_Regular;

    @Override
    public void onCreate() {
        super.onCreate();

        //微信
        PlatformConfig.setWeixin("wxd03acf74417ae059", "104fc554d409d4539c4591df6bf9c746");
        //新浪
        PlatformConfig.setSinaWeibo("1170673459", "9ca72cbce28e178be6f67675862d2545","http://www.wandoujia.com/apps/com.eico.weico");
        //qq qqzone
        PlatformConfig.setQQZone("1106210609","KEYrzYqu8QwwYHgmUbE");
        AutoLayoutConifg.getInstance().useDeviceSize();
        UMShareAPI.get(this);
        //字体
        msyh=Typeface.createFromAsset(getAssets(),"fonts/msyh.ttc");
        PingFang_Light=Typeface.createFromAsset(getAssets(),"fonts/PingFang Light.ttf");
        msyhbd=Typeface.createFromAsset(getAssets(),"fonts/msyhbd.ttc");
        PingFang_Medium=Typeface.createFromAsset(getAssets(),"fonts/PingFang Medium.ttf");
        msyhl=Typeface.createFromAsset(getAssets(),"fonts/msyhl.ttc");
        PingFang_Bold=Typeface.createFromAsset(getAssets(),"fonts/PingFang Bold.ttf");
        PingFang_Regular=Typeface.createFromAsset(getAssets(),"fonts/PingFang Regular.ttf");

        //初始化二维码
        ZXingLibrary.initDisplayOpinion(this);

        //Utils包的初始化
        Utils.init(getApplicationContext());
    }
}
