package functions;

import driver.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static driver.DriverManager.getDriver;

public class common_function   {
    private WebDriverWait wait;
    public WebDriverWait getWait() {
        return wait;
    }
    Actions actions = new Actions(getDriver());

    public static WebElement getWebElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    public static List<WebElement> getWebElements(By by) {
        return DriverManager.getDriver().findElements(by);
    }

    public void clicks(By by) {
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", getDriver().findElement(by));
    }

    public void sendKeys(By by, String text) {
        WebElement element = getWebElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public void press(Keys key) {
        actions.sendKeys(key).perform();
    }

    public boolean isDisplayed(By by) {
        WebElement element = getWebElement(by);
        return element.isDisplayed();
    }

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public String getTitlePage() {
        return getDriver().getTitle();
    }
    public String getAttribute(String attr, WebElement element){
        return element.getAttribute(attr);
    }

    public boolean verifyTitlePage(String titlePage) {
        return getTitlePage().contains(titlePage);
    }

    public void selectValue(String value, By element) {
        WebElement select = getWait().until(ExpectedConditions.visibilityOfElementLocated(element));
        Select selectOption = new Select(select);
        selectOption.selectByValue(value);
    }

    public String getValue(By by){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        return element.getText();
    }

    //xoa attribute trong phan tu
    public void removeAttribute(By by, String attr){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].removeAttribute('" + attr + "')", element);
    }

    //cai dat attribute cho phan tu
    public void setAttribute(By by, String attr, String value){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].setAttribute('" + attr + "' , '" + value + "')", element);
    }

    // scroll to find element with By
    public void scrollToElement(By by){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true)", element);
    }
    // scroll to find element with web element
    public void scrollToElement(WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].scrollIntoView(true)", element);
    }
    // scroll to find element with web element
    public void jsClick(By by){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    // scroll to find element with web element
    public void jsSendKey(By by, String str){
        WebElement element = DriverManager.getDriver().findElement(by);
        JavascriptExecutor executor = (JavascriptExecutor) getDriver();
        executor.executeScript("arguments[0].setAttribute('value','khongduoc');", element);
    }

    //Ham kiem tra xep theo thu tu lon -> be
    public void checkDESC(By by){
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList = getDriver().findElements(by);
        for (WebElement we :elementList){
            obtainedList.add(we.getText());
            System.out.println(we);
        }
        ArrayList<String> sortedList = new ArrayList<>();
        for (String s : obtainedList){
            sortedList.add(s);
            System.out.println(s);
        }
        Collections.sort(sortedList);
        sortedList.sort(Collections.reverseOrder());
        Assert.assertEquals(obtainedList,sortedList);
    }

}
