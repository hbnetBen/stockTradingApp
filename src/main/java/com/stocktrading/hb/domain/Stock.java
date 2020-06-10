package com.stocktrading.hb.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stocktrading.hb.domain.enumeration.TransactionType;
import com.stocktrading.hb.domain.impl.Ownership;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * A user stock.
 */
@Document(collection = "user_stock")
public class Stock extends AbstractAuditingEntity implements Ownership, Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @JsonIgnore
    @Field("symbol")
    private String symbol;

    @JsonIgnore
    @Field("volume")
    private Long volume;

    @Field("owner")
    private String owner;

    public Stock(){}

    public Stock(String symbol, Long volume, String owner) {
        this.symbol = symbol;
        this.volume = volume;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Stock{" +
            "id='" + id + '\'' +
            ", symbol='" + symbol + '\'' +
            ", volume=" + volume +
            ", owner='" + owner + '\'' +
            '}';
    }
}
