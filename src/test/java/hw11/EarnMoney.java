package hw11;

import helpers.GetClipboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class EarnMoney extends BasePage {
    public EarnMoney(WebDriver driver) {
        super(driver);
    }
    public WebElement getCode(){
        return wait.until(driver->driver.findElement(By.xpath("(//input)[2]")));
    }
    private WebElement getButton(){
        return driver.findElement(By.tagName("button"));
    }
    public String getClipboardText() throws IOException, UnsupportedFlavorException {
        getButton().click();
        return GetClipboard.GetStringFromClipboard();
    }
    }


