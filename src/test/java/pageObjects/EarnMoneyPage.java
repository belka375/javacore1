package pageObjects;

import helpers.GetClipBoard;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;


public class EarnMoneyPage extends BasePage{


    public EarnMoneyPage(WebDriver driver)  {
        super (driver);
    }
    private WebElement getCopyButton(){
        return wait.until(x->driver.findElement(By.xpath("//*[@type='submit']")));
    }
    //get atribut value java - search in Google
    public WebElement getCodeField(){
        return wait.until(x->driver.findElement(By.xpath("(//input)[2]")));
    }

    private WebElement getButtonCopy(){
        return driver.findElement(By.tagName("button"));
    }


    //extract text from clipboard


    public String getTextFromClipBoard() throws IOException, UnsupportedFlavorException {
       //see helper - getclipboard
        getButtonCopy().click();
        return GetClipBoard.GetStrintFromClipBoard();

    }



}
