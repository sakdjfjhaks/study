package com.study.practice.springboot.entityclass.answer;


import java.util.Date;

/**
* 回答
*
* @author zhangkui
* @date  2020-03-17
*/

public class Answer {

        private Long answerId;

        private Long askId;

        private Long customerId;

        private String customerNickName;

        private String customerAvatar;

        private String customerSign;

        private String answerContent;

        private Long creator;

        private Date createTime;

        private Date modifyTime;

        private Long modifyor;

        private Integer deleteState;

        public Long getAnswerId() {
                return answerId;
        }

        public void setAnswerId(Long answerId) {
                this.answerId = answerId;
        }

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

        public String getAnswerContent() {
                return answerContent;
        }

        public void setAnswerContent(String answerContent) {
                this.answerContent = answerContent;
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