package com.stocktrading.hb.service.dto;

import com.stocktrading.hb.domain.enumeration.TransactionType;

import java.util.Objects;

/**
 * A DTO representing a transaction.
 */
public class TransactionDTO {
    private String symbol;
    private TransactionType type;
    private Long quantity;
    private Double price;

    public TransactionDTO() {
        // Empty constructor needed for Jackson.
    }

    public TransactionDTO(String symbol, TransactionType type, Long quantity, Double price) {
        this.symbol = symbol;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransactionDTO)) return false;
        TransactionDTO that = (TransactionDTO) o;
        return Objects.equals(getSymbol(), that.getSymbol()) &&
            getType() == that.getType() &&
            Objects.equals(getQuantity(), that.getQuantity()) &&
            Objects.equals(getPrice(), that.getPrice());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSymbol(), getType(), getQuantity(), getPrice());
    }
}
