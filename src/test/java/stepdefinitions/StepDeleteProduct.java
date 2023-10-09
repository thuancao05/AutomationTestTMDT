package stepdefinitions;

import functions.admin.add_edit_Product_function;
import functions.admin.product_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDeleteProduct {
    product_function productFunction;
    public StepDeleteProduct(TestContext testContext){
        productFunction = testContext.getProductFunction();
    }
    @Given("user stay at products page")
    public void userStayAtProductsPage() {
    }

    @When("user click delete product button with product name is {string}")
    public void userClickDeleteProductButtonWithProductNameIs(String arg0) {
        productFunction.clickDeleteButton("Tên sản phẩm", arg0);
    }

    @Then("user should see an success delete message {string}")
    public void userShouldSeeAnSuccessDeleteMessage(String arg0) {
        productFunction.checkDeleteSuccess(arg0);
    }

    @And("user press Accept Alert to confirm deletion")
    public void userPressAcceptAlertToConfirmDeletion() {
        productFunction.pressAcceptAlert();
    }
}
