package shw15;

//*Action / Hover
//*1. Point mouse to the Login button at the Home page - and this button will change color.
//*2. Make assert that color of mouse changed.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PageObjectTests15 {
        WebDriver driver;
        WebDriverWait wait;

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void findLoginButtonColor()  {
        var landingPage = new LandingPage15(driver);
        landingPage.openPage();
        landingPage.getLoginButton();
       Assert.assertTrue(driver.findElement(By.xpath("//*[@href='/login']")).isDisplayed());
    }


    @Test
    public void LoginButton_OnHover_ColorChanged() {
        var landingPage = new LandingPage15(driver);
        landingPage.openPage();
        landingPage.getLoginButton();
        String loginButtonColorBefore = landingPage.getLoginButtonColor();
        landingPage.hoverOverLoginButton();
        String loginButtonColorAfter = landingPage.getLoginButtonColor();
        Assert.assertNotSame(loginButtonColorBefore, loginButtonColorAfter);
    }

}


