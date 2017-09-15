package com.ssmk.module.shoppingcar.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/23 20:56
 * 编写人  :  王成哲
 */

public class ShopsOrderBean implements Serializable{

    /**
     * sellerId : 50
     * sellerName : 恒源祥
     * commodityInfoList : [{"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","cartId":"","goodsName":"商品一","goodsCode":"1502183326672416","skuId":"74b959f706e5cba47c04926d65501390","goodsFormatId":"12","sizeNumberId":"11","goodsPrice":358,"freight":0,"purchaseSize":2}]
     */

    private int sellerId;
    private String sellerName;
    private List<CommodityInfoListBean> commodityInfoList;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public List<CommodityInfoListBean> getCommodityInfoList() {
        return commodityInfoList;
    }

    public void setCommodityInfoList(List<CommodityInfoListBean> commodityInfoList) {
        this.commodityInfoList = commodityInfoList;
    }

    public static class CommodityInfoListBean {
        /**
         * goodsId : 679AD23B3BB249BAAB15CED70FBF9483
         * cartId :
         * goodsName : 商品一
         * goodsCode : 1502183326672416
         * skuId : 74b959f706e5cba47c04926d65501390
         * goodsFormatId : 12
         * sizeNumberId : 11
         * goodsPrice : 358
         * freight : 0
         * purchaseSize : 2
         */

        private String goodsId;
        private String cartId;
        private String goodsName;
        private String goodsCode;
        private String skuId;
        private String goodsFormatId;
        private String sizeNumberId;
        private int goodsPrice;
        private int freight;
        private int purchaseSize;

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

        public int getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(int goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public int getFreight() {
            return freight;
        }

        public void setFreight(int freight) {
            this.freight = freight;
        }

        public int getPurchaseSize() {
            return purchaseSize;
        }

        public void setPurchaseSize(int purchaseSize) {
            this.purchaseSize = purchaseSize;
        }
    }
}
