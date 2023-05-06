package com.farm.foy.controller;

import com.farm.foy.service.MonitorService;
import com.farm.foy.service.PumpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
@RequestMapping("/monitor")
public class MonitorController {

    private final MonitorService monitorService;
    private final PumpService pumpService;

    public MonitorController(MonitorService monitorService, PumpService pumpService) {
        this.monitorService = monitorService;
        this.pumpService = pumpService;
    }

    @GetMapping
    public String monitor(Model model, @RequestParam(name = "temperature", required = false) String temperature) {
        if (temperature == null) {
            //TODO: get temp
        }
        log.info("temperature = " + temperature);
        model.addAttribute("pumpActive", pumpService.peekPumpState());
        model.addAttribute("temperature", temperature);
        return "farm-monitor";
    }

}
