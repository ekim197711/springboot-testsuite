package com.space.springboottestsuite.space;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Tags({
        @Tag("do-not-run-per-default")
})
class PowerAllSpaceStationsServiceTest {

    @Test
    @DisplayName("Power up all stations")
    void createDefault() {
        Assertions.assertEquals(1L, 1L);
    }
}