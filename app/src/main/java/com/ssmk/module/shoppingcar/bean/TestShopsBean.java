package com.ssmk.module.shoppingcar.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 8:24
 * 编写人  :  王成哲
 */
public class TestShopsBean {

    private boolean isEdtor;
    protected boolean isChoosed;//是否选择
    private int sellerId;
    private String sellerName;
    @SerializedName("appShopsGoodsList")
    private List<TestGoodsBean> goods;
    public TestShopsBean() {
    }

    public TestShopsBean(boolean isEdtor, List<TestGoodsBean> goods, String sellerName, int sellerId, boolean isChoosed) {
        this.isEdtor = isEdtor;
        this.goods = goods;
        this.sellerName = sellerName;
        this.sellerId = sellerId;
        this.isChoosed = isChoosed;
    }

    public boolean isEdtor() {
        return isEdtor;
    }

    public void setEdtor(boolean edtor) {
        isEdtor = edtor;
    }

    public List<TestGoodsBean> getGoods() {
        return goods;
    }

    public void setGoods(List<TestGoodsBean> goods) {
        this.goods = goods;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }
}
