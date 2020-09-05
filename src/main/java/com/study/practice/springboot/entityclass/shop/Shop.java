package com.study.practice.springboot.entityclass.shop;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @author fantingting
 * @date 2019/06/14
 */
public class Shop {
    //网店类型，1老店，2新店
    private Integer oldOrNew;
    //网店id
    private Long shopId;
    //客户id，客户发布自动关联，后台发布需验证客户是否注册
    private Long userId;
    //维护人,客户发布网店需指定,后台发布网店自动关联业务员,只能查询自己的网店
    private Long sysUserId;
    //网店类型,1天猫，2淘宝，3京东，4其他
    private Integer shopType;
    //网店标题
    private String shopTitle;
    //网店描述
    private String shopDescription;
    //网店网址
    private String shopUrl;
    //网店名称
    private String shopName;
    //网店售价
    private BigDecimal shopPrice;
    //技术年费,京东天猫才会有
    private BigDecimal shopTechnicalFee;
    //消保金
    private BigDecimal shopSaleBond;
    //一般扣分
    private BigDecimal shopGeneralDeductPoints;
    //严重扣分
    private BigDecimal shopSeriousDeductPoints;
    //售假扣分
    private BigDecimal shopFakeDeductPoints;
    //网店认证状态,1个人身份证认证，2公司名义认证
    private Integer shopCertificate;
    //可提供身份证正反面照,1是，2否
    private Integer provideIdentityCard;
    //可提供个人半身照,1是，2否
    private Integer providePersonalPhoto;
    //可提供手持身份证照,1是，2否
    private Integer provideHandIdentityCard;
    //可提供户口本照,1是，2否
    private Integer provideHouseholdRegister;
    //网店状态,客户后台展示：1、2、3审核中,4在售,5已预订,6交接中,7已出售，8已删除，管理后台展示：1未分配，2审核中，3审核失败，4在售，5已预订，6交接中，7已出售，8已删除
    private Integer shopState;
    //创建人，只有在后台创建的时候才会有
    private Long creator;
    //创建时间
    private Date createTime;
    //修改时间
    private Date modifyTime;
    //修改人，一定是后台修改
    private Long modifyor;
    //开通类目
    private Integer shopCategory;
    //网店等级
    private Integer shopLevel;
    //所在地区
    private Integer shopArea;
    //网店分类
    private Integer shopClassify;
    //价格区间(低)
    private BigDecimal shopPriceMin;
    //价格区间(高)
    private BigDecimal shopPriceMax;
    //等级区间(低)
    private Integer shopLevelMin;
    //等级区间(高)
    private Integer shopLevelMax;
    //纳税人资质
    private Integer taxpayerType;
    //是否带货,1是，2否
    private Integer shopBringGoods;
    //完成指标
    private Integer shopFulfillTarget;
    //老店
    private Integer shopSecondHand;

    //是否提供货源渠道,1是，2否
    private Integer shopProvideChannels;

    //商标类型
    private Integer shopTrademarkType;

    /**
     * 排序字段(create_time, shop_price)
     */
    private String orderField;

    /**
     * 排序类型(asc, desc)
     */
    private String orderType;

    //商标类型
    private Long shopTrademarkClassify;
    //是否独家
    private Integer exclusive;
    //宝贝与描述相符，数字
    private BigDecimal shopFitsDescription;

    //卖家服务态度，数字
    private BigDecimal shopSellerService;
    //卖家发货速度，数字
    private BigDecimal shopDeliverySpeed;
    //宝贝与描述相符比同行水平
    private Integer shopFitsDescriptionRate;
    //卖家服务态度比同行水平
    private Integer shopSellerServiceRate;
    //卖家发货速度比同行水平
    private Integer shopDeliverySpeedRate;
    //店铺开通的所有类目
    //收藏
    private String collection;
    //公司详情
    private String companyDetail;
    //卖家姓名
    private String userName;
    //卖家手机号
    private Long userPhone;
    //卖家地址
    private String area;
    //卖家手机号(带星号)
    private String userPhoneNum;

