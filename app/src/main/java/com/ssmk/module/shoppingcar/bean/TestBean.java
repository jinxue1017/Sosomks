package com.ssmk.module.shoppingcar.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 8:23
 * 编写人  :  王成哲
 */

public class TestBean {

    private int code;
    private String msg;
    private int total;
    @SerializedName("appShopsSellerList")
    private List<TestShopsBean> group;

    public TestBean() {
    }

    public TestBean(int code, String msg, int total, List<TestShopsBean> group) {
        this.code = code;
        this.msg = msg;
        this.total = total;
        this.group = group;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<TestShopsBean> getGroup() {
        return group;
    }

    public void setGroup(List<TestShopsBean> group) {
        this.group = group;
    }
}
