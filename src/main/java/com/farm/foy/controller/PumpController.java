package com.farm.foy.controller;

import com.farm.foy.service.PumpService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/control")
public class PumpController {
    private final PumpService pumpService;

    public PumpController(PumpService pumpService) {
        this.pumpService = pumpService;
    }

    @GetMapping("/pump/state")
    public String getPumpState() {
        return pumpService.getIsPumpOn();
    }

    @PostMapping("/pump/on")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pumpOn() {
        pumpService.pumpOn();
    }

    @PostMapping("/pump/off")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pumpOff() {
        pumpService.pumpOff();
    }
}
