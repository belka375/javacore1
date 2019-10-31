package browsersFactory;

import enumsPackage.BrowsersTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowsersFactory {
    public WebDriver createWebDriver (BrowsersTypes browser) throws NoSuchMethodException{
        switch (browser){
            case CHROME:
                return GetChromeDriver();
            case FIREFOX:
                return GetFirefoxDriver();
            default:
                throw new NoSuchMethodException();
        }
    }

    private WebDriver GetFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver","geckodriver");
        return new FirefoxDriver();
    }

    private WebDriver GetChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        return new ChromeDriver();

    }

}
