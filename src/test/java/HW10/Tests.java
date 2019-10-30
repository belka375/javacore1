package HW10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Tests {
    WebDriver driver;
    Wait<WebDriver> wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(20))
                .ignoring(NoSuchElementException.class);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void openSignupPage() {
        LandP landingPage = new LandP(driver);
        landingPage.open();
    }

    @Test
    public void SignUp() {
        LandP landingPage = new LandP(driver);
        landingPage.open();
        SignUpPage signUpPage= landingPage.openSignUpPage();
    }
}
