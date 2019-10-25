package seleniumHomeWork10;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPageHW10 {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public LandingPageHW10(WebDriver driver) {
        this.driver = driver;
        wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);
    }

    public void open() {
        driver.get("https://deens-master.now.sh");
    }

    public WebElement getSignUpButton() {
        var signUpButton = wait.until(x -> driver.findElement(By.cssSelector("[href='/register']")));
        return signUpButton;
    }

    public SignUpPageHW10 openSignUpPage() {
        getSignUpButton().click();
        SignUpPageHW10 signUpPage = new SignUpPageHW10(driver);
        return signUpPage;
    }

    private boolean getUserAvatar() {
        return wait.until(x -> driver.findElement(By.xpath("//*[@alt='user avatar']")).isDisplayed());
    }

    public boolean isLogged() {
        return getUserAvatar();
    }
}


