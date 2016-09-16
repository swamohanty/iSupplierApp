package application.model;

import oracle.maf.api.cdm.persistence.model.Entity;

import java.math.BigDecimal;


public class XxNotifications extends Entity {

    private String fromUser;
    private String notifDate;
    private String subject;
    private String userKey;
    private BigDecimal notificationId;
    private String notificationType;
    private String beginDate;


    public String getFromUser() {
        return this.fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getNotifDate() {
        return this.notifDate;
    }

    public void setNotifDate(String notifDate) {
        this.notifDate = notifDate;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUserKey() {
        return this.userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public BigDecimal getNotificationId() {
        return this.notificationId;
    }

    public void setNotificationId(BigDecimal notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationType() {
        return this.notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getBeginDate() {
        return this.beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }


}
