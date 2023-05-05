package com.farm.foy.repository;

import com.farm.foy.entity.PumpControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PumpControlRepository extends JpaRepository<PumpControl, Long> {
}
