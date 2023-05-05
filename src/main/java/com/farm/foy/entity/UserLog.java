package com.farm.foy.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class UserLog {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "IP_ADDR")
    String ipAddr;
    @Column(name = "DEVICE")
    String device;
    @Column(name = "TIME")
    LocalDateTime time;
}
