package homeWork11_pageObjects_Deens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class EarnMoneyPage {
    WebDriver driver;
    Wait<WebDriver> wait;


    public EarnMoneyPage(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(Exception.class);
    }

    public WebElement referralCodeField() {
        return wait.until(x -> driver.findElement(By.xpath("(//input[@class])[2]")));
    }

    private WebElement getCopyButton() {
        return wait.until(x -> driver.findElement(By.xpath("(//div[@width='auto'])[2]")));
    }

    public void copyReferralCode() {
        getCopyButton().click();

    }
}

