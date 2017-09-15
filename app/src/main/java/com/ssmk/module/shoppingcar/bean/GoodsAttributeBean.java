package com.ssmk.module.shoppingcar.bean;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/23 17:14
 * 编写人  :  王成哲
 */

public class GoodsAttributeBean {

    /**
     * commodityFormat : {"goodsFormatId":"12","goodsFormatName":"古董白","goodsFormatNumber":0,"goodsFormatPhoto":"http://ourvfy0xt.bkt.clouddn.com/upload/rear/2017/08/19/cce8539eff0b67f8fcc3c5b3eed51373.jpg"}
     * commoditySizeJson : {"sizeNumberId":"12","sizeNumberName":"180/92A","commodityNumber":505}
     */

    private CommodityFormatBean commodityFormat;
    private CommoditySizeJsonBean commoditySizeJson;

    public CommodityFormatBean getCommodityFormat() {
        return commodityFormat;
    }

    public void setCommodityFormat(CommodityFormatBean commodityFormat) {
        this.commodityFormat = commodityFormat;
    }

    public CommoditySizeJsonBean getCommoditySizeJson() {
        return commoditySizeJson;
    }

    public void setCommoditySizeJson(CommoditySizeJsonBean commoditySizeJson) {
        this.commoditySizeJson = commoditySizeJson;
    }

    public static class CommodityFormatBean {
        /**
         * goodsFormatId : 12
         * goodsFormatName : 古董白
         * goodsFormatNumber : 0
         * goodsFormatPhoto : http://ourvfy0xt.bkt.clouddn.com/upload/rear/2017/08/19/cce8539eff0b67f8fcc3c5b3eed51373.jpg
         */

        private String goodsFormatId;
        private String goodsFormatName;
        private int goodsFormatNumber;
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

        public int getGoodsFormatNumber() {
            return goodsFormatNumber;
        }

        public void setGoodsFormatNumber(int goodsFormatNumber) {
            this.goodsFormatNumber = goodsFormatNumber;
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
         * sizeNumberId : 12
         * sizeNumberName : 180/92A
         * commodityNumber : 505
         */

        private String sizeNumberId;
        private String sizeNumberName;
        private int commodityNumber;

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

        public int getCommodityNumber() {
            return commodityNumber;
        }

        public void setCommodityNumber(int commodityNumber) {
            this.commodityNumber = commodityNumber;
        }
    }
}
