package shw10_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static helpers.RandomStringGenerator.randomEmail;
import static helpers.RandomStringGenerator.randomString;

public class PageObjects {
    WebDriver driver;




    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
        driver = new ChromeDriver();

    }
        @AfterTest
                public void tierDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

    @Test

    public void tryToRegister_RegisteredSuccesfull_Asserted(){
    MainPage1 mainPage1 = new MainPage1(driver);
    mainPage1.open();
        var signUpPage = mainPage1.clickOnSignInButton1();
        String username = randomString(15);
        String password = randomString(6);
        String email = randomEmail();



    }

}
