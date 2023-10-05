package pages.admin;

import org.openqa.selenium.By;

public class products_page extends base_admin_page {
    public static By addProductButton = By.id("addProductButton");
    public static By rowInTable = By.xpath("//tbody/tr");
    public static By columnInTable = By.xpath("//table[1]/thead[1]/tr[1]/th");
}
