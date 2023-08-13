package com.space.springboottestsuite.refuel;

import com.space.springboottestsuite.RefuelService;
import com.space.springboottestsuite.space.SpaceShip;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "my-config.we-are-testing", havingValue = "true")
public class RefuelServiceForTest extends RefuelService {
    public SpaceShip refuelShip(SpaceShip ship) {
        ship.setFuelleft(95L);
        return ship;
    }
}
