package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * date: 2017/8/2
 * author:侯亮亮候亮亮
 */

public class CommodBean {

    /**
     * code : 200
     * msg : 获取信息成功!
     * commodityData : {"goodsId":"1","goodsCode":"1","goodsName":"阿迪达斯","goodsPrice":"0.00","memberPrice":"1.00","discountPrice":"1.00","isnfc":"1","sellerId":16,"sellerName":"1","gtId":23,"goodsType":"男装","goodsService":"免运费,七天退换货","goodsStatus":"0","goodsPhoto1":"/glhr-main/resources/images/school/school1.jpg","goodsPhoto2":"/glhr-main/resources/images/school/school1.jpg","goodsPhoto3":"/glhr-main/resources/images/school/school1.jpg","goodsPhoto4":"/glhr-main/resources/images/school/school1.jpg","goodsPhoto5":"/glhr-main/resources/images/school/school1.jpg","goodsPhoto6":"","goodsIntroduce":"简单描述","isExpress":"1","freight":"0.00","isDelivery":"1","createName":"1","createTime":"2017-01-01","goodsStock":1,"goodsSales":1,"isDelete":"1","reserve1":null,"reserve2":"31"}
     * commodityCommentList : [{"commentId":"asdfas","commentStar":"5","commentContent":"非常好","memberId":247,"commentTime":"2017-07-21 17:55:30","goodsId":1,"goodsName":"1","orderCode":"","createName":"fdsf","createTime":"2017-07-21 17:55:30","phoneNumber":"1001","memberName":"周富豪","headPortrait":"http://47.94.227.190:8080/glhr-main/upload/rear/2023d637e78152ed4aa72cda762c9272.png","memberStar":"高级","gender":"1"}]
     */

    private int code;
    private String msg;
    private CommodityDataBean commodityData;

    private List<CommodityCommentListBean> commodityCommentList;

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

    public CommodityDataBean getCommodityData() {
        return commodityData;
    }

    public void setCommodityData(CommodityDataBean commodityData) {
        this.commodityData = commodityData;
    }

    public List<CommodityCommentListBean> getCommodityCommentList() {
        return commodityCommentList;
    }

    public void setCommodityCommentList(List<CommodityCommentListBean> commodityCommentList) {
        this.commodityCommentList = commodityCommentList;
    }

    public static class CommodityDataBean {
        /**
         * goodsId : 1
         * goodsCode : 1
         * goodsName : 阿迪达斯
         * goodsPrice : 0.00
         * memberPrice : 1.00
         * discountPrice : 1.00
         * isnfc : 1
         * sellerId : 16
         * sellerName : 1
         * gtId : 23
         * goodsType : 男装
         * goodsService : 免运费,七天退换货
         * goodsStatus : 0
         * goodsPhoto1 : /glhr-main/resources/images/school/school1.jpg
         * goodsPhoto2 : /glhr-main/resources/images/school/school1.jpg
         * goodsPhoto3 : /glhr-main/resources/images/school/school1.jpg
         * goodsPhoto4 : /glhr-main/resources/images/school/school1.jpg
         * goodsPhoto5 : /glhr-main/resources/images/school/school1.jpg
         * goodsPhoto6 :
         * goodsIntroduce : 简单描述
         * isExpress : 1
         * freight : 0.00
         * isDelivery : 1
         * createName : 1
         * createTime : 2017-01-01
         * goodsStock : 1
         * goodsSales : 1
         * isDelete : 1
         * reserve1 : null
         * reserve2 : 31
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
        private String goodsPhoto4;
        private String goodsPhoto5;
        private String goodsPhoto6;
        private String goodsIntroduce;
        private String isExpress;
        private String freight;
        private String isDelivery;
        private String createName;
        private String createTime;
        private int goodsStock;
        private int goodsSales;
        private String isDelete;
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

        public String getGoodsPhoto4() {
            return goodsPhoto4;
        }

        public void setGoodsPhoto4(String goodsPhoto4) {
            this.goodsPhoto4 = goodsPhoto4;
        }

        public String getGoodsPhoto5() {
            return goodsPhoto5;
        }

        public void setGoodsPhoto5(String goodsPhoto5) {
            this.goodsPhoto5 = goodsPhoto5;
        }

        public String getGoodsPhoto6() {
            return goodsPhoto6;
        }

        public void setGoodsPhoto6(String goodsPhoto6) {
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

        public String getCreateName() {
            return createName;
        }

        public void setCreateName(String createName) {
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

        public String getIsDelete() {
            return isDelete;
        }

        public void setIsDelete(String isDelete) {
            this.isDelete = isDelete;
        }

        public Object getReserve1() {
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

    public static class CommodityCommentListBean {
        /**
         * commentId : asdfas
         * commentStar : 5
         * commentContent : 非常好
         * memberId : 247
         * commentTime : 2017-07-21 17:55:30
         * goodsId : 1
         * goodsName : 1
         * orderCode :
         * createName : fdsf
         * createTime : 2017-07-21 17:55:30
         * phoneNumber : 1001
         * memberName : 周富豪
         * headPortrait : http://47.94.227.190:8080/glhr-main/upload/rear/2023d637e78152ed4aa72cda762c9272.png
         * memberStar : 高级
         * gender : 1
         */

        private String commentId;
        private String commentStar;
        private String commentContent;
        private int memberId;
        private String commentTime;
        private int goodsId;
        private String goodsName;
        private String orderCode;
        private String createName;
        private String createTime;
        private String phoneNumber;
        private String memberName;
        private String headPortrait;
        private String memberStar;
        private String gender;

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getCommentStar() {
            return commentStar;
        }

        public void setCommentStar(String commentStar) {
            this.commentStar = commentStar;
        }

        public String getCommentContent() {
            return commentContent;
        }

        public void setCommentContent(String commentContent) {
            this.commentContent = commentContent;
        }

        public int getMemberId() {
            return memberId;
        }

        public void setMemberId(int memberId) {
            this.memberId = memberId;
        }

        public String getCommentTime() {
            return commentTime;
        }

        public void setCommentTime(String commentTime) {
            this.commentTime = commentTime;
        }

        public int getGoodsId() {
            return goodsId;
        }

        public void setGoodsId(int goodsId) {
            this.goodsId = goodsId;
        }

        public String getGoodsName() {
            return goodsName;
        }

        public void setGoodsName(String goodsName) {
            this.goodsName = goodsName;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getCreateName() {
            return createName;
        }

        public void setCreateName(String createName) {
            this.createName = createName;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getHeadPortrait() {
            return headPortrait;
        }

        public void setHeadPortrait(String headPortrait) {
            this.headPortrait = headPortrait;
        }

        public String getMemberStar() {
            return memberStar;
        }

        public void setMemberStar(String memberStar) {
            this.memberStar = memberStar;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
}
