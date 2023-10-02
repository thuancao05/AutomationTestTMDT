package stepdefinitions;

import functions.*;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepOrder {
    login_function loginFunction ;
    index_function indexFunction ;
    detailProduct_function detailProductFunction;
    cart_function cartFunction;
    payment_function paymentFunction;
    public StepOrder(TestContext testContext){
        loginFunction = testContext.getLoginFunction();
        indexFunction = testContext.getIndexFunction();
        detailProductFunction = testContext.getDetailProductFunction();
        cartFunction = testContext.getCartFunction();
        paymentFunction = testContext.getPaymentFunction();

    }
    @When("user login with email {string} and password: {string}")
    public void userLoginWithEmailAndPassword(String arg0, String arg1) {
        loginFunction.inputEmail(arg0);
        loginFunction.inputPassword(arg1);
        loginFunction.clickLoginButton();
    }
    @And("select product {string} to order")
    public void selectProductToOrder(String arg0) {
        indexFunction.inputSearch(arg0);
        indexFunction.clickSearchButton();
        indexFunction.clickFirstProductAfterSearch();
        detailProductFunction.verifyDetailProductPage();
        detailProductFunction.inputQuantity("3");
        detailProductFunction.clickAddToCartButton();
        cartFunction.clickOrderButton();
    }
    @Then("user redirect to payment page {string}")
    public void userRedirectToPaymentPage(String arg0) {
        paymentFunction.verifyPaymentPage();
    }


    @When("user input name is {string}")
    public void userInputNameIs(String arg0) {
        paymentFunction.inputName(arg0);
    }

    @And("click submit button")
    public void clickSubmitButton() {
        paymentFunction.clickSubmitButton();
    }

    @Then("user should see an error name message bellow textbox name {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxName(String arg0) {
        paymentFunction.checkErrorName(arg0);
        indexFunction.clickLogOutButton();
    }
}
