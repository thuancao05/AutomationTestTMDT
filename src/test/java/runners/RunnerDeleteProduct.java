package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/deleteProduct.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerDeleteProduct.html",
                "json:target/cucumber-reports/RunnerDeleteProduct.json"
        })
@Test
public class RunnerDeleteProduct extends AbstractTestNGCucumberTests{
}
