package functions;


import org.testng.Assert;
import pages.cart_page;
import pages.payment_page;

public class payment_function {
    public payment_page paymentPage = new payment_page();
    public common_function commonFunction = new common_function();

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
        commonFunction.sendKeys(paymentPage.noteInput, str);
    }
    public void checkErrorName(String str){
        Assert.assertTrue(commonFunction.isDisplayed(paymentPage.errorNameMessage));
        Assert.assertEquals(str, commonFunction.getValue(paymentPage.errorNameMessage));
    }
}