package com.ssmk.bean;

/**
 * Created by lenovo on 2017/7/11.
 */

public class ResponseBean {

    /**
     * code : SUNSOFT.SE0004
     * msg : 用户名不存在!
     * token : null
     */

    private String code;
    private String msg;
    private String token;

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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
