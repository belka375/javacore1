package HW10.HWT;

import helpers.GetClipboard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class EarnMoneyP extends BasePages{


    public EarnMoneyP(WebDriver driver){super(driver);}


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

