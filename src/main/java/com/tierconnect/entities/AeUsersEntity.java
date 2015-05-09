package com.tierconnect.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@javax.persistence.Table(name = "ae_users", schema = "", catalog = "tcnotifications")
public class AeUsersEntity {
    private int id;

    @Id
    @GeneratedValue
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int accountId;

    @Basic
    @javax.persistence.Column(name = "account_id")
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    private Timestamp createdAt;

    @Basic
    @javax.persistence.Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    private Timestamp updatedAt;

    @Basic
    @javax.persistence.Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Timestamp deletedAt;

    @Basic
    @javax.persistence.Column(name = "deleted_at")
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    private String firstName;

    @Basic
    @javax.persistence.Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    @Basic
    @javax.persistence.Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String confirmationCode;

    @Basic
    @javax.persistence.Column(name = "confirmation_code")
    public String getConfirmationCode() {
        return confirmationCode;
    }

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    private byte registered;

    @Basic
    @javax.persistence.Column(name = "registered")
    public byte getRegistered() {
        return registered;
    }

    public void setRegistered(byte registered) {
        this.registered = registered;
    }

    private byte confirmed;

    @Basic
    @javax.persistence.Column(name = "confirmed")
    public byte getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(byte confirmed) {
        this.confirmed = confirmed;
    }

    private Integer themeId;

    @Basic
    @javax.persistence.Column(name = "theme_id")
    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    private byte notifySent;

    @Basic
    @javax.persistence.Column(name = "notify_sent")
    public byte getNotifySent() {
        return notifySent;
    }

    public void setNotifySent(byte notifySent) {
        this.notifySent = notifySent;
    }

    private byte notifyViewed;

    @Basic
    @javax.persistence.Column(name = "notify_viewed")
    public byte getNotifyViewed() {
        return notifyViewed;
    }

    public void setNotifyViewed(byte notifyViewed) {
        this.notifyViewed = notifyViewed;
    }

    private int publicId;

    @Basic
    @javax.persistence.Column(name = "public_id")
    public int getPublicId() {
        return publicId;
    }

    public void setPublicId(int publicId) {
        this.publicId = publicId;
    }

    private String rememberToken;

    @Basic
    @javax.persistence.Column(name = "remember_token")
    public String getRememberToken() {
        return rememberToken;
    }

    public void setRememberToken(String rememberToken) {
        this.rememberToken = rememberToken;
    }

    private int alcId;

    @Basic
    @javax.persistence.Column(name = "alc_id")
    public int getAlcId() {
        return alcId;
    }

    public void setAlcId(int alcId) {
        this.alcId = alcId;
    }

    private Timestamp lastLoginDate;

    @Basic
    @javax.persistence.Column(name = "lastLoginDate")
    public Timestamp getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Timestamp lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    private Short isUserLocked;

    @Basic
    @javax.persistence.Column(name = "isUserLocked")
    public Short getIsUserLocked() {
        return isUserLocked;
    }

    public void setIsUserLocked(Short isUserLocked) {
        this.isUserLocked = isUserLocked;
    }

    private Integer departmentId;

    @Basic
    @javax.persistence.Column(name = "department_id")
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeUsersEntity that = (AeUsersEntity) o;

        if (id != that.id) return false;
        if (accountId != that.accountId) return false;
        if (registered != that.registered) return false;
        if (confirmed != that.confirmed) return false;
        if (notifySent != that.notifySent) return false;
        if (notifyViewed != that.notifyViewed) return false;
        if (publicId != that.publicId) return false;
        if (alcId != that.alcId) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (confirmationCode != null ? !confirmationCode.equals(that.confirmationCode) : that.confirmationCode != null)
            return false;
        if (themeId != null ? !themeId.equals(that.themeId) : that.themeId != null) return false;
        if (rememberToken != null ? !rememberToken.equals(that.rememberToken) : that.rememberToken != null)
            return false;
        if (lastLoginDate != null ? !lastLoginDate.equals(that.lastLoginDate) : that.lastLoginDate != null)
            return false;
        if (isUserLocked != null ? !isUserLocked.equals(that.isUserLocked) : that.isUserLocked != null) return false;
        if (departmentId != null ? !departmentId.equals(that.departmentId) : that.departmentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + accountId;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (confirmationCode != null ? confirmationCode.hashCode() : 0);
        result = 31 * result + (int) registered;
        result = 31 * result + (int) confirmed;
        result = 31 * result + (themeId != null ? themeId.hashCode() : 0);
        result = 31 * result + (int) notifySent;
        result = 31 * result + (int) notifyViewed;
        result = 31 * result + publicId;
        result = 31 * result + (rememberToken != null ? rememberToken.hashCode() : 0);
        result = 31 * result + alcId;
        result = 31 * result + (lastLoginDate != null ? lastLoginDate.hashCode() : 0);
        result = 31 * result + (isUserLocked != null ? isUserLocked.hashCode() : 0);
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
