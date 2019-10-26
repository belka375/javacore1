package shomework11;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    Wait<WebDriver> wait;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        wait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(100))
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class);

    }

    public void open() {
        driver.get("https://deens-master.now.sh/");
    }

    private WebElement getLoginButton(){
        var loginButton=wait.until(x->driver.findElement(By.cssSelector("[href='/login']")));
        return loginButton;
    }
    public LoginPage openLoginPage() {
        getLoginButton().click();
        LoginPage loginPage=new LoginPage(driver);
        return loginPage;
    }

}
