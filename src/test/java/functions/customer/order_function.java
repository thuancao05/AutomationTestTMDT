package functions.customer;

import driver.DriverManager;
import functions.common_function;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.customer.orders_page;

public class order_function {
    public orders_page ordersPage = new orders_page();
    public common_function commonFunction = new common_function();

    public void clickLogoutButton(){
        commonFunction.clicks(ordersPage.logoutButton);
    }
}