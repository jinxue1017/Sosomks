package com.ssmk.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/8/2.
 */

public class CitySonBean {
    /**
     * code : 200
     * msg : 获取市县成功
     * data : [{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"09381978","regionNo":"007007001","regionName":"宁江","parentNo":"007007","regionPath":"吉林/松原/宁江","regionType":"区","regionTypeNum":"3","regionShortName":"nj","regionSpell":"ningjiang","regionAreaId":"null","regionPostCode":"138000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"09398577","regionNo":"007007002","regionName":"扶余","parentNo":"007007","regionPath":"吉林/松原/扶余","regionType":"县","regionTypeNum":"3","regionShortName":"fy","regionSpell":"fuyu","regionAreaId":"null","regionPostCode":"131203","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"09406952","regionNo":"007007003","regionName":"长岭","parentNo":"007007","regionPath":"吉林/松原/长岭","regionType":"县","regionTypeNum":"3","regionShortName":"cl","regionSpell":"changling","regionAreaId":"null","regionPostCode":"131500","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"09413400","regionNo":"007007004","regionName":"乾安","parentNo":"007007","regionPath":"吉林/松原/乾安","regionType":"县","regionTypeNum":"3","regionShortName":"qa","regionSpell":"qianan","regionAreaId":"null","regionPostCode":"131400","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"09424317","regionNo":"007007005","regionName":"前郭尔罗斯","parentNo":"007007","regionPath":"吉林/松原/前郭尔罗斯","regionType":"蒙古族自治县","regionTypeNum":"3","regionShortName":"qgelsmgzzz","regionSpell":"qianguoerl","regionAreaId":"null","regionPostCode":"131100","createName":null,"createTime":null}]
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
         * regionId : 09381978
         * regionNo : 007007001
         * regionName : 宁江
         * parentNo : 007007
         * regionPath : 吉林/松原/宁江
         * regionType : 区
         * regionTypeNum : 3
         * regionShortName : nj
         * regionSpell : ningjiang
         * regionAreaId : null
         * regionPostCode : 138000
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
