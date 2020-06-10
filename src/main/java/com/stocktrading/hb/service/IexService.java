package com.stocktrading.hb.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.stocktrading.hb.config.ApplicationProperties;
import com.stocktrading.hb.service.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class IexService {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private final ApplicationProperties applicationProperties;

    @Autowired
    public IexService(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    public List<IexResponseSymbolDTO> getSymbols(){
        List<IexResponseSymbolDTO> symbolDTOS = new ArrayList<>();
        ApplicationProperties.Iex iex = applicationProperties.getIex();
        String uri = iex.getBaseUrl() + iex.getSymbolPath() + iex.getApiKey() + iex.getFormat();
        log.info("IEX Endpoint: "+uri);
        ResponseEntity<String> payload = new RestTemplate().getForEntity(uri, String.class);
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try {
            JsonNode payloadBody = mapper.readTree(payload.getBody());
            if(payload.getStatusCode().equals(HttpStatus.OK)) {
                if(payloadBody.size() == 0) return symbolDTOS;
                return Arrays.asList(mapper.treeToValue(payloadBody, IexResponseSymbolDTO[].class));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return symbolDTOS;
    }

    public IexResponseQuoteDTO getQuote(String symbol){
        if (symbol.isEmpty()) return null;
        IexResponseQuoteDTO quoteDTO = new IexResponseQuoteDTO();
        ApplicationProperties.Iex iex = applicationProperties.getIex();
        String uri = iex.getBaseUrl() + iex.getStockBasePath() + symbol.toLowerCase() + iex.getQuotePath() + iex.getApiKey();
        log.info("IEX Endpoint: "+uri);
        ResponseEntity<String> payload = new RestTemplate().getForEntity(uri, String.class);
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try {
            JsonNode payloadBody = mapper.readTree(payload.getBody());
            if(payload.getStatusCode().equals(HttpStatus.OK)) {
                if(payloadBody.size() == 0) return quoteDTO;
                return mapper.treeToValue(payloadBody, IexResponseQuoteDTO.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quoteDTO;
    }

    public List<IexResponseCurrentPriceDTO> getStocksPrice(String symbols){
        List<IexResponseCurrentPriceDTO> quotes = new ArrayList<>();
        if (symbols.isEmpty()) return null;
        String[] symbolArray = symbols.split(",");
        for (String symbol : symbolArray) {
            IexResponseCurrentPriceDTO priceDTO = new IexResponseCurrentPriceDTO();
            ApplicationProperties.Iex iex = applicationProperties.getIex();
            String uri = iex.getBaseUrl() + iex.getStockBasePath() + symbol.toLowerCase() + iex.getQuotePath() + iex.getApiKey();
            log.info("IEX Endpoint: "+uri);
            ResponseEntity<String> payload = new RestTemplate().getForEntity(uri, String.class);
            ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
            try {
                JsonNode payloadBody = mapper.readTree(payload.getBody());
                if(payload.getStatusCode().equals(HttpStatus.OK)) {
                    if(payloadBody.size() == 0) quotes.add(priceDTO);
                    quotes.add(mapper.treeToValue(payloadBody, IexResponseCurrentPriceDTO.class));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return quotes;
    }

    public IexResponseStatDTO getStat(String symbol){
        if (symbol.isEmpty()) return null;
        IexResponseStatDTO statDTO = new IexResponseStatDTO();
        ApplicationProperties.Iex iex = applicationProperties.getIex();
        String uri = iex.getBaseUrl() + iex.getStockBasePath() + symbol.toLowerCase() + iex.getStatPath() + iex.getApiKey();
        log.info("IEX Endpoint: "+uri);
        ResponseEntity<String> payload = new RestTemplate().getForEntity(uri, String.class);
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try {
            JsonNode payloadBody = mapper.readTree(payload.getBody());
            if(payload.getStatusCode().equals(HttpStatus.OK)) {
                if(payloadBody.size() == 0) return statDTO;
                return mapper.treeToValue(payloadBody, IexResponseStatDTO.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return statDTO;
    }

    public IexResponseStockPriceTargetDTO getPriceTarget(String symbol){
        if (symbol.isEmpty()) return null;
        IexResponseStockPriceTargetDTO priceTargetDTO = new IexResponseStockPriceTargetDTO();
        ApplicationProperties.Iex iex = applicationProperties.getIex();
        String uri = iex.getBaseUrl() + iex.getStockBasePath() + symbol.toLowerCase() + iex.getPriceTargetPath() + iex.getApiKey();
        log.info("IEX Endpoint: "+uri);
        ResponseEntity<String> payload = new RestTemplate().getForEntity(uri, String.class);
        ObjectMapper mapper = new ObjectMapper().registerModule(new JavaTimeModule());
        try {
            JsonNode payloadBody = mapper.readTree(payload.getBody());
            if(payload.getStatusCode().equals(HttpStatus.OK)) {
                if(payloadBody.size() == 0) return priceTargetDTO;
                return mapper.treeToValue(payloadBody, IexResponseStockPriceTargetDTO.class);
            }
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode() == HttpStatus.GATEWAY_TIMEOUT) {
                // Do something
            } else {
                throw e;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return priceTargetDTO;
    }

}
