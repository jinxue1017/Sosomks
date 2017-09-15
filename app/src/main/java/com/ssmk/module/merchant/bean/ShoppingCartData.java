package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * 类描述：
 * 创建人：lenovo
 * 创建时间：2017/8/10 14:33
 */

public class ShoppingCartData {

    /**
     * commoditySizeJsonList : [{"commodityNumber":999,"sizeNumberId":"31","sizeNumberName":"均码"}]
     * goodsFormatId : 25
     * goodsFormatName : 臧黑
     * goodsFormatNumber : 0
     * goodsFormatPhoto : http://ourvfy0xt.bkt.clouddn.com/upload/rear/2017/08/19/067243357fc0f8fdf9073c96ba6c5e74.jpg
     */

    private String goodsFormatId;
    private String goodsFormatName;
    private int goodsFormatNumber;
    private String goodsFormatPhoto;
    private List<CommoditySizeJsonListBean> commoditySizeJsonList;

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

    public List<CommoditySizeJsonListBean> getCommoditySizeJsonList() {
        return commoditySizeJsonList;
    }

    public void setCommoditySizeJsonList(List<CommoditySizeJsonListBean> commoditySizeJsonList) {
        this.commoditySizeJsonList = commoditySizeJsonList;
    }

    public static class CommoditySizeJsonListBean {
        /**
         * commodityNumber : 999
         * sizeNumberId : 31
         * sizeNumberName : 均码
         */

        private int commodityNumber;
        private String sizeNumberId;
        private String sizeNumberName;

        public int getCommodityNumber() {
            return commodityNumber;
        }

        public void setCommodityNumber(int commodityNumber) {
            this.commodityNumber = commodityNumber;
        }

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
