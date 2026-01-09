package com.example.trading.service;

import com.example.trading.model.Instrument;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class InstrumentService {

    public List<Instrument> getInstruments() {
        List<Instrument> list = new ArrayList<>();
        list.add(new Instrument("TCS", "NSE", "EQUITY", 3500));
        list.add(new Instrument("INFY", "NSE", "EQUITY", 1600));
        return list;
    }
}
