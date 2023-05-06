package com.farm.foy.service;

import com.farm.foy.entity.PumpControl;
import com.farm.foy.repository.PumpControlRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Getter
@Setter
public class PumpService {

    private final PumpControlRepository pumpRepository;

    public PumpService(PumpControlRepository pumpRepository) {
        this.pumpRepository = pumpRepository;
    }

    private int token = 0;
    private String pumpStatus = "-";

    public void pumpOn(int token) {
        this.pumpStatus = "Y";
        this.token = token;
    }

    public void pumpOff() {
        this.pumpStatus = "N";
        this.token = 0;
    }

    public int getIsPumpOn() {
        pumpRepository.save(PumpControl.builder()
                .active(pumpStatus)
                .time(LocalDateTime.now())
                .build());
        return token;
    }

    public String peekPumpState() {
        return pumpStatus;
    }

}
