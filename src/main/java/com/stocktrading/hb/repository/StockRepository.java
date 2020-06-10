package com.stocktrading.hb.repository;

import com.stocktrading.hb.domain.Stock;
import com.stocktrading.hb.repository.impl.OwnershipRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Spring Data MongoDB repository for the {@link Stock entity.
 */
@Repository
public interface StockRepository extends MongoRepository<Stock, String>, OwnershipRepository<Stock> {
    Optional<Stock> findOneBySymbol(String symbol);
    Optional<Stock> findBySymbolAndOwner(String symbol, String owner);
}
