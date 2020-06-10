package com.stocktrading.hb.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * A DTO representing a stock price target.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexResponseStockPriceTargetDTO {

    private String symbol;
    private String updatedDate;
    private Double priceTargetAverage;
    private Long priceTargetHigh;
    private Long priceTargetLow;
    private Long numberOfAnalysts;
    private String currency;


    public IexResponseStockPriceTargetDTO(String symbol, String updatedDate, Double priceTargetAverage, Long priceTargetHigh, Long priceTargetLow, Long numberOfAnalysts, String currency) {
        this.symbol = symbol;
        this.updatedDate = updatedDate;
        this.priceTargetAverage = priceTargetAverage;
        this.priceTargetHigh = priceTargetHigh;
        this.priceTargetLow = priceTargetLow;
        this.numberOfAnalysts = numberOfAnalysts;
        this.currency = currency;
    }

    public IexResponseStockPriceTargetDTO() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Double getPriceTargetAverage() {
        return priceTargetAverage;
    }

    public void setPriceTargetAverage(Double priceTargetAverage) {
        this.priceTargetAverage = priceTargetAverage;
    }

    public Long getPriceTargetHigh() {
        return priceTargetHigh;
    }

    public void setPriceTargetHigh(Long priceTargetHigh) {
        this.priceTargetHigh = priceTargetHigh;
    }

    public Long getPriceTargetLow() {
        return priceTargetLow;
    }

    public void setPriceTargetLow(Long priceTargetLow) {
        this.priceTargetLow = priceTargetLow;
    }

    public Long getNumberOfAnalysts() {
        return numberOfAnalysts;
    }

    public void setNumberOfAnalysts(Long numberOfAnalysts) {
        this.numberOfAnalysts = numberOfAnalysts;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IexResponseStockPriceTargetDTO)) return false;
        IexResponseStockPriceTargetDTO that = (IexResponseStockPriceTargetDTO) o;
        return Objects.equals(getSymbol(), that.getSymbol()) &&
            Objects.equals(getUpdatedDate(), that.getUpdatedDate()) &&
            Objects.equals(getPriceTargetAverage(), that.getPriceTargetAverage()) &&
            Objects.equals(getPriceTargetHigh(), that.getPriceTargetHigh()) &&
            Objects.equals(getPriceTargetLow(), that.getPriceTargetLow()) &&
            Objects.equals(getNumberOfAnalysts(), that.getNumberOfAnalysts()) &&
            Objects.equals(getCurrency(), that.getCurrency());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSymbol(), getUpdatedDate(), getPriceTargetAverage(), getPriceTargetHigh(), getPriceTargetLow(), getNumberOfAnalysts(), getCurrency());
    }

    @Override
    public String toString() {
        return "IexResponseStockPriceTargetDTO{" +
            "symbol='" + symbol + '\'' +
            ", updatedDate='" + updatedDate + '\'' +
            ", priceTargetAverage=" + priceTargetAverage +
            ", priceTargetHigh=" + priceTargetHigh +
            ", priceTargetLow=" + priceTargetLow +
            ", numberOfAnalysts=" + numberOfAnalysts +
            ", currency='" + currency + '\'' +
            '}';
    }
}
