package com.accenture.test.automation.runners;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import courgette.api.testng.TestNGCourgette;
import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.accenture.test.automation.steps",
                "com.accenture.test.automation.hooks",
                "com.accenture.fwk.hooks"},
        plugin = { "pretty","json:target/cucumber-json/cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},
        dryRun = false,
        monochrome = true)

public class RunCucumberFeatureTests {
}
