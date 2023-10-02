package functions;


import driver.DriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.login_page;

public class login_function {
    public login_page loginPage = new login_page();
    public common_function commonFunction = new common_function();


    public void inputEmail(String str) {
//        WebElement element = DriverManager.getDriver().findElement(loginPage.emailInput);
//        element.click();
        commonFunction.sleep(3000);

        commonFunction.sendKeys(loginPage.emailInput, str);
        commonFunction.sleep(1000);
//        commonFunction.press(Keys.ENTER);
//        commonFunction.sendKeys(loginPage.passwordInput, "1");
//        commonFunction.sleep(1000);
//        commonFunction.clicks(login_page.loginBtn);
    }
    public void inputPassword(String str) {
        commonFunction.sendKeys(loginPage.passwordInput, str);
        commonFunction.sleep(1000);
    }
    public void clickLoginButton( ) {
        commonFunction.clicks(login_page.loginBtn);
        commonFunction.sleep(2000);
    }
    public void checkErrorEmail(String str){
        Assert.assertTrue(commonFunction.isDisplayed(login_page.errorEmailMessage));
        Assert.assertEquals(str, commonFunction.getValue(login_page.errorEmailMessage));

    }
    public void checkErrorPassword(String str){
        Assert.assertTrue(commonFunction.isDisplayed(login_page.errorPasswordMessage));
        Assert.assertEquals(str, commonFunction.getValue(login_page.errorPasswordMessage));
    }
    public void checkErrorLogin(String str){
        Assert.assertTrue(commonFunction.isDisplayed(login_page.errorAuthenticationMessage));
        Assert.assertEquals(str, commonFunction.getValue(login_page.errorAuthenticationMessage));
    }
    public void clickRegisterButton() {
        commonFunction.sleep(1000);
        commonFunction.clicks(login_page.registerBtn);
    }
}