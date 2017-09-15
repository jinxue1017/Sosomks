package com.ssmk.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/8/2.
 */

public class CollectionBean {

    /**
     * data : {"rows":[{"collectionId":"016BC0D63F1141998516D7E3843E38D1","sellerId":16,"sellerName":"1","goodsId":"1","goodsName":"阿迪达斯","memberId":259,"createTime":"2017-08-02 14:08:42","pageNo":0,"pageSize":0}],"results":1}
     * code : 200
     * msg : 获取收藏列表成功
     */

    private DataBean data;
    private int code;
    private String msg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

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

    public static class DataBean {
        /**
         * rows : [{"collectionId":"016BC0D63F1141998516D7E3843E38D1","sellerId":16,"sellerName":"1","goodsId":"1","goodsName":"阿迪达斯","memberId":259,"createTime":"2017-08-02 14:08:42","pageNo":0,"pageSize":0}]
         * results : 1
         */

        private int results;
        private List<RowsBean> rows;

        public int getResults() {
            return results;
        }

        public void setResults(int results) {
            this.results = results;
        }

        public List<RowsBean> getRows() {
            return rows;
        }

        public void setRows(List<RowsBean> rows) {
            this.rows = rows;
        }

        public static class RowsBean {
            /**
             * collectionId : 016BC0D63F1141998516D7E3843E38D1
             * sellerId : 16
             * sellerName : 1
             * goodsId : 1
             * goodsName : 阿迪达斯
             * memberId : 259
             * createTime : 2017-08-02 14:08:42
             * pageNo : 0
             * pageSize : 0
             */

            private String collectionId;
            private int sellerId;
            private String sellerName;
            private String goodsId;
            private String goodsName;
            private int memberId;
            private String createTime;
            private int pageNo;
            private int pageSize;

            public String getCollectionId() {
                return collectionId;
            }

            public void setCollectionId(String collectionId) {
                this.collectionId = collectionId;
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

            public int getMemberId() {
                return memberId;
            }

            public void setMemberId(int memberId) {
                this.memberId = memberId;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public int getPageNo() {
                return pageNo;
            }

            public void setPageNo(int pageNo) {
                this.pageNo = pageNo;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }
        }
    }
}
