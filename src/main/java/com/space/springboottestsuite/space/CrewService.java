package com.space.springboottestsuite.space;


import org.springframework.stereotype.Service;

@Service
public class CrewService {
    public Crew createDefault() {
        return new Crew(null, "John Doe", 1L);
    }
}
