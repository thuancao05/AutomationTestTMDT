package functions.admin;


import functions.common_function;
import org.testng.Assert;
import pages.admin.products_page;

public class product_function {
    public products_page productPage = new products_page();
    public common_function commonFunction = new common_function();

    public void verifyAdminProductPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(productPage.logo));
        System.out.println("Verified add new product page");
    }

    public void clickAddNewProductButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(productPage.addProductButton);
        commonFunction.sleep(1000);

    }


    // kiem tra du lieu trong bang theo ten cot
    public void checkDataInTable(String titleName, String data){
        commonFunction.checkDataInTable(titleName,data,productPage.columnInTable, productPage.rowInTable);
        commonFunction.clicks(productPage.logoutButton);
    }
}