package com.ssmk.module.merchant.bean;

import java.io.Serializable;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/24 11:25
 */

public class CommodityInfoList implements Serializable {
    private String goodsId;
    private String cartId;
    private String goodsName;
    private String goodsCode;
    private String skuId;
    private String goodsFormatId;
    private String sizeNumberId;
    private String goodsPrice;
    private String freight;
    private String purchaseSize;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getGoodsFormatId() {
        return goodsFormatId;
    }

    public void setGoodsFormatId(String goodsFormatId) {
        this.goodsFormatId = goodsFormatId;
    }

    public String getSizeNumberId() {
        return sizeNumberId;
    }

    public void setSizeNumberId(String sizeNumberId) {
        this.sizeNumberId = sizeNumberId;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getPurchaseSize() {
        return purchaseSize;
    }

    public void setPurchaseSize(String purchaseSize) {
        this.purchaseSize = purchaseSize;
    }
}