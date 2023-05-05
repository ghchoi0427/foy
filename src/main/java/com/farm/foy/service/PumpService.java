package com.farm.foy.service;

import com.farm.foy.entity.PumpControl;
import com.farm.foy.repository.PumpControlRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PumpService {

    private final PumpControlRepository pumpRepository;

    public PumpService(PumpControlRepository pumpRepository) {
        this.pumpRepository = pumpRepository;
    }

    private String isPumpOn = "N";

    public void pumpOn() {
        this.isPumpOn = "Y";
    }

    public void pumpOff() {
        this.isPumpOn = "N";
    }

    public String getIsPumpOn() {
        pumpRepository.save(PumpControl.builder()
                .active(this.isPumpOn)
                .time(LocalDateTime.now())
                .build());
        return isPumpOn;
    }

    public String peekPumpState() {
        return isPumpOn;
    }

}
