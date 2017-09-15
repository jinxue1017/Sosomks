package com.ssmk.module.shoppingcar.bean;

import java.util.List;

/**
 * author：郑志强
 * data：2017/7/17 8:45
 * function：
 */

public class ShoppingCarBean {
    private String title;
    private boolean groupCheck=false;
    private String edit;
    private List<GoodsInfo> goods;

    public ShoppingCarBean() {
    }

    public ShoppingCarBean(String title, boolean groupCheck, String edit, List<GoodsInfo> goods) {
        this.title = title;
        this.groupCheck = groupCheck;
        this.edit = edit;
        this.goods = goods;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isGroupCheck() {
        return groupCheck;
    }

    public void setGroupCheck(boolean groupCheck) {
        this.groupCheck = groupCheck;
    }

    public String getEdit() {
        return edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    public List<GoodsInfo> getGoods() {
        return goods;
    }

    public void setGoods(List<GoodsInfo> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "ShoppingCarBean{" +
                "title='" + title + '\'' +
                ", groupCheck=" + groupCheck +
                ", edit='" + edit + '\'' +
                ", goods=" + goods +
                '}';
    }

    public static class GoodsInfo {
        private String goodsPic;
        private String goodsName;
        private int goodsPrice;
        private String goodsParams;
        private int goodsNum;
        private boolean childCheck = false;

        public GoodsInfo() {
        }

        public GoodsInfo(String goodsPic, String goodsName, int goodsPrice, String goodsParams, int goodsNum, boolean childCheck) {
            this.goodsPic = goodsPic;
            this.goodsName = goodsName;
            this.goodsPrice = goodsPrice;
            this.goodsParams = goodsParams;
            this.goodsNum = goodsNum;
            this.childCheck = childCheck;
        }

        public String getGoodsPic() {
            return goodsPic;
        }

        public void setGoodsPic(String goodsPic) {
            this.goodsPic = goodsPic;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public int getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(int goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public String getGoodsParams() {
            return goodsParams;
        }

        public void setGoodsParams(String goodsParams) {
            this.goodsParams = goodsParams;
        }

        public int getGoodsNum() {
            return goodsNum;
        }

        public void setGoodsNum(int goodsNum) {
            this.goodsNum = goodsNum;
        }

        public boolean isChildCheck() {
            return childCheck;
        }

        public void setChildCheck(boolean childCheck) {
            this.childCheck = childCheck;
        }

        @Override
        public String toString() {
            return "GoodsInfo{" +
                    "goodsPic='" + goodsPic + '\'' +
                    ", goodsName='" + goodsName + '\'' +
                    ", goodsPrice=" + goodsPrice +
                    ", goodsParams='" + goodsParams + '\'' +
                    ", goodsNum=" + goodsNum +
                    ", childCheck=" + childCheck +
                    '}';
        }
    }
}
