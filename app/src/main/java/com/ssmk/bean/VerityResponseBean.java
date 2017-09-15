package com.ssmk.bean;

/**
 * Created by lenovo on 2017/7/11.
 */

public class VerityResponseBean {

    /**
     * "code": 状态码 200 表示成功,
     * "msg":  状态码对应的提示信息
     */
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
