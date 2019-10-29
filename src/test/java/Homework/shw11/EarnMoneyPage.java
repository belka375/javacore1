package Homework.shw11;

import helpers.GetClipboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

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
    private WebElement getCodeField(){
        return wait.until(driver->driver.findElement(By.xpath("(//input)[2])")));
    }
    private WebElement getButton(){
        return driver.findElement(By.tagName("button"));
    }
    public String getTextFromClipboard() throws IOException, UnsupportedFlavorException {
        getButton().click();
        return GetClipboard.GetStringFromClipboard();
    }

}
