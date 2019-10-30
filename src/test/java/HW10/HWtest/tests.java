package HW10.HWtest;

import HW10.HWtest.HWObjects.LandingPage;
import HW10.HWtest.HWObjects.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class tests extends BaseT {
     WebDriver driver;

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
       var landingPage =login("irina256","malysh86" );
        Thread.sleep(7000);
        var earnMoneyP= landingPage.openEM();



        var getTextFromField = earnMoneyP.getRefCode().getAttribute("value");
        var getTextCopied = earnMoneyP.getTextFromClipboard().split("=")[1];

Assert.assertEquals(getTextFromField,getTextCopied);


    }
}