package com.example.trading.service;

import com.example.trading.model.Trade;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TradeService {

    private List<Trade> trades = new ArrayList<>();

    public void addTrade(Trade trade) {
        trades.add(trade);
    }

    public List<Trade> getTrades() {
        return trades;
    }
}
