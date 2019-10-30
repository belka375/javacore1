package HW10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class tests {
     WebDriver driver;



    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.quit();

    }

    @Test
    public void openLandingPage() {
       LandingPage landingPage =new LandingPage(driver);
       landingPage.open();


    }
    @Test
    public void openSignUP() throws InterruptedException {
        LandingPage landingPage=new LandingPage(driver);
        landingPage.open();
       SignUpPage signUpPage = landingPage.openSignUpPage();
       Thread.sleep(3000);
       signUpPage.signup("user","email","password");
        var customazibleTravelsText = driver.findElement(By.xpath("//*[contains(@style,'color')]"));
        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));


    }
    @Test
    public void getCode() throws InterruptedException, IOException, UnsupportedFlavorException {
        LandingPage landingPage=new LandingPage(driver);
        landingPage.open();
        Thread.sleep(3000);
        LoginP loginP=landingPage.openLoginP();

        loginP.login("irina256", "malysh86");
        Thread.sleep(3000);

        EarnMoneyP earnMoneyP= landingPage.openEM();
        Thread.sleep(3000);

        var getTextFromField = earnMoneyP.getRefCode().getAttribute("value");
        var getTextCopied = earnMoneyP.getTextFromClipboard().split("=")[1];

Assert.assertEquals(getTextFromField,getTextCopied);


    }
}