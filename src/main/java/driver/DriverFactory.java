package driver;

import constants.ConstantGlobal;
import helpers.PropertiesHelpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


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
                driver = initDriver();
                break;
            default:
                System.out.println("Browser: " + browserName + " is invalid, Launching browser default...");
                driver = initDriver();
        }
        return driver;
    }

    private WebDriver initDriver() {
        WebDriver driver;
        System.out.println("Launching browser...");
        WebDriverManager.firefoxdriver().setup();

//        ChromeOptions options = new ChromeOptions();
//        options.setHeadless(ConstantGlobal.HEADLESS);
//        options.addArguments("--remote-allow-origins=*");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        return driver;
    }


    public void closeDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }
    }
}
