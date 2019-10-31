package HW10.HWT;

import helpers.GetClipboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class EarnMoneyP {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public EarnMoneyP(WebDriver driver){
        this.driver=driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(NoSuchElementException.class);
    }

    public WebElement getRefCode() {
       return wait.until(x->x.findElement(By.xpath("(//input)[2]")));
    }


    public String getTextFromClipboard() throws IOException, UnsupportedFlavorException {
        getCopyButton().click();
        return GetClipboard.GetStringFromClipboard();

    }

    private WebElement getCopyButton()
        {
            return wait.until(x->x.findElement(By.tagName("button")));
        }
    }

