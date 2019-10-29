package hw13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BasePage;
import java.util.List;

public class SearchDestination extends BasePage {


    public SearchDestination(WebDriver driver){
        super(driver);
    }
    public List<WebElement> getNewYork(){
        return wait.until(x->driver.findElements(By.xpath("//*[contains(@class,'Trip__LinkWrapper')]")));
    }


}
