package functions;


import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.cart_page;

public class cart_function {
    public cart_page cartPage = new cart_page();
    public common_function commonFunction = new common_function();

    public void verifyCartPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(cartPage.titleGioHangLabel));
        System.out.println("Verified cart page");
    }

    public void clickOrderButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(cartPage.orderButton);
        commonFunction.sleep(1000);
    }


    // kiem tra du lieu trong bang theo ten cot
    public void checkDataInTable(String titleName, String data){
        commonFunction.checkDataInTable(titleName,data,cartPage.columnInTable, cartPage.rowInTable);
        commonFunction.clearSession();
    }
}