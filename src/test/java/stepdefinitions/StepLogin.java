package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.WebUI;

import functions.login_function;
import functions.index_function;
import hooks.TestContext;

public class StepLogin {
    login_function loginFunction ;
    index_function indexFunction ;

    public StepLogin(TestContext testContext){
        loginFunction = testContext.getLoginFunction();
        indexFunction = testContext.getIndexFunction();
    }

    @Given("user navigate to Login page {string}")
    public void userNavigateToLoginPage(String arg0) {
        WebUI.openURL(arg0);

    }

    @When("user enter email {string} and password: {string}")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        loginFunction.inputEmail(arg0);
        loginFunction.inputPassword(arg1);
    }

    @And("click login button")
    public void clickLoginButton() {
        loginFunction.clickLoginButton();
    }


    @And("user click logout button")
    public void userClickLogoutButton() {
        indexFunction.clickLogOutButton();
    }





    @Then("user should see an error login message {string}")
    public void userShouldSeeAnErrorLoginMessage(String arg0) {
        loginFunction.checkErrorLogin(arg0);
    }

}
