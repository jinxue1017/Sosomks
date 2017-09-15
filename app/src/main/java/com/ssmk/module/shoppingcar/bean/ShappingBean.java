package com.ssmk.module.shoppingcar.bean;

import java.util.List;

/**
 * 创建者:      CaiJianNan
 * 创建时间:   2017/8/1 08:46
 * 描述: TODO
 */

public class ShappingBean {
    /**
     * code : 200
     * msg : 信息获取成功!
     * total : 7
     * merchantsTypeData : [{"stId":1,"typeName":"包","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao1.png","typeStatus":"0","createName":"波波","createTime":"2017-06-29"},{"stId":2,"typeName":"酒","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/cha-.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/cha_dj.png","typeStatus":"0","createName":"波波","createTime":"2017-06-30"},{"stId":22,"typeName":"珠宝","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/jiu.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/jiu_dj.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-03"},{"stId":24,"typeName":"食品","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/xiezi.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/xiezi1.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-03"},{"stId":25,"typeName":"烟","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yan.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yan_dj.png","typeStatus":"1","createName":"波波","createTime":"2017-07-07"},{"stId":26,"typeName":"服装","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yifu.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/yifu1.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-16"},{"stId":27,"typeName":"奢侈品","originalIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/zhuabo_dj.png","checkIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/zhubao-.png","typeStatus":"1","createName":"丹丹","createTime":"2017-07-16"}]
     * merchantsData : [{"typeName":"包","merchantsSellerInfo":[{"sellerId":23,"sellerLoginName":"lgm","sellerCode":"glhr-23","sellerName":"老干妈","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/meinong.png","provinceId":"002","provinceName":"天津","cityId":"002001","cityName":"市辖区","districtId":"002001003","districtName":"河西","stId":1,"typeName":"烟","address":"新立里社区","tel":"13225284619","qq":"1231","isDelivery":"1","deliveryDistance":"0.00","deliveryCost":"0.00","settlementCycle":"一周","createName":null,"createTime":"2017-07-17","longitude":"117.223372","latitude":"39.109563"},{"sellerId":16,"sellerLoginName":"szss","sellerCode":"glhr-16","sellerName":"三只松鼠","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/aerbeisi.png","provinceId":"002","provinceName":"天津","cityId":"002002","cityName":"县","districtId":"002002016","districtName":"蓟县","stId":1,"typeName":"烟","address":"天津市张自忠路","tel":"13225284619","qq":"123","isDelivery":"0","deliveryDistance":"132.00","deliveryCost":"123.00","settlementCycle":"一周","createName":null,"createTime":"2017-07-11","longitude":"117.203021","latitude":"39.130541"}]},{"typeName":"酒","merchantsSellerInfo":[{"sellerId":20,"sellerLoginName":"bcw","sellerCode":"glhr-20","sellerName":"百草味","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/Jiu2.png","provinceId":"001","provinceName":"北京","cityId":"001001","cityName":"市辖区","districtId":"001001002","districtName":"西城","stId":2,"typeName":"酒","address":"大木仓胡同","tel":"13225649751","qq":"34343","isDelivery":"1","deliveryDistance":"34.00","deliveryCost":"34.00","settlementCycle":"两周","createName":null,"createTime":"2017-07-17","longitude":"116.365868","latitude":"39.912289"}]},{"typeName":"珠宝","merchantsSellerInfo":[{"sellerId":17,"sellerLoginName":"wl","sellerCode":"glhr-17","sellerName":"卫龙","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/baicaowei.png","provinceId":"002","provinceName":"天津","cityId":"002001","cityName":"市辖区","districtId":"002001003","districtName":"河西","stId":22,"typeName":"酒","address":"天津市河西路","tel":"15711098543","qq":"66688","isDelivery":"0","deliveryDistance":"88.01","deliveryCost":"88.00","settlementCycle":"日","createName":null,"createTime":"2017-07-12","longitude":"117.223371","latitude":"39.109563"}]},{"typeName":"食品","merchantsSellerInfo":[{"sellerId":24,"sellerLoginName":"whh","sellerCode":"glhr-24","sellerName":"娃哈哈","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/pic1.png","provinceId":"006","provinceName":"辽宁","cityId":"006007","cityName":"锦州","districtId":"006007006","districtName":"黑山","stId":24,"typeName":"食品","address":"黑山县教育局","tel":"15711694851","qq":"23432","isDelivery":"1","deliveryDistance":"23.00","deliveryCost":"23.00","settlementCycle":"两周","createName":null,"createTime":"2017-07-17","longitude":"122.123443","latitude":"41.666028"}]},{"typeName":"烟","merchantsSellerInfo":[{"sellerId":22,"sellerLoginName":"ww","sellerCode":"glhr-21","sellerName":"旺旺","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/jiupic.png","provinceId":"002","provinceName":"天津","cityId":"002002","cityName":"县","districtId":"002002017","districtName":"宁河","stId":25,"typeName":"食品","address":"宁河五村","tel":"17745916582","qq":"123123123","isDelivery":"1","deliveryDistance":"123.00","deliveryCost":"12.00","settlementCycle":"日","createName":null,"createTime":"2017-07-17","longitude":"117.778363","latitude":"39.466543"},{"sellerId":18,"sellerLoginName":"wdm","sellerCode":"glhr-18","sellerName":"味多美","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/caihongtang.png","provinceId":"003","provinceName":"河北","cityId":"003002","cityName":"唐山","districtId":"003002002","districtName":"路南","stId":25,"typeName":"食品","address":"唐山市路南区人民政府\r\n新华西道68号","tel":"13327694581","qq":"99","isDelivery":"0","deliveryDistance":"0.00","deliveryCost":"0.00","settlementCycle":"两周","createName":null,"createTime":"2017-07-12","longitude":"118.154354","latitude":"39.625058"}]},{"typeName":"服装","merchantsSellerInfo":[{"sellerId":19,"sellerLoginName":"jfc","sellerCode":"glhr-19","sellerName":"金风城","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/haifeisi.png","provinceId":"004","provinceName":"山西","cityId":"004001","cityName":"太原","districtId":"004001002","districtName":"迎泽","stId":26,"typeName":"茶","address":"开化寺南街","tel":"15810948627","qq":"234234","isDelivery":"0","deliveryDistance":"0.00","deliveryCost":"0.00","settlementCycle":"一周","createName":null,"createTime":"2017-07-17","longitude":"112.5634","latitude":"37.863451"}]},{"typeName":"奢侈品","merchantsSellerInfo":[]}]
     */

