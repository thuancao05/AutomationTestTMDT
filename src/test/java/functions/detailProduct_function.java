package functions;


import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.detailProduct_page;

public class detailProduct_function {
    public detailProduct_page detailProductPage = new detailProduct_page();
    public common_function commonFunction = new common_function();

    public void verifyDetailProductPage(){
        commonFunction.sleep(500);
        Assert.assertTrue(commonFunction.isDisplayed(detailProductPage.nameProduct));
        System.out.println("Verified detail product page");
    }
    public void inputQuantity(String str) {
        WebElement element = DriverManager.getDriver().findElement(By.xpath("//input[@id='quantityProduct']"));
        element.click();
        commonFunction.press(Keys.BACK_SPACE);
        commonFunction.sendKeys(detailProductPage.quantity, str);
    }

    public void clickAddToCartButton( ) {
        commonFunction.clicks(detailProductPage.addToCartButton);
        commonFunction.sleep(5000);
    }


}