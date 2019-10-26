package hw10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;


public class Tests {
    WebDriver driver;


    @BeforeMethod
    public void deensTest(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void openMainPage(){
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
    }
    @Test
    public void openSignUpPage_registerUser_loggedAsNewUser(){
        MainPage mainPage=new MainPage(driver);
        mainPage.open();
        var signUp = mainPage.openSingUp();
        String username = randomString(10);
        String password = randomString(12);
        String email = randomEmail();
        mainPage=signUp.registerUser(username,email,password);
        var logged = mainPage.isLogged();
        Assert.assertTrue(logged);
    }
}
