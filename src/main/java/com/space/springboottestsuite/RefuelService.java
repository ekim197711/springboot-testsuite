package com.space.springboottestsuite;

import com.space.springboottestsuite.space.SpaceShip;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@ConditionalOnProperty(name = "my-config.we-are-testing", havingValue = "false")
public class RefuelService {
    public SpaceShip refuelShip(SpaceShip ship) {
        RestTemplate rt = new RestTemplate();
        return rt.postForObject("http://localhost:8080/refuel", ship, SpaceShip.class);
    }
}
