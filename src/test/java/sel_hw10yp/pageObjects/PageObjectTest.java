package sel_hw10yp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class PageObjectTest {
    private WebDriver driver;



    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {

        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void openLandingPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test
    public  void openSignUpPageFromLandingPage() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
//        landingPage.openSignUpPage();
        SignUpPage signUpPage = landingPage.openSignUpPage();
        signUpPage.register("username155","emailtest1@test.com","pass121243451");


        WebElement avatar = driver.findElement(By.xpath("//*[@class=' ls-is-cached lazyloaded'][1]"));
        Assert.assertTrue(avatar.isDisplayed());
    }

}
