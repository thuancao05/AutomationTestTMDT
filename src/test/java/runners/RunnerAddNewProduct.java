package runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features/addNewProduct.feature",
        glue = {"stepdefinitions",
                "functions",
                "pages",
                "hooks"
        },
        plugin = {"pretty", "html:target/cucumber-html-report.html"}
)
@Test
public class RunnerAddNewProduct extends AbstractTestNGCucumberTests{
}
