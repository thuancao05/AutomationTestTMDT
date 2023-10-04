package functions.admin;


import functions.common_function;
import org.testng.Assert;
import pages.admin.addNewProduct_page;
import pages.admin.products_page;

public class addNewProduct_function {
    public addNewProduct_page addNewProductPage = new addNewProduct_page();
    public common_function commonFunction = new common_function();

    public void clickSubmitAddNewProductButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(addNewProductPage.submitButton);
    }
    public void inputNameProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.nameInput, str);
        commonFunction.sleep(500);
    }
    public void inputDescribeProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.describeInput, str);
        commonFunction.sleep(500);
    }
    public void inputPriceProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.priceInput, str);
        commonFunction.sleep(500);
    }
    public void inputCategoryProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.categoryInput, str);
        commonFunction.sleep(500);
    }
    public void inputQuantityProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.quantityInput, str);
        commonFunction.sleep(500);
    }
    public void inputDateProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.dateInput, str);
        commonFunction.sleep(500);
    }
    // kiem tra du lieu trong bang theo ten cot
//    public void checkDataInTable(String titleName, String data){
//        commonFunction.checkDataInTable(titleName,data,cartPage.columnInTable, cartPage.rowInTable);
//        commonFunction.clearSession();
//    }
}