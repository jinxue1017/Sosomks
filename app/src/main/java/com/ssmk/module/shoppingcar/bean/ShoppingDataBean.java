package com.ssmk.module.shoppingcar.bean;

import java.util.List;

/**
 * 类描述：
 * 创建人：张海顺
 * 班级：1504D
 * 创建时间：2017/8/11 21:13.
 */

public class ShoppingDataBean {

    /**
     * code : 200
     * msg : 成功获取用户信息!
     * total : 1
     * appShopsSellerList : [{"sellerId":35,"sellerName":"恒源祥","appShopsGoodsList":[{"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","goodsName":"一恒源祥中年男士外套夹克男春秋季新款立领纯色茄克衫薄款爸爸装","cartId":"31A1F44052C34D129F4A3FB81F55BAC0","skuId":"d18552b67f1cafdc17dd1b1f780babea","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","goodsNumber":23,"goodsPrice":358,"freight":0,"memberPrice":340,"goodsCode":"1502183326672416","discountPrice":340},{"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","goodsName":"一恒源祥中年男士外套夹克男春秋季新款立领纯色茄克衫薄款爸爸装","cartId":"D7CF7954688247F6837DD8F0D1A18FBC","skuId":"74b959f706e5cba47c04926d65501390","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","goodsNumber":3,"goodsPrice":358,"freight":0,"memberPrice":340,"goodsCode":"1502183326672416","discountPrice":340}]}]
     */

    private int code;
    private String msg;
    private int total;
    private List<AppShopsSellerListBean> appShopsSellerList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<AppShopsSellerListBean> getAppShopsSellerList() {
        return appShopsSellerList;
    }

    public void setAppShopsSellerList(List<AppShopsSellerListBean> appShopsSellerList) {
        this.appShopsSellerList = appShopsSellerList;
    }

    public static class AppShopsSellerListBean {
        /**
         * sellerId : 35
         * sellerName : 恒源祥
         * appShopsGoodsList : [{"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","goodsName":"一恒源祥中年男士外套夹克男春秋季新款立领纯色茄克衫薄款爸爸装","cartId":"31A1F44052C34D129F4A3FB81F55BAC0","skuId":"d18552b67f1cafdc17dd1b1f780babea","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","goodsNumber":23,"goodsPrice":358,"freight":0,"memberPrice":340,"goodsCode":"1502183326672416","discountPrice":340},{"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","goodsName":"一恒源祥中年男士外套夹克男春秋季新款立领纯色茄克衫薄款爸爸装","cartId":"D7CF7954688247F6837DD8F0D1A18FBC","skuId":"74b959f706e5cba47c04926d65501390","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","goodsNumber":3,"goodsPrice":358,"freight":0,"memberPrice":340,"goodsCode":"1502183326672416","discountPrice":340}]
         */
        private boolean isEdtor;
        protected boolean isChoosed;//是否选择
        private int sellerId;
        private String sellerName;
        private List<AppShopsGoodsListBean> appShopsGoodsList;
        public boolean isEdtor() {
            return isEdtor;
        }
        public void setIsEdtor(boolean isEdtor) {
            this.isEdtor = isEdtor;
        }

        public boolean isChoosed() {
            return isChoosed;
        }
        public void setIsChoosed(boolean isChoosed) {
            this.isChoosed = isChoosed;
        }

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

        public List<AppShopsGoodsListBean> getAppShopsGoodsList() {
            return appShopsGoodsList;
        }

        public void setAppShopsGoodsList(List<AppShopsGoodsListBean> appShopsGoodsList) {
            this.appShopsGoodsList = appShopsGoodsList;
        }

        public AppShopsSellerListBean(boolean isEdtor, boolean isChoosed, int sellerId, String sellerName, List<AppShopsGoodsListBean> appShopsGoodsList) {
            this.isEdtor = isEdtor;
            this.isChoosed = isChoosed;
            this.sellerId = sellerId;
            this.sellerName = sellerName;
            this.appShopsGoodsList = appShopsGoodsList;
        }

