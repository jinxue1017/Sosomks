package com.ssmk.module.home.view;

import android.content.Intent;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.blankj.utilcode.util.LogUtils;
import com.ssmk.R;
import com.ssmk.base.MVPBaseActivity;
import com.ssmk.module.home.bean.WabUrlBean;

import butterknife.BindView;


/**
 * 功能描述  : 用于显示新闻咨询的Activty
 * 创建时间 : 2017/8/19 15:11
 * 编写人  :  王成哲
 */

public class HomeWabActivity extends MVPBaseActivity{
    @BindView(R.id.home_activity_wabview)
    WebView mWebView;

    @Override
    protected void initview() {

    }
    @Override
    protected void initdata() {
        Intent intent = getIntent();
        WabUrlBean bean= (WabUrlBean) intent.getSerializableExtra("WabUrl");
            if (bean.getType()==1){
                String url = bean.getUrl();
                LogUtils.e("Url",url);
                setWabView(bean.getUrl());
//                setWabView("http://www.baidu.com");
                //加载轮播图URl
            }else if (bean.getType() == 2){
                //加载新闻资讯URl
                setWabView(bean.getUrl());

            }


    }

    @Override
    protected int layoutRes() {
        return R.layout.home_activity_wab;
    }

    @Override
    public void UpData(Object o) {

    }

    /**
     * 设置WabView
     */
    private void setWabView(String url) {
        if (url!=null){
            //加载访问地址
            mWebView.loadUrl(url);
            // 支持JavaScript
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.setHorizontalScrollBarEnabled(false);//水平不显示
            mWebView.setVerticalScrollBarEnabled(false); //垂直不显示
            //设置webView支持缩放
//            mWebView.getSettings().setBuiltInZoomControls(true);
            //支持保存数据
            mWebView.getSettings().setSaveFormData(false);
            //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
            mWebView.setWebViewClient(new WebViewClient(){
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    mWebView.loadUrl(url);
                    //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                    return true;
                }
            });
        }


        }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {
            mWebView.goBack();// 返回前一个页面
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
