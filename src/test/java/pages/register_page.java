package pages;

import org.openqa.selenium.By;

public class register_page {
    public static By emailInput = By.id("emailInput");
    public static By errorEmailMessage = By.id("validateEmail");
    public static By nameInput = By.id("nameInput");
    public static By errorNameMessage = By.id("validateName");
    public static By phoneInput = By.id("phoneInput");
    public static By errorPhoneMessage = By.id("validatePhone");
    public static By passwordInput = By.id("passwordInput");
    public static By errorPasswordMessage = By.id("validatePassword");
    public static By loginBtn = By.id("loginBtn");
    public static By registerBtn = By.xpath("//button[@id='registerBtn']");
    public static By errorRegisterMessage = By.id("validateRegister");
    public static By successfulRegisterMessage = By.xpath("//span[contains(text(),'Đăng ký thành công !')]");

}
