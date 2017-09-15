package com.ssmk.module.shoppingcar.bean;

public class SubmitOrderBean {


    /**
     * code : 200
     * msg : 订单生成成功!
     * orderCodeList : null
     * orderCode : 150353691168027744
     */

    private int code;
    private String msg;
    private Object orderCodeList;
    private String orderCode;

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

    public Object getOrderCodeList() {
        return orderCodeList;
    }

    public void setOrderCodeList(Object orderCodeList) {
        this.orderCodeList = orderCodeList;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }
}
