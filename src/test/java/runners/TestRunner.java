package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features ="src/test/resources/features/",
                glue = "stepDefinations",
                dryRun = false,
                monochrome = true,
                plugin = {"pretty","html:test-output.html","json:target/cucumber.json","junit:target/cucumberxml.xml","rerun:target/rerun.txt" }
         )

public class TestRunner {
}
