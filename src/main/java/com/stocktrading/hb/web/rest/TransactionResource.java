package com.stocktrading.hb.web.rest;


import com.stocktrading.hb.domain.Transaction;
import com.stocktrading.hb.service.IexService;
import com.stocktrading.hb.service.StockService;
import com.stocktrading.hb.service.TransactionService;
import com.stocktrading.hb.service.dto.IexResponseCurrentPriceDTO;
import com.stocktrading.hb.service.dto.IexResponseQuoteDTO;
import com.stocktrading.hb.service.dto.TransactionDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing transactions.
 */
@RestController
@RequestMapping("/api")
public class TransactionResource {

    private static class TransactionResourceException extends RuntimeException {
        private TransactionResourceException(String message) {
            super(message);
        }
    }

    private final Logger log = LoggerFactory.getLogger(TransactionResource.class);

    private final TransactionService transactionService;
    private final StockService stockService;

    public TransactionResource(TransactionService transactionService, StockService stockService) {

        this.transactionService = transactionService;
        this.stockService = stockService;
    }

    /**
     * {@code POST  /buy-stock} : buy stock.
     *
     * @param transactionDTO transaction details.
     */
    @PostMapping(path = "/buy-stock")
    public ResponseEntity<Transaction> buyStock(@RequestBody TransactionDTO transactionDTO) {
        if (transactionDTO.getSymbol() == null || transactionDTO.getPrice() == null ||
            transactionDTO.getQuantity() == null || transactionDTO.getType() == null) {
            throw new TransactionResourceException("Invalid Inputs");
        }
        return new ResponseEntity<>(new Transaction(), null, HttpStatus.CREATED);
    }

    /**
     * {@code POST  /sell-stock} : sell stock.
     *
     * @param transactionDTO transaction details.
     */
    @PostMapping(path = "/sell-stock")
    public ResponseEntity<Transaction> sellStock(@RequestBody TransactionDTO transactionDTO) {
        if (transactionDTO.getSymbol() == null || transactionDTO.getPrice() == null ||
            transactionDTO.getQuantity() == null || transactionDTO.getType() == null) {
            throw new TransactionResourceException("Invalid Inputs");
        }
        return new ResponseEntity<>(new Transaction(), null, HttpStatus.CREATED);
    }

}
