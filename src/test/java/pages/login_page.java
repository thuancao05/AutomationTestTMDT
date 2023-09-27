package pages;
import org.openqa.selenium.By;

public class login_page {
    public static By emailInput = By.id("emailInput");
    public static By errorEmailMessage = By.id("validateEmail");
    public static By passwordInput = By.id("passwordInput");
    public static By errorPasswordMessage = By.id("validatePassword");
    public static By loginBtn = By.id("loginButton");
    public static By errorAuthenticationMessage = By.id("validateAuthentication");
    public static By registerBtn = By.id("registerButton");

}
