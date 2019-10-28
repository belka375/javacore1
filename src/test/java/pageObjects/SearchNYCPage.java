package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchNYCPage extends BasePage{
    public SearchNYCPage(WebDriver driver)
    {
        super(driver);
    }

    public int getNYCTumbs(){
        int nYCElements=wait.until(x->driver.findElements(By.cssSelector(".Trip__LinkWrapper")).size());
        return nYCElements;
    }


}
