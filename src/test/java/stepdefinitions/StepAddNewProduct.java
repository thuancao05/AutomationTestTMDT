package stepdefinitions;

import functions.admin.add_edit_Product_function;
import functions.admin.product_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepAddNewProduct {
    add_edit_Product_function addEditProduct;
    product_function productFunction;
    public StepAddNewProduct(TestContext testContext){
        addEditProduct = testContext.getAddEditProductFunction();
        productFunction = testContext.getProductFunction();
    }
    @Given("user click add new product button")
    public void userClickAddNewProductButton() {
        productFunction.clickAddNewProductButton();
    }


    @And("submit click add new product button")
    public void submitClickAddNewProductButton() {
        addEditProduct.clickSubmitAddNewProductButton();
    }

    @Then("the list product page display new product on top list products with name is {string}")
    public void theListProductPageDisplayNewProductOnTopListProductsWithNameIs(String arg0) {
        productFunction.checkDataInTable("Tên sản phẩm", arg0);
        productFunction.clickLogoutButton();
    }

    @When("user input product name is {string}")
    public void userInputProductNameIs(String arg0) {
        addEditProduct.inputNameProduct(arg0);
    }
    @Then("user should see an error name message bellow textbox product name {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductName(String arg0) {
        addEditProduct.checkErrorName(arg0);
    }

    @When("user input product price is {string}")
    public void userInputProductPriceIs(String arg0) {
        addEditProduct.inputPriceProduct(arg0);
    }

    @Then("user should see an error name message bellow textbox product price {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductPrice(String arg0) {
        addEditProduct.checkErrorPrice(arg0);
    }

    @When("user input product category is {string}")
    public void userInputProductCategoryIs(String arg0) {
        addEditProduct.inputCategoryProduct(arg0);
    }

    @Then("user should see an error name message bellow textbox product category {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductCategory(String arg0) {
        addEditProduct.checkErrorCategory(arg0);
    }

    @When("user input product quantity is {string}")
    public void userInputProductQuantityIs(String arg0) {
        addEditProduct.inputQuantityProduct(arg0);

    }

    @Then("user should see an error name message bellow textbox product quantity {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductQuantity(String arg0) {
        addEditProduct.checkErrorQuantity(arg0);
    }

    @When("user input product date of manufacture is {string}")
    public void userInputProductDateOfManufactureIs(String arg0) {
        addEditProduct.inputDateProduct(arg0);
    }

    @Then("user should see an error name message bellow textbox product date of manufacture {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductDateOfManufacture(String arg0) {
        addEditProduct.checkErrorDateOfManufacture(arg0);
    }

    @When("user not select image")
    public void userNotSelectImage() {

    }

    @Then("user should see an error name message bellow textbox product image {string}")
    public void userShouldSeeAnErrorNameMessageBellowTextboxProductImage(String arg0) {
        addEditProduct.checkErrorImage(arg0);
    }

    @When("user input product information {string}, {string}, {string}, {string}, {string} , {string} and path image {string}")
    public void userInputProductInformationAndPathImage(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) {
        addEditProduct.inputNameProduct(arg0);
        addEditProduct.uploadImage(arg6);
        addEditProduct.inputNameProduct(arg0);
        addEditProduct.inputDescribeProduct(arg1);
        addEditProduct.inputPriceProduct(arg2);
        addEditProduct.inputCategoryProduct(arg3);
        addEditProduct.inputQuantityProduct(arg4);
    }
}
