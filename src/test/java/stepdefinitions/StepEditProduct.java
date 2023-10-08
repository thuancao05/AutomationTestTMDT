package stepdefinitions;

import functions.admin.addNewProduct_function;
import functions.admin.product_function;
import hooks.TestContext;
import io.cucumber.java.en.Given;

public class StepEditProduct {
    addNewProduct_function addNewProductFunction;
    product_function productFunction;
    public StepEditProduct(TestContext testContext){
        addNewProductFunction = testContext.getAddNewProductFunction();
        productFunction = testContext.getProductFunction();
    }
    @Given("user click edit product button with product name is {string}")
    public void userClickEditProductButtonWithProductNameIs(String arg0) {
        productFunction.clickEditButton("Tên sản phẩm", arg0);
    }
}
