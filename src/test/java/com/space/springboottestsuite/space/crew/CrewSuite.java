package com.space.springboottestsuite.space.crew;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags({"crew"})
@SelectPackages({"com.space.springboottestsuite.space"})
public class CrewSuite {

}
