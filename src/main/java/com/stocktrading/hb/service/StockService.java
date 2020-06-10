package com.stocktrading.hb.service;

import com.stocktrading.hb.domain.StockSymbol;
import com.stocktrading.hb.repository.StockSymbolRepository;
import com.stocktrading.hb.service.dto.IexResponseSymbolDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing stocks.
 */
@Service
public class StockService {

    private final Logger log = LoggerFactory.getLogger(StockService.class);

    private final StockSymbolRepository symbolRepository;
    private final IexService iexService;

    @Autowired
    public StockService(StockSymbolRepository symbolRepository, IexService iexService) {
        this.symbolRepository = symbolRepository;
        this.iexService = iexService;
    }

    @Scheduled(cron = "0 */10 * ? * *") // Every 10-mins
    public void updateSymbolsFromWebService() {
        log.info("***********updateSymbolsFromWebService****************");
        List<StockSymbol> stockSymbols = symbolRepository.findAll();
        List<IexResponseSymbolDTO> symbolDTOS = iexService.getSymbols();
        //log.info("************************************************stockSymbols size: "+stockSymbols.size());

        if(stockSymbols.isEmpty()){
            if(!symbolDTOS.isEmpty()) symbolDTOS.forEach(symbolDTO -> symbolRepository.save(Optional.of(symbolDTO).map(StockSymbol::new).get()));
        }else{
            for (IexResponseSymbolDTO symbolDTO : symbolDTOS) {
                symbolRepository.findOneBySymbol(symbolDTO.getSymbol()).ifPresent(existingStockSymbol -> {
                    existingStockSymbol.setCurrency(symbolDTO.getCurrency());
                    existingStockSymbol.setDate(symbolDTO.getDate());
                    existingStockSymbol.setExchange(symbolDTO.getExchange());
                    existingStockSymbol.setIexId(symbolDTO.getIexId());
                    existingStockSymbol.setName(symbolDTO.getName());
                    existingStockSymbol.setType(symbolDTO.getType());
                    symbolRepository.save(existingStockSymbol);
                });
            }
        }


    }
}
