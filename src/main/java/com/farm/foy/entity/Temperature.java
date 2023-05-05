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
public class Temperature {
    @Id
    @GeneratedValue
    Long id;
    @Column(name = "TEMP")
    String temp;
    @Column(name = "TIME")
    LocalDateTime time;
}
