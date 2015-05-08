package com.tierconnect.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by Paul Landaeta on 06/05/2015.
 */
@Entity
@javax.persistence.Table(name = "ae_accounts", schema = "", catalog = "tcnotifications")
public class AeAccountsEntity {
    private int id;

    @Id
    @javax.persistence.Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private Integer timezoneId;

    @Basic
    @javax.persistence.Column(name = "timezone_id")
    public Integer getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(Integer timezoneId) {
        this.timezoneId = timezoneId;
    }

    private Integer dateFormatId;

    @Basic
    @javax.persistence.Column(name = "date_format_id")
    public Integer getDateFormatId() {
        return dateFormatId;
    }

    public void setDateFormatId(Integer dateFormatId) {
        this.dateFormatId = dateFormatId;
    }

    private Integer datetimeFormatId;

    @Basic
    @javax.persistence.Column(name = "datetime_format_id")
    public Integer getDatetimeFormatId() {
        return datetimeFormatId;
    }

    public void setDatetimeFormatId(Integer datetimeFormatId) {
        this.datetimeFormatId = datetimeFormatId;
    }

    private String defaultTheme;

    @Basic
    @javax.persistence.Column(name = "default_theme")
    public String getDefaultTheme() {
        return defaultTheme;
    }

    public void setDefaultTheme(String defaultTheme) {
        this.defaultTheme = defaultTheme;
    }

    private String defaultView;

    @Basic
    @javax.persistence.Column(name = "default_view")
    public String getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
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

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String ip;

    @Basic
    @javax.persistence.Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String accountKey;

    @Basic
    @javax.persistence.Column(name = "account_key")
    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    private Timestamp lastLogin;

    @Basic
    @javax.persistence.Column(name = "last_login")
    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    private String address1;

