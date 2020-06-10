package com.stocktrading.hb.web.rest;


import com.stocktrading.hb.service.IexService;
import com.stocktrading.hb.service.StockService;
import com.stocktrading.hb.service.dto.IexResponseCurrentPriceDTO;
import com.stocktrading.hb.service.dto.IexResponseQuoteDTO;
import com.stocktrading.hb.service.dto.IexResponseStockPriceTargetDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing stocks.
 */
@RestController
@RequestMapping("/api")
public class StockResource {

    private static class StockResourceException extends RuntimeException {
        private StockResourceException(String message) {
            super(message);
        }
    }

    private final Logger log = LoggerFactory.getLogger(StockResource.class);

    private final IexService iexService;

    private final StockService stockService;

    public StockResource(IexService iexService, StockService stockService) {

        this.iexService = iexService;
        this.stockService = stockService;
    }

    /**
     * {@code GET  /stock} : search stocks latest price.
     *
     * @param symbol the keyword symbol.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if search result not returned.
     */
    @GetMapping("/stock")
    public ResponseEntity<IexResponseQuoteDTO> stock(@RequestParam(value = "symbol") String symbol) {
        if (symbol == null) {
            throw new StockResourceException("Symbol cannot be null, supply keyword");
        }
        IexResponseQuoteDTO quote = iexService.getQuote(symbol);
        return new ResponseEntity<>(quote, null, HttpStatus.CREATED);
    }

    /**
     * {@code GET  /stocks} : search stocks latest price.
     *
     * @param symbols the keyword symbol.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if search result not returned.
     */
    @GetMapping("/stocks")
    public ResponseEntity<List<IexResponseCurrentPriceDTO>> stocks(@RequestParam(value = "symbols") String symbols) {
        if (symbols == null) {
            throw new StockResourceException("Symbol(s) cannot be null, supply keyword(s)");
        }
        List<IexResponseCurrentPriceDTO> quote = iexService.getStocksPrice(symbols);
        return new ResponseEntity<>(quote, null, HttpStatus.CREATED);
    }

}
