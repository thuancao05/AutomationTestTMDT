package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/addProductToCart.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-reports/RunnerAddToCart.html",
                "json:target/cucumber-reports/RunnerAddToCart.json"
        })
@Test
public class RunnerAddToCart extends AbstractTestNGCucumberTests{
}
