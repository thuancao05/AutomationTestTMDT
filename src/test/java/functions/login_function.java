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
        commonFunction.sleep(1000);
        commonFunction.sendKeys(loginPage.emailInput, str);
    }
    public void inputPassword(String str) {
        commonFunction.sendKeys(loginPage.passwordInput, str);
    }
    public void clickLoginButton( ) {
        commonFunction.clicks(loginPage.loginBtn);
        commonFunction.sleep(1000);
    }
    public void checkErrorEmail(String str){
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.errorEmailMessage));
        Assert.assertEquals(str, commonFunction.getValue(loginPage.errorEmailMessage));
    }
    public void checkErrorPassword(String str){
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.errorPasswordMessage));
        Assert.assertEquals(str, commonFunction.getValue(loginPage.errorPasswordMessage));
    }
    public void checkErrorLogin(String str){
        Assert.assertTrue(commonFunction.isDisplayed(loginPage.errorAuthenticationMessage));
        Assert.assertEquals(str, commonFunction.getValue(loginPage.errorAuthenticationMessage));
    }
}