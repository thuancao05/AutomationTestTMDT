package functions.admin;


import driver.DriverManager;
import functions.common_function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.admin.add_edit_Product_page;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static java.time.Duration.ofSeconds;

public class add_edit_Product_function {
    public add_edit_Product_page addEditProductPage = new add_edit_Product_page();
    public common_function commonFunction = new common_function();

    public void clickSubmitAddNewProductButton() {
        commonFunction.sleep(500);
        commonFunction.clicks(addEditProductPage.submitButton);
        commonFunction.sleep(500);

    }
    public void inputNameProduct(String str) {
        commonFunction.sendKeys(addEditProductPage.nameInput, str);
        commonFunction.sleep(500);
    }
    public void inputDescribeProduct(String str) {
        commonFunction.sendKeys(addEditProductPage.describeInput, str);
        commonFunction.sleep(500);
    }
    public void inputPriceProduct(String str) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='priceInput']"));
        element.click();
        for (int i = 1; i <= 10; i++){
            commonFunction.press(Keys.BACK_SPACE);
        }
        commonFunction.sendKeys(addEditProductPage.priceInput, str);
        commonFunction.sleep(500);
    }
    public void inputCategoryProduct(String str) {
        if(commonFunction.isDisplayed(addEditProductPage.categoryInput)){
            commonFunction.sendKeys(addEditProductPage.categoryInput, str);
        }

        else {
            commonFunction.sendKeys(addEditProductPage.categoryChange, str);

        }
        commonFunction.press(Keys.ENTER);
        commonFunction.sleep(500);
    }
    public void inputQuantityProduct(String str) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='quantityInput']"));
        element.click();
        for (int i = 1; i <= 10; i++){
            commonFunction.press(Keys.BACK_SPACE);
        }
        commonFunction.sendKeys(addEditProductPage.quantityInput, str);
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
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorNameMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorNameMessage));
        }
    }
    public void checkErrorPrice(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorPriceMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorPriceMessage));
        }
    }
    public void checkErrorCategory(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorCategoryMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorCategoryMessage));
        }
    }
    public void checkErrorQuantity(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorQuantityMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorQuantityMessage));
        }
    }
    public void checkErrorDateOfManufacture(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorDateMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorDateMessage));
        }
    }
    public void checkErrorImage(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(addEditProductPage.errorImageMessage));
            commonFunction.clicks(addEditProductPage.logoutButton);
        }catch (Exception e) {
            commonFunction.clicks(addEditProductPage.logoutButton);
            Assert.assertTrue(commonFunction.isDisplayed(addEditProductPage.errorImageMessage));
        }
    }

    public void uploadImage(String path){
        commonFunction.sleep(1000);
        commonFunction.clicks(addEditProductPage.chooseImageButton);
        String filePath = path;

        // Khởi tạo Robot class
        Robot rb = null;
        try {
            rb = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // Copy File path vào Clipboard
        StringSelection str = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        commonFunction.sleep(1000);
        // Nhấn Control+V để dán
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);


        commonFunction.sleep(1000);

        // Nhấn Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        commonFunction.sleep(3000);
        commonFunction.clicks(addEditProductPage.uploadImageButton);
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(addEditProductPage.successfulUploadImageMessage));
        commonFunction.isDisplayed(addEditProductPage.successfulUploadImageMessage);
    }

    public void checkSuccessUpdate(String str){
        commonFunction.isDisplayed(addEditProductPage.successfulUpdateMessage);
    }
}