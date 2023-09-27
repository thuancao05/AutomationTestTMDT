package functions;

import org.testng.Assert;
import pages.index_page;
import pages.login_page;

public class index_function {
    public index_page indexPage = new index_page();
    public common_function commonFunction = new common_function();

    public void verifyLogoIndexPage(){
        commonFunction.sleep(1000);
        Assert.assertTrue(commonFunction.isDisplayed(indexPage.logo));
        commonFunction.sleep(1000);
        System.out.println("Verified index page");
    }
    public void clickLogOutBtn(){
        commonFunction.clicks(indexPage.logoutBtn);
    }
}
