package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/order.feature",
        tags = "@SuccessfulOrder",
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
public class RunnerOrderFlow1 extends AbstractTestNGCucumberTests{
}
