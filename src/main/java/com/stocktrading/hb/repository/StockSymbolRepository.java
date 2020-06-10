package com.stocktrading.hb.repository;

import com.stocktrading.hb.domain.StockSymbol;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data MongoDB repository for the {@link StockSymbol} entity.
 */
@Repository
public interface StockSymbolRepository extends MongoRepository<StockSymbol, String> {
    Optional<StockSymbol> findOneBySymbol(String symbol);
}
