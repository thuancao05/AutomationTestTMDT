package hooks;
import driver.DriverFactory;
import driver.DriverManager;
import functions.*;
import functions.admin.add_edit_Product_function;
import functions.admin.product_function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import utils.LogUtils;

public class TestContext {

    private WebDriver driver;
    private common_function commonFunction;
    private login_function loginFunction;
    private index_function indexFunction;
    private register_function registerFunction;
    private detailProduct_function detailProductFunction;
    private cart_function cartFunction;
    private payment_function paymentFunction;
    private add_edit_Product_function addNewProductFunction;
    private product_function productFunction;

    public TestContext() {
        ThreadGuard.protect(new DriverFactory().createDriver());
        LogUtils.info("Driver in TestContext: " + getDriver());
    }
    public common_function getCommonFunction() {
        if (commonFunction == null) {
            commonFunction = new common_function();
        }
        return commonFunction;
    }

    public login_function getLoginFunction() {
        if (loginFunction == null) {
            loginFunction = new login_function();
        }
        return loginFunction;
    }
    public index_function getIndexFunction() {
        if (indexFunction == null) {
            indexFunction = new index_function();
        }
        return indexFunction;
    }
    public register_function getRegisterFunction() {
        if (registerFunction == null) {
            registerFunction = new register_function();
        }
        return registerFunction;
    }
    public detailProduct_function getDetailProductFunction() {
        if (detailProductFunction == null) {
            detailProductFunction = new detailProduct_function();
        }
        return detailProductFunction;
    }

    public cart_function getCartFunction() {
        if (cartFunction == null) {
            cartFunction = new cart_function();
        }
        return cartFunction;
    }

    public payment_function getPaymentFunction() {
        if (paymentFunction == null) {
            paymentFunction = new payment_function();
        }
        return paymentFunction;
    }

    public add_edit_Product_function getAddEditProductFunction() {
        if (addNewProductFunction == null) {
            addNewProductFunction = new add_edit_Product_function();
        }
        return addNewProductFunction;
    }
    public product_function getProductFunction() {
        if (productFunction == null) {
            productFunction = new product_function();
        }
        return productFunction;
    }
    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }
}
