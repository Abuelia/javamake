package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "js_settings", schema = "", catalog = "tcnotifications")
public class JsSettingsEntity {
    private int userId;
    private String emailRedirectNotification;
    private String smsPhoneRedirectNotification;
    private Short emailMuteNotification;
    private Short smsMuteNotification;
    private Integer defaultSsizeId;
    private Integer defaultWebDriverId;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "email_redirect_notification")
    public String getEmailRedirectNotification() {
        return emailRedirectNotification;
    }

    public void setEmailRedirectNotification(String emailRedirectNotification) {
        this.emailRedirectNotification = emailRedirectNotification;
    }

    @Basic
    @Column(name = "sms_phone_redirect_notification")
    public String getSmsPhoneRedirectNotification() {
        return smsPhoneRedirectNotification;
    }

    public void setSmsPhoneRedirectNotification(String smsPhoneRedirectNotification) {
        this.smsPhoneRedirectNotification = smsPhoneRedirectNotification;
    }

    @Basic
    @Column(name = "email_mute_notification")
    public Short getEmailMuteNotification() {
        return emailMuteNotification;
    }

    public void setEmailMuteNotification(Short emailMuteNotification) {
        this.emailMuteNotification = emailMuteNotification;
    }

    @Basic
    @Column(name = "sms_mute_notification")
    public Short getSmsMuteNotification() {
        return smsMuteNotification;
    }

    public void setSmsMuteNotification(Short smsMuteNotification) {
        this.smsMuteNotification = smsMuteNotification;
    }

    @Basic
    @Column(name = "default_ssize_id")
    public Integer getDefaultSsizeId() {
        return defaultSsizeId;
    }

    public void setDefaultSsizeId(Integer defaultSsizeId) {
        this.defaultSsizeId = defaultSsizeId;
    }

    @Basic
    @Column(name = "default_web_driver_id")
    public Integer getDefaultWebDriverId() {
        return defaultWebDriverId;
    }

    public void setDefaultWebDriverId(Integer defaultWebDriverId) {
        this.defaultWebDriverId = defaultWebDriverId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JsSettingsEntity that = (JsSettingsEntity) o;

        if (userId != that.userId) return false;
        if (emailRedirectNotification != null ? !emailRedirectNotification.equals(that.emailRedirectNotification) : that.emailRedirectNotification != null)
            return false;
        if (smsPhoneRedirectNotification != null ? !smsPhoneRedirectNotification.equals(that.smsPhoneRedirectNotification) : that.smsPhoneRedirectNotification != null)
            return false;
        if (emailMuteNotification != null ? !emailMuteNotification.equals(that.emailMuteNotification) : that.emailMuteNotification != null)
            return false;
        if (smsMuteNotification != null ? !smsMuteNotification.equals(that.smsMuteNotification) : that.smsMuteNotification != null)
            return false;
        if (defaultSsizeId != null ? !defaultSsizeId.equals(that.defaultSsizeId) : that.defaultSsizeId != null)
            return false;
        if (defaultWebDriverId != null ? !defaultWebDriverId.equals(that.defaultWebDriverId) : that.defaultWebDriverId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (emailRedirectNotification != null ? emailRedirectNotification.hashCode() : 0);
        result = 31 * result + (smsPhoneRedirectNotification != null ? smsPhoneRedirectNotification.hashCode() : 0);
        result = 31 * result + (emailMuteNotification != null ? emailMuteNotification.hashCode() : 0);
        result = 31 * result + (smsMuteNotification != null ? smsMuteNotification.hashCode() : 0);
        result = 31 * result + (defaultSsizeId != null ? defaultSsizeId.hashCode() : 0);
        result = 31 * result + (defaultWebDriverId != null ? defaultWebDriverId.hashCode() : 0);
        return result;
    }
}
