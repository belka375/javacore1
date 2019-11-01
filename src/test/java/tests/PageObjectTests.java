package tests;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.time.Duration;
import java.util.Optional;

public class PageObjectTests {
    WebDriver driver;


    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();


    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }
    @Test
    public void clickEarnMoney(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test
    public void loginTOApp() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        LoginPage loginPage = landingPage.openLoginPage();

        loginPage.login("user", "password");


    }




}