    @Basic
    @javax.persistence.Column(name = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    @Basic
    @javax.persistence.Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String city;

    @Basic
    @javax.persistence.Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String state;

    @Basic
    @javax.persistence.Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String postalCode;

    @Basic
    @javax.persistence.Column(name = "postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private Integer countryId;

    @Basic
    @javax.persistence.Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    private String emailFooter;

    @Basic
    @javax.persistence.Column(name = "email_footer")
    public String getEmailFooter() {
        return emailFooter;
    }

    public void setEmailFooter(String emailFooter) {
        this.emailFooter = emailFooter;
    }

    private String workPhone;

    @Basic
    @javax.persistence.Column(name = "work_phone")
    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    private String workEmail;

    @Basic
    @javax.persistence.Column(name = "work_email")
    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    private int languageId;

    @Basic
    @javax.persistence.Column(name = "language_id")
    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    private String idNumber;

    @Basic
    @javax.persistence.Column(name = "id_number")
    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    private String jobNumberPrefix;

    @Basic
    @javax.persistence.Column(name = "job_number_prefix")
    public String getJobNumberPrefix() {
        return jobNumberPrefix;
    }

    public void setJobNumberPrefix(String jobNumberPrefix) {
        this.jobNumberPrefix = jobNumberPrefix;
    }

    private Integer jobNumberCounter;

    @Basic
    @javax.persistence.Column(name = "job_number_counter")
    public Integer getJobNumberCounter() {
        return jobNumberCounter;
    }

    public void setJobNumberCounter(Integer jobNumberCounter) {
        this.jobNumberCounter = jobNumberCounter;
    }

    private String whiteLabelLic;

    @Basic
    @javax.persistence.Column(name = "white_label_lic")
    public String getWhiteLabelLic() {
        return whiteLabelLic;
    }

    public void setWhiteLabelLic(String whiteLabelLic) {
        this.whiteLabelLic = whiteLabelLic;
    }

    private Date whiteLabelPaid;

    @Basic
    @javax.persistence.Column(name = "white_label_paid")
    public Date getWhiteLabelPaid() {
        return whiteLabelPaid;
    }

    public void setWhiteLabelPaid(Date whiteLabelPaid) {
        this.whiteLabelPaid = whiteLabelPaid;
    }

    private String smsPkgLic;

    @Basic
    @javax.persistence.Column(name = "sms_pkg_lic")
    public String getSmsPkgLic() {
        return smsPkgLic;
    }

    public void setSmsPkgLic(String smsPkgLic) {
        this.smsPkgLic = smsPkgLic;
    }

    private Date smsPkgPaid;

    @Basic
    @javax.persistence.Column(name = "sms_pkg_paid")
    public Date getSmsPkgPaid() {
        return smsPkgPaid;
    }

    public void setSmsPkgPaid(Date smsPkgPaid) {
        this.smsPkgPaid = smsPkgPaid;
    }

    private String mailPgkLic;

    @Basic
    @javax.persistence.Column(name = "mail_pgk_lic")
    public String getMailPgkLic() {
        return mailPgkLic;
    }

    public void setMailPgkLic(String mailPgkLic) {
        this.mailPgkLic = mailPgkLic;
    }

    private Date mailPkgPaid;

    @Basic
    @javax.persistence.Column(name = "mail_pkg_paid")
    public Date getMailPkgPaid() {
        return mailPkgPaid;
    }

    public void setMailPkgPaid(Date mailPkgPaid) {
        this.mailPkgPaid = mailPkgPaid;
    }

    private int subaccountsParent;

    @Basic
    @javax.persistence.Column(name = "subaccounts_parent")
    public int getSubaccountsParent() {
        return subaccountsParent;
    }

    public void setSubaccountsParent(int subaccountsParent) {
        this.subaccountsParent = subaccountsParent;
    }

    private Date subaccountsPaid;

    @Basic
    @javax.persistence.Column(name = "subaccounts_paid")
    public Date getSubaccountsPaid() {
        return subaccountsPaid;
    }

    public void setSubaccountsPaid(Date subaccountsPaid) {
        this.subaccountsPaid = subaccountsPaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeAccountsEntity that = (AeAccountsEntity) o;

        if (id != that.id) return false;
        if (languageId != that.languageId) return false;
        if (subaccountsParent != that.subaccountsParent) return false;
        if (timezoneId != null ? !timezoneId.equals(that.timezoneId) : that.timezoneId != null) return false;
        if (dateFormatId != null ? !dateFormatId.equals(that.dateFormatId) : that.dateFormatId != null) return false;
        if (datetimeFormatId != null ? !datetimeFormatId.equals(that.datetimeFormatId) : that.datetimeFormatId != null)
            return false;
        if (defaultTheme != null ? !defaultTheme.equals(that.defaultTheme) : that.defaultTheme != null) return false;
        if (defaultView != null ? !defaultView.equals(that.defaultView) : that.defaultView != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (accountKey != null ? !accountKey.equals(that.accountKey) : that.accountKey != null) return false;
        if (lastLogin != null ? !lastLogin.equals(that.lastLogin) : that.lastLogin != null) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (postalCode != null ? !postalCode.equals(that.postalCode) : that.postalCode != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;
        if (emailFooter != null ? !emailFooter.equals(that.emailFooter) : that.emailFooter != null) return false;
        if (workPhone != null ? !workPhone.equals(that.workPhone) : that.workPhone != null) return false;
        if (workEmail != null ? !workEmail.equals(that.workEmail) : that.workEmail != null) return false;
        if (idNumber != null ? !idNumber.equals(that.idNumber) : that.idNumber != null) return false;
        if (jobNumberPrefix != null ? !jobNumberPrefix.equals(that.jobNumberPrefix) : that.jobNumberPrefix != null)
            return false;
        if (jobNumberCounter != null ? !jobNumberCounter.equals(that.jobNumberCounter) : that.jobNumberCounter != null)
            return false;
        if (whiteLabelLic != null ? !whiteLabelLic.equals(that.whiteLabelLic) : that.whiteLabelLic != null)
            return false;
        if (whiteLabelPaid != null ? !whiteLabelPaid.equals(that.whiteLabelPaid) : that.whiteLabelPaid != null)
            return false;
        if (smsPkgLic != null ? !smsPkgLic.equals(that.smsPkgLic) : that.smsPkgLic != null) return false;
        if (smsPkgPaid != null ? !smsPkgPaid.equals(that.smsPkgPaid) : that.smsPkgPaid != null) return false;
        if (mailPgkLic != null ? !mailPgkLic.equals(that.mailPgkLic) : that.mailPgkLic != null) return false;
        if (mailPkgPaid != null ? !mailPkgPaid.equals(that.mailPkgPaid) : that.mailPkgPaid != null) return false;
        if (subaccountsPaid != null ? !subaccountsPaid.equals(that.subaccountsPaid) : that.subaccountsPaid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (timezoneId != null ? timezoneId.hashCode() : 0);
        result = 31 * result + (dateFormatId != null ? dateFormatId.hashCode() : 0);
        result = 31 * result + (datetimeFormatId != null ? datetimeFormatId.hashCode() : 0);
        result = 31 * result + (defaultTheme != null ? defaultTheme.hashCode() : 0);
        result = 31 * result + (defaultView != null ? defaultView.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (accountKey != null ? accountKey.hashCode() : 0);
        result = 31 * result + (lastLogin != null ? lastLogin.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (postalCode != null ? postalCode.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        result = 31 * result + (emailFooter != null ? emailFooter.hashCode() : 0);
        result = 31 * result + (workPhone != null ? workPhone.hashCode() : 0);
        result = 31 * result + (workEmail != null ? workEmail.hashCode() : 0);
        result = 31 * result + languageId;
        result = 31 * result + (idNumber != null ? idNumber.hashCode() : 0);
        result = 31 * result + (jobNumberPrefix != null ? jobNumberPrefix.hashCode() : 0);
        result = 31 * result + (jobNumberCounter != null ? jobNumberCounter.hashCode() : 0);
        result = 31 * result + (whiteLabelLic != null ? whiteLabelLic.hashCode() : 0);
        result = 31 * result + (whiteLabelPaid != null ? whiteLabelPaid.hashCode() : 0);
        result = 31 * result + (smsPkgLic != null ? smsPkgLic.hashCode() : 0);
        result = 31 * result + (smsPkgPaid != null ? smsPkgPaid.hashCode() : 0);
        result = 31 * result + (mailPgkLic != null ? mailPgkLic.hashCode() : 0);
        result = 31 * result + (mailPkgPaid != null ? mailPkgPaid.hashCode() : 0);
        result = 31 * result + subaccountsParent;
        result = 31 * result + (subaccountsPaid != null ? subaccountsPaid.hashCode() : 0);
        return result;
    }
}
