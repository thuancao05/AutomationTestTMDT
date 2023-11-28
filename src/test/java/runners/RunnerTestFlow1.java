package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/testFlow1.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerOrderFlow1.html",
                "json:target/cucumber-reports/RunnerOrderFlow1.json"
        })
@Test
public class RunnerTestFlow1 extends AbstractTestNGCucumberTests{
}
