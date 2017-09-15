package com.ssmk.module.merchant.bean;

import java.io.Serializable;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/24 11:24
 */

public class CommodityAndSellerList implements Serializable {
    private String sellerid;
    private String sellerName;
    CommodityInfoList commodityInfoList;

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public CommodityInfoList getCommodityInfoList() {
        return commodityInfoList;
    }

    public void setCommodityInfoList(CommodityInfoList commodityInfoList) {
        this.commodityInfoList = commodityInfoList;
    }
}