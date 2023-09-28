package functions;


import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.cart_page;

public class cart_function {
    public cart_page cartPage = new cart_page();
    public common_function commonFunction = new common_function();

    public void verifyRegisterPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(cartPage.titleGioHangLabel));
        System.out.println("Verified cart page");
    }

    public void clickOrderButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(cartPage.orderButton);
        commonFunction.sleep(1000);
    }

    public void checkProductInCart(String nameProduct, String quantityProduct){

    }

    // kiem tra du lieu trong bang theo ten cot
    public void checkDataInTable(String titleName, String data){
//        String str = commonFunction.getValue(By.xpath("//table/tbody/tr[2]/td[3]"));
//        System.out.println(str);
        commonFunction.checkDataInTable(titleName,data,cartPage.columnInTable, cartPage.rowInTable);
    }
}