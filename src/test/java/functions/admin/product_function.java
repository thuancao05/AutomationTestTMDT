package functions.admin;


import functions.common_function;
import org.openqa.selenium.By;
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
    public int checkDataInTable(String titleName, String data){
        int row =  commonFunction.checkDataInTable(titleName,data,productPage.columnInTable, productPage.rowInTable);
        return row;
    }
    public void clickLogoutButton(){
        commonFunction.clicks(productPage.logoutButton);
    }
    public void clickEditButton(String titleName, String data){
        int row = checkDataInTable(titleName, data);
        commonFunction.clicks(By.xpath("//tbody/tr["+row+"]/td[6]/a[1]/button[1]"));
        commonFunction.sleep(5000);
    }
}