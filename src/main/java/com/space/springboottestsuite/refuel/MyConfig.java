package com.space.springboottestsuite.refuel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("my-config")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MyConfig {
    private String weAreTesting;
}
