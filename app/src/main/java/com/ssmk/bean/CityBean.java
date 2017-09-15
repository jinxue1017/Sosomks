package com.ssmk.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/8/2.
 */

public class CityBean {
    /**
     * code : 200
     * msg : 获取市县成功
     * data : [{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00875260","regionNo":"007001","regionName":"长春","parentNo":"007","regionPath":"吉林/长春","regionType":"市","regionTypeNum":"2","regionShortName":"cc","regionSpell":"changchun","regionAreaId":"0431","regionPostCode":"130061","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00885839","regionNo":"007002","regionName":"吉林","parentNo":"007","regionPath":"吉林/吉林","regionType":"市","regionTypeNum":"2","regionShortName":"jl","regionSpell":"jilin","regionAreaId":"0432","regionPostCode":"132011","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00898619","regionNo":"007003","regionName":"四平","parentNo":"007","regionPath":"吉林/四平","regionType":"市","regionTypeNum":"2","regionShortName":"sp","regionSpell":"siping","regionAreaId":"0434","regionPostCode":"136000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00905581","regionNo":"007004","regionName":"辽源","parentNo":"007","regionPath":"吉林/辽源","regionType":"市","regionTypeNum":"2","regionShortName":"ly","regionSpell":"liaoyuan","regionAreaId":"0437","regionPostCode":"136200","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00912050","regionNo":"007005","regionName":"通化","parentNo":"007","regionPath":"吉林/通化","regionType":"市","regionTypeNum":"2","regionShortName":"th","regionSpell":"tonghua","regionAreaId":"0435","regionPostCode":"134001","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00923510","regionNo":"007006","regionName":"白山","parentNo":"007","regionPath":"吉林/白山","regionType":"市","regionTypeNum":"2","regionShortName":"bs","regionSpell":"baishan","regionAreaId":"0439","regionPostCode":"134300","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00931404","regionNo":"007007","regionName":"松原","parentNo":"007","regionPath":"吉林/松原","regionType":"市","regionTypeNum":"2","regionShortName":"sy","regionSpell":"songyuan","regionAreaId":"0438","regionPostCode":"138000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00946492","regionNo":"007008","regionName":"白城","parentNo":"007","regionPath":"吉林/白城","regionType":"市","regionTypeNum":"2","regionShortName":"bc","regionSpell":"baicheng","regionAreaId":"0436","regionPostCode":"137000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00958253","regionNo":"007009","regionName":"延边","parentNo":"007","regionPath":"吉林/延边","regionType":"州","regionTypeNum":"2","regionShortName":"yb","regionSpell":"yanbian","regionAreaId":"0433","regionPostCode":"133000","createName":null,"createTime":null}]
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
         * pageNo : 0
         * pageSize : 0
         * operatorUid : null
         * operatorUname : null
         * operatorRname : null
         * operatorTime : null
         * reserve1 : null
         * reserve2 : null
         * reserve3 : null
         * referer : null
         * tranIP : null
         * auditBaseEntity : null
         * regionId : 00875260
         * regionNo : 007001
         * regionName : 长春
         * parentNo : 007
         * regionPath : 吉林/长春
         * regionType : 市
         * regionTypeNum : 2
         * regionShortName : cc
         * regionSpell : changchun
         * regionAreaId : 0431
         * regionPostCode : 130061
         * createName : null
         * createTime : null
         */

        private int pageNo;
        private int pageSize;
        private Object operatorUid;
        private Object operatorUname;
        private Object operatorRname;
        private Object operatorTime;
        private Object reserve1;
        private Object reserve2;
        private Object reserve3;
        private Object referer;
        private Object tranIP;
        private Object auditBaseEntity;
        private String regionId;
        private String regionNo;
        private String regionName;
        private String parentNo;
        private String regionPath;
        private String regionType;
        private String regionTypeNum;
        private String regionShortName;
        private String regionSpell;
        private String regionAreaId;
        private String regionPostCode;
        private Object createName;
        private Object createTime;

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

        public Object getOperatorUid() {
            return operatorUid;
        }

        public void setOperatorUid(Object operatorUid) {
            this.operatorUid = operatorUid;
        }

        public Object getOperatorUname() {
            return operatorUname;
        }

        public void setOperatorUname(Object operatorUname) {
            this.operatorUname = operatorUname;
        }

        public Object getOperatorRname() {
            return operatorRname;
        }

        public void setOperatorRname(Object operatorRname) {
            this.operatorRname = operatorRname;
        }

        public Object getOperatorTime() {
            return operatorTime;
        }

        public void setOperatorTime(Object operatorTime) {
            this.operatorTime = operatorTime;
        }

        public Object getReserve1() {
            return reserve1;
        }

        public void setReserve1(Object reserve1) {
            this.reserve1 = reserve1;
        }

        public Object getReserve2() {
            return reserve2;
        }

        public void setReserve2(Object reserve2) {
            this.reserve2 = reserve2;
        }

        public Object getReserve3() {
            return reserve3;
        }

        public void setReserve3(Object reserve3) {
            this.reserve3 = reserve3;
        }

        public Object getReferer() {
            return referer;
        }

        public void setReferer(Object referer) {
            this.referer = referer;
        }

        public Object getTranIP() {
            return tranIP;
        }

        public void setTranIP(Object tranIP) {
            this.tranIP = tranIP;
        }

        public Object getAuditBaseEntity() {
            return auditBaseEntity;
        }

        public void setAuditBaseEntity(Object auditBaseEntity) {
            this.auditBaseEntity = auditBaseEntity;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getRegionNo() {
            return regionNo;
        }

        public void setRegionNo(String regionNo) {
            this.regionNo = regionNo;
        }

        public String getRegionName() {
            return regionName;
        }

        public void setRegionName(String regionName) {
            this.regionName = regionName;
        }

        public String getParentNo() {
            return parentNo;
        }

        public void setParentNo(String parentNo) {
            this.parentNo = parentNo;
        }

        public String getRegionPath() {
            return regionPath;
        }

        public void setRegionPath(String regionPath) {
            this.regionPath = regionPath;
        }

        public String getRegionType() {
            return regionType;
        }

        public void setRegionType(String regionType) {
            this.regionType = regionType;
        }

        public String getRegionTypeNum() {
            return regionTypeNum;
        }

        public void setRegionTypeNum(String regionTypeNum) {
            this.regionTypeNum = regionTypeNum;
        }

        public String getRegionShortName() {
            return regionShortName;
        }

        public void setRegionShortName(String regionShortName) {
            this.regionShortName = regionShortName;
        }

        public String getRegionSpell() {
            return regionSpell;
        }

        public void setRegionSpell(String regionSpell) {
            this.regionSpell = regionSpell;
        }

        public String getRegionAreaId() {
            return regionAreaId;
        }

        public void setRegionAreaId(String regionAreaId) {
            this.regionAreaId = regionAreaId;
        }

        public String getRegionPostCode() {
            return regionPostCode;
        }

        public void setRegionPostCode(String regionPostCode) {
            this.regionPostCode = regionPostCode;
        }

        public Object getCreateName() {
            return createName;
        }

        public void setCreateName(Object createName) {
            this.createName = createName;
        }

        public Object getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Object createTime) {
            this.createTime = createTime;
        }
    }
}
