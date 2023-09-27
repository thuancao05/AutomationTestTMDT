package functions;


import org.testng.Assert;
import pages.register_page;

public class register_function {
    public register_page registerPage = new register_page();
    public common_function commonFunction = new common_function();

    public void verifyRegisterPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.nameInput));
        System.out.println("Verified register page");
    }
    public void inputName(String str) {
        commonFunction.sendKeys(registerPage.nameInput, str);
    }
    public void inputPhone(String str) {
        commonFunction.sendKeys(registerPage.phoneInput, str);
    }
    public void inputEmail(String str) {
        commonFunction.sendKeys(registerPage.emailInput, str);
    }
    public void inputPassword(String str) {
        commonFunction.sendKeys(registerPage.passwordInput, str);
    }
    public void clickLoginButton( ) {
        commonFunction.clicks(registerPage.loginBtn);
    }
    public void clickRegisterButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(registerPage.registerBtn);
        commonFunction.sleep(1000);
    }

    public void checkErrorName(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.errorNameMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.errorNameMessage));

    }
    public void checkErrorPhone(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.errorPhoneMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.errorPhoneMessage));
    }
    public void checkErrorEmail(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.errorEmailMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.errorEmailMessage));
    }
    public void checkErrorPassword(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.errorPasswordMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.errorPasswordMessage));
    }
    public void checkErrorRegister(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.errorRegisterMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.errorRegisterMessage));
    }
    public void checkSuccessfulRegister(String str){
        Assert.assertTrue(commonFunction.isDisplayed(registerPage.successfulRegisterMessage));
        Assert.assertEquals(str, commonFunction.getValue(registerPage.successfulRegisterMessage));
    }

}