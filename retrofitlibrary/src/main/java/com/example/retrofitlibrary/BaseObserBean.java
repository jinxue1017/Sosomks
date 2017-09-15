package com.example.retrofitlibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;


/**
 * Created by ASUS on 2017/7/11.
 */

public  abstract  class BaseObserBean<T> implements Observer<T> {

    public BaseObserBean(Context context) {
        this.context = context;

    }
    private Context context;

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable e) {
        Log.d("Tag12345",e.toString());
        Toast.makeText(context,"网络异常",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

}
