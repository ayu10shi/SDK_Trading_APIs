package com.example.trading.model;

public class Instrument {
    public String symbol;
    public String exchange;
    public String instrumentType;
    public double lastTradedPrice;

    public Instrument(String symbol, String exchange, String instrumentType, double price) {
        this.symbol = symbol;
        this.exchange = exchange;
        this.instrumentType = instrumentType;
        this.lastTradedPrice = price;
    }
}
