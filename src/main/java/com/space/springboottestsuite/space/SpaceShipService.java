package com.space.springboottestsuite.space;

import org.springframework.stereotype.Service;

@Service
public class SpaceShipService {
    public SpaceShip createDefault() {
        return new SpaceShip(null, "Falcon", 10L);
    }
}
