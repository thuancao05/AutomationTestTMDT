package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import keywords.WebUI;
import functions.register_function;
import hooks.TestContext;
public class StepRegister {
    register_function registerFunction ;

    public StepRegister(TestContext testContext){
        registerFunction = testContext.getRegisterFunction();

    }
    @Given("user navigate to register page {string}")
    public void userNavigateToRegisterPage(String arg0) {
        WebUI.openURL(arg0);
        registerFunction.verifyRegisterPage();
    }

    @When("user enter name: {string}, phone: {string} email {string} and password: {string}")
    public void userEnterNamePhoneEmailAndPassword(String arg0, String arg1, String arg2, String arg3) {
        registerFunction.inputName(arg0);
        registerFunction.inputPhone(arg1);
        registerFunction.inputEmail(arg2);
        registerFunction.inputPassword(arg3);
    }

    @And("click register button")
    public void clickRegisterButton() {
        registerFunction.clickRegisterButton();
    }

    @Then("user should see an success message {string}")
    public void userShouldSeeAnSuccessMessage(String arg0) {
        registerFunction.checkSuccessfulRegister(arg0);
    }
}
