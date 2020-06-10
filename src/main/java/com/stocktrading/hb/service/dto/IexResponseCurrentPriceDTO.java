package com.stocktrading.hb.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * A DTO representing a stock quote current price.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexResponseCurrentPriceDTO {

    private String symbol;
    private String calculationPrice;
    private Double high;
    private Double low;
    private Double latestPrice;
    private String primaryExchange;

    /**
     * No args constructor for use in serialization
     *
     */
    public IexResponseCurrentPriceDTO() {
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(Double latestPrice) {
        this.latestPrice = latestPrice;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IexResponseCurrentPriceDTO)) return false;
        IexResponseCurrentPriceDTO that = (IexResponseCurrentPriceDTO) o;
        return Objects.equals(getSymbol(), that.getSymbol()) &&
            Objects.equals(getCalculationPrice(), that.getCalculationPrice()) &&
            Objects.equals(getHigh(), that.getHigh()) &&
            Objects.equals(getLow(), that.getLow()) &&
            Objects.equals(getLatestPrice(), that.getLatestPrice()) &&
            Objects.equals(getPrimaryExchange(), that.getPrimaryExchange());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSymbol(), getCalculationPrice(), getHigh(), getLow(), getLatestPrice(), getPrimaryExchange());
    }

    @Override
    public String toString() {
        return "IexResponseCurrentPriceDTO{" +
            "symbol='" + symbol + '\'' +
            ", calculationPrice='" + calculationPrice + '\'' +
            ", high=" + high +
            ", low=" + low +
            ", latestPrice=" + latestPrice +
            ", primaryExchange='" + primaryExchange + '\'' +
            '}';
    }
}
