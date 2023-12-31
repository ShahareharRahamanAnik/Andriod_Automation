package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src\\test\\resources\\Feature\\1Android.feature",
        "src/test/resources/Feature/2Andriod.feature",
        "src/test/resources/Feature/3Andriod.feature",
        "src/test/resources/Feature/4Andriod.feature"},
        glue = {"StepDefinition"}, monochrome = true, dryRun = false, // runs feature file from class, so false to stop
        plugin = {
                "pretty", "html:build/reports/feature.html"
        }
)
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
