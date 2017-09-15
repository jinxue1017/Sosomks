package com.ssmk.module.shoppingcar.bean;

import java.util.List;

public class OrderAllBean {

    /**
     * code : 200
     * msg : 订单列表获取成功
     * data : [{"orderId":"F51D8CB12131445BB53D15A8D510C9B6","orderCode":"150243346798478213","orderPrice":"358.00","memberId":252,"buyName":null,"sellerId":35,"sellerName":"恒源祥","goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":null,"payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 14:37:48","orderInfoDetailList":[{"detailId":"02333209E70B42D998D9A816D5317EBE","orderId":"F51D8CB12131445BB53D15A8D510C9B6","sellerId":35,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"d18552b67f1cafdc17dd1b1f780babea","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","purchaseSize":1,"goodsPrice":358,"gsId":"FDEC6FC2CCDD409BAC77C646568D1203","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}"}]},{"orderId":"2214CABFD02C4A0F86583161FBD72EE5","orderCode":"150242917051819487","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":0,"sellerName":null,"goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":"0","payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 13:26:10","orderInfoDetailList":[{"detailId":"2C6C570BB72744A7A22BC09E1555FE26","orderId":"2214CABFD02C4A0F86583161FBD72EE5","sellerId":35,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"d18552b67f1cafdc17dd1b1f780babea","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","purchaseSize":2,"goodsPrice":358,"gsId":"FDEC6FC2CCDD409BAC77C646568D1203","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}"}]},{"orderId":"3DD13773154D45E18C719554BC2F0EC3","orderCode":"150243339197997042","orderPrice":"358.00","memberId":252,"buyName":null,"sellerId":35,"sellerName":"恒源祥","goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":null,"payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 14:36:32","orderInfoDetailList":[{"detailId":"353C01FCC884411B865A5AD78EBEB4F5","orderId":"3DD13773154D45E18C719554BC2F0EC3","sellerId":35,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"d18552b67f1cafdc17dd1b1f780babea","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","purchaseSize":1,"goodsPrice":358,"gsId":"FDEC6FC2CCDD409BAC77C646568D1203","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}"}]},{"orderId":"EEEC8110FCD44B23BB25EE5485FFA0C1","orderCode":"150243346785658691","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":50,"sellerName":"恒源祥","goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":null,"payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 14:37:47","orderInfoDetailList":[{"detailId":"378CC52E90D0475CA19B659F4153A95A","orderId":"EEEC8110FCD44B23BB25EE5485FFA0C1","sellerId":50,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"74b959f706e5cba47c04926d65501390","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","purchaseSize":2,"goodsPrice":358,"gsId":"70C0B73108B54A7681CF1E9D41920EB0","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}"}]},{"orderId":"8D8E1870A69246E983F5C6D21290FFF2","orderCode":"150242990291002533","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":0,"sellerName":null,"goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":"0","payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 13:38:22","orderInfoDetailList":[{"detailId":"38D6DDE31219401984FC4C211E9301E1","orderId":"8D8E1870A69246E983F5C6D21290FFF2","sellerId":50,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"74b959f706e5cba47c04926d65501390","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","purchaseSize":2,"goodsPrice":358,"gsId":"70C0B73108B54A7681CF1E9D41920EB0","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}"}]},{"orderId":"4707E81325464B5FBD82BB0100E50DFC","orderCode":"150242953228436058","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":0,"sellerName":null,"goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":"0","payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 13:32:12","orderInfoDetailList":[{"detailId":"5FA25C4AC8AE402CBDAC9E2503526244","orderId":"4707E81325464B5FBD82BB0100E50DFC","sellerId":35,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"d18552b67f1cafdc17dd1b1f780babea","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","purchaseSize":2,"goodsPrice":358,"gsId":"FDEC6FC2CCDD409BAC77C646568D1203","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}"}]},{"orderId":"77069F3E43304EBE8A8644FC40C958EE","orderCode":"150242989698762436","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":0,"sellerName":null,"goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":"0","payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 13:38:17","orderInfoDetailList":[{"detailId":"6F0470FA744648BB88464EE9D7E3ED0B","orderId":"77069F3E43304EBE8A8644FC40C958EE","sellerId":50,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"74b959f706e5cba47c04926d65501390","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","purchaseSize":2,"goodsPrice":358,"gsId":"70C0B73108B54A7681CF1E9D41920EB0","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}"}]},{"orderId":"7CB19D320C1C4058A14337C8F7506036","orderCode":"150243310248992944","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":50,"sellerName":"恒源祥","goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":null,"payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 14:31:42","orderInfoDetailList":[{"detailId":"D4637A0311A04E1A954495C66DC7D3C5","orderId":"7CB19D320C1C4058A14337C8F7506036","sellerId":50,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"74b959f706e5cba47c04926d65501390","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","purchaseSize":2,"goodsPrice":358,"gsId":"70C0B73108B54A7681CF1E9D41920EB0","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}"}]},{"orderId":"EFA6C491E3E24A25B7F7BE9BF63A73AE","orderCode":"150243339184874876","orderPrice":"716.00","memberId":252,"buyName":null,"sellerId":50,"sellerName":"恒源祥","goodsId":null,"goodsName":null,"payMode":null,"paySerialNum":null,"payStatus":null,"payTime":null,"orderStatus":"0","freight":0,"deliveryId":null,"deliveryName":"张三","deliveryTel":"13452639857","addressDetail":"收货地址-北京顺义","isSplitSingle":0,"deliveryTime":null,"closingTime":null,"createName":null,"createTime":"2017-08-11 14:36:31","orderInfoDetailList":[{"detailId":"D727E80904724120936CC258FE2BAFAE","orderId":"EFA6C491E3E24A25B7F7BE9BF63A73AE","sellerId":50,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"74b959f706e5cba47c04926d65501390","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"11","purchaseSize":2,"goodsPrice":358,"gsId":"70C0B73108B54A7681CF1E9D41920EB0","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"11\",\"sizeNumberName\":\"175/88A\"}}"}]}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * orderId : F51D8CB12131445BB53D15A8D510C9B6
         * orderCode : 150243346798478213
         * orderPrice : 358.00
         * memberId : 252
         * buyName : null
         * sellerId : 35
         * sellerName : 恒源祥
         * goodsId : null
         * goodsName : null
         * payMode : null
         * paySerialNum : null
         * payStatus : null
         * payTime : null
         * orderStatus : 0
         * freight : 0
         * deliveryId : null
         * deliveryName : 张三
         * deliveryTel : 13452639857
         * addressDetail : 收货地址-北京顺义
         * isSplitSingle : 0
         * deliveryTime : null
         * closingTime : null
         * createName : null
         * createTime : 2017-08-11 14:37:48
         * orderInfoDetailList : [{"detailId":"02333209E70B42D998D9A816D5317EBE","orderId":"F51D8CB12131445BB53D15A8D510C9B6","sellerId":35,"goodsId":"679AD23B3BB249BAAB15CED70FBF9483","skuId":"d18552b67f1cafdc17dd1b1f780babea","goodsInfoId":null,"goodsFormatId":"12","sizeNumberId":"31","purchaseSize":1,"goodsPrice":358,"gsId":"FDEC6FC2CCDD409BAC77C646568D1203","stockNumber":100,"salesNumber":0,"goodsCode":"1502183326672416","skuInfo":"{\"commodityFormatJson\":{\"goodsFormatId\":\"12\",\"goodsFormatName\":\"古董白\",\"goodsFormatPhoto\":\"\"},\"commoditySizeJson\":{\"sizeNumberId\":\"31\",\"sizeNumberName\":\"均码\"}}"}]
            */

