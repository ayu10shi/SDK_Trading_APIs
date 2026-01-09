package com.example.trading.service;

import com.example.trading.model.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PortfolioService {

    private final TradeService tradeService;

    public PortfolioService(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    public List<PortfolioItem> getPortfolio() {
        Map<String, PortfolioItem> map = new HashMap<>();

        for (Trade trade : tradeService.getTrades()) {
            map.putIfAbsent(trade.symbol, new PortfolioItem(trade.symbol, 0, trade.price));
            PortfolioItem item = map.get(trade.symbol);
            item.quantity += trade.quantity;
        }

        return new ArrayList<>(map.values());
    }
}
