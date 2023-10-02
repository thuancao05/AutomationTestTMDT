package stepdefinitions;

import functions.index_function;
import functions.login_function;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.WebUI;
import functions.register_function;
import hooks.TestContext;
public class CommonSteps {
    login_function loginFunction ;
    index_function indexFunction ;
    register_function registerFunction ;

    public CommonSteps(TestContext testContext){
        loginFunction = testContext.getLoginFunction();
        indexFunction = testContext.getIndexFunction();
        registerFunction = testContext.getRegisterFunction();

    }
    @Then("user should see an error email message {string}")
    public void userShouldSeeAnErrorEmailMessage(String arg0) {
        loginFunction.checkErrorEmail(arg0);
    }

    @Then("user should see an error password message {string}")
    public void userShouldSeeAnErrorPasswordMessage(String arg0) {
        loginFunction.checkErrorPassword(arg0);
    }

    @Then("user should see an error name message {string}")
    public void userShouldSeeAnErrorNameMessage(String arg0) {
        registerFunction.checkErrorName(arg0);
    }

    @Then("user should see an error phone message {string}")
    public void userShouldSeeAnErrorPhoneMessage(String arg0) {
        registerFunction.checkErrorPhone(arg0);

    }

    @Then("user should see an error register message {string}")
    public void userShouldSeeAnErrorRegisterMessage(String arg0) {
        registerFunction.checkErrorRegister(arg0);

    }
    @Given("user redirect to index page {string}")
    public void userRedirectToIndexPage(String arg0) {
        WebUI.openURL(arg0);
        indexFunction.verifyLogoIndexPage();
    }
    @Given("user stay at payment page")
    public void userStayAtPaymentPage() {
    }
}
