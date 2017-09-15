package com.ssmk.module.shoppingcar.bean;

public class SkuInfoBean {

    /**
     * commodityFormatJson : {"goodsFormatId":"12","goodsFormatName":"古董白","goodsFormatPhoto":""}
     * commoditySizeJson : {"sizeNumberId":"31","sizeNumberName":"均码"}
     */

    private CommodityFormatJsonBean commodityFormatJson;
    private CommoditySizeJsonBean commoditySizeJson;

    public CommodityFormatJsonBean getCommodityFormatJson() {
        return commodityFormatJson;
    }

    public void setCommodityFormatJson(CommodityFormatJsonBean commodityFormatJson) {
        this.commodityFormatJson = commodityFormatJson;
    }

    public CommoditySizeJsonBean getCommoditySizeJson() {
        return commoditySizeJson;
    }

    public void setCommoditySizeJson(CommoditySizeJsonBean commoditySizeJson) {
        this.commoditySizeJson = commoditySizeJson;
    }

    public static class CommodityFormatJsonBean {
        /**
         * goodsFormatId : 12
         * goodsFormatName : 古董白
         * goodsFormatPhoto :
         */

        private String goodsFormatId;
        private String goodsFormatName;
        private String goodsFormatPhoto;

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

        public String getGoodsFormatPhoto() {
            return goodsFormatPhoto;
        }

        public void setGoodsFormatPhoto(String goodsFormatPhoto) {
            this.goodsFormatPhoto = goodsFormatPhoto;
        }
    }

    public static class CommoditySizeJsonBean {
        /**
         * sizeNumberId : 31
         * sizeNumberName : 均码
         */

        private String sizeNumberId;
        private String sizeNumberName;

        public String getSizeNumberId() {
            return sizeNumberId;
        }

        public void setSizeNumberId(String sizeNumberId) {
            this.sizeNumberId = sizeNumberId;
        }

        public String getSizeNumberName() {
            return sizeNumberName;
        }

        public void setSizeNumberName(String sizeNumberName) {
            this.sizeNumberName = sizeNumberName;
        }
    }
}
