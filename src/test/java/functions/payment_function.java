package functions;

import driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.payment_page;

public class payment_function {
    public payment_page paymentPage = new payment_page();
    public common_function commonFunction = new common_function();
    public index_function indexFunction = new index_function();

    public void verifyPaymentPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(paymentPage.titleThanhToanDonHangLabel));
        System.out.println("Verified payment page");
    }

    public void clickSubmitButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(paymentPage.submitButton);
        commonFunction.sleep(1000);
    }

    public void inputName(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.nameInput, str);
    }
    public void inputPhone(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.phoneInput, str);
    }
    public void inputEmail(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.emailInput, str);
    }
    public void inputAddress(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.addressInput, str);
    }
    public void inputNote(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.noteInput, str);
    }
    public void selectCity(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.citySelect, str);
        commonFunction.press(Keys.ENTER);
    }
    public void selectDistrict(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.districtSelect, str);
        commonFunction.press(Keys.ENTER);
    }
    public void selectWard(String str) {
        commonFunction.sleep(1000);
        commonFunction.sendKeys(paymentPage.wardSelect, str);
        commonFunction.press(Keys.ENTER);
    }
    public void checkErrorName(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(paymentPage.errorNameMessage));
            indexFunction.clickLogOutButton();
        }catch (Exception e) {
            indexFunction.clickLogOutButton();
            Assert.assertTrue(commonFunction.isDisplayed(paymentPage.errorNameMessage));
        }
    }
    public void checkErrorPhone(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(paymentPage.errorPhoneMessage));
            indexFunction.clickLogOutButton();
        }catch (Exception e) {
            indexFunction.clickLogOutButton();
            Assert.assertTrue(commonFunction.isDisplayed(paymentPage.errorPhoneMessage));
        }
    }
    public void checkErrorEmail(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(paymentPage.errorEmailMessage));
            indexFunction.clickLogOutButton();
        }catch (Exception e) {
            indexFunction.clickLogOutButton();
            Assert.assertTrue(commonFunction.isDisplayed(paymentPage.errorEmailMessage));
        }
    }
    public void checkErrorAddress(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(paymentPage.errorAddressMessage));
            indexFunction.clickLogOutButton();
        }catch (Exception e) {
            indexFunction.clickLogOutButton();
            Assert.assertTrue(commonFunction.isDisplayed(paymentPage.errorAddressMessage));
        }
    }

    public void checkOrderSuccess(String str){
        try {
            Assert.assertEquals(str, commonFunction.getValue(paymentPage.successfulOrderMessage));
            indexFunction.clickLogOutButton();
        }catch (Exception e) {
            indexFunction.clickLogOutButton();
            Assert.assertTrue(commonFunction.isDisplayed(paymentPage.successfulOrderMessage));
        }
    }
}