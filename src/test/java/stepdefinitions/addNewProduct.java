package stepdefinitions;

import functions.admin.addNewProduct_function;
import functions.admin.product_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addNewProduct {
    addNewProduct_function addNewProductFunction;
    product_function productFunction;
    public addNewProduct(TestContext testContext){
        addNewProductFunction = testContext.getAddNewProductFunction();
        productFunction = testContext.getProductFunction();
    }
    @Given("user click add new product button")
    public void userClickAddNewProductButton() {
        productFunction.clickAddNewProductButton();
    }

    @When("user input product information {string}, {string}, {string}, {string}, {string} , {string}")
    public void userInputProductInformation(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        addNewProductFunction.inputNameProduct(arg0);
        addNewProductFunction.inputDescribeProduct(arg1);
        addNewProductFunction.inputPriceProduct(arg2);
        addNewProductFunction.inputCategoryProduct(arg3);
        addNewProductFunction.inputQuantityProduct(arg4);
        addNewProductFunction.inputDateProduct(arg5);
    }

    @And("submit click add new product button")
    public void submitClickAddNewProductButton() {
        addNewProductFunction.clickSubmitAddNewProductButton();
    }

    @Then("the list product page display new product on top list products with name is {string}")
    public void theListProductPageDisplayNewProductOnTopListProductsWithNameIs(String arg0) {
        productFunction.checkDataInTable("Tên sản phẩm", arg0);

    }

    @When("user input product name is {string}")
    public void userInputProductNameIs(String arg0) {
        addNewProductFunction.inputNameProduct(arg0);
    }
    @Then("user should see an error name message bellow textbox product name {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductName(String arg0) {
        addNewProductFunction.checkErrorName(arg0);
    }

    @When("user input product price is {string}")
    public void userInputProductPriceIs(String arg0) {
        addNewProductFunction.inputPriceProduct(arg0);
    }

    @Then("user should see an error name message bellow textbox product price {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductPrice(String arg0) {
        addNewProductFunction.checkErrorPrice(arg0);
    }
}
