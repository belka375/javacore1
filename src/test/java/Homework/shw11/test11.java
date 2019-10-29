package Homework.shw11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class test11 {
    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }


    @Test
    public void getReferalCode() throws InterruptedException, IOException, UnsupportedFlavorException {
        var landingPage = new pageObjects.LandingPage(driver);
        landingPage.open();
        var loginPage = landingPage.openLoginPage();

        loginPage.login("drryte@mail.com","karina17");
        Assert.assertTrue(landingPage.isLogged());
        Thread.sleep(3000);

        var earnMoney = landingPage.openEarnMoneyPage();
        var textFromField = earnMoney.getCodeField().getAttribute("value");
        var textFromClipboard = earnMoney.getTextFromClipboard();

        Assert.assertEquals(textFromField, textFromClipboard);

    }
}
