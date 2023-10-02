package pages;

import org.openqa.selenium.By;

public class payment_page {
    public static By submitButton = By.id("submitButton");
    public static By nameInput = By.id("nameInput");
    public static By phoneInput = By.id("phoneInput");
    public static By emailInput = By.id("emailInput");
    public static By addressInput = By.id("addressInput");
    public static By citySelect = By.id("citySelect");
    public static By districtSelect = By.id("districtSelect");
    public static By wardSelect = By.id("wardSelect");
    public static By noteInput = By.id("noteInput");
    public static By titleThanhToanDonHangLabel = By.xpath("//h2[contains(text(),'Thanh Toán Đơn Hàng')]");
    public static By errorNameMessage = By.id("errorNameMessage");
    public static By errorPhoneMessage = By.id("errorPhoneMessage");
    public static By errorEmailMessage = By.id("errorEmailMessage");
    public static By errorAddressMessage = By.id("errorAddressMessage");
}
