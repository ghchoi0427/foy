package com.farm.foy.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "TEMPERATURE")
@Getter
@Setter
@RequiredArgsConstructor
public class Temperature {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    Long id;
    @Column(name = "TEMP")
    String temp;
    @Column(name = "TIME")
    LocalDateTime time;
}
