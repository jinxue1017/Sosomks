package com.ssmk.bean;

import java.util.List;

/**
 * ░░░░░░░░░░░░░░░░░░░░░░░░▄░░
 * ░░░░░░░░░▐█░░░░░░░░░░░▄▀▒▌░
 * ░░░░░░░░▐▀▒█░░░░░░░░▄▀▒▒▒▐
 * ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐
 * ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐
 * ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌
 * ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒
 * ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐
 * ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄
 * ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒
 * ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒
 * 创建者:      CaiJianNan
 * 创建时间:   2017/7/18 14:22
 * 描述: TODO
 */

public  class ShoppingBean {

    /**
     * code : 200
     * msg : success
     * shopsCarousel : [{"apId":1,"apName":"图标","apSort":"1","apPath":"图标","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner1.jpg","createName":"周富豪","createTime":"2017-07-11"},{"apId":2,"apName":"风景图1","apSort":"2","apPath":"风景图1","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner2.jpg","createName":"周富豪","createTime":"2017-07-11"},{"apId":3,"apName":"风景图2","apSort":"3","apPath":"风景图2","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner3.jpg","createName":"王丹丹","createTime":"2017-07-11"},{"apId":4,"apName":"logo","apSort":"4","apPath":"logo","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner5.jpg","createName":"王丹丹","createTime":"2017-07-11"},{"apId":22,"apName":"风景图2","apSort":"5","apPath":"风景图2","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner4.jpg","createName":"崔超","createTime":"2017-07-11"},{"apId":26,"apName":"aa","apSort":"7","apPath":"aa","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner6.jpg","createName":"崔超","createTime":"2017-07-16"},{"apId":27,"apName":"好货","apSort":"6","apPath":"好货","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner7.jpg","createName":"周富豪","createTime":"2017-07-16"},{"apId":28,"apName":"非常好吃的辣条","apSort":"8","apPath":"非常好吃的辣条","photoPath":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner8.jpg","createName":"周富豪","createTime":"2017-07-15"}]
     * shopsRecommend : [{"recommendId":1,"sellerCode":"2","goodsCode":"SC00001","recommendSort":"1","isShow":"1","createName":"周富豪","createTime":"2017-07-11","goodsId":2,"goodsName":"辣条","goodsPrice":2,"memberPrice":1.8,"discountPrice":1.84,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/02.png"},{"recommendId":6,"sellerCode":"2","goodsCode":"SC00001","recommendSort":"6","isShow":"0","createName":"王丹丹","createTime":"2017-07-11","goodsId":2,"goodsName":"辣条","goodsPrice":2,"memberPrice":1.8,"discountPrice":1.84,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/02.png"},{"recommendId":7,"sellerCode":"2","goodsCode":"SC00001","recommendSort":"7","isShow":"0","createName":"王丹丹","createTime":"2017-07-11","goodsId":2,"goodsName":"辣条","goodsPrice":2,"memberPrice":1.8,"discountPrice":1.84,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/02.png"},{"recommendId":2,"sellerCode":"10","goodsCode":"1499413061623","recommendSort":"2","isShow":"1","createName":"周富豪","createTime":"2017-07-11","goodsId":10,"goodsName":"测试","goodsPrice":12,"memberPrice":11,"discountPrice":11,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/3.jpg"},{"recommendId":3,"sellerCode":"11","goodsCode":"1499413104448","recommendSort":"3","isShow":"1","createName":"王丹丹","createTime":"2017-07-11","goodsId":11,"goodsName":"测试2","goodsPrice":122,"memberPrice":122,"discountPrice":122,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/4.jpg"},{"recommendId":4,"sellerCode":"12","goodsCode":"1499766609009","recommendSort":"4","isShow":"0","createName":"崔超","createTime":"2017-07-11","goodsId":12,"goodsName":"测试1","goodsPrice":12,"memberPrice":11,"discountPrice":11,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/5.png"},{"recommendId":5,"sellerCode":"13","goodsCode":"1499769068220","recommendSort":"5","isShow":"0","createName":"苏奥杰","createTime":"2017-07-11","goodsId":13,"goodsName":"测试3","goodsPrice":13,"memberPrice":12,"discountPrice":12,"goodsPhoto1":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/6.png"}]
     * appNews : [{"newsId":12,"newsTitle":"新闻标题10","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/3.jpg","newsSort":"1","newsSimple":"地方","newsNote":"发","createName":"冠霖环如","createTime":"2017-07-10 13:39:03"},{"newsId":1,"newsTitle":"新闻标题01","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/1.jpg","newsSort":"1","newsSimple":"广东省","newsNote":"过生日纪念活动发货人色鬼三国杀说人话","createName":"周富豪","createTime":"2017-07-10 10:48:21"},{"newsId":2,"newsTitle":"新闻标题02","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/2.jpg","newsSort":"2","newsSimple":"公司订购方式","newsNote":"代购任何人都他","createName":"周富豪","createTime":"2017-07-10 10:48:21"},{"newsId":3,"newsTitle":"新闻标题03","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/3.jpg","newsSort":"3","newsSimple":"归属感","newsNote":"睡个好觉你的","createName":"何俊杰","createTime":"2017-07-10 10:48:21"},{"newsId":4,"newsTitle":"新闻标题04","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/4.jpg","newsSort":"4","newsSimple":"告诉对方公司","newsNote":"还是让他忽然说","createName":"王丹丹","createTime":"2017-07-10 10:48:21"},{"newsId":6,"newsTitle":"新闻标题05","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/5.jpg","newsSort":"5","newsSimple":"的说个事我如果","newsNote":"社会发生","createName":"何俊杰","createTime":"2017-07-10 10:48:21"},{"newsId":7,"newsTitle":"新闻标题06","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/6.jpg","newsSort":"6","newsSimple":"公司分管","newsNote":"更是进入身体忽然听到","createName":"王丹丹","createTime":"2017-07-10 10:48:21"},{"newsId":8,"newsTitle":"新闻标题06","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/7.jpg","newsSort":"7","newsSimple":"黄裳凤蝶","newsNote":"红烧肉他会觉得挺好","createName":"周富豪","createTime":"2017-07-10 10:48:21"},{"newsId":9,"newsTitle":"新闻标题07","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/8.jpg","newsSort":"8","newsSimple":"突然一个人","newsNote":"干涉啼饥号寒","createName":"周富豪","createTime":"2017-07-10 10:48:21"},{"newsId":11,"newsTitle":"新闻标题09","newsPath":"http://47.94.227.190:8080/glhr-main/upload/rear/appNews/10.jpg","newsSort":"0","newsSimple":"新闻simple","newsNote":"新闻note","createName":"冠霖环如","createTime":"2017-07-10 10:48:21"}]
     */


