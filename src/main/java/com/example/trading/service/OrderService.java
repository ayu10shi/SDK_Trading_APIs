package com.example.trading.service;

import com.example.trading.model.Order;
import com.example.trading.model.Trade;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    private Map<String, Order> orders = new HashMap<>();
    private final TradeService tradeService;

    public OrderService(TradeService tradeService) {
        this.tradeService = tradeService;
    }

    public Order placeOrder(Order order) {
        order.orderId = "ORD" + System.currentTimeMillis();

        if (order.quantity <= 0) {
            throw new RuntimeException("Quantity must be greater than 0");
        }

        if ("MARKET".equals(order.orderStyle)) {
            order.status = "EXECUTED";

            Trade trade = new Trade();
            trade.tradeId = "TRD" + System.currentTimeMillis();
            trade.orderId = order.orderId;
            trade.symbol = order.symbol;
            trade.quantity = order.quantity;
            trade.price = order.price;

            tradeService.addTrade(trade);
        } else {
            order.status = "PLACED";
        }

        orders.put(order.orderId, order);
        return order;
    }

    public Order getOrder(String id) {
        return orders.get(id);
    }
}
