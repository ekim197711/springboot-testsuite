package com.space.springboottestsuite;

import com.space.springboottestsuite.refuel.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({MyConfig.class})
public class SpringbootTestsuiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestsuiteApplication.class, args);
    }

}
