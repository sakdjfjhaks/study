package com.study.practice.entity.addtest;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author wangkun
 * @date 2020-09-07
 */
public class AddTest {
    private Long addTestId;
    private String addTestName;
    private BigDecimal addTestLat;
    private BigDecimal addTestLon;
    private Date createTime;

    public Long getAddTestId() {
        return addTestId;
    }

    public void setAddTestId(Long addTestId) {
        this.addTestId = addTestId;
    }

    public String getAddTestName() {
        return addTestName;
    }

    public void setAddTestName(String addTestName) {
        this.addTestName = addTestName;
    }

    public BigDecimal getAddTestLat() {
        return addTestLat;
    }

    public void setAddTestLat(BigDecimal addTestLat) {
        this.addTestLat = addTestLat;
    }

    public BigDecimal getAddTestLon() {
        return addTestLon;
    }

    public void setAddTestLon(BigDecimal addTestLon) {
        this.addTestLon = addTestLon;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}