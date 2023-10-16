package pages;

import org.openqa.selenium.By;

public class cart_page {
    public static By orderButton = By.id("orderButton");
    public static By titleGioHangLabel = By.xpath("//h2[contains(text(),'Giỏ Hàng')]");
    public static By rowInTable = By.xpath("//tbody/tr");
    public static By columnInTable = By.xpath("//table[1]/thead[1]/tr[1]/th");
    public static By logoutBtn = By.xpath("//a[@id='logoutBtn']");

}
