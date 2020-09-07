package com.study.practice.springboot.entityclass.citycoordinate;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangkun
 * @date 2020-09-07
 */
public class CityCoordinate {
    private Long cityId;
    private String cityName;
    private BigDecimal cityLat;
    private BigDecimal cityLon;
    private Date createTime;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public BigDecimal getCityLat() {
        return cityLat;
    }

    public void setCityLat(BigDecimal cityLat) {
        this.cityLat = cityLat;
    }

    public BigDecimal getCityLon() {
        return cityLon;
    }

    public void setcityLon(BigDecimal cityLon) {
        this.cityLon = cityLon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}