package com.example.trading.model;

public class PortfolioItem {
    public String symbol;
    public int quantity;
    public double averagePrice;

    public PortfolioItem(String symbol, int quantity, double avgPrice) {
        this.symbol = symbol;
        this.quantity = quantity;
        this.averagePrice = avgPrice;
    }
}
