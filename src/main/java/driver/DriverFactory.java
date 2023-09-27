package driver;

import constants.ConstantGlobal;
import helpers.PropertiesHelpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
    public WebDriver createDriver() {
        WebDriver driver = setupBrowser(PropertiesHelpers.getValue("BROWSER"));
        DriverManager.setDriver(driver);
        return driver;
    }

    public WebDriver createDriver(String browserName) {
        WebDriver driver = setupBrowser(browserName);
        DriverManager.setDriver(driver);
        return driver;
    }

    private WebDriver setupBrowser(String browserName) {
        WebDriver driver;
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = initChromeDriver();
                break;
            default:
                System.out.println("Browser: " + browserName + " is invalid, Launching Chrome browser default...");
                driver = initChromeDriver();
        }
        return driver;
    }

    private WebDriver initChromeDriver() {
        WebDriver driver;
        System.out.println("Launching Chrome browser...");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(ConstantGlobal.HEADLESS);
//        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        return driver;
    }


    public void closeDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }
    }
}
