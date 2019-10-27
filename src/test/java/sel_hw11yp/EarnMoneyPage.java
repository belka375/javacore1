package sel_hw11yp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class EarnMoneyPage {
  WebDriver driver;
    Wait<WebDriver>wait;

    public EarnMoneyPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }

    public WebElement codeField(){
        return wait.until(driver->driver.findElement(By.xpath("(//input)[2]")));
    }


    public WebElement getCopyCodeButton(){
        return wait.until(x->driver.findElement(By.xpath("//button[@type='submit']")));
    }
    public void copyReferralCode() {
        getCopyCodeButton().click();

    }

    public static class GetClipboard {
        public static String GetStringFromClipboard() throws IOException, UnsupportedFlavorException {
            return (String) Toolkit.getDefaultToolkit()
                    .getSystemClipboard().getData(DataFlavor.stringFlavor);
        }
    }

    public String getTextFromClipboard() throws IOException, UnsupportedFlavorException {
        getCopyCodeButton().click();
        return GetClipboard.GetStringFromClipboard();
    }

//    public boolean compareCodes(String copiedCode, String getCode){
//        return copiedCode.equals(getCode);
//    }

}