    private List<ShopsCarouselBean> shopsCarousel;
    private List<ShopsRecommendBean> shopsRecommend;
    private List<AppNewsBean> appNews;


    public List<ShopsCarouselBean> getShopsCarousel() {
        return shopsCarousel;
    }

    public void setShopsCarousel(List<ShopsCarouselBean> shopsCarousel) {
        this.shopsCarousel = shopsCarousel;
    }

    public List<ShopsRecommendBean> getShopsRecommend() {
        return shopsRecommend;
    }

    public void setShopsRecommend(List<ShopsRecommendBean> shopsRecommend) {
        this.shopsRecommend = shopsRecommend;
    }

    public List<AppNewsBean> getAppNews() {
        return appNews;
    }

    public void setAppNews(List<AppNewsBean> appNews) {
        this.appNews = appNews;
    }

    public static class ShopsCarouselBean {
        /**
         * apId : 1
         * apName : 图标
         * apSort : 1
         * apPath : 图标
         * photoPath : http://47.94.227.190:8080/glhr-main/upload/rear/shopsAlternatePhoto/banner1.jpg
         * createName : 周富豪
         * createTime : 2017-07-11
         */

        private int apId;
        private String apName;
        private String apSort;
        private String apPath;
        private String photoPath;
        private String createName;
        private String createTime;

        public int getApId() {
            return apId;
        }

        public void setApId(int apId) {
            this.apId = apId;
        }

        public String getApName() {
            return apName;
        }

        public void setApName(String apName) {
            this.apName = apName;
        }

        public String getApSort() {
            return apSort;
        }

        public void setApSort(String apSort) {
            this.apSort = apSort;
        }

        public String getApPath() {
            return apPath;
        }

        public void setApPath(String apPath) {
            this.apPath = apPath;
        }

        public String getPhotoPath() {
            return photoPath;
        }

