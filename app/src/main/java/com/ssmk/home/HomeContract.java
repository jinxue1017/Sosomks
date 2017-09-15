package com.ssmk.home;


import com.ssmk.base.BasePresenter;
import com.ssmk.base.BaseView;

/**
 * MVPPlugin
 *  邮箱 784787081@qq.com
 */

public class HomeContract {
    interface View extends BaseView {
        void undata(String s);
    }

    interface  Presenter extends BasePresenter<View> {
        void getdata();
    }


}
