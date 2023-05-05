package com.farm.foy.service;

import com.farm.foy.repository.TemperatureRepository;
import com.farm.foy.repository.UserLogRepository;
import org.springframework.stereotype.Service;

@Service
public class MonitorService {

    private final TemperatureRepository tempRepository;
    private final UserLogRepository userLogRepository;

    public MonitorService(TemperatureRepository tempRepository, UserLogRepository userLogRepository) {
        this.tempRepository = tempRepository;
        this.userLogRepository = userLogRepository;
    }


}
