package com.stocktrading.hb.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Objects;

/**
 * A DTO representing a stock stats.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IexResponseStatDTO {

    private String companyName;
    private Long marketcap;
    private Double week52high;
    private Double week52low;
    private Double week52change;
    private Long sharesOutstanding;
    private Long _float;
    private Long avg10Volume;
    private Long avg30Volume;
    private Double day200MovingAvg;
    private Double day50MovingAvg;
    private Long employees;
    private Double ttmEPS;
    private Double ttmDividendRate;
    private Double dividendYield;
    private String nextDividendDate;
    private String exDividendDate;
    private String nextEarningsDate;
    private Long peRatio;
    private Double beta;
    private Double maxChangePercent;
    private Double year5ChangePercent;
    private Double year2ChangePercent;
    private Double year1ChangePercent;
    private Double ytdChangePercent;
    private Double month6ChangePercent;
    private Double month3ChangePercent;
    private Double month1ChangePercent;
    private Double day30ChangePercent;
    private Double day5ChangePercent;

    /**
     * No args constructor for use in serialization
     *
     */
    public IexResponseStatDTO() {
    }

    /**
     *
     * @param marketcap
     * @param ytdChangePercent
     * @param month1ChangePercent
     * @param month3ChangePercent
     * @param month6ChangePercent
     * @param companyName
     * @param avg30Volume
     * @param week52change
     * @param dividendYield
     * @param nextDividendDate
     * @param day5ChangePercent
     * @param peRatio
     * @param year5ChangePercent
     * @param sharesOutstanding
     * @param beta
     * @param day30ChangePercent
     * @param week52high
     * @param exDividendDate
     * @param day200MovingAvg
     * @param nextEarningsDate
     * @param maxChangePercent
     * @param year2ChangePercent
     * @param _float
     * @param day50MovingAvg
     * @param year1ChangePercent
     * @param avg10Volume
     * @param week52low
     * @param ttmDividendRate
     * @param employees
     * @param ttmEPS
     */
    public IexResponseStatDTO(String companyName, Long marketcap, Double week52high, Double week52low, Double week52change, Long sharesOutstanding, Long _float, Long avg10Volume, Long avg30Volume, Double day200MovingAvg, Double day50MovingAvg, Long employees, Double ttmEPS, Double ttmDividendRate, Double dividendYield, String nextDividendDate, String exDividendDate, String nextEarningsDate, Long peRatio, Double beta, Double maxChangePercent, Double year5ChangePercent, Double year2ChangePercent, Double year1ChangePercent, Double ytdChangePercent, Double month6ChangePercent, Double month3ChangePercent, Double month1ChangePercent, Double day30ChangePercent, Double day5ChangePercent) {
        this.companyName = companyName;
        this.marketcap = marketcap;
        this.week52high = week52high;
        this.week52low = week52low;
        this.week52change = week52change;
        this.sharesOutstanding = sharesOutstanding;
        this._float = _float;
        this.avg10Volume = avg10Volume;
        this.avg30Volume = avg30Volume;
        this.day200MovingAvg = day200MovingAvg;
        this.day50MovingAvg = day50MovingAvg;
        this.employees = employees;
        this.ttmEPS = ttmEPS;
        this.ttmDividendRate = ttmDividendRate;
        this.dividendYield = dividendYield;
        this.nextDividendDate = nextDividendDate;
        this.exDividendDate = exDividendDate;
        this.nextEarningsDate = nextEarningsDate;
        this.peRatio = peRatio;
        this.beta = beta;
        this.maxChangePercent = maxChangePercent;
        this.year5ChangePercent = year5ChangePercent;
        this.year2ChangePercent = year2ChangePercent;
        this.year1ChangePercent = year1ChangePercent;
        this.ytdChangePercent = ytdChangePercent;
        this.month6ChangePercent = month6ChangePercent;
        this.month3ChangePercent = month3ChangePercent;
        this.month1ChangePercent = month1ChangePercent;
        this.day30ChangePercent = day30ChangePercent;
        this.day5ChangePercent = day5ChangePercent;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getMarketcap() {
        return marketcap;
    }

    public void setMarketcap(Long marketcap) {
        this.marketcap = marketcap;
    }

    public Double getWeek52high() {
        return week52high;
    }

    public void setWeek52high(Double week52high) {
        this.week52high = week52high;
    }

    public Double getWeek52low() {
        return week52low;
    }

    public void setWeek52low(Double week52low) {
        this.week52low = week52low;
    }

    public Double getWeek52change() {
        return week52change;
    }

    public void setWeek52change(Double week52change) {
        this.week52change = week52change;
    }

    public Long getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(Long sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public Long get_float() {
        return _float;
    }

    public void set_float(Long _float) {
        this._float = _float;
    }

    public Long getAvg10Volume() {
        return avg10Volume;
    }

    public void setAvg10Volume(Long avg10Volume) {
        this.avg10Volume = avg10Volume;
    }

    public Long getAvg30Volume() {
        return avg30Volume;
    }

    public void setAvg30Volume(Long avg30Volume) {
        this.avg30Volume = avg30Volume;
    }

    public Double getDay200MovingAvg() {
        return day200MovingAvg;
    }

    public void setDay200MovingAvg(Double day200MovingAvg) {
        this.day200MovingAvg = day200MovingAvg;
    }

    public Double getDay50MovingAvg() {
        return day50MovingAvg;
    }

    public void setDay50MovingAvg(Double day50MovingAvg) {
        this.day50MovingAvg = day50MovingAvg;
    }

    public Long getEmployees() {
        return employees;
    }

    public void setEmployees(Long employees) {
        this.employees = employees;
    }

    public Double getTtmEPS() {
        return ttmEPS;
    }

    public void setTtmEPS(Double ttmEPS) {
        this.ttmEPS = ttmEPS;
    }

    public Double getTtmDividendRate() {
        return ttmDividendRate;
    }

    public void setTtmDividendRate(Double ttmDividendRate) {
        this.ttmDividendRate = ttmDividendRate;
    }

    public Double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(Double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getNextDividendDate() {
        return nextDividendDate;
    }

    public void setNextDividendDate(String nextDividendDate) {
        this.nextDividendDate = nextDividendDate;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public String getNextEarningsDate() {
        return nextEarningsDate;
    }

    public void setNextEarningsDate(String nextEarningsDate) {
        this.nextEarningsDate = nextEarningsDate;
    }

    public Long getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(Long peRatio) {
        this.peRatio = peRatio;
    }

    public Double getBeta() {
        return beta;
    }

    public void setBeta(Double beta) {
        this.beta = beta;
    }

    public Double getMaxChangePercent() {
        return maxChangePercent;
    }

    public void setMaxChangePercent(Double maxChangePercent) {
        this.maxChangePercent = maxChangePercent;
    }

    public Double getYear5ChangePercent() {
        return year5ChangePercent;
    }

    public void setYear5ChangePercent(Double year5ChangePercent) {
        this.year5ChangePercent = year5ChangePercent;
    }

    public Double getYear2ChangePercent() {
        return year2ChangePercent;
    }

    public void setYear2ChangePercent(Double year2ChangePercent) {
        this.year2ChangePercent = year2ChangePercent;
    }

    public Double getYear1ChangePercent() {
        return year1ChangePercent;
    }

    public void setYear1ChangePercent(Double year1ChangePercent) {
        this.year1ChangePercent = year1ChangePercent;
    }

    public Double getYtdChangePercent() {
        return ytdChangePercent;
    }

    public void setYtdChangePercent(Double ytdChangePercent) {
        this.ytdChangePercent = ytdChangePercent;
    }

    public Double getMonth6ChangePercent() {
        return month6ChangePercent;
    }

    public void setMonth6ChangePercent(Double month6ChangePercent) {
        this.month6ChangePercent = month6ChangePercent;
    }

    public Double getMonth3ChangePercent() {
        return month3ChangePercent;
    }

    public void setMonth3ChangePercent(Double month3ChangePercent) {
        this.month3ChangePercent = month3ChangePercent;
    }

    public Double getMonth1ChangePercent() {
        return month1ChangePercent;
    }

    public void setMonth1ChangePercent(Double month1ChangePercent) {
        this.month1ChangePercent = month1ChangePercent;
    }

    public Double getDay30ChangePercent() {
        return day30ChangePercent;
    }

    public void setDay30ChangePercent(Double day30ChangePercent) {
        this.day30ChangePercent = day30ChangePercent;
    }

    public Double getDay5ChangePercent() {
        return day5ChangePercent;
    }

    public void setDay5ChangePercent(Double day5ChangePercent) {
        this.day5ChangePercent = day5ChangePercent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IexResponseStatDTO)) return false;
        IexResponseStatDTO that = (IexResponseStatDTO) o;
        return Objects.equals(getCompanyName(), that.getCompanyName()) &&
            Objects.equals(getMarketcap(), that.getMarketcap()) &&
            Objects.equals(getWeek52high(), that.getWeek52high()) &&
            Objects.equals(getWeek52low(), that.getWeek52low()) &&
            Objects.equals(getWeek52change(), that.getWeek52change()) &&
            Objects.equals(getSharesOutstanding(), that.getSharesOutstanding()) &&
            Objects.equals(get_float(), that.get_float()) &&
            Objects.equals(getAvg10Volume(), that.getAvg10Volume()) &&
            Objects.equals(getAvg30Volume(), that.getAvg30Volume()) &&
            Objects.equals(getDay200MovingAvg(), that.getDay200MovingAvg()) &&
            Objects.equals(getDay50MovingAvg(), that.getDay50MovingAvg()) &&
            Objects.equals(getEmployees(), that.getEmployees()) &&
            Objects.equals(getTtmEPS(), that.getTtmEPS()) &&
            Objects.equals(getTtmDividendRate(), that.getTtmDividendRate()) &&
            Objects.equals(getDividendYield(), that.getDividendYield()) &&
            Objects.equals(getNextDividendDate(), that.getNextDividendDate()) &&
            Objects.equals(getExDividendDate(), that.getExDividendDate()) &&
            Objects.equals(getNextEarningsDate(), that.getNextEarningsDate()) &&
            Objects.equals(getPeRatio(), that.getPeRatio()) &&
            Objects.equals(getBeta(), that.getBeta()) &&
            Objects.equals(getMaxChangePercent(), that.getMaxChangePercent()) &&
            Objects.equals(getYear5ChangePercent(), that.getYear5ChangePercent()) &&
            Objects.equals(getYear2ChangePercent(), that.getYear2ChangePercent()) &&
            Objects.equals(getYear1ChangePercent(), that.getYear1ChangePercent()) &&
            Objects.equals(getYtdChangePercent(), that.getYtdChangePercent()) &&
            Objects.equals(getMonth6ChangePercent(), that.getMonth6ChangePercent()) &&
            Objects.equals(getMonth3ChangePercent(), that.getMonth3ChangePercent()) &&
            Objects.equals(getMonth1ChangePercent(), that.getMonth1ChangePercent()) &&
            Objects.equals(getDay30ChangePercent(), that.getDay30ChangePercent()) &&
            Objects.equals(getDay5ChangePercent(), that.getDay5ChangePercent());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCompanyName(), getMarketcap(), getWeek52high(), getWeek52low(), getWeek52change(), getSharesOutstanding(), get_float(), getAvg10Volume(), getAvg30Volume(), getDay200MovingAvg(), getDay50MovingAvg(), getEmployees(), getTtmEPS(), getTtmDividendRate(), getDividendYield(), getNextDividendDate(), getExDividendDate(), getNextEarningsDate(), getPeRatio(), getBeta(), getMaxChangePercent(), getYear5ChangePercent(), getYear2ChangePercent(), getYear1ChangePercent(), getYtdChangePercent(), getMonth6ChangePercent(), getMonth3ChangePercent(), getMonth1ChangePercent(), getDay30ChangePercent(), getDay5ChangePercent());
    }

    @Override
    public String toString() {
        return "IexResponseStatDTO{" +
            "companyName='" + companyName + '\'' +
            ", marketcap=" + marketcap +
            ", week52high=" + week52high +
            ", week52low=" + week52low +
            ", week52change=" + week52change +
            ", sharesOutstanding=" + sharesOutstanding +
            ", _float=" + _float +
            ", avg10Volume=" + avg10Volume +
            ", avg30Volume=" + avg30Volume +
            ", day200MovingAvg=" + day200MovingAvg +
            ", day50MovingAvg=" + day50MovingAvg +
            ", employees=" + employees +
            ", ttmEPS=" + ttmEPS +
            ", ttmDividendRate=" + ttmDividendRate +
            ", dividendYield=" + dividendYield +
            ", nextDividendDate='" + nextDividendDate + '\'' +
            ", exDividendDate='" + exDividendDate + '\'' +
            ", nextEarningsDate='" + nextEarningsDate + '\'' +
            ", peRatio=" + peRatio +
            ", beta=" + beta +
            ", maxChangePercent=" + maxChangePercent +
            ", year5ChangePercent=" + year5ChangePercent +
            ", year2ChangePercent=" + year2ChangePercent +
            ", year1ChangePercent=" + year1ChangePercent +
            ", ytdChangePercent=" + ytdChangePercent +
            ", month6ChangePercent=" + month6ChangePercent +
            ", month3ChangePercent=" + month3ChangePercent +
            ", month1ChangePercent=" + month1ChangePercent +
            ", day30ChangePercent=" + day30ChangePercent +
            ", day5ChangePercent=" + day5ChangePercent +
            '}';
    }

}
