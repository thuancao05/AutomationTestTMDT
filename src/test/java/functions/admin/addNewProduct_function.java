package functions.admin;


import driver.DriverManager;
import functions.common_function;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.admin.addNewProduct_page;
import pages.admin.products_page;

public class addNewProduct_function {
    public addNewProduct_page addNewProductPage = new addNewProduct_page();
    public common_function commonFunction = new common_function();

    public void clickSubmitAddNewProductButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(addNewProductPage.submitButton);
        commonFunction.sleep(1000);

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
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='priceInput']"));
        element.click();
        for (int i = 1; i <= 10; i++){
            commonFunction.press(Keys.BACK_SPACE);
        }
        commonFunction.sendKeys(addNewProductPage.priceInput, str);
        commonFunction.sleep(500);
    }
    public void inputCategoryProduct(String str) {
        commonFunction.sendKeys(addNewProductPage.categoryInput, str);
        commonFunction.press(Keys.ENTER);
        commonFunction.sleep(500);
    }
    public void inputQuantityProduct(String str) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='quantityInput']"));
        element.click();
        for (int i = 1; i <= 10; i++){
            commonFunction.press(Keys.BACK_SPACE);
        }
        commonFunction.sendKeys(addNewProductPage.quantityInput, str);
        commonFunction.sleep(500);
    }
    public void inputDateProduct(String str) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='dateInput']"));
        element.click();
        for (int i = 1; i <= 10; i++){
            commonFunction.press(Keys.BACK_SPACE);
            commonFunction.press(Keys.DELETE);
        }
        element.sendKeys(str);
        commonFunction.press(Keys.ENTER);
        commonFunction.sleep(500);
    }
    public void checkErrorName(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorNameMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorNameMessage));
        }
    }
    public void checkErrorPrice(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorPriceMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorPriceMessage));
        }
    }
    public void checkErrorCategory(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorCategoryMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorCategoryMessage));
        }
    }
    public void checkErrorQuantity(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorQuantityMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorQuantityMessage));
        }
    }
    public void checkErrorDateOfManufacture(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorDateMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorDateMessage));
        }
    }
    public void checkErrorImage(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorImageMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorImageMessage));
        }
    }

    public void uploadImage(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addNewProductPage.errorImageMessage));
            commonFunction.clicks(addNewProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addNewProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addNewProductPage.errorImageMessage));
        }
    }
}