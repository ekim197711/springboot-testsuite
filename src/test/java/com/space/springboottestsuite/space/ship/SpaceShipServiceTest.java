package com.space.springboottestsuite.space.ship;

import com.space.springboottestsuite.space.SpaceShip;
import com.space.springboottestsuite.space.SpaceShipService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tags({
        @Tag("spaceship"),
        @Tag("service"),
})
class SpaceShipServiceTest {

    @Autowired
    SpaceShipService service;

    @Test
    void createDefault() {
        SpaceShip aDefault = service.createDefault();
        Assertions.assertEquals(10L, aDefault.getFuelleft());
    }
}