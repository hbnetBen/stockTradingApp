package com.stocktrading.hb.service;

import com.stocktrading.hb.domain.Transaction;
import com.stocktrading.hb.repository.StockRepository;
import com.stocktrading.hb.repository.StockSymbolRepository;
import com.stocktrading.hb.repository.TransactionRepository;
import com.stocktrading.hb.security.SecurityUtils;
import com.stocktrading.hb.service.dto.IexResponseQuoteDTO;
import com.stocktrading.hb.service.dto.TransactionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


/**
 * Service class for managing stocks.
 */
@Service
public class TransactionService {

    private final Logger log = LoggerFactory.getLogger(TransactionService.class);

    private final StockRepository stockRepository;
    private final TransactionRepository transactionRepository;
    private final IexService iexService;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository, StockRepository stockRepository, IexService iexService) {
        this.transactionRepository = transactionRepository;
        this.stockRepository = stockRepository;
        this.iexService = iexService;
    }


    public Transaction buyStock(TransactionDTO transactionDTO) {
        IexResponseQuoteDTO quote = iexService.getQuote(transactionDTO.getSymbol());
        stockRepository.findBySymbolAndOwner(quote.getSymbol(), SecurityUtils.getOwner()).ifPresent(existingStockSymbol -> {
            existingStockSymbol.setCurrency(symbolDTO.getCurrency());
            existingStockSymbol.setDate(symbolDTO.getDate());
            existingStockSymbol.setExchange(symbolDTO.getExchange());
            existingStockSymbol.setIexId(symbolDTO.getIexId());
            existingStockSymbol.setName(symbolDTO.getName());
            existingStockSymbol.setType(symbolDTO.getType());
            symbolRepository.save(existingStockSymbol);
        });
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
