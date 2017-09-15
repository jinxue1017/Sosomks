package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * 创建者： 廉锦雪
 * 创建时间:2017/8/2215:07
 */

public class ShangpinBean {

    /**
     * code : 200
     * msg : 成功!
     * total : 5
     * data : [{"gtId":254,"masterId":"1","masterType":"上衣","typeName":"2","createName":null,"createTime":"2017-08-19","sellerId":110},{"gtId":255,"masterId":"1","masterType":"裤子","typeName":"2","createName":null,"createTime":"2017-08-19","sellerId":110},{"gtId":256,"masterId":"1","masterType":"秋季上新","typeName":"2","createName":null,"createTime":"2017-08-19","sellerId":110},{"gtId":257,"masterId":"1","masterType":"夏季新品","typeName":"2","createName":null,"createTime":"2017-08-19","sellerId":110},{"gtId":258,"masterId":"1","masterType":"热销特卖","typeName":"2","createName":null,"createTime":"2017-08-19","sellerId":110}]
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
         * gtId : 254
         * masterId : 1
         * masterType : 上衣
         * typeName : 2
         * createName : null
         * createTime : 2017-08-19
         * sellerId : 110
         */

        private int gtId;
        private String masterId;
        private String masterType;
        private String typeName;
        private Object createName;
        private String createTime;
        private int sellerId;

        public int getGtId() {
            return gtId;
        }

        public void setGtId(int gtId) {
            this.gtId = gtId;
        }

        public String getMasterId() {
            return masterId;
        }

        public void setMasterId(String masterId) {
            this.masterId = masterId;
        }

        public String getMasterType() {
            return masterType;
        }

        public void setMasterType(String masterType) {
            this.masterType = masterType;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
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

        public int getSellerId() {
            return sellerId;
        }

        public void setSellerId(int sellerId) {
            this.sellerId = sellerId;
        }
    }
}
