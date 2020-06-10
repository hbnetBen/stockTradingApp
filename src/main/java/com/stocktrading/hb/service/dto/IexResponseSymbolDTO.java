package com.stocktrading.hb.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

/**
 * A DTO representing a stock symbol.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexResponseSymbolDTO {

    private String id;
    private String symbol;
    private String name;
    private String date;
    private String type;
    private String iexId;
    private String region;
    private String currency;
    private String exchange;
    private Boolean isEnabled;
    private String figi;
    private String cik;

    /**
     * No args constructor for use in serialization
     *
     */
    @Autowired
    public IexResponseSymbolDTO() {
    }

    /**
     *
     * @param id
     * @param date
     * @param iexId
     * @param symbol
     * @param isEnabled
     * @param name
     * @param currency
     * @param type
     * @param region
     * @param exchange
     * @param figi
     * @param cik
     */
    public IexResponseSymbolDTO(String id, String symbol, String name, String date, String type, String iexId, String region, String currency, String exchange, Boolean isEnabled, String figi, String cik) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.date = date;
        this.type = type;
        this.iexId = iexId;
        this.region = region;
        this.currency = currency;
        this.exchange = exchange;
        this.isEnabled = isEnabled;
        this.figi = figi;
        this.cik = cik;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getFigi() {
        return figi;
    }

    public void setFigi(String figi) {
        this.figi = figi;
    }

    public String getCik() {
        return cik;
    }

    public void setCik(String cik) {
        this.cik = cik;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIexId() {
        return iexId;
    }

    public void setIexId(String iexId) {
        this.iexId = iexId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IexResponseSymbolDTO)) return false;
        IexResponseSymbolDTO that = (IexResponseSymbolDTO) o;
        return Objects.equals(getId(), that.getId()) &&
            Objects.equals(getSymbol(), that.getSymbol()) &&
            Objects.equals(getName(), that.getName()) &&
            Objects.equals(getDate(), that.getDate()) &&
            Objects.equals(getType(), that.getType()) &&
            Objects.equals(getIexId(), that.getIexId()) &&
            Objects.equals(getRegion(), that.getRegion()) &&
            Objects.equals(getCurrency(), that.getCurrency()) &&
            Objects.equals(getExchange(), that.getExchange()) &&
            Objects.equals(getIsEnabled(), that.getIsEnabled());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getSymbol(), getName(), getDate(), getType(), getIexId(), getRegion(), getCurrency(), getExchange(), getIsEnabled());
    }

    @Override
    public String toString() {
        return "IexResponseSymbolDTO{" +
            "id='" + id + '\'' +
            ", symbol='" + symbol + '\'' +
            ", name='" + name + '\'' +
            ", date='" + date + '\'' +
            ", type='" + type + '\'' +
            ", iexId='" + iexId + '\'' +
            ", region='" + region + '\'' +
            ", currency='" + currency + '\'' +
            ", exchange='" + exchange + '\'' +
            ", isEnabled=" + isEnabled +
            ", figi='" + figi + '\'' +
            ", cik='" + cik + '\'' +
            '}';
    }
}
