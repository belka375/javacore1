package HW10.HWtest;

import HW10.HWT.LandingP;
import HW10.HWT.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class tests extends BaseTest {
     WebDriver driver;

     @Test
    public void openSignUP() throws InterruptedException {
        LandingP landingPage=new LandingP(driver);
        landingPage.openLP();
       SignUpPage signUpPage = landingPage.openSignUpPage();
       Thread.sleep(3000);
       signUpPage.signup("user","email","password");
        var customazibleTravelsText = driver.findElement(By.xpath("//*[contains(@style,'color')]"));
        Assert.assertTrue(true, String.valueOf(customazibleTravelsText));


    }
    @Test
    public void getCode() throws InterruptedException, IOException, UnsupportedFlavorException {
       var landingPage =login("irina256","malysh86" );
        Thread.sleep(7000);
        var earnMoneyP= landingPage.openEM();



        var getTextFromField = earnMoneyP.getRefCode().getAttribute("value");
        var getTextCopied = earnMoneyP.getTextFromClipboard().split("=")[1];

Assert.assertEquals(getTextFromField,getTextCopied);


    }
}