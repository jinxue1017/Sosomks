package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/10 13:01
 * 编写人  :  王成哲
 */

public class GoodsBean {


    /**
     * code : 200
     * msg : 获取信息成功!
     * total : 5
     * data : [{"goodsId":"825BA0DBEF254659979CF636DC013B80","goodsCode":"1502420574133637","goodsName":"剑南春9","goodsPrice":"320.00","memberPrice":"300.00","discountPrice":"300.00","isnfc":"0","sellerId":36,"sellerName":"剑南春","gtId":4,"goodsType":"酒","goodsService":"免运费","goodsStatus":"1","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/60698552BF24421C8A6A32B6AAACA586.jpg","goodsPhoto2":"http://47.94.227.190:8080/glhr-main/upload/rear/7EF76429BF274ECAB1285BF4F6354C52.jpg","goodsPhoto3":"http://47.94.227.190:8080/glhr-main/upload/rear/F3011C854210473987B96A0116926744.jpg","goodsPhoto4":null,"goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/30b6c2035fc6a6498cb324be1e530e31.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/953a6269b59dd1f029009079b134a228.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/3e2ce3829f980a238acf85004313c253.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/3f13165414b61166f1d3b72fcb8bcaf4.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/2f624e5b65bccd0eeb037c2f2c2d5b64.jpg\" alt=\"\" />","isExpress":"1","freight":"0.00","isDelivery":"0","createName":null,"createTime":"2017-08-11 11:04:41","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{\"goodsFormatNumber\":1}}]","reserve2":"122"},{"goodsId":"2890D90CEC5B4207A4D5B0C21198E89E","goodsCode":"1502419737260611","goodsName":"剑南春8","goodsPrice":"123.00","memberPrice":"120.00","discountPrice":"120.00","isnfc":"0","sellerId":36,"sellerName":"剑南春","gtId":4,"goodsType":"酒","goodsService":"免运费","goodsStatus":"1","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/02830E7F0223461791BFCD1C26C4058D.jpg","goodsPhoto2":"http://47.94.227.190:8080/glhr-main/upload/rear/1EF5B74B4C634C2C845B3E0D1FB8D0B6.jpg","goodsPhoto3":"http://47.94.227.190:8080/glhr-main/upload/rear/98975D941EE24573B3F2C0B644DA624B.jpg","goodsPhoto4":"http://47.94.227.190:8080/glhr-main/upload/rear/9F8C46DA162F4F70BB46C1BF3C5BECF4.jpg","goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/610fb2a5da86d6bf1e5c4e58568a9618.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/ac39dd9465a17af06d085249bdb833b2.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/d390b703d5857c608ea512f92fdbad72.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/5feb6d6d9dac349dcbf09e5c26560d5a.jpg\" alt=\"\" />","isExpress":"1","freight":"0.00","isDelivery":"0","createName":null,"createTime":"2017-08-11 10:50:29","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{\"goodsFormatNumber\":1}}]","reserve2":"122"},{"goodsId":"C2EDFD15A8F844EAB5D01D39AA0DAFAA","goodsCode":"1502419557135306","goodsName":"剑南春7","goodsPrice":"123.00","memberPrice":"120.00","discountPrice":"120.00","isnfc":"0","sellerId":36,"sellerName":"剑南春","gtId":4,"goodsType":"酒","goodsService":"免运费","goodsStatus":"1","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/045BE55C957E4F32B43DB24B886E124D.jpg","goodsPhoto2":"http://47.94.227.190:8080/glhr-main/upload/rear/FDBBF043DE7B4B9EB07A613B594380E0.jpg","goodsPhoto3":"http://47.94.227.190:8080/glhr-main/upload/rear/FC6998E26015410B9BABA6B7419090EB.jpg","goodsPhoto4":"http://47.94.227.190:8080/glhr-main/upload/rear/593EB2476FB84748890E9D3A61A28D1C.jpg","goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/d66b2751a2fdbe092b342aa1dd3b754e.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/60f5896675b4b3814e15e564c7bbdde3.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/9096d1ffbe57c19a4f7283a2803e548a.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/4d61cc9e5900e9e36a4d7335f47fc83a.jpg\" alt=\"\" />","isExpress":"0","freight":"0.00","isDelivery":"0","createName":null,"createTime":"2017-08-11 10:48:42","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{}}]","reserve2":"122"},{"goodsId":"A143F06E5EB3470DA398C07045787CC1","goodsCode":"1502179277683787","goodsName":"三剑南春 52度绵竹银牌特曲","goodsPrice":"138.00","memberPrice":"120.00","discountPrice":"120.00","isnfc":"0","sellerId":36,"sellerName":"剑南春","gtId":4,"goodsType":"酒","goodsService":"免运费","goodsStatus":"1","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/1BEFFC2CCFB5413C8EBB304E2DD0906D.jpg","goodsPhoto2":"http://47.94.227.190:8080/glhr-main/upload/rear/FB538F2E7BDC4B7A876565F217859C66.jpg","goodsPhoto3":"http://47.94.227.190:8080/glhr-main/upload/rear/FC1B930A400045C1AA04285908D22F8F.jpg","goodsPhoto4":null,"goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/a9cb09d828141d8190055a59bc9e1141.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/bd6408156b8af2829e215f5e6e14d561.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/f01530c565141e80df8b66a6dc705c17.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/2e15f0ad2fd80ac0e302e0a9cde1dd8d.jpg\" alt=\"\" />","isExpress":"1","freight":"0.00","isDelivery":"0","createName":null,"createTime":"2017-08-08 16:02:51","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{\"goodsFormatNumber\":1}}]","reserve2":"122"},{"goodsId":"C12F5D32C2BA4A03B7FA8E2A091661F1","goodsCode":"1502179111431404","goodsName":"二剑南春 52度绵竹银牌特曲","goodsPrice":"138.00","memberPrice":"120.00","discountPrice":"120.00","isnfc":"0","sellerId":36,"sellerName":"剑南春","gtId":4,"goodsType":"酒","goodsService":"免运费","goodsStatus":"2","goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/65D3CAAC7E534335954058A5F20CF1CD.jpg","goodsPhoto2":"http://47.94.227.190:8080/glhr-main/upload/rear/0DF91E80211B45C4BDFBF452ACA13840.jpg","goodsPhoto3":"http://47.94.227.190:8080/glhr-main/upload/rear/85AB3F79BF684656A77452949EB70F36.jpg","goodsPhoto4":null,"goodsPhoto5":null,"goodsPhoto6":null,"goodsIntroduce":"<img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/13dfcfd9f0e5b1cbc2c31b9b242eed3a.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/a2cbe4527cd483d3e68f8c23440b0f20.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/0e08ffe5f1c8160dacd36c76a2d89fc6.jpg\" alt=\"\" /><img src=\"http://47.94.227.190:8080/glhr-main/upload/rear/a9178ccf8ca2a71d9f31a6a0d4277ab5.jpg\" alt=\"\" />","isExpress":"1","freight":"0.00","isDelivery":"0","createName":null,"createTime":"2017-08-08 16:01:08","goodsStock":0,"goodsSales":0,"isDelete":null,"reserve1":"[{\"commodityFormatJson\":{\"goodsFormatNumber\":1}}]","reserve2":"122"}]
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
         * goodsId : 825BA0DBEF254659979CF636DC013B80
         * goodsCode : 1502420574133637
         * goodsName : 剑南春9
         * goodsPrice : 320.00
         * memberPrice : 300.00
         * discountPrice : 300.00
         * isnfc : 0
         * sellerId : 36
         * sellerName : 剑南春
         * gtId : 4
         * goodsType : 酒
         * goodsService : 免运费
         * goodsStatus : 1
         * goodsPhoto1 : http://47.94.227.190:8080/glhr-main/upload/rear/60698552BF24421C8A6A32B6AAACA586.jpg
         * goodsPhoto2 : http://47.94.227.190:8080/glhr-main/upload/rear/7EF76429BF274ECAB1285BF4F6354C52.jpg
         * goodsPhoto3 : http://47.94.227.190:8080/glhr-main/upload/rear/F3011C854210473987B96A0116926744.jpg
         * goodsPhoto4 : null
         * goodsPhoto5 : null
         * goodsPhoto6 : null
         * goodsIntroduce : <img src="http://47.94.227.190:8080/glhr-main/upload/rear/30b6c2035fc6a6498cb324be1e530e31.jpg" alt="" /><img src="http://47.94.227.190:8080/glhr-main/upload/rear/953a6269b59dd1f029009079b134a228.jpg" alt="" /><img src="http://47.94.227.190:8080/glhr-main/upload/rear/3e2ce3829f980a238acf85004313c253.jpg" alt="" /><img src="http://47.94.227.190:8080/glhr-main/upload/rear/3f13165414b61166f1d3b72fcb8bcaf4.jpg" alt="" /><img src="http://47.94.227.190:8080/glhr-main/upload/rear/2f624e5b65bccd0eeb037c2f2c2d5b64.jpg" alt="" />
         * isExpress : 1
         * freight : 0.00
         * isDelivery : 0
         * createName : null
         * createTime : 2017-08-11 11:04:41
         * goodsStock : 0
         * goodsSales : 0
         * isDelete : null
         * reserve1 : [{"commodityFormatJson":{"goodsFormatNumber":1}}]
         * reserve2 : 122
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
        private String goodsPhoto2;
        private String goodsPhoto3;
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

        public String getGoodsPhoto2() {
            return goodsPhoto2;
        }

        public void setGoodsPhoto2(String goodsPhoto2) {
            this.goodsPhoto2 = goodsPhoto2;
        }

        public String getGoodsPhoto3() {
            return goodsPhoto3;
        }

        public void setGoodsPhoto3(String goodsPhoto3) {
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
