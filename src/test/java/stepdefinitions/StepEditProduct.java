package stepdefinitions;

import functions.admin.add_edit_Product_function;
import functions.admin.product_function;
import hooks.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepEditProduct {
    add_edit_Product_function addEditProductFunction;
    product_function productFunction;
    public StepEditProduct(TestContext testContext){
        addEditProductFunction = testContext.getAddEditProductFunction();
        productFunction = testContext.getProductFunction();
    }
    @Given("user click edit product button with product name is {string}")
    public void userClickEditProductButtonWithProductNameIs(String arg0) {
        productFunction.clickEditButton("Tên sản phẩm", arg0);
    }

    @Then("user should see an success update message {string}")
    public void userShouldSeeAnSuccessUpdateMessage(String arg0) {
        addEditProductFunction.checkSuccessUpdate(arg0);
        productFunction.clickLogoutButton();
    }

    @When("user input product describe is {string}")
    public void userInputProductDescribeIs(String arg0) {
        addEditProductFunction.inputDescribeProduct(arg0);
    }

    @When("user change product image with path {string}")
    public void userChangeProductImageWithPath(String arg0) {
        addEditProductFunction.uploadImage(arg0);
    }
}
