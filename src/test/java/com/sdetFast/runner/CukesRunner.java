package com.sdetFast.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(



        features = "src/test/resources/features",
        glue = "com/sdetFast/step_definitions",

        dryRun = false,
        tags = "@wip",
       plugin = {"json:target/cucumber.json",
                 "json:target/rerun.txt",
           "html:target/cucumber-report.html"}
)
public class CukesRunner {
}
