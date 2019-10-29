package hw11;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import shw_Practice.BaseTests;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class EarnMoneyTest extends BaseTests {

    @Test
    public void getReferenceCode() throws IOException, UnsupportedFlavorException, InterruptedException {
        var mainPage=Login("tell.joshuan@thtt.us","123456789");
        Thread.sleep(5000);
        var earnMoney=mainPage.openEarnMoney();
        var referenceCode=earnMoney.getCode().getAttribute("value");
        var textFromClipboard=earnMoney.getClipboardText().split("=")[1];
        Assert.assertEquals(referenceCode,textFromClipboard);
    }
    }





