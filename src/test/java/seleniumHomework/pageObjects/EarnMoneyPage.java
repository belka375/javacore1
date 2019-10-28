package seleniumHomework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EarnMoneyPage extends BasePage {
    public EarnMoneyPage(WebDriver driver){
        super(driver);
    }

    public WebElement getReferralCode(){return wait.until(x->x.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/main/div[1]/div/div/div/div/div[1]/div/input")));
    }

    public void getreferal() throws InterruptedException {
        var ref = getReferralCode();
        Actions act = new Actions(driver);
        act.moveToElement(ref).doubleClick().build().perform();
        ref.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    }
}
