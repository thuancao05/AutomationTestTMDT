package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/createProduct.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerCreateProduct.html",
                "json:target/cucumber-reports/RunnerCreateProduct.json"
        }
)
@Test
public class RunnerCreateProduct extends AbstractTestNGCucumberTests{
}
