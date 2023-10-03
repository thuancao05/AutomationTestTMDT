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
    }

    @When("user input phone is {string}")
    public void userInputPhoneIs(String arg0) {
        paymentFunction.inputPhone(arg0);
    }

    @Then("user should see an error phone message bellow textbox phone {string}")
    public void userShouldSeeAnErrorPhoneMessageBellowTextboxPhone(String arg0) {
        paymentFunction.checkErrorPhone(arg0);
    }

    @When("user input email is {string}")
    public void userInputEmailIs(String arg0) {
        paymentFunction.inputEmail(arg0);
    }

    @Then("user should see an error email message bellow textbox email {string}")
    public void userShouldSeeAnErrorEmailMessageBellowTextboxEmail(String arg0) {
        paymentFunction.checkErrorEmail(arg0);
    }

    @When("user input address is {string}")
    public void userInputAddressIs(String arg0) {
        paymentFunction.inputAddress(arg0);
    }

    @Then("user should see an error address message bellow textbox address {string}")
    public void userShouldSeeAnErrorAddressMessageBellowTextboxAddress(String arg0) {
        paymentFunction.checkErrorAddress(arg0);
    }

    @When("user input address is {string}, {string}, {string}, {string}, {string}")
    public void userInputAddressIs(String arg0, String arg1, String arg2, String arg3, String arg4) {
        paymentFunction.inputAddress(arg0);
        paymentFunction.selectCity(arg1);
        paymentFunction.selectDistrict(arg2);
        paymentFunction.selectWard(arg3);
        paymentFunction.inputNote(arg4);
    }

    @Then("user should see an order success message {string}")
    public void userShouldSeeAnOrderSuccessMessage(String arg0) {
        paymentFunction.checkOrderSuccess(arg0);
    }
}
