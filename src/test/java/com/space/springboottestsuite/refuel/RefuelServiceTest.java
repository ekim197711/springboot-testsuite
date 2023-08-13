package com.space.springboottestsuite.refuel;

import com.space.springboottestsuite.RefuelService;
import com.space.springboottestsuite.space.SpaceShip;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ActiveProfiles("test")
class RefuelServiceTest {

    @Autowired
    RefuelService refuelService;

    @Test
    void refuelShip() {
        SpaceShip ship = new SpaceShip(1L, "Falcon", 7L);
        SpaceShip spaceShip = refuelService.refuelShip(ship);
        System.out.println(spaceShip);
        Assertions.assertTrue(spaceShip.getFuelleft() > 90);
    }
}