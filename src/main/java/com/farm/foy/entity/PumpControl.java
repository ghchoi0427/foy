package com.farm.foy.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@Table(name = "PUMP_CONTROL")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class PumpControl {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "ACTIVE", length = 1) // "Y" or "N"
    String active;
    @Column(name = "TIME")
    LocalDateTime time;
}
