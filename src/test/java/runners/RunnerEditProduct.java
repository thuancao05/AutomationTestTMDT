package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/editProduct.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerEditProduct.html",
                "json:target/cucumber-reports/RunnerEditProduct.json"
        })
@Test
public class RunnerEditProduct extends AbstractTestNGCucumberTests{
}
