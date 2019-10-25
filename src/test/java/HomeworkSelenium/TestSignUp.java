package HomeworkSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignUp {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
//        Thread.sleep(500);
        driver.quit();
    }


    @Test
    public void signUpToDeens() throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        homePage.open();
        SignUpPage signUpPage = homePage.openSignUpPage();
        signUpPage.signUp("tanik11", "tanik11@gmail.com", "password");
        //waiting for the page to update after clicking "Register"
        homePage.worldImgDisplayed();
        //asserting that avatar is displayed. Not sure how to write that assert using POM
        homePage.assertAvatar();
        }

}
