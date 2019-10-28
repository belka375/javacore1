package shomework11;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class EarnMoneyPage {
    WebDriver driver;
    Wait<WebDriver> wait;

    public EarnMoneyPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }

    private WebElement getEarnMoneyButton() {
        var earnMoneyButton = wait.until(x -> x.findElement(By.cssSelector("[style='color: rgb(217, 117, 110);']")));
        return earnMoneyButton;
    }

    public void openEarnMoneyPage() throws InterruptedException {
        getEarnMoneyButton().click();
    }
        public WebElement getCopyButton () {
            var copyButton = wait.until(x -> driver.findElement(By.xpath("(//*[@type='submit'])[1]")));
            return copyButton;
        }
        public void copyCode(){
            getCopyButton().click();
        }
        public String getTextFromClipboard () throws IOException, UnsupportedFlavorException {
        String textClipboard = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            return textClipboard;
        }
        public String getReferralCode () {
            return driver.findElement(By.xpath("(//*[@value='vyOwofUD7'])[1]")).getAttribute("value");
        }

    }
