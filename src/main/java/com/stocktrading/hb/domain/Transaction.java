package com.stocktrading.hb.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.stocktrading.hb.domain.enumeration.TransactionType;
import com.stocktrading.hb.domain.impl.Ownership;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * A user stock transaction.
 */
@Document(collection = "stock_transaction")
public class Transaction extends AbstractAuditingEntity implements Ownership, Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @JsonIgnore
    @Field("symbol")
    private String symbol;

    @JsonIgnore
    @Field("type")
    private TransactionType type;

    @JsonIgnore
    @Field("quantity")
    private Long quantity;

    @JsonIgnore
    @Field("price")
    private Double price;

    @DBRef
    @Field("stock")
    private Stock stock;

    @Field("owner")
    private String owner;


    public Transaction(){}

    public Transaction(String symbol, TransactionType type, Long quantity, Double price, String owner) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
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

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transaction{" +
            "id='" + id + '\'' +
            ", symbol='" + symbol + '\'' +
            ", type=" + type +
            ", quantity=" + quantity +
            ", price=" + price +
            ", stock=" + stock +
            ", owner='" + owner + '\'' +
            '}';
    }
}
