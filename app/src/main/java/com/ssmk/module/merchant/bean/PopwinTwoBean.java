package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/1017:09
 */

public class PopwinTwoBean {


    /**
     * code : 200
     * msg : 获取信息成功!
     * total : 1
     * data : [{"goodsId":"06FEE2EABEA645C89864D9869ACDEC7C","goodsCode":"1501745745264053","goodsName":"周黑鸭（鸭脖四）","goodsPrice":"30.00","memberPrice":"30.00","discountPrice":"30.00","isnfc":"0","sellerId":34,"sellerName":"周黑鸭","gtId":7,"goodsType":"食品","goodsService":"免运费","goodsStatus":"1","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/resources/images/shopsGoods/78156F0DF991437BB10D2AB47D843BF5.jpg","goodsPhoto2":null,"goodsPhoto3":null,"goodsPhoto4":null,"goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/ed3821bbe4373816bcc7a19786aa12c5.jpg\" alt=\"\" />","isExpress":"1","freight":"0.00","isDelivery":"1","createName":null,"createTime":"2017-08-03 15:36:31","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{\"goodsFormatId\":\"43\",\"goodsFormatName\":\"五香味\"}}]","reserve2":"66"}]
     */

    private int code;
    private String msg;
    private int total;
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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goodsId : 06FEE2EABEA645C89864D9869ACDEC7C
         * goodsCode : 1501745745264053
         * goodsName : 周黑鸭（鸭脖四）
         * goodsPrice : 30.00
         * memberPrice : 30.00
         * discountPrice : 30.00
         * isnfc : 0
         * sellerId : 34
         * sellerName : 周黑鸭
         * gtId : 7
         * goodsType : 食品
         * goodsService : 免运费
         * goodsStatus : 1
         * goodsPhoto1 : http://47.94.227.190:8080/glhr-main/resources/images/shopsGoods/78156F0DF991437BB10D2AB47D843BF5.jpg
         * goodsPhoto2 : null
         * goodsPhoto3 : null
         * goodsPhoto4 : null
         * goodsPhoto5 : null
         * goodsPhoto6 : null
         * goodsIntroduce : <img src="http://47.94.227.190:8080/glhr-main/upload/rear/ed3821bbe4373816bcc7a19786aa12c5.jpg" alt="" />
         * isExpress : 1
         * freight : 0.00
         * isDelivery : 1
         * createName : null
         * createTime : 2017-08-03 15:36:31
         * goodsStock : 0
         * goodsSales : 0
         * isDelete : null
         * reserve1 : [{"commodityFormatJson":{"goodsFormatId":"43","goodsFormatName":"五香味"}}]
         * reserve2 : 66
         */

        private String goodsId;
        private String goodsCode;
        private String goodsName;
        private String goodsPrice;
        private String memberPrice;
        private String discountPrice;
        private String isnfc;
        private int sellerId;
        private String sellerName;
        private int gtId;
        private String goodsType;
        private String goodsService;
        private String goodsStatus;
        private String goodsPhoto1;
        private Object goodsPhoto2;
        private Object goodsPhoto3;
        private Object goodsPhoto4;
        private Object goodsPhoto5;
        private Object goodsPhoto6;
        private String goodsIntroduce;
        private String isExpress;
        private String freight;
        private String isDelivery;
        private Object createName;
        private String createTime;
        private int goodsStock;
        private int goodsSales;
        private Object isDelete;
        private String reserve1;
        private String reserve2;

        public String getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(String goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsCode() {
            return goodsCode;
        }

        public void setGoodsCode(String goodsCode) {
            this.goodsCode = goodsCode;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(String goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public String getMemberPrice() {
            return memberPrice;
        }

        public void setMemberPrice(String memberPrice) {
            this.memberPrice = memberPrice;
        }

        public String getDiscountPrice() {
            return discountPrice;
        }

        public void setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
        }

        public String getIsnfc() {
            return isnfc;
        }

        public void setIsnfc(String isnfc) {
            this.isnfc = isnfc;
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

        public int getGtId() {
            return gtId;
        }

        public void setGtId(int gtId) {
            this.gtId = gtId;
        }

        public String getGoodsType() {
            return goodsType;
        }

        public void setGoodsType(String goodsType) {
            this.goodsType = goodsType;
        }

        public String getGoodsService() {
            return goodsService;
        }

        public void setGoodsService(String goodsService) {
            this.goodsService = goodsService;
        }

        public String getGoodsStatus() {
            return goodsStatus;
        }

        public void setGoodsStatus(String goodsStatus) {
            this.goodsStatus = goodsStatus;
        }

        public String getGoodsPhoto1() {
            return goodsPhoto1;
        }

        public void setGoodsPhoto1(String goodsPhoto1) {
            this.goodsPhoto1 = goodsPhoto1;
        }

        public Object getGoodsPhoto2() {
            return goodsPhoto2;
        }

        public void setGoodsPhoto2(Object goodsPhoto2) {
            this.goodsPhoto2 = goodsPhoto2;
        }

        public Object getGoodsPhoto3() {
            return goodsPhoto3;
        }

        public void setGoodsPhoto3(Object goodsPhoto3) {
            this.goodsPhoto3 = goodsPhoto3;
        }

        public Object getGoodsPhoto4() {
            return goodsPhoto4;
        }

        public void setGoodsPhoto4(Object goodsPhoto4) {
            this.goodsPhoto4 = goodsPhoto4;
        }

        public Object getGoodsPhoto5() {
            return goodsPhoto5;
        }

        public void setGoodsPhoto5(Object goodsPhoto5) {
            this.goodsPhoto5 = goodsPhoto5;
        }

        public Object getGoodsPhoto6() {
            return goodsPhoto6;
        }

        public void setGoodsPhoto6(Object goodsPhoto6) {
            this.goodsPhoto6 = goodsPhoto6;
        }

        public String getGoodsIntroduce() {
            return goodsIntroduce;
        }

        public void setGoodsIntroduce(String goodsIntroduce) {
            this.goodsIntroduce = goodsIntroduce;
        }

        public String getIsExpress() {
            return isExpress;
        }

        public void setIsExpress(String isExpress) {
            this.isExpress = isExpress;
        }

        public String getFreight() {
            return freight;
        }

        public void setFreight(String freight) {
            this.freight = freight;
        }

        public String getIsDelivery() {
            return isDelivery;
        }

        public void setIsDelivery(String isDelivery) {
            this.isDelivery = isDelivery;
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

        public int getGoodsStock() {
            return goodsStock;
        }

        public void setGoodsStock(int goodsStock) {
            this.goodsStock = goodsStock;
        }

        public int getGoodsSales() {
            return goodsSales;
        }

        public void setGoodsSales(int goodsSales) {
            this.goodsSales = goodsSales;
        }

        public Object getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(Object isDelete) {
            this.isDelete = isDelete;
        }

        public String getReserve1() {
            return reserve1;
        }

        public void setReserve1(String reserve1) {
            this.reserve1 = reserve1;
        }

        public String getReserve2() {
            return reserve2;
        }

        public void setReserve2(String reserve2) {
            this.reserve2 = reserve2;
        }
    }
}