    public Integer getOldOrNew() {
        return oldOrNew;
    }

    public void setOldOrNew(Integer oldOrNew) {
        this.oldOrNew = oldOrNew;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Long sysUserId) {
        this.sysUserId = sysUserId;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public void setShopDescription(String shopDescription) {
        this.shopDescription = shopDescription;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public BigDecimal getShopTechnicalFee() {
        return shopTechnicalFee;
    }

    public void setShopTechnicalFee(BigDecimal shopTechnicalFee) {
        this.shopTechnicalFee = shopTechnicalFee;
    }

    public BigDecimal getShopSaleBond() {
        return shopSaleBond;
    }

    public void setShopSaleBond(BigDecimal shopSaleBond) {
        this.shopSaleBond = shopSaleBond;
    }

    public BigDecimal getShopGeneralDeductPoints() {
        return shopGeneralDeductPoints;
    }

    public void setShopGeneralDeductPoints(BigDecimal shopGeneralDeductPoints) {
        this.shopGeneralDeductPoints = shopGeneralDeductPoints;
    }

    public BigDecimal getShopSeriousDeductPoints() {
        return shopSeriousDeductPoints;
    }

    public void setShopSeriousDeductPoints(BigDecimal shopSeriousDeductPoints) {
        this.shopSeriousDeductPoints = shopSeriousDeductPoints;
    }

    public BigDecimal getShopFakeDeductPoints() {
        return shopFakeDeductPoints;
    }

    public void setShopFakeDeductPoints(BigDecimal shopFakeDeductPoints) {
        this.shopFakeDeductPoints = shopFakeDeductPoints;
    }

    public Integer getShopCertificate() {
        return shopCertificate;
    }

    public void setShopCertificate(Integer shopCertificate) {
        this.shopCertificate = shopCertificate;
    }

    public Integer getProvideIdentityCard() {
        return provideIdentityCard;
    }

    public void setProvideIdentityCard(Integer provideIdentityCard) {
        this.provideIdentityCard = provideIdentityCard;
    }

    public Integer getProvidePersonalPhoto() {
        return providePersonalPhoto;
    }

    public void setProvidePersonalPhoto(Integer providePersonalPhoto) {
        this.providePersonalPhoto = providePersonalPhoto;
    }

    public Integer getProvideHandIdentityCard() {
        return provideHandIdentityCard;
    }

    public void setProvideHandIdentityCard(Integer provideHandIdentityCard) {
        this.provideHandIdentityCard = provideHandIdentityCard;
    }

    public Integer getProvideHouseholdRegister() {
        return provideHouseholdRegister;
    }

    public void setProvideHouseholdRegister(Integer provideHouseholdRegister) {
        this.provideHouseholdRegister = provideHouseholdRegister;
    }

    public Integer getShopState() {
        return shopState;
    }

    public void setShopState(Integer shopState) {
        this.shopState = shopState;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyor() {
        return modifyor;
    }

    public void setModifyor(Long modifyor) {
        this.modifyor = modifyor;
    }

    public Integer getShopCategory() {
        return shopCategory;
    }

    public void setShopCategory(Integer shopCategory) {
        this.shopCategory = shopCategory;
    }

    public Integer getShopLevel() {
        return shopLevel;
    }

    public void setShopLevel(Integer shopLevel) {
        this.shopLevel = shopLevel;
    }

    public Integer getShopArea() {
        return shopArea;
    }

    public void setShopArea(Integer shopArea) {
        this.shopArea = shopArea;
    }

    public Integer getShopClassify() {
        return shopClassify;
    }

    public void setShopClassify(Integer shopClassify) {
        this.shopClassify = shopClassify;
    }

    public BigDecimal getShopPriceMin() {
        return shopPriceMin;
    }

    public void setShopPriceMin(BigDecimal shopPriceMin) {
        this.shopPriceMin = shopPriceMin;
    }

    public BigDecimal getShopPriceMax() {
        return shopPriceMax;
    }

    public void setShopPriceMax(BigDecimal shopPriceMax) {
        this.shopPriceMax = shopPriceMax;
    }

    public Integer getShopLevelMin() {
        return shopLevelMin;
    }

    public void setShopLevelMin(Integer shopLevelMin) {
        this.shopLevelMin = shopLevelMin;
    }

    public Integer getShopLevelMax() {
        return shopLevelMax;
    }

    public void setShopLevelMax(Integer shopLevelMax) {
        this.shopLevelMax = shopLevelMax;
    }

    public Integer getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(Integer taxpayerType) {
        this.taxpayerType = taxpayerType;
    }

    public Integer getShopBringGoods() {
        return shopBringGoods;
    }

    public void setShopBringGoods(Integer shopBringGoods) {
        this.shopBringGoods = shopBringGoods;
    }

    public Integer getShopFulfillTarget() {
        return shopFulfillTarget;
    }

    public void setShopFulfillTarget(Integer shopFulfillTarget) {
        this.shopFulfillTarget = shopFulfillTarget;
    }

    public Integer getShopSecondHand() {
        return shopSecondHand;
    }

    public void setShopSecondHand(Integer shopSecondHand) {
        this.shopSecondHand = shopSecondHand;
    }

    public Integer getShopProvideChannels() {
        return shopProvideChannels;
    }

    public void setShopProvideChannels(Integer shopProvideChannels) {
        this.shopProvideChannels = shopProvideChannels;
    }

    public Integer getShopTrademarkType() {
        return shopTrademarkType;
    }

    public void setShopTrademarkType(Integer shopTrademarkType) {
        this.shopTrademarkType = shopTrademarkType;
    }

    public String getOrderField() {
        return orderField;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Long getShopTrademarkClassify() {
        return shopTrademarkClassify;
    }

    public void setShopTrademarkClassify(Long shopTrademarkClassify) {
        this.shopTrademarkClassify = shopTrademarkClassify;
    }

    public Integer getExclusive() {
        return exclusive;
    }

    public void setExclusive(Integer exclusive) {
        this.exclusive = exclusive;
    }

    public BigDecimal getShopFitsDescription() {
        return shopFitsDescription;
    }

    public void setShopFitsDescription(BigDecimal shopFitsDescription) {
        this.shopFitsDescription = shopFitsDescription;
    }

    public BigDecimal getShopSellerService() {
        return shopSellerService;
    }

    public void setShopSellerService(BigDecimal shopSellerService) {
        this.shopSellerService = shopSellerService;
    }

    public BigDecimal getShopDeliverySpeed() {
        return shopDeliverySpeed;
    }

    public void setShopDeliverySpeed(BigDecimal shopDeliverySpeed) {
        this.shopDeliverySpeed = shopDeliverySpeed;
    }

    public Integer getShopFitsDescriptionRate() {
        return shopFitsDescriptionRate;
    }

    public void setShopFitsDescriptionRate(Integer shopFitsDescriptionRate) {
        this.shopFitsDescriptionRate = shopFitsDescriptionRate;
    }

    public Integer getShopSellerServiceRate() {
        return shopSellerServiceRate;
    }

    public void setShopSellerServiceRate(Integer shopSellerServiceRate) {
        this.shopSellerServiceRate = shopSellerServiceRate;
    }

    public Integer getShopDeliverySpeedRate() {
        return shopDeliverySpeedRate;
    }

    public void setShopDeliverySpeedRate(Integer shopDeliverySpeedRate) {
        this.shopDeliverySpeedRate = shopDeliverySpeedRate;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public String getCompanyDetail() {
        return companyDetail;
    }

    public void setCompanyDetail(String companyDetail) {
        this.companyDetail = companyDetail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getUserPhoneNum() {
        return userPhoneNum;
    }

    public void setUserPhoneNum(String userPhoneNum) {
        this.userPhoneNum = userPhoneNum;
    }
}