package com.example.retrofitlibrary;


import java.util.Map;

/**
 * 网络返回基类 支持泛型
 * Created by Tamic on 2016-06-06.
 */
public class BaseResponse<T> {
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total;
    private int code;
    private String msg;
    private String token;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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


    @Override
    public String toString() {
        return "BaseResponse{" +
                "total=" + total +
                ", code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public boolean isOk() {
        return code == 0;
    }

}
