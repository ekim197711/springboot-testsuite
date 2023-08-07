package com.space.springboottestsuite.space;


import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags({"service"})
@SelectPackages({"com.space.springboottestsuite.space.crew", "com.space.springboottestsuite.space.ship"})
public class ServiceSuite {

}
