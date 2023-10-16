package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/search.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerSearch.html",
                "json:target/cucumber-reports/RunnerSearch.json"
        })
@Test
public class RunnerSearch extends AbstractTestNGCucumberTests{
}
