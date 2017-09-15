package com.ssmk.module.merchant.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/22 10:37
 */

public class LiJiBean implements Serializable{
    private String GoodsPhoto1;
    private List<CommodityAndSellerList> commodityAndSellerList;

    public String getGoodsPhoto1() {
        return GoodsPhoto1;
    }

    public void setGoodsPhoto1(String goodsPhoto1) {
        GoodsPhoto1 = goodsPhoto1;
    }

    public List<CommodityAndSellerList> getCommodityAndSellerList() {
        return commodityAndSellerList;
    }

    public void setCommodityAndSellerList(List<CommodityAndSellerList> commodityAndSellerList) {
        this.commodityAndSellerList = commodityAndSellerList;
    }

}