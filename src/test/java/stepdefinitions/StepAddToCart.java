package stepdefinitions;

import functions.cart_function;
import functions.detailProduct_function;
import functions.index_function;
import hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepAddToCart {
    detailProduct_function detailProductFunction;
    index_function indexFunction;
    cart_function cartFunction;

    public StepAddToCart(TestContext testContext){
        detailProductFunction = testContext.getDetailProductFunction();
        indexFunction = testContext.getIndexFunction();
        cartFunction = testContext.getCartFunction();

    }
    @Given("user click to view detail one product")
    public void userClickToViewDetailOneProduct() {
        indexFunction.clickFirstProductAfterSearch();
        detailProductFunction.verifyDetailProductPage();
    }

    @When("user select {string} to add product to cart")
    public void userSelectToAddProductToCart(String arg0) {
        detailProductFunction.inputQuantity(arg0);
    }

    @And("click add to cart button")
    public void clickAddToCartButton() {
        detailProductFunction.clickAddToCartButton();
    }

    @Then("the cart page displayed product added with {string}")
    public void theCartPageDisplayedProductAddedWith(String arg0) {
        cartFunction.checkDataInTable("Tên sản phẩm", "Điện Trở Băng A07 ( Trở Thanh )");
    }
}
