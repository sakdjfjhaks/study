package com.study.practice.springboot.entityclass.ask;
import java.math.BigDecimal;
import java.util.Date;

/**
* 提问
*
* @author zhangkui
* @date  2020-04-26
*/

public class Ask {
        private Long askId;

        private Long customerId;

        private String customerNickName;

        private String customerAvatar;

        private String customerSign;

        private String askContent;

        private BigDecimal momentsLat;

        private BigDecimal momentsLng;

        private String address;

        private String shortContent;

        private String shortPicture;

        private Integer likeNum;

        private Integer visitNum;

        private Integer answerNum;

        private Long creator;

        private Date createTime;

        private Date modifyTime;

        private Long modifyor;

        private Integer deleteState;

        public Long getAskId() {
                return askId;
        }

        public void setAskId(Long askId) {
                this.askId = askId;
        }

        public Long getCustomerId() {
                return customerId;
        }

        public void setCustomerId(Long customerId) {
                this.customerId = customerId;
        }

        public String getCustomerNickName() {
                return customerNickName;
        }

        public void setCustomerNickName(String customerNickName) {
                this.customerNickName = customerNickName;
        }

        public String getCustomerAvatar() {
                return customerAvatar;
        }

        public void setCustomerAvatar(String customerAvatar) {
                this.customerAvatar = customerAvatar;
        }

        public String getCustomerSign() {
                return customerSign;
        }

        public void setCustomerSign(String customerSign) {
                this.customerSign = customerSign;
        }

        public String getAskContent() {
                return askContent;
        }

        public void setAskContent(String askContent) {
                this.askContent = askContent;
        }

        public BigDecimal getMomentsLat() {
                return momentsLat;
        }

        public void setMomentsLat(BigDecimal momentsLat) {
                this.momentsLat = momentsLat;
        }

        public BigDecimal getMomentsLng() {
                return momentsLng;
        }

        public void setMomentsLng(BigDecimal momentsLng) {
                this.momentsLng = momentsLng;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getShortContent() {
                return shortContent;
        }

        public void setShortContent(String shortContent) {
                this.shortContent = shortContent;
        }

        public String getShortPicture() {
                return shortPicture;
        }

        public void setShortPicture(String shortPicture) {
                this.shortPicture = shortPicture;
        }

        public Integer getLikeNum() {
                return likeNum;
        }

        public void setLikeNum(Integer likeNum) {
                this.likeNum = likeNum;
        }

        public Integer getVisitNum() {
                return visitNum;
        }

        public void setVisitNum(Integer visitNum) {
                this.visitNum = visitNum;
        }

        public Integer getAnswerNum() {
                return answerNum;
        }

        public void setAnswerNum(Integer answerNum) {
                this.answerNum = answerNum;
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

        public Integer getDeleteState() {
                return deleteState;
        }

        public void setDeleteState(Integer deleteState) {
                this.deleteState = deleteState;
        }
}