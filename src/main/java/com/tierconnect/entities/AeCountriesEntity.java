package com.tierconnect.entities;

import javax.persistence.*;

/**
 * Created by Paul Landaeta on 09/05/2015.
 */
@Entity
@Table(name = "ae_countries", schema = "", catalog = "tcnotifications")
public class AeCountriesEntity {
    private int id;
    private String capital;
    private String citizenship;
    private String countryCode;
    private String currency;
    private String currencyCode;
    private String currencySubUnit;
    private String fullName;
    private String iso31662;
    private String iso31663;
    private String name;
    private String regionCode;
    private String subRegionCode;
    private byte eea;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "capital")
    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "citizenship")
    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Basic
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Basic
    @Column(name = "currency_code")
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Basic
    @Column(name = "currency_sub_unit")
    public String getCurrencySubUnit() {
        return currencySubUnit;
    }

    public void setCurrencySubUnit(String currencySubUnit) {
        this.currencySubUnit = currencySubUnit;
    }

    @Basic
    @Column(name = "full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Basic
    @Column(name = "iso_3166_2")
    public String getIso31662() {
        return iso31662;
    }

    public void setIso31662(String iso31662) {
        this.iso31662 = iso31662;
    }

    @Basic
    @Column(name = "iso_3166_3")
    public String getIso31663() {
        return iso31663;
    }

    public void setIso31663(String iso31663) {
        this.iso31663 = iso31663;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "region_code")
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    @Basic
    @Column(name = "sub_region_code")
    public String getSubRegionCode() {
        return subRegionCode;
    }

    public void setSubRegionCode(String subRegionCode) {
        this.subRegionCode = subRegionCode;
    }

    @Basic
    @Column(name = "eea")
    public byte getEea() {
        return eea;
    }

    public void setEea(byte eea) {
        this.eea = eea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AeCountriesEntity that = (AeCountriesEntity) o;

        if (id != that.id) return false;
        if (eea != that.eea) return false;
        if (capital != null ? !capital.equals(that.capital) : that.capital != null) return false;
        if (citizenship != null ? !citizenship.equals(that.citizenship) : that.citizenship != null) return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (currencyCode != null ? !currencyCode.equals(that.currencyCode) : that.currencyCode != null) return false;
        if (currencySubUnit != null ? !currencySubUnit.equals(that.currencySubUnit) : that.currencySubUnit != null)
            return false;
        if (fullName != null ? !fullName.equals(that.fullName) : that.fullName != null) return false;
        if (iso31662 != null ? !iso31662.equals(that.iso31662) : that.iso31662 != null) return false;
        if (iso31663 != null ? !iso31663.equals(that.iso31663) : that.iso31663 != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (regionCode != null ? !regionCode.equals(that.regionCode) : that.regionCode != null) return false;
        if (subRegionCode != null ? !subRegionCode.equals(that.subRegionCode) : that.subRegionCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (citizenship != null ? citizenship.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (currencyCode != null ? currencyCode.hashCode() : 0);
        result = 31 * result + (currencySubUnit != null ? currencySubUnit.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (iso31662 != null ? iso31662.hashCode() : 0);
        result = 31 * result + (iso31663 != null ? iso31663.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (regionCode != null ? regionCode.hashCode() : 0);
        result = 31 * result + (subRegionCode != null ? subRegionCode.hashCode() : 0);
        result = 31 * result + (int) eea;
        return result;
    }
}
