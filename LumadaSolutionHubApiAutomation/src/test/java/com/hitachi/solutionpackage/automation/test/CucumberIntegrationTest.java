package com.hitachi.solutionpackage.automation.test;

import org.junit.runner.RunWith;

import com.hitachi.solutionpackage.automation.test.SpringIntegrationTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",tags={"@Tag"})
public class CucumberIntegrationTest extends SpringIntegrationTest{
}