package com.ssmk.module.shoppingcar.bean;

/**
 * 功能描述  :
 * 创建时间 : 2017/8/15 8:28
 * 编写人  :  王成哲
 */
public class TestGoodsBean {

    private String goodsId;
    private String goodsName;
    private String cartId;
    private String skuId;
    private String skuInfo;
    private long goodsInfoId;
    private String goodsFormatId;
    private String sizeNumberId;
    private int goodsNumber;
    private int goodsPrice;
    private int freight;
    private int memberPrice;
    private String goodsCode;
    private int discountPrice;
    private boolean isEdtor;
    protected boolean isChoosed;//是否选择
    private double priceNum;

    public TestGoodsBean() {
    }

    public TestGoodsBean(String goodsId, double priceNum, boolean isChoosed, boolean isEdtor, int discountPrice, int memberPrice, String goodsCode, int freight, int goodsPrice, int goodsNumber, String sizeNumberId, String goodsFormatId, long goodsInfoId, String skuInfo, String skuId, String goodsName, String cartId) {
        this.goodsId = goodsId;
        this.priceNum = priceNum;
        this.isChoosed = isChoosed;
        this.isEdtor = isEdtor;
        this.discountPrice = discountPrice;
        this.memberPrice = memberPrice;
        this.goodsCode = goodsCode;
        this.freight = freight;
        this.goodsPrice = goodsPrice;
        this.goodsNumber = goodsNumber;
        this.sizeNumberId = sizeNumberId;
        this.goodsFormatId = goodsFormatId;
        this.goodsInfoId = goodsInfoId;
        this.skuInfo = skuInfo;
        this.skuId = skuId;
        this.goodsName = goodsName;
        this.cartId = cartId;
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

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getSkuInfo() {
        return skuInfo;
    }

    public void setSkuInfo(String skuInfo) {
        this.skuInfo = skuInfo;
    }

    public long getGoodsInfoId() {
        return goodsInfoId;
    }

    public void setGoodsInfoId(long goodsInfoId) {
        this.goodsInfoId = goodsInfoId;
    }

    public String getGoodsFormatId() {
        return goodsFormatId;
    }

    public void setGoodsFormatId(String goodsFormatId) {
        this.goodsFormatId = goodsFormatId;
    }

    public String getSizeNumberId() {
        return sizeNumberId;
    }

    public void setSizeNumberId(String sizeNumberId) {
        this.sizeNumberId = sizeNumberId;
    }

    public int getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(int goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public int getFreight() {
        return freight;
    }

    public void setFreight(int freight) {
        this.freight = freight;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public int getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(int memberPrice) {
        this.memberPrice = memberPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public boolean isEdtor() {
        return isEdtor;
    }

    public void setEdtor(boolean edtor) {
        isEdtor = edtor;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }

    public double getPriceNum() {
        return priceNum;
    }

    public void setPriceNum(double priceNum) {
        this.priceNum = priceNum;
    }
}
