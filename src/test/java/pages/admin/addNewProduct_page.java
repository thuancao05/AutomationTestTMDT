package pages.admin;

import org.openqa.selenium.By;

public class addNewProduct_page extends base_admin_page{
    public static By submitButton = By.id("submitButton");
    public static By nameInput = By.id("nameInput");
    public static By describeInput = By.id("describeInput");
    public static By priceInput = By.id("priceInput");
    public static By categoryInput = By.id("categoryInput");
    public static By quantityInput = By.id("quantityInput");
    public static By dateInput = By.id("dateInput");
    public static By errorNameMessage = By.id("errorNameMessage");
    public static By errorPriceMessage = By.id("errorPriceMessage");
    public static By errorCategoryMessage = By.id("errorCategoryMessage");
    public static By errorQuantityMessage = By.id("errorQuantityMessage");
    public static By errorDateMessage = By.id("errorDateMessage");
    public static By errorImageMessage = By.id("errorImageMessage");
    public static By chooseImageButton = By.id("chooseImageButton");
    public static By uploadImageButton = By.id("uploadImageButton");
    public static By successfulUploadImageMessage = By.xpath("//span[contains(text(),'Thêm hình ảnh thành công')]");

}
