package com.ssmk.module.home.bean;

import java.io.Serializable;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/19 18:17
 * 编写人  :  王成哲
 */

public class WabUrlBean implements Serializable{
    private String url;
    private int type;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public WabUrlBean(String url, int type) {
        this.url = url;
        this.type = type;
    }
}