        public static class AppShopsGoodsListBean {
            /**
             * goodsId : 679AD23B3BB249BAAB15CED70FBF9483
             * goodsName : 一恒源祥中年男士外套夹克男春秋季新款立领纯色茄克衫薄款爸爸装
             * cartId : 31A1F44052C34D129F4A3FB81F55BAC0
             * skuId : d18552b67f1cafdc17dd1b1f780babea
             * skuInfo : {"commodityFormatJson":{"goodsFormatId":"12","goodsFormatName":"古董白","goodsFormatPhoto":""},"commoditySizeJson":{"sizeNumberId":"31","sizeNumberName":"均码"}}
             * goodsInfoId : null
             * goodsFormatId : 12
             * sizeNumberId : 31
             * goodsNumber : 23
             * goodsPrice : 358
             * freight : 0
             * memberPrice : 340
             * goodsCode : 1502183326672416
             * discountPrice : 340
             */

            private String goodsId;
            private String goodsName;
            private String cartId;
            private String skuId;
            private String skuInfo;
            private long goodsInfoId;
            private String goodsFormatId;
            private String sizeNumberId;
            private int goodsNumber;
            private int goodsPrice;
            private int freight;
            private int memberPrice;
            private String goodsCode;
            private int discountPrice;
            private boolean isEdtor;
            protected boolean isChoosed;//是否选择
            private double priceNum;

            public AppShopsGoodsListBean(String goodsId, String goodsName, String cartId, String skuId, String skuInfo, long goodsInfoId, String goodsFormatId, String sizeNumberId, int goodsNumber, int goodsPrice, int freight, int memberPrice, String goodsCode, int discountPrice, boolean isEdtor, boolean isChoosed,double priceNum) {
                this.goodsId = goodsId;
                this.goodsName = goodsName;
                this.cartId = cartId;
                this.skuId = skuId;
                this.skuInfo = skuInfo;
                this.goodsInfoId = goodsInfoId;
                this.goodsFormatId = goodsFormatId;
                this.sizeNumberId = sizeNumberId;
                this.goodsNumber = goodsNumber;
                this.goodsPrice = goodsPrice;
                this.freight = freight;
                this.memberPrice = memberPrice;
                this.goodsCode = goodsCode;
                this.discountPrice = discountPrice;
                this.isEdtor = isEdtor;
                this.isChoosed = isChoosed;
                this.priceNum = priceNum;

            }

            public double getPriceNum(){

                return priceNum;
            }

            public void setPriceNum(double priceNum){
                this.priceNum=priceNum;
            }
            public boolean isEdtor()
            {
                return isEdtor;
            }
            public void setIsEdtor(boolean isEdtor) {
                this.isEdtor = isEdtor;
            }

            public boolean isChoosed() {
                return isChoosed;
            }
            public void setIsChoosed(boolean isChoosed) {
                this.isChoosed = isChoosed;
            }

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getGoodsName() {
                return goodsName;
            }

            public void setGoodsName(String goodsName) {
                this.goodsName = goodsName;
            }

            public String getCartId() {
                return cartId;
            }

            public void setCartId(String cartId) {
                this.cartId = cartId;
            }

            public String getSkuId() {
                return skuId;
            }

            public void setSkuId(String skuId) {
                this.skuId = skuId;
            }

            public String getSkuInfo() {
                return skuInfo;
            }

            public void setSkuInfo(String skuInfo) {
                this.skuInfo = skuInfo;
            }

            public long getGoodsInfoId() {
                return goodsInfoId;
            }

            public void setGoodsInfoId(long goodsInfoId) {
                this.goodsInfoId = goodsInfoId;
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

            public int getGoodsNumber() {
                return goodsNumber;
            }

            public void setGoodsNumber(int goodsNumber) {
                this.goodsNumber = goodsNumber;
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

            public int getMemberPrice() {
                return memberPrice;
            }

            public void setMemberPrice(int memberPrice) {
                this.memberPrice = memberPrice;
            }

            public String getGoodsCode() {
                return goodsCode;
            }

            public void setGoodsCode(String goodsCode) {
                this.goodsCode = goodsCode;
            }

            public int getDiscountPrice() {
                return discountPrice;
            }

            public void setDiscountPrice(int discountPrice) {
                this.discountPrice = discountPrice;
            }
        }
    }

    public ShoppingDataBean() {
    }
}