        public void setPhotoPath(String photoPath) {
            this.photoPath = photoPath;
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
    }

    public static class ShopsRecommendBean {
        /**
         * recommendId : 1
         * sellerCode : 2
         * goodsCode : SC00001
         * recommendSort : 1
         * isShow : 1
         * createName : 周富豪
         * createTime : 2017-07-11
         * goodsId : 2
         * goodsName : 辣条
         * goodsPrice : 2.0
         * memberPrice : 1.8
         * discountPrice : 1.84
         * goodsPhoto1 : http://47.94.227.190:8080/glhr-main/upload/rear/shopsRecommend/02.png
         */

        private int recommendId;
        private String sellerCode;
        private String goodsCode;
        private String recommendSort;
        private String isShow;
        private String createName;
        private String createTime;
        private int goodsId;
        private String goodsName;
        private double goodsPrice;
        private double memberPrice;
        private double discountPrice;
        private String goodsPhoto1;

        public int getRecommendId() {
            return recommendId;
        }

        public void setRecommendId(int recommendId) {
            this.recommendId = recommendId;
        }

        public String getSellerCode() {
            return sellerCode;
        }

        public void setSellerCode(String sellerCode) {
            this.sellerCode = sellerCode;
        }

        public String getGoodsCode() {
            return goodsCode;
        }

        public void setGoodsCode(String goodsCode) {
            this.goodsCode = goodsCode;
        }

        public String getRecommendSort() {
            return recommendSort;
        }

        public void setRecommendSort(String recommendSort) {
            this.recommendSort = recommendSort;
        }

        public String getIsShow() {
            return isShow;
        }

        public void setIsShow(String isShow) {
            this.isShow = isShow;
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

        public double getGoodsPrice() {
            return goodsPrice;
        }

        public void setGoodsPrice(double goodsPrice) {
            this.goodsPrice = goodsPrice;
        }

        public double getMemberPrice() {
            return memberPrice;
        }

        public void setMemberPrice(double memberPrice) {
            this.memberPrice = memberPrice;
        }

        public double getDiscountPrice() {
            return discountPrice;
        }

        public void setDiscountPrice(double discountPrice) {
            this.discountPrice = discountPrice;
        }

        public String getGoodsPhoto1() {
            return goodsPhoto1;
        }

        public void setGoodsPhoto1(String goodsPhoto1) {
            this.goodsPhoto1 = goodsPhoto1;
        }
    }

    public static class AppNewsBean {
        /**
         * newsId : 12
         * newsTitle : 新闻标题10
         * newsPath : http://47.94.227.190:8080/glhr-main/upload/rear/appNews/3.jpg
         * newsSort : 1
         * newsSimple : 地方
         * newsNote : 发
         * createName : 冠霖环如
         * createTime : 2017-07-10 13:39:03
         */

        private int newsId;
        private String newsTitle;
        private String newsPath;
        private String newsSort;
        private String newsSimple;
        private String newsNote;
        private String createName;
        private String createTime;

        public int getNewsId() {
            return newsId;
        }

        public void setNewsId(int newsId) {
            this.newsId = newsId;
        }

        public String getNewsTitle() {
            return newsTitle;
        }

        public void setNewsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
        }

        public String getNewsPath() {
            return newsPath;
        }

        public void setNewsPath(String newsPath) {
            this.newsPath = newsPath;
        }

        public String getNewsSort() {
            return newsSort;
        }

        public void setNewsSort(String newsSort) {
            this.newsSort = newsSort;
        }

        public String getNewsSimple() {
            return newsSimple;
        }

        public void setNewsSimple(String newsSimple) {
            this.newsSimple = newsSimple;
        }

        public String getNewsNote() {
            return newsNote;
        }

        public void setNewsNote(String newsNote) {
            this.newsNote = newsNote;
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

        @Override
        public String toString() {
            return "AppNewsBean{" +
                    "newsId=" + newsId +
                    ", newsTitle='" + newsTitle + '\'' +
                    ", newsPath='" + newsPath + '\'' +
                    ", newsSort='" + newsSort + '\'' +
                    ", newsSimple='" + newsSimple + '\'' +
                    ", newsNote='" + newsNote + '\'' +
                    ", createName='" + createName + '\'' +
                    ", createTime='" + createTime + '\'' +
                    '}';
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }
    }
}
