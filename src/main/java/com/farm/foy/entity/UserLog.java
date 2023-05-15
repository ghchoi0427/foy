package com.farm.foy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@RequiredArgsConstructor
@Table(name = "USER_LOG")
@Getter
@Setter
public class UserLog {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    Long id;
    @Column(name = "IP_ADDR")
    String ipAddr;
    @Column(name = "DEVICE")
    String device;
    @Column(name = "TIME")
    LocalDateTime time;
}
