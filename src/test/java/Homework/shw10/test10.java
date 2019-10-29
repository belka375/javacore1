package Homework.shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test10 {
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
    public void openLoginPage(){
        LandingPage landingPage = new LandingPage(driver);
        landingPage.open();
    }
    @Test
    public void signupToApp() throws InterruptedException {
        var landingPage = new LandingPage(driver);
        landingPage.open();
        SignupPage signupPage = landingPage.openSignupPage();

        signupPage.signup("usernameyeee", "email42y32@mail.com","passwordy55565");

        Assert.assertEquals(driver.findElements(By.xpath("//*[contains(@class, 'Home__HomeTagLine')]")).size(), 0);
    }

}