    private int code;
    private String msg;
    private int total;
    private List<MerchantsTypeDataBean> merchantsTypeData;
    private List<MerchantsDataBean> merchantsData;

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

    public List<MerchantsTypeDataBean> getMerchantsTypeData() {
        return merchantsTypeData;
    }

    public void setMerchantsTypeData(List<MerchantsTypeDataBean> merchantsTypeData) {
        this.merchantsTypeData = merchantsTypeData;
    }

    public List<MerchantsDataBean> getMerchantsData() {
        return merchantsData;
    }

    public void setMerchantsData(List<MerchantsDataBean> merchantsData) {
        this.merchantsData = merchantsData;
    }

    public static class MerchantsTypeDataBean {
        /**
         * stId : 1
         * typeName : 包
         * originalIcon : http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao.png
         * checkIcon : http://47.94.227.190:8080/glhr-main/upload/rear/shopsType/bao1.png
         * typeStatus : 0
         * createName : 波波
         * createTime : 2017-06-29
         */

        private int stId;
        private String typeName;
        private String originalIcon;
        private String checkIcon;
        private String typeStatus;
        private String createName;
        private String createTime;

        public int getStId() {
            return stId;
        }

        public void setStId(int stId) {
            this.stId = stId;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getOriginalIcon() {
            return originalIcon;
        }

        public void setOriginalIcon(String originalIcon) {
            this.originalIcon = originalIcon;
        }

        public String getCheckIcon() {
            return checkIcon;
        }

        public void setCheckIcon(String checkIcon) {
            this.checkIcon = checkIcon;
        }

        public String getTypeStatus() {
            return typeStatus;
        }

        public void setTypeStatus(String typeStatus) {
            this.typeStatus = typeStatus;
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

    public static class MerchantsDataBean {
        /**
         * typeName : 包
         * merchantsSellerInfo : [{"sellerId":23,"sellerLoginName":"lgm","sellerCode":"glhr-23","sellerName":"老干妈","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/meinong.png","provinceId":"002","provinceName":"天津","cityId":"002001","cityName":"市辖区","districtId":"002001003","districtName":"河西","stId":1,"typeName":"烟","address":"新立里社区","tel":"13225284619","qq":"1231","isDelivery":"1","deliveryDistance":"0.00","deliveryCost":"0.00","settlementCycle":"一周","createName":null,"createTime":"2017-07-17","longitude":"117.223372","latitude":"39.109563"},{"sellerId":16,"sellerLoginName":"szss","sellerCode":"glhr-16","sellerName":"三只松鼠","sellerIcon":"http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/aerbeisi.png","provinceId":"002","provinceName":"天津","cityId":"002002","cityName":"县","districtId":"002002016","districtName":"蓟县","stId":1,"typeName":"烟","address":"天津市张自忠路","tel":"13225284619","qq":"123","isDelivery":"0","deliveryDistance":"132.00","deliveryCost":"123.00","settlementCycle":"一周","createName":null,"createTime":"2017-07-11","longitude":"117.203021","latitude":"39.130541"}]
         */

        private String typeName;
        private List<MerchantsSellerInfoBean> merchantsSellerInfo;

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public List<MerchantsSellerInfoBean> getMerchantsSellerInfo() {
            return merchantsSellerInfo;
        }

        public void setMerchantsSellerInfo(List<MerchantsSellerInfoBean> merchantsSellerInfo) {
            this.merchantsSellerInfo = merchantsSellerInfo;
        }

        public static class MerchantsSellerInfoBean {
            /**
             * sellerId : 23
             * sellerLoginName : lgm
             * sellerCode : glhr-23
             * sellerName : 老干妈
             * sellerIcon : http://47.94.227.190:8080/glhr-main/upload/rear/shopsSeller/meinong.png
             * provinceId : 002
             * provinceName : 天津
             * cityId : 002001
             * cityName : 市辖区
             * districtId : 002001003
             * districtName : 河西
             * stId : 1
             * typeName : 烟
             * address : 新立里社区
             * tel : 13225284619
             * qq : 1231
             * isDelivery : 1
             * deliveryDistance : 0.00
             * deliveryCost : 0.00
             * settlementCycle : 一周
             * createName : null
             * createTime : 2017-07-17
             * longitude : 117.223372
             * latitude : 39.109563
             */

            private int sellerId;
            private String sellerLoginName;
            private String sellerCode;
            private String sellerName;
            private String sellerIcon;
            private String provinceId;
            private String provinceName;
            private String cityId;
            private String cityName;
            private String districtId;
            private String districtName;
            private int stId;
            private String typeName;
            private String address;
            private String tel;
            private String qq;
            private String isDelivery;
            private String deliveryDistance;
            private String deliveryCost;
            private String settlementCycle;
            private Object createName;
            private String createTime;
            private String longitude;
            private String latitude;

            public int getSellerId() {
                return sellerId;
            }

            public void setSellerId(int sellerId) {
                this.sellerId = sellerId;
            }

            public String getSellerLoginName() {
                return sellerLoginName;
            }

            public void setSellerLoginName(String sellerLoginName) {
                this.sellerLoginName = sellerLoginName;
            }

            public String getSellerCode() {
                return sellerCode;
            }

            public void setSellerCode(String sellerCode) {
                this.sellerCode = sellerCode;
            }

            public String getSellerName() {
                return sellerName;
            }

            public void setSellerName(String sellerName) {
                this.sellerName = sellerName;
            }

            public String getSellerIcon() {
                return sellerIcon;
            }

            public void setSellerIcon(String sellerIcon) {
                this.sellerIcon = sellerIcon;
            }

            public String getProvinceId() {
                return provinceId;
            }

            public void setProvinceId(String provinceId) {
                this.provinceId = provinceId;
            }

            public String getProvinceName() {
                return provinceName;
            }

            public void setProvinceName(String provinceName) {
                this.provinceName = provinceName;
            }

            public String getCityId() {
                return cityId;
            }

            public void setCityId(String cityId) {
                this.cityId = cityId;
            }

            public String getCityName() {
                return cityName;
            }

            public void setCityName(String cityName) {
                this.cityName = cityName;
            }

            public String getDistrictId() {
                return districtId;
            }

            public void setDistrictId(String districtId) {
                this.districtId = districtId;
            }

            public String getDistrictName() {
                return districtName;
            }

            public void setDistrictName(String districtName) {
                this.districtName = districtName;
            }

            public int getStId() {
                return stId;
            }

            public void setStId(int stId) {
                this.stId = stId;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getIsDelivery() {
                return isDelivery;
            }

            public void setIsDelivery(String isDelivery) {
                this.isDelivery = isDelivery;
            }

            public String getDeliveryDistance() {
                return deliveryDistance;
            }

            public void setDeliveryDistance(String deliveryDistance) {
                this.deliveryDistance = deliveryDistance;
            }

            public String getDeliveryCost() {
                return deliveryCost;
            }

            public void setDeliveryCost(String deliveryCost) {
                this.deliveryCost = deliveryCost;
            }

            public String getSettlementCycle() {
                return settlementCycle;
            }

            public void setSettlementCycle(String settlementCycle) {
                this.settlementCycle = settlementCycle;
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

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }
        }
    }
}
