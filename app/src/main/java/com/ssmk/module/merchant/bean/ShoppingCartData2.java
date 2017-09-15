package com.ssmk.module.merchant.bean;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/10 14:33
 */

public class ShoppingCartData2 {

    /**
     * commodityFormatJson : {"goodsFormatId":"82","goodsFormatName":"原味"}
     */

    private CommodityFormatJsonBean commodityFormatJson;

    public CommodityFormatJsonBean getCommodityFormatJson() {
        return commodityFormatJson;
    }

    public void setCommodityFormatJson(CommodityFormatJsonBean commodityFormatJson) {
        this.commodityFormatJson = commodityFormatJson;
    }

    public static class CommodityFormatJsonBean {
        /**
         * goodsFormatId : 82
         * goodsFormatName : 原味
         */

        private String goodsFormatId;
        private String goodsFormatName;

        public String getGoodsFormatId() {
            return goodsFormatId;
        }

        public void setGoodsFormatId(String goodsFormatId) {
            this.goodsFormatId = goodsFormatId;
        }

        public String getGoodsFormatName() {
            return goodsFormatName;
        }

        public void setGoodsFormatName(String goodsFormatName) {
            this.goodsFormatName = goodsFormatName;
        }
    }
}
