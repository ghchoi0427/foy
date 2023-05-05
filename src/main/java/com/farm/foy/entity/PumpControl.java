package com.farm.foy.entity;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PumpControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "ACTIVE", length = 1) // "Y" or "N"
    String active;
    @Column(name = "TIME")
    LocalDateTime time;
}