        private String orderId;
        private String orderCode;
        private String orderPrice;
        private int memberId;
        private Object buyName;
        private int sellerId;
        private String sellerName;
        private Object goodsId;
        private String goodsName;
        private Object payMode;
        private Object paySerialNum;
        private Object payStatus;
        private Object payTime;
        private String orderStatus;
        private int freight;
        private Object deliveryId;
        private String deliveryName;
        private String deliveryTel;
        private String addressDetail;
        private int isSplitSingle;
        private Object deliveryTime;
        private Object closingTime;
        private Object createName;
        private String createTime;
        private List<OrderInfoDetailListBean> orderInfoDetailList;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice(String orderPrice) {
            this.orderPrice = orderPrice;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public Object getBuyName() {
            return buyName;
        }

        public void setBuyName(Object buyName) {
            this.buyName = buyName;
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

        public Object getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(Object goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public Object getPayMode() {
            return payMode;
        }

        public void setPayMode(Object payMode) {
            this.payMode = payMode;
        }

        public Object getPaySerialNum() {
            return paySerialNum;
        }

        public void setPaySerialNum(Object paySerialNum) {
            this.paySerialNum = paySerialNum;
        }

        public Object getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(Object payStatus) {
            this.payStatus = payStatus;
        }

        public Object getPayTime() {
            return payTime;
        }

        public void setPayTime(Object payTime) {
            this.payTime = payTime;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public int getFreight() {
            return freight;
        }

        public void setFreight(int freight) {
            this.freight = freight;
        }

        public Object getDeliveryId() {
            return deliveryId;
        }

        public void setDeliveryId(Object deliveryId) {
            this.deliveryId = deliveryId;
        }

        public String getDeliveryName() {
            return deliveryName;
        }

        public void setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
        }

        public String getDeliveryTel() {
            return deliveryTel;
        }

        public void setDeliveryTel(String deliveryTel) {
            this.deliveryTel = deliveryTel;
        }

        public String getAddressDetail() {
            return addressDetail;
        }

        public void setAddressDetail(String addressDetail) {
            this.addressDetail = addressDetail;
        }

        public int getIsSplitSingle() {
            return isSplitSingle;
        }

        public void setIsSplitSingle(int isSplitSingle) {
            this.isSplitSingle = isSplitSingle;
        }

        public Object getDeliveryTime() {
            return deliveryTime;
        }

        public void setDeliveryTime(Object deliveryTime) {
            this.deliveryTime = deliveryTime;
        }

        public Object getClosingTime() {
            return closingTime;
        }

        public void setClosingTime(Object closingTime) {
            this.closingTime = closingTime;
        }

        public Object getCreateName() {
            return createName;
        }

        public void setCreateName(Object createName) {
            this.createName = createName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public List<OrderInfoDetailListBean> getOrderInfoDetailList() {
            return orderInfoDetailList;
        }

        public void setOrderInfoDetailList(List<OrderInfoDetailListBean> orderInfoDetailList) {
            this.orderInfoDetailList = orderInfoDetailList;
        }

        public static class OrderInfoDetailListBean {
            /**
             * detailId : 02333209E70B42D998D9A816D5317EBE
             * orderId : F51D8CB12131445BB53D15A8D510C9B6
             * sellerId : 35
             * goodsId : 679AD23B3BB249BAAB15CED70FBF9483
             * skuId : d18552b67f1cafdc17dd1b1f780babea
             * goodsInfoId : null
             * goodsFormatId : 12
             * sizeNumberId : 31
             * purchaseSize : 1
             * goodsPrice : 358
             * gsId : FDEC6FC2CCDD409BAC77C646568D1203
             * stockNumber : 100
             * salesNumber : 0
             * goodsCode : 1502183326672416
             * skuInfo : {"commodityFormatJson":{"goodsFormatId":"12","goodsFormatName":"古董白","goodsFormatPhoto":""},"commoditySizeJson":{"sizeNumberId":"31","sizeNumberName":"均码"}}
             */

            private String detailId;
            private String orderId;
            private int sellerId;
            private String goodsId;
            private String skuId;
            private Object goodsInfoId;
            private String goodsFormatId;
            private String sizeNumberId;
            private int purchaseSize;
            private int goodsPrice;
            private String gsId;
            private int stockNumber;
            private int salesNumber;
            private String goodsCode;
            private String skuInfo;

            public String getDetailId() {
                return detailId;
            }

            public void setDetailId(String detailId) {
                this.detailId = detailId;
            }

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public int getSellerId() {
                return sellerId;
            }

            public void setSellerId(int sellerId) {
                this.sellerId = sellerId;
            }

            public String getGoodsId() {
                return goodsId;
            }

            public void setGoodsId(String goodsId) {
                this.goodsId = goodsId;
            }

            public String getSkuId() {
                return skuId;
            }

            public void setSkuId(String skuId) {
                this.skuId = skuId;
            }

            public Object getGoodsInfoId() {
                return goodsInfoId;
            }

            public void setGoodsInfoId(Object goodsInfoId) {
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

            public int getPurchaseSize() {
                return purchaseSize;
            }

            public void setPurchaseSize(int purchaseSize) {
                this.purchaseSize = purchaseSize;
            }

            public int getGoodsPrice() {
                return goodsPrice;
            }

            public void setGoodsPrice(int goodsPrice) {
                this.goodsPrice = goodsPrice;
            }

            public String getGsId() {
                return gsId;
            }

            public void setGsId(String gsId) {
                this.gsId = gsId;
            }

            public int getStockNumber() {
                return stockNumber;
            }

            public void setStockNumber(int stockNumber) {
                this.stockNumber = stockNumber;
            }

            public int getSalesNumber() {
                return salesNumber;
            }

            public void setSalesNumber(int salesNumber) {
                this.salesNumber = salesNumber;
            }

            public String getGoodsCode() {
                return goodsCode;
            }

            public void setGoodsCode(String goodsCode) {
                this.goodsCode = goodsCode;
            }

            public String getSkuInfo() {
                return skuInfo;
            }

            public void setSkuInfo(String skuInfo) {
                this.skuInfo = skuInfo;
            }
        }
    }
}
