package com.farm.foy.controller;

import com.farm.foy.entity.TokenRequest;
import com.farm.foy.service.PumpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/control")
public class PumpController {
    private final PumpService pumpService;

    public PumpController(PumpService pumpService) {
        this.pumpService = pumpService;
    }

    /**
     * this method is called by wemos d1 r1 module to retrieve activation timeout from server
     *
     * @return activate tokens
     */
    @GetMapping("/pump/state")
    public String getPumpState(@RequestParam(required = false) String temperature, @RequestParam(name = "token", required = false) String token) {
        log.info("temp = " + temperature + ", token = " + token);
        pumpService.setToken(Integer.parseInt(token));
        return String.valueOf(pumpService.getIsPumpOn());
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
