package com.zhiguan.carownerhomejob.domain.system;

import java.util.Date;

public class SystemSetConfig {
    private Long id;

    private String isDeleted;

    private String createOperator;

    private Date createTime;

    private String lastOperator;

    private Date lastModifyTime;

    private String platformName;

    private String logoImgUrlMax;

    private String logoImgUrlMin;

    private String customerTel;

    private String weixinPublicDevelopId;

    private String weixinPublicAppId;

    private String weixinPublicAppSecret;

    private String weixinMiniAppId;

    private String weixinMiniAppSecret;

    private String weixinPublicHttpUrl;

    private String bak1;

    private String bak2;

    private String bak3;

    private String bak4;

    private String bak5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted == null ? null : isDeleted.trim();
    }

    public String getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(String createOperator) {
        this.createOperator = createOperator == null ? null : createOperator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(String lastOperator) {
        this.lastOperator = lastOperator == null ? null : lastOperator.trim();
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName == null ? null : platformName.trim();
    }

    public String getLogoImgUrlMax() {
        return logoImgUrlMax;
    }

    public void setLogoImgUrlMax(String logoImgUrlMax) {
        this.logoImgUrlMax = logoImgUrlMax == null ? null : logoImgUrlMax.trim();
    }

    public String getLogoImgUrlMin() {
        return logoImgUrlMin;
    }

    public void setLogoImgUrlMin(String logoImgUrlMin) {
        this.logoImgUrlMin = logoImgUrlMin == null ? null : logoImgUrlMin.trim();
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel == null ? null : customerTel.trim();
    }

    public String getWeixinPublicDevelopId() {
        return weixinPublicDevelopId;
    }

    public void setWeixinPublicDevelopId(String weixinPublicDevelopId) {
        this.weixinPublicDevelopId = weixinPublicDevelopId == null ? null : weixinPublicDevelopId.trim();
    }

    public String getWeixinPublicAppId() {
        return weixinPublicAppId;
    }

    public void setWeixinPublicAppId(String weixinPublicAppId) {
        this.weixinPublicAppId = weixinPublicAppId == null ? null : weixinPublicAppId.trim();
    }

    public String getWeixinPublicAppSecret() {
        return weixinPublicAppSecret;
    }

    public void setWeixinPublicAppSecret(String weixinPublicAppSecret) {
        this.weixinPublicAppSecret = weixinPublicAppSecret == null ? null : weixinPublicAppSecret.trim();
    }

    public String getWeixinMiniAppId() {
        return weixinMiniAppId;
    }

    public void setWeixinMiniAppId(String weixinMiniAppId) {
        this.weixinMiniAppId = weixinMiniAppId == null ? null : weixinMiniAppId.trim();
    }

    public String getWeixinMiniAppSecret() {
        return weixinMiniAppSecret;
    }

    public void setWeixinMiniAppSecret(String weixinMiniAppSecret) {
        this.weixinMiniAppSecret = weixinMiniAppSecret == null ? null : weixinMiniAppSecret.trim();
    }

    public String getWeixinPublicHttpUrl() {
        return weixinPublicHttpUrl;
    }

    public void setWeixinPublicHttpUrl(String weixinPublicHttpUrl) {
        this.weixinPublicHttpUrl = weixinPublicHttpUrl == null ? null : weixinPublicHttpUrl.trim();
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1 == null ? null : bak1.trim();
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2 == null ? null : bak2.trim();
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3 == null ? null : bak3.trim();
    }

    public String getBak4() {
        return bak4;
    }

    public void setBak4(String bak4) {
        this.bak4 = bak4 == null ? null : bak4.trim();
    }

    public String getBak5() {
        return bak5;
    }

    public void setBak5(String bak5) {
        this.bak5 = bak5 == null ? null : bak5.trim();
    }
}