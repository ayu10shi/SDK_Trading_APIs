package com.example.trading.controller;

import com.example.trading.service.InstrumentService;
import com.example.trading.model.Instrument;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1")
public class InstrumentController {

    private final InstrumentService service;

    public InstrumentController(InstrumentService service) {
        this.service = service;
    }

    @GetMapping("/instruments")
    public List<Instrument> getInstruments() {
        return service.getInstruments();
    }
}
