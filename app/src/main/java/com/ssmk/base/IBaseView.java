package com.ssmk.base;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/17 14:37
 * 编写人  :  王成哲
 */

public interface IBaseView<T> {
    void succeed(T t,int tag);
    void error(T t,int tag);

}
