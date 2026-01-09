package com.example.trading.controller;

import com.example.trading.model.Trade;
import com.example.trading.service.TradeService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class TradeController {

    private final TradeService service;

    public TradeController(TradeService service) {
        this.service = service;
    }

    @GetMapping("/trades")
    public List<Trade> getTrades() {
        return service.getTrades();
    }
}
