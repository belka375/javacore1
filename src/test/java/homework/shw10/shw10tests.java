package homework.shw10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class shw10tests {
    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(7000);
        driver.quit();
    }

    @Test
    public void deens_tryToSignUp_signUpSuccessfull(){
        var landingPage = new LandingPage(driver);
        landingPage.open();
        SignUpPage signUpPage = landingPage.openSignUpPage();

        signUpPage.signUp("user", "username99@username.com", "password99");

        WebElement landingPageNote = driver.findElement(By.cssSelector("[class*=Home__HomeTagLine]"));
        var note = landingPageNote.getText();
        Assert.assertEquals(note, "Customizable travels created by locals for free");



    }

}
