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
        WebDriver driver = setupBrowser();
        DriverManager.setDriver(driver);
        return driver;
    }

    private WebDriver setupBrowser() {
        WebDriver driver;
        driver = initDriver();
        return driver;
    }

    private WebDriver initDriver() {
        WebDriver driver;
        System.out.println("Launching browser...");
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void closeDriver() {
        if (DriverManager.getDriver() != null) {
            DriverManager.quit();
        }
    }
}
