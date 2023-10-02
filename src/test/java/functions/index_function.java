package functions;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.index_page;
import pages.login_page;

public class index_function {
    public index_page indexPage = new index_page();
    public common_function commonFunction = new common_function();

    public void verifyLogoIndexPage(){
        commonFunction.sleep(5000);
        Assert.assertTrue(commonFunction.isDisplayed(indexPage.logo));
        commonFunction.sleep(500);
        System.out.println("Verified index page");
    }
    public void clickUserProfileButton(){
        commonFunction.clicks(indexPage.userProfileBtn);
    }
    public void clickCartBtn(){
        commonFunction.clicks(indexPage.cartBtn);
    }
    public void clickLogOutButton(){
        commonFunction.sleep(3000);
        commonFunction.clicks(indexPage.logoutBtn);
    }
    public void inputSearch(String str){
        commonFunction.sendKeys(indexPage.searchInput, str);
    }
    public void clickSearchButton(){
        commonFunction.press(Keys.ENTER);
        commonFunction.sleep(1000);
    }

    public int getToTalSearch(){
        return Integer.parseInt(commonFunction.getValue(indexPage.totalSearch));
    }
    public void checkProductNameIncludeSearchValue(String str){
        commonFunction.sleep(1000);
        for (int i = 1; i <= getToTalSearch(); i++){
            By element = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div["+i+"]/div[1]/a[1]/div[1]/h5[1]");
            String nameProduct = commonFunction.getValue(element).toLowerCase();
            System.out.println(nameProduct);
            Assert.assertTrue(nameProduct.indexOf(str.toLowerCase()) != -1);
        }
    }
    public void clickFirstProductAfterSearch(){
        commonFunction.clicks(indexPage.firstProductAfterSearch);
    }

}
