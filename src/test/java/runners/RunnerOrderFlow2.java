package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/flowOrder2.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerOrderFlow2.html",
                "json:target/cucumber-reports/RunnerOrderFlow2.json"
        })
@Test
public class RunnerOrderFlow2 extends AbstractTestNGCucumberTests{
}
