package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class EarnMoneyPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public EarnMoneyPage(WebDriver driver) throws IOException, UnsupportedFlavorException {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }
    private WebElement getCopyButton(){
        return wait.until(x->driver.findElement(By.xpath("//*[@type='submit']")));
    }
    public void copyReferralLink() {
        getCopyButton().click();
    }
//extract text from clipboard
    String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
    String copiedText = driver.findElement(By.xpath("//*[@type='submit']")).getAttribute("value").toString();
    Assert.assertEquals(copiedText, myText);


}
