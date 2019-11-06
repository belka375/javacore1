package pageObjects;

import helpers.GetClipBoard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class EarnMoneyPage extends BasePage{



    public EarnMoneyPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getCodeField(){
        return wait.until(driver->driver.findElement(By.xpath("(//input)[2]")));
    }
    private WebElement getCopyButton(){
        return driver.findElement(By.tagName("button"));
    }


    public String getTextFromClipboard() throws IOException, UnsupportedFlavorException {
        getCopyButton().click();
        return GetClipBoard.GetStringFromClipboard();
    }
}

