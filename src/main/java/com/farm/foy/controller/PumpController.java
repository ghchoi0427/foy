package com.farm.foy.controller;

import com.farm.foy.entity.TokenRequest;
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

    /**
     * this method is called by wemos d1 r1 module to retrieve activation timeout from server
     * @return activate tokens
     */
    @GetMapping("/pump/state")
    public int getPumpState() {
        return pumpService.getIsPumpOn();
    }

    @PostMapping("/pump/on")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pumpOn(@RequestBody TokenRequest token) {
        pumpService.pumpOn(token.getToken());
    }

    @PostMapping("/pump/off")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void pumpOff() {
        pumpService.pumpOff();
    }
}
