package com.ssmk.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/8/2.
 */

public class RegionBean {
    /**
     * code : 200
     * msg : 获取省份成功
     * data : [{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00016866","regionNo":"001","regionName":"北京","parentNo":"","regionPath":"北京","regionType":"市","regionTypeNum":"1","regionShortName":"bj","regionSpell":"beijing","regionAreaId":"010","regionPostCode":"100000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00021482","regionNo":"002","regionName":"天津","parentNo":"","regionPath":"天津","regionType":"市","regionTypeNum":"1","regionShortName":"tj","regionSpell":"tianjin","regionAreaId":"022","regionPostCode":"300000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00036818","regionNo":"003","regionName":"河北","parentNo":"","regionPath":"河北","regionType":"省","regionTypeNum":"1","regionShortName":"hb","regionSpell":"hebei","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00046430","regionNo":"004","regionName":"山西","parentNo":"","regionPath":"山西","regionType":"省","regionTypeNum":"1","regionShortName":"sx","regionSpell":"shanxi","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00057000","regionNo":"005","regionName":"内蒙古","parentNo":"","regionPath":"内蒙古","regionType":"自治区","regionTypeNum":"1","regionShortName":"nmg","regionSpell":"neimenggu","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00069909","regionNo":"006","regionName":"辽宁","parentNo":"","regionPath":"辽宁","regionType":"省","regionTypeNum":"1","regionShortName":"ln","regionSpell":"liaoning","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00072450","regionNo":"007","regionName":"吉林","parentNo":"","regionPath":"吉林","regionType":"省","regionTypeNum":"1","regionShortName":"jl","regionSpell":"jilin","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00085040","regionNo":"008","regionName":"黑龙江","parentNo":"","regionPath":"黑龙江","regionType":"省","regionTypeNum":"1","regionShortName":"hlj","regionSpell":"heilongjia","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00098787","regionNo":"009","regionName":"上海","parentNo":"","regionPath":"上海","regionType":"市","regionTypeNum":"1","regionShortName":"sh","regionSpell":"shanghai","regionAreaId":"021","regionPostCode":"200000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00109425","regionNo":"010","regionName":"江苏","parentNo":"","regionPath":"江苏","regionType":"省","regionTypeNum":"1","regionShortName":"js","regionSpell":"jiangsu","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00110767","regionNo":"011","regionName":"浙江","parentNo":"","regionPath":"浙江","regionType":"省","regionTypeNum":"1","regionShortName":"zj","regionSpell":"zhejiang","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00125564","regionNo":"012","regionName":"安徽","parentNo":"","regionPath":"安徽","regionType":"省","regionTypeNum":"1","regionShortName":"ah","regionSpell":"anhui","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00135520","regionNo":"013","regionName":"福建","parentNo":"","regionPath":"福建","regionType":"省","regionTypeNum":"1","regionShortName":"fj","regionSpell":"fujian","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00140913","regionNo":"014","regionName":"江西","parentNo":"","regionPath":"江西","regionType":"省","regionTypeNum":"1","regionShortName":"jx","regionSpell":"jiangxi","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00158008","regionNo":"015","regionName":"山东","parentNo":"","regionPath":"山东","regionType":"省","regionTypeNum":"1","regionShortName":"sd","regionSpell":"shandong","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00167302","regionNo":"016","regionName":"河南","parentNo":"","regionPath":"河南","regionType":"省","regionTypeNum":"1","regionShortName":"hn","regionSpell":"henan","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00172489","regionNo":"017","regionName":"湖北","parentNo":"","regionPath":"湖北","regionType":"省","regionTypeNum":"1","regionShortName":"hb","regionSpell":"hubei","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00180542","regionNo":"018","regionName":"湖南","parentNo":"","regionPath":"湖南","regionType":"省","regionTypeNum":"1","regionShortName":"hn","regionSpell":"hunan","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00195248","regionNo":"019","regionName":"广东","parentNo":"","regionPath":"广东","regionType":"省","regionTypeNum":"1","regionShortName":"gd","regionSpell":"guangdong","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00204617","regionNo":"020","regionName":"广西","parentNo":"","regionPath":"广西","regionType":"壮族自治区","regionTypeNum":"1","regionShortName":"gx","regionSpell":"guangxi","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00213430","regionNo":"021","regionName":"海南","parentNo":"","regionPath":"海南","regionType":"省","regionTypeNum":"1","regionShortName":"hn","regionSpell":"hainan","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00222870","regionNo":"022","regionName":"重庆","parentNo":"","regionPath":"重庆","regionType":"市","regionTypeNum":"1","regionShortName":"cq","regionSpell":"chongqing","regionAreaId":"023","regionPostCode":"400000","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00232320","regionNo":"023","regionName":"四川","parentNo":"","regionPath":"四川","regionType":"省","regionTypeNum":"1","regionShortName":"sc","regionSpell":"sichuan","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00249960","regionNo":"024","regionName":"贵州","parentNo":"","regionPath":"贵州","regionType":"省","regionTypeNum":"1","regionShortName":"gz","regionSpell":"guizhou","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00258024","regionNo":"025","regionName":"云南","parentNo":"","regionPath":"云南","regionType":"省","regionTypeNum":"1","regionShortName":"yn","regionSpell":"yunnan","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00261133","regionNo":"026","regionName":"西藏","parentNo":"","regionPath":"西藏","regionType":"自治区","regionTypeNum":"1","regionShortName":"xc","regionSpell":"xicang","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00271595","regionNo":"027","regionName":"陕西","parentNo":"","regionPath":"陕西","regionType":"省","regionTypeNum":"1","regionShortName":"sx","regionSpell":"shanxi","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00284582","regionNo":"028","regionName":"甘肃","parentNo":"","regionPath":"甘肃","regionType":"省","regionTypeNum":"1","regionShortName":"gs","regionSpell":"gansu","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00298125","regionNo":"029","regionName":"青海","parentNo":"","regionPath":"青海","regionType":"省","regionTypeNum":"1","regionShortName":"qh","regionSpell":"qinghai","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00306884","regionNo":"030","regionName":"宁夏","parentNo":"","regionPath":"宁夏","regionType":"回族自治区","regionTypeNum":"1","regionShortName":"nx","regionSpell":"ningxia","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00310045","regionNo":"031","regionName":"新疆","parentNo":"","regionPath":"新疆","regionType":"维吾尔自治区","regionTypeNum":"1","regionShortName":"xj","regionSpell":"xinjiang","regionAreaId":"null","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00325800","regionNo":"032","regionName":"香港","parentNo":"","regionPath":"香港","regionType":"特别行政区","regionTypeNum":"1","regionShortName":"xg","regionSpell":"xianggang","regionAreaId":"852","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00337766","regionNo":"033","regionName":"澳门","parentNo":"","regionPath":"澳门","regionType":"特别行政区","regionTypeNum":"1","regionShortName":"am","regionSpell":"aomen","regionAreaId":"853","regionPostCode":"null","createName":null,"createTime":null},{"pageNo":0,"pageSize":0,"operatorUid":null,"operatorUname":null,"operatorRname":null,"operatorTime":null,"reserve1":null,"reserve2":null,"reserve3":null,"referer":null,"tranIP":null,"auditBaseEntity":null,"regionId":"00340094","regionNo":"034","regionName":"台湾","parentNo":"","regionPath":"台湾","regionType":"省","regionTypeNum":"1","regionShortName":"tw","regionSpell":"taiwan","regionAreaId":"886","regionPostCode":"null","createName":null,"createTime":null}]
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
         * regionId : 00016866
         * regionNo : 001
         * regionName : 北京
         * parentNo :
         * regionPath : 北京
         * regionType : 市
         * regionTypeNum : 1
         * regionShortName : bj
         * regionSpell : beijing
         * regionAreaId : 010
         * regionPostCode : 100000
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
