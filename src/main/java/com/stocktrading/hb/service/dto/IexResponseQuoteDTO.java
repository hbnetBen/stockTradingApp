package com.stocktrading.hb.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * A DTO representing a stock quote.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexResponseQuoteDTO {

    private String symbol;
    private String companyName;
    private String calculationPrice;
    private Long open;
    private Long openTime;
    private Double close;
    private Long closeTime;
    private Double high;
    private Double low;
    private Double latestPrice;
    private String latestSource;
    private String primaryExchange;
    private String latestTime;
    private Long latestUpdate;
    private Long latestVolume;
    private Long volume;
    private Double iexRealtimePrice;
    private Long iexRealtimeSize;
    private Long iexLastUpdated;
    private Double delayedPrice;
    private Long delayedPriceTime;
    private Double extendedPrice;
    private Double extendedChange;
    private Double extendedChangePercent;
    private Long extendedPriceTime;
    private Double previousClose;
    private Long previousVolume;
    private Double change;
    private Double changePercent;
    private Double iexMarketPercent;
    private Long iexVolume;
    private Long avgTotalVolume;
    private Double iexBidPrice;
    private Long iexBidSize;
    private Double iexAskPrice;
    private Long iexAskSize;
    private Long marketCap;
    private Double week52High;
    private Double week52Low;
    private Double ytdChange;
    private Double peRatio;
    private Long lastTradeTime;
    private Boolean isUSMarketOpen;

    /**
     * No args constructor for use in serialization
     *
     */
    public IexResponseQuoteDTO() {
    }

    /**
     *
     * @param symbol
     * @param avgTotalVolume
     * @param companyName
     * @param iexRealtimePrice
     * @param delayedPrice
     * @param iexMarketPercent
     * @param calculationPrice
     * @param extendedChangePercent
     * @param latestSource
     * @param latestUpdate
     * @param iexBidPrice
     * @param previousClose
     * @param high
     * @param peRatio
     * @param isUSMarketOpen
     * @param low
     * @param delayedPriceTime
     * @param extendedPrice
     * @param extendedPriceTime
     * @param week52Low
     * @param closeTime
     * @param changePercent
     * @param week52High
     * @param openTime
     * @param close
     * @param latestPrice
     * @param marketCap
     * @param previousVolume
     * @param iexRealtimeSize
     * @param iexLastUpdated
     * @param change
     * @param latestVolume
     * @param iexAskPrice
     * @param volume
     * @param ytdChange
     * @param iexVolume
     * @param iexAskSize
     * @param lastTradeTime
     * @param extendedChange
     * @param latestTime
     * @param open
     * @param iexBidSize
     * @param primaryExchange
     */
    public IexResponseQuoteDTO(String symbol, String companyName, String calculationPrice, Long open, Long openTime, Double close, Long closeTime, Double high, Double low, Double latestPrice, String latestSource, String latestTime, Long latestUpdate, Long latestVolume, Long volume, Double iexRealtimePrice, Long iexRealtimeSize, Long iexLastUpdated, Double delayedPrice, Long delayedPriceTime, Double extendedPrice, Double extendedChange, Double extendedChangePercent, Long extendedPriceTime, Double previousClose, Long previousVolume, Double change, Double changePercent, Double iexMarketPercent, Long iexVolume, Long avgTotalVolume, Double iexBidPrice, Long iexBidSize, Double iexAskPrice, Long iexAskSize, Long marketCap, Double week52High, Double week52Low, Double ytdChange, Double peRatio, Long lastTradeTime, Boolean isUSMarketOpen, String primaryExchange) {
        this.symbol = symbol;
        this.companyName = companyName;
        this.calculationPrice = calculationPrice;
        this.open = open;
        this.openTime = openTime;
        this.close = close;
        this.closeTime = closeTime;
        this.high = high;
        this.low = low;
        this.latestPrice = latestPrice;
        this.latestSource = latestSource;
        this.latestTime = latestTime;
        this.latestUpdate = latestUpdate;
        this.latestVolume = latestVolume;
        this.volume = volume;
        this.iexRealtimePrice = iexRealtimePrice;
        this.iexRealtimeSize = iexRealtimeSize;
        this.iexLastUpdated = iexLastUpdated;
        this.delayedPrice = delayedPrice;
        this.delayedPriceTime = delayedPriceTime;
        this.extendedPrice = extendedPrice;
        this.extendedChange = extendedChange;
        this.extendedChangePercent = extendedChangePercent;
        this.extendedPriceTime = extendedPriceTime;
        this.previousClose = previousClose;
        this.previousVolume = previousVolume;
        this.change = change;
        this.changePercent = changePercent;
        this.iexMarketPercent = iexMarketPercent;
        this.iexVolume = iexVolume;
        this.avgTotalVolume = avgTotalVolume;
        this.iexBidPrice = iexBidPrice;
        this.iexBidSize = iexBidSize;
        this.iexAskPrice = iexAskPrice;
        this.iexAskSize = iexAskSize;
        this.marketCap = marketCap;
        this.week52High = week52High;
        this.week52Low = week52Low;
        this.ytdChange = ytdChange;
        this.peRatio = peRatio;
        this.lastTradeTime = lastTradeTime;
        this.isUSMarketOpen = isUSMarketOpen;
        this.primaryExchange = primaryExchange;
    }

    public String getPrimaryExchange() {
        return primaryExchange;
    }

    public void setPrimaryExchange(String primaryExchange) {
        this.primaryExchange = primaryExchange;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCalculationPrice() {
        return calculationPrice;
    }

    public void setCalculationPrice(String calculationPrice) {
        this.calculationPrice = calculationPrice;
    }

    public Long getOpen() {
        return open;
    }

    public void setOpen(Long open) {
        this.open = open;
    }

    public Long getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    public Double getClose() {
        return close;
    }

    public void setClose(Double close) {
        this.close = close;
    }

    public Long getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
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

    public String getLatestSource() {
        return latestSource;
    }

    public void setLatestSource(String latestSource) {
        this.latestSource = latestSource;
    }

    public String getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(String latestTime) {
        this.latestTime = latestTime;
    }

    public Long getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(Long latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    public Long getLatestVolume() {
        return latestVolume;
    }

    public void setLatestVolume(Long latestVolume) {
        this.latestVolume = latestVolume;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public Double getIexRealtimePrice() {
        return iexRealtimePrice;
    }

    public void setIexRealtimePrice(Double iexRealtimePrice) {
        this.iexRealtimePrice = iexRealtimePrice;
    }

    public Long getIexRealtimeSize() {
        return iexRealtimeSize;
    }

    public void setIexRealtimeSize(Long iexRealtimeSize) {
        this.iexRealtimeSize = iexRealtimeSize;
    }

    public Long getIexLastUpdated() {
        return iexLastUpdated;
    }

    public void setIexLastUpdated(Long iexLastUpdated) {
        this.iexLastUpdated = iexLastUpdated;
    }

    public Double getDelayedPrice() {
        return delayedPrice;
    }

    public void setDelayedPrice(Double delayedPrice) {
        this.delayedPrice = delayedPrice;
    }

    public Long getDelayedPriceTime() {
        return delayedPriceTime;
    }

    public void setDelayedPriceTime(Long delayedPriceTime) {
        this.delayedPriceTime = delayedPriceTime;
    }

    public Double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public Double getExtendedChange() {
        return extendedChange;
    }

    public void setExtendedChange(Double extendedChange) {
        this.extendedChange = extendedChange;
    }

    public Double getExtendedChangePercent() {
        return extendedChangePercent;
    }

    public void setExtendedChangePercent(Double extendedChangePercent) {
        this.extendedChangePercent = extendedChangePercent;
    }

    public Long getExtendedPriceTime() {
        return extendedPriceTime;
    }

    public void setExtendedPriceTime(Long extendedPriceTime) {
        this.extendedPriceTime = extendedPriceTime;
    }

    public Double getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(Double previousClose) {
        this.previousClose = previousClose;
    }

    public Long getPreviousVolume() {
        return previousVolume;
    }

    public void setPreviousVolume(Long previousVolume) {
        this.previousVolume = previousVolume;
    }

    public Double getChange() {
        return change;
    }

    public void setChange(Double change) {
        this.change = change;
    }

    public Double getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(Double changePercent) {
        this.changePercent = changePercent;
    }

    public Double getIexMarketPercent() {
        return iexMarketPercent;
    }

    public void setIexMarketPercent(Double iexMarketPercent) {
        this.iexMarketPercent = iexMarketPercent;
    }

    public Long getIexVolume() {
        return iexVolume;
    }

    public void setIexVolume(Long iexVolume) {
        this.iexVolume = iexVolume;
    }

    public Long getAvgTotalVolume() {
        return avgTotalVolume;
    }

    public void setAvgTotalVolume(Long avgTotalVolume) {
        this.avgTotalVolume = avgTotalVolume;
    }

    public Double getIexBidPrice() {
        return iexBidPrice;
    }

    public void setIexBidPrice(Double iexBidPrice) {
        this.iexBidPrice = iexBidPrice;
    }

    public Long getIexBidSize() {
        return iexBidSize;
    }

    public void setIexBidSize(Long iexBidSize) {
        this.iexBidSize = iexBidSize;
    }

    public Double getIexAskPrice() {
        return iexAskPrice;
    }

    public void setIexAskPrice(Double iexAskPrice) {
        this.iexAskPrice = iexAskPrice;
    }

    public Long getIexAskSize() {
        return iexAskSize;
    }

    public void setIexAskSize(Long iexAskSize) {
        this.iexAskSize = iexAskSize;
    }

    public Long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(Long marketCap) {
        this.marketCap = marketCap;
    }

    public Double getWeek52High() {
        return week52High;
    }

    public void setWeek52High(Double week52High) {
        this.week52High = week52High;
    }

    public Double getWeek52Low() {
        return week52Low;
    }

    public void setWeek52Low(Double week52Low) {
        this.week52Low = week52Low;
    }

    public Double getYtdChange() {
        return ytdChange;
    }

    public void setYtdChange(Double ytdChange) {
        this.ytdChange = ytdChange;
    }

    public Double getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Double peRatio) {
        this.peRatio = peRatio;
    }

    public Long getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(Long lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Boolean getUSMarketOpen() {
        return isUSMarketOpen;
    }

    public void setUSMarketOpen(Boolean USMarketOpen) {
        isUSMarketOpen = USMarketOpen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IexResponseQuoteDTO)) return false;
        IexResponseQuoteDTO that = (IexResponseQuoteDTO) o;
        return Objects.equals(getSymbol(), that.getSymbol()) &&
            Objects.equals(getCompanyName(), that.getCompanyName()) &&
            Objects.equals(getCalculationPrice(), that.getCalculationPrice()) &&
            Objects.equals(getOpen(), that.getOpen()) &&
            Objects.equals(getOpenTime(), that.getOpenTime()) &&
            Objects.equals(getClose(), that.getClose()) &&
            Objects.equals(getCloseTime(), that.getCloseTime()) &&
            Objects.equals(getHigh(), that.getHigh()) &&
            Objects.equals(getLow(), that.getLow()) &&
            Objects.equals(getLatestPrice(), that.getLatestPrice()) &&
            Objects.equals(getLatestSource(), that.getLatestSource()) &&
            Objects.equals(getLatestTime(), that.getLatestTime()) &&
            Objects.equals(getLatestUpdate(), that.getLatestUpdate()) &&
            Objects.equals(getLatestVolume(), that.getLatestVolume()) &&
            Objects.equals(getVolume(), that.getVolume()) &&
            Objects.equals(getIexRealtimePrice(), that.getIexRealtimePrice()) &&
            Objects.equals(getIexRealtimeSize(), that.getIexRealtimeSize()) &&
            Objects.equals(getIexLastUpdated(), that.getIexLastUpdated()) &&
            Objects.equals(getDelayedPrice(), that.getDelayedPrice()) &&
            Objects.equals(getDelayedPriceTime(), that.getDelayedPriceTime()) &&
            Objects.equals(getExtendedPrice(), that.getExtendedPrice()) &&
            Objects.equals(getExtendedChange(), that.getExtendedChange()) &&
            Objects.equals(getExtendedChangePercent(), that.getExtendedChangePercent()) &&
            Objects.equals(getExtendedPriceTime(), that.getExtendedPriceTime()) &&
            Objects.equals(getPreviousClose(), that.getPreviousClose()) &&
            Objects.equals(getPreviousVolume(), that.getPreviousVolume()) &&
            Objects.equals(getChange(), that.getChange()) &&
            Objects.equals(getChangePercent(), that.getChangePercent()) &&
            Objects.equals(getIexMarketPercent(), that.getIexMarketPercent()) &&
            Objects.equals(getIexVolume(), that.getIexVolume()) &&
            Objects.equals(getAvgTotalVolume(), that.getAvgTotalVolume()) &&
            Objects.equals(getIexBidPrice(), that.getIexBidPrice()) &&
            Objects.equals(getIexBidSize(), that.getIexBidSize()) &&
            Objects.equals(getIexAskPrice(), that.getIexAskPrice()) &&
            Objects.equals(getIexAskSize(), that.getIexAskSize()) &&
            Objects.equals(getMarketCap(), that.getMarketCap()) &&
            Objects.equals(getWeek52High(), that.getWeek52High()) &&
            Objects.equals(getWeek52Low(), that.getWeek52Low()) &&
            Objects.equals(getYtdChange(), that.getYtdChange()) &&
            Objects.equals(getPeRatio(), that.getPeRatio()) &&
            Objects.equals(getLastTradeTime(), that.getLastTradeTime()) &&
            Objects.equals(isUSMarketOpen, that.isUSMarketOpen);
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSymbol(), getCompanyName(), getCalculationPrice(), getOpen(), getOpenTime(), getClose(), getCloseTime(), getHigh(), getLow(), getLatestPrice(), getLatestSource(), getLatestTime(), getLatestUpdate(), getLatestVolume(), getVolume(), getIexRealtimePrice(), getIexRealtimeSize(), getIexLastUpdated(), getDelayedPrice(), getDelayedPriceTime(), getExtendedPrice(), getExtendedChange(), getExtendedChangePercent(), getExtendedPriceTime(), getPreviousClose(), getPreviousVolume(), getChange(), getChangePercent(), getIexMarketPercent(), getIexVolume(), getAvgTotalVolume(), getIexBidPrice(), getIexBidSize(), getIexAskPrice(), getIexAskSize(), getMarketCap(), getWeek52High(), getWeek52Low(), getYtdChange(), getPeRatio(), getLastTradeTime(), isUSMarketOpen);
    }

    @Override
    public String toString() {
        return "IexResponseQuoteDTO{" +
            "symbol='" + symbol + '\'' +
            ", companyName='" + companyName + '\'' +
            ", calculationPrice='" + calculationPrice + '\'' +
            ", open=" + open +
            ", openTime=" + openTime +
            ", close=" + close +
            ", closeTime=" + closeTime +
            ", high=" + high +
            ", low=" + low +
            ", latestPrice=" + latestPrice +
            ", latestSource='" + latestSource + '\'' +
            ", latestTime='" + latestTime + '\'' +
            ", latestUpdate=" + latestUpdate +
            ", latestVolume=" + latestVolume +
            ", volume=" + volume +
            ", iexRealtimePrice=" + iexRealtimePrice +
            ", iexRealtimeSize=" + iexRealtimeSize +
            ", iexLastUpdated=" + iexLastUpdated +
            ", delayedPrice=" + delayedPrice +
            ", delayedPriceTime=" + delayedPriceTime +
            ", extendedPrice=" + extendedPrice +
            ", extendedChange=" + extendedChange +
            ", extendedChangePercent=" + extendedChangePercent +
            ", extendedPriceTime=" + extendedPriceTime +
            ", previousClose=" + previousClose +
            ", previousVolume=" + previousVolume +
            ", change=" + change +
            ", changePercent=" + changePercent +
            ", iexMarketPercent=" + iexMarketPercent +
            ", iexVolume=" + iexVolume +
            ", avgTotalVolume=" + avgTotalVolume +
            ", iexBidPrice=" + iexBidPrice +
            ", iexBidSize=" + iexBidSize +
            ", iexAskPrice=" + iexAskPrice +
            ", iexAskSize=" + iexAskSize +
            ", marketCap=" + marketCap +
            ", week52High=" + week52High +
            ", week52Low=" + week52Low +
            ", ytdChange=" + ytdChange +
            ", peRatio=" + peRatio +
            ", lastTradeTime=" + lastTradeTime +
            ", isUSMarketOpen=" + isUSMarketOpen +
            '}';
    }
}
