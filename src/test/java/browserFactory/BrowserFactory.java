package browserFactory;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public WebDriver createWebDriver(BrowserType browser) throws NoSuchMethodException {
        switch(browser){
            case CHROME:
                return GetChroomeDriver();
            case FIREFOX:
                return GetFirefoxDriver();
            default:
                throw new NoSuchMethodException();
        }
    }



    private WebDriver GetChroomeDriver() {
        System.setProperty("webdriver.crome.driver", "chromedriver");
        return new ChromeDriver();
    }
    private WebDriver GetFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "geckodriver");
        return new FirefoxDriver();
    }
}
