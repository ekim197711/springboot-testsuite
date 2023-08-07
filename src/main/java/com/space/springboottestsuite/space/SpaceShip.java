package com.space.springboottestsuite.space;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShip {
    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private Long fuelleft;
}
