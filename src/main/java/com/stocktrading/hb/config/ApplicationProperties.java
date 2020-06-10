package com.stocktrading.hb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Stock Trading App.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private final ApplicationProperties.Iex iex = new ApplicationProperties.Iex();

    public ApplicationProperties() {
    }

    public Iex getIex() {
        return iex;
    }

    public static class Iex{
        private String baseUrl;
        private String stockBasePath;
        private String symbolPath;
        private String quotePath;
        private String statPath;
        private String priceTargetPath;
        private String apiKey;
        private String format;

        public String getBaseUrl() {
            return baseUrl;
        }

        public void setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
        }

        public String getStockBasePath() {
            return stockBasePath;
        }

        public void setStockBasePath(String stockBasePath) {
            this.stockBasePath = stockBasePath;
        }

        public String getSymbolPath() {
            return symbolPath;
        }

        public void setSymbolPath(String symbolPath) {
            this.symbolPath = symbolPath;
        }

        public String getQuotePath() {
            return quotePath;
        }

        public void setQuotePath(String quotePath) {
            this.quotePath = quotePath;
        }

        public String getStatPath() {
            return statPath;
        }

        public void setStatPath(String statPath) {
            this.statPath = statPath;
        }

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public String getPriceTargetPath() {
            return priceTargetPath;
        }

        public void setPriceTargetPath(String priceTargetPath) {
            this.priceTargetPath = priceTargetPath;
        }
    }
}
