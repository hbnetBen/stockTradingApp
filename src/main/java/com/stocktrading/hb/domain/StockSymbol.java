package com.stocktrading.hb.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stocktrading.hb.service.dto.IexResponseSymbolDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Objects;

/**
 * A stock symbol.
 */
@Document(collection = "stock_symbol")
public class StockSymbol extends AbstractAuditingEntity implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @JsonIgnore
    @Field("symbol")
    private String symbol;

    @JsonIgnore
    @Field("exchange")
    private String exchange;

    @JsonIgnore
    @Field("name")
    private String name;

    @JsonIgnore
    @Field("date")
    private String date;

    @JsonIgnore
    @Field("type")
    private String type;

    @JsonIgnore
    @Field("iex_id")
    private String iexId;

    @JsonIgnore
    @Field("region")
    private String region;

    @JsonIgnore
    @Field("currency")
    private String currency;

    @JsonIgnore
    @Field("is_enabled")
    private Boolean isEnabled;

    public StockSymbol(){}

    public StockSymbol(String symbol, String exchange, String name, String date, String type, String iexId, String region, String currency, Boolean isEnabled) {
        this.symbol = symbol;
        this.exchange = exchange;
        this.name = name;
        this.date = date;
        this.type = type;
        this.iexId = iexId;
        this.region = region;
        this.currency = currency;
        this.isEnabled = isEnabled;
    }

    public StockSymbol(IexResponseSymbolDTO symbolDTO) {
        this.symbol = symbolDTO.getSymbol();
        this.exchange = symbolDTO.getExchange();
        this.name = symbolDTO.getName();
        this.date = symbolDTO.getDate();
        this.type = symbolDTO.getType();
        this.iexId = symbolDTO.getIexId();
        this.region = symbolDTO.getRegion();
        this.currency = symbolDTO.getCurrency();
        this.isEnabled = symbolDTO.getIsEnabled();
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

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
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
        if (!(o instanceof StockSymbol)) return false;
        StockSymbol that = (StockSymbol) o;
        return Objects.equals(getId(), that.getId()) &&
            Objects.equals(getSymbol(), that.getSymbol()) &&
            Objects.equals(getExchange(), that.getExchange()) &&
            Objects.equals(getName(), that.getName()) &&
            Objects.equals(getDate(), that.getDate()) &&
            Objects.equals(getType(), that.getType()) &&
            Objects.equals(getIexId(), that.getIexId()) &&
            Objects.equals(getRegion(), that.getRegion()) &&
            Objects.equals(getCurrency(), that.getCurrency()) &&
            Objects.equals(getIsEnabled(), that.getIsEnabled());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getSymbol(), getExchange(), getName(), getDate(), getType(), getIexId(), getRegion(), getCurrency(), getIsEnabled());
    }

    @Override
    public String toString() {
        return "StockSymbol{" +
            "id='" + id + '\'' +
            ", symbol='" + symbol + '\'' +
            ", exchange='" + exchange + '\'' +
            ", name='" + name + '\'' +
            ", date='" + date + '\'' +
            ", type='" + type + '\'' +
            ", iexId='" + iexId + '\'' +
            ", region='" + region + '\'' +
            ", currency='" + currency + '\'' +
            ", isEnabled=" + isEnabled +
            '}';
    }
}
