package shomework11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class PageObjectPage {
    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
         driver.quit();
    }

    @Test
    public void referralCodeVerification() throws IOException, UnsupportedFlavorException, InterruptedException {
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
        var loginPage=landingPage.openLoginPage();
        loginPage.login("deanabestom@gmail.com", "#####___");

        EarnMoneyPage earnMoney=new EarnMoneyPage(driver);
        Thread.sleep(2000);
       earnMoney.openEarnMoneyPage();
        Thread.sleep(2000);
        earnMoney.getCopyButton().click();
        Thread.sleep(2000);
        String code=earnMoney.getReferralCode();
        String text=earnMoney.getTextFromClipboard();

       Assert.assertEquals(text,code);




    }
}
