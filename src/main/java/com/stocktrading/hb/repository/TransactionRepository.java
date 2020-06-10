package com.stocktrading.hb.repository;

import com.stocktrading.hb.domain.Transaction;
import com.stocktrading.hb.repository.impl.OwnershipRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data MongoDB repository for the {@link Transaction entity.
 */
@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String>, OwnershipRepository<Transaction> {
    List<Transaction> findAllBySymbol(String symbol);
    List<Transaction> findAllByType(String type);
}
