package shw10.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class EarnMoneyPage {
    private WebDriver driver;
    Wait<WebDriver> wait;
    public EarnMoneyPage(WebDriver driver){
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(200))
                .ignoring(Exception.class);
    }

    public WebElement getReferralCode(){return wait.until(x->x.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/main/div[1]/div/div/div/div/div[1]/div/input")));
    }

    public void referal() throws InterruptedException {
        var ref = getReferralCode();
        Actions act = new Actions(driver);
        act.moveToElement(ref).doubleClick().build().perform();
        ref.sendKeys(Keys.chord(Keys.CONTROL, "c"));
    }
}
