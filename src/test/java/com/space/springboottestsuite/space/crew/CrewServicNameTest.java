package com.space.springboottestsuite.space.crew;

import com.space.springboottestsuite.space.Crew;
import com.space.springboottestsuite.space.CrewService;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tags({
        @Tag("crew"),
        @Tag("service"),
})
class CrewServicNameTest {

    @Autowired
    CrewService crewService;

    @Test
    @DisplayName("Make sure that name is John doe begin with")
    void createDefault() {
        Crew aDefault = crewService.createDefault();
        Assertions.assertEquals("John Doe", aDefault.getName());

    }
}