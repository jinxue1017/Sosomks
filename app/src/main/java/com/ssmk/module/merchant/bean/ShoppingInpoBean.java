package com.ssmk.module.merchant.bean;

import java.util.List;

/**
 * 创建者:      CaiJianNan
 * 创建时间:   2017/8/2 17:07
 * 描述: TODO
 */

public class ShoppingInpoBean {
    /**
     * code : 200
     * msg : 成功!
     * total : 13
     * data : [{"gtId":51,"masterId":"2","masterType":"家居服套装","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":52,"masterId":"2","masterType":"家居裙/裤","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":53,"masterId":"2","masterType":"吊带/背心/T恤","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":54,"masterId":"2","masterType":"基础内衣","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":55,"masterId":"2","masterType":"保暖内衣","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":56,"masterId":"2","masterType":"内裤专区","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":57,"masterId":"2","masterType":"袜子专区","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":58,"masterId":"1","masterType":"短袖T恤","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":59,"masterId":"1","masterType":"短袖衬衫","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":60,"masterId":"1","masterType":"丝光棉","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":61,"masterId":"1","masterType":"休闲裤","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":62,"masterId":"1","masterType":"牛仔裤","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29},{"gtId":63,"masterId":"1","masterType":"茄克","typeName":"2","createName":null,"createTime":"2017-08-03","sellerId":29}]
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
         * gtId : 51
         * masterId : 2
         * masterType : 家居服套装
         * typeName : 2
         * createName : null
         * createTime : 2017-08-03
         * sellerId : 29
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
