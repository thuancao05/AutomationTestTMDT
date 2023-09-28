package stepdefinitions;

import functions.index_function;
import functions.login_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepSearch {
    index_function indexFunction ;

    public StepSearch(TestContext testContext){
        indexFunction = testContext.getIndexFunction();

    }
    @When("user enter search value: {string}")
    public void userEnterSearchValue(String arg0) {
        indexFunction.inputSearch(arg0);
    }

    @And("click search button")
    public void clickSearchButton() {
        indexFunction.clickSearchButton();
    }

    @Then("user should see list products with name include {string}")
    public void userShouldSeeListProductsWithNameInclude(String arg0) {
        indexFunction.checkProductNameIncludeSearchValue(arg0);
    }
}
