package com.example.trading.controller;

import com.example.trading.model.PortfolioItem;
import com.example.trading.service.PortfolioService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class PortfolioController {

    private final PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping("/portfolio")
    public List<PortfolioItem> getPortfolio() {
        return service.getPortfolio();
    }
}
