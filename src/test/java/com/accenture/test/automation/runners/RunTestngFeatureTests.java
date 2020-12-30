package com.accenture.test.automation.runners;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import courgette.api.testng.TestNGCourgette;
import org.junit.runner.RunWith;

//https://github.com/prashant-ramcharan/courgette-jvm
@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 4,
        runLevel = CourgetteRunLevel.SCENARIO,
        rerunFailedScenarios = false,
        rerunAttempts = 1,
        showTestOutput = true,
        reportTitle = "Accenture - Test Result Report",
        reportTargetDir = "reports",
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features",
                glue = {"com.accenture.test.automation.steps",
                        "com.accenture.test.automation.hooks",
                        "com.accenture.fwk.hooks"},
                publish = true,
                plugin = {
                        "pretty",
                        "json:build/cucumber-report/cucumber.json",
                        "html:build/cucumber-report/cucumber.html",
                        "junit:build/cucumber-report/cucumber.xml"}
        ))
public class RunTestngFeatureTests extends TestNGCourgette {

}
