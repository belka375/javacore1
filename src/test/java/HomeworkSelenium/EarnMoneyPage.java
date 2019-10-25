package HomeworkSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;

public class EarnMoneyPage {

    private WebDriver driver;
    Wait<WebDriver> wait;

    public EarnMoneyPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(Exception.class);
    }

    public WebElement getCopyReferralCodeButton(){
        return wait.until(x->driver.findElement(By.xpath("//button[@type='submit']")));
    }

    public String getCopiedCode() throws IOException, UnsupportedFlavorException {
        String copiedCode = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        return copiedCode;
    }

    public String getCode() {
        WebElement referralCode = wait.until(x->driver.findElement(By.xpath("//div[contains(@class,'StyledInput')]/input")));
        String code = "https://deens-master.now.sh/register?ref="+referralCode.getAttribute("value");
        return code;
    }

    public boolean compareCodes(String copiedCode, String getCode){
        return copiedCode.equals(getCode);
    }

     }
